package com.example.android.codelabs.paging.db

import android.database.Cursor
import androidx.paging.DataSource
import androidx.paging.DataSource.Factory
import androidx.room.EntityInsertionAdapter
import androidx.room.RoomDatabase
import androidx.room.RoomSQLiteQuery
import androidx.room.paging.LimitOffsetDataSource
import androidx.room.util.CursorUtil
import androidx.sqlite.db.SupportSQLiteStatement
import com.example.android.codelabs.paging.model.Repo
import java.util.ArrayList

class RepoDao_Impl(private val __db: RoomDatabase) : RepoDao {

    private val __insertionAdapterOfRepo: EntityInsertionAdapter<Repo>

    init {
        this.__insertionAdapterOfRepo = object : EntityInsertionAdapter<Repo>(__db) {
            public override fun createQuery(): String {
                return "INSERT OR REPLACE INTO `repos` (`id`,`name`,`fullName`,`description`,`url`,`stars`,`forks`,`language`) VALUES (?,?,?,?,?,?,?,?)"
            }

            public override fun bind(stmt: SupportSQLiteStatement, value: Repo) {
                stmt.bindLong(1, value.id)
                if (value.name == null) {
                    stmt.bindNull(2)
                } else {
                    stmt.bindString(2, value.name)
                }
                if (value.fullName == null) {
                    stmt.bindNull(3)
                } else {
                    stmt.bindString(3, value.fullName)
                }
                if (value.description == null) {
                    stmt.bindNull(4)
                } else {
                    stmt.bindString(4, value.description)
                }
                if (value.url == null) {
                    stmt.bindNull(5)
                } else {
                    stmt.bindString(5, value.url)
                }
                stmt.bindLong(6, value.stars.toLong())
                stmt.bindLong(7, value.forks.toLong())
                if (value.language == null) {
                    stmt.bindNull(8)
                } else {
                    stmt.bindString(8, value.language)
                }
            }
        }
    }

    override fun insert(posts: List<Repo>) {
        __db.assertNotSuspendingTransaction()
        __db.beginTransaction()
        try {
            __insertionAdapterOfRepo.insert(posts)
            __db.setTransactionSuccessful()
        } finally {
            __db.endTransaction()
        }
    }

    override fun reposByName(queryString: String): DataSource.Factory<Int, Repo> {
        val _sql = "SELECT * FROM repos WHERE (name LIKE ?) OR (description LIKE ?) ORDER BY stars DESC, name ASC"
        val _statement = RoomSQLiteQuery.acquire(_sql, 2)
        var _argIndex = 1
        if (queryString == null) {
            _statement.bindNull(_argIndex)
        } else {
            _statement.bindString(_argIndex, queryString)
        }
        _argIndex = 2
        if (queryString == null) {
            _statement.bindNull(_argIndex)
        } else {
            _statement.bindString(_argIndex, queryString)
        }
        return object : DataSource.Factory<Int, Repo>() {
            override fun create(): LimitOffsetDataSource<Repo> {
                return object : LimitOffsetDataSource<Repo>(__db, _statement, false, "repos") {
                    override fun convertRows(cursor: Cursor): List<Repo> {
                        val _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(cursor, "id")
                        val _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(cursor, "name")
                        val _cursorIndexOfFullName = CursorUtil.getColumnIndexOrThrow(cursor, "fullName")
                        val _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(cursor, "description")
                        val _cursorIndexOfUrl = CursorUtil.getColumnIndexOrThrow(cursor, "url")
                        val _cursorIndexOfStars = CursorUtil.getColumnIndexOrThrow(cursor, "stars")
                        val _cursorIndexOfForks = CursorUtil.getColumnIndexOrThrow(cursor, "forks")
                        val _cursorIndexOfLanguage = CursorUtil.getColumnIndexOrThrow(cursor, "language")
                        val _res = ArrayList<Repo>(cursor.count)
                        while (cursor.moveToNext()) {
                            val _item: Repo
                            val _tmpId: Long
                            _tmpId = cursor.getLong(_cursorIndexOfId)
                            val _tmpName: String
                            _tmpName = cursor.getString(_cursorIndexOfName)
                            val _tmpFullName: String
                            _tmpFullName = cursor.getString(_cursorIndexOfFullName)
                            val _tmpDescription: String
                            _tmpDescription = cursor.getString(_cursorIndexOfDescription)
                            val _tmpUrl: String
                            _tmpUrl = cursor.getString(_cursorIndexOfUrl)
                            val _tmpStars: Int
                            _tmpStars = cursor.getInt(_cursorIndexOfStars)
                            val _tmpForks: Int
                            _tmpForks = cursor.getInt(_cursorIndexOfForks)
                            val _tmpLanguage: String
                            _tmpLanguage = cursor.getString(_cursorIndexOfLanguage)
                            _item = Repo(_tmpId, _tmpName, _tmpFullName, _tmpDescription, _tmpUrl, _tmpStars, _tmpForks, _tmpLanguage)
                            _res.add(_item)
                        }
                        return _res
                    }
                }
            }
        }
    }
}
