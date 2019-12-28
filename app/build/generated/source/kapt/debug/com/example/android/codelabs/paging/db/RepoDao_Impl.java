package com.example.android.codelabs.paging.db;

import android.database.Cursor;
import androidx.paging.DataSource;
import androidx.paging.DataSource.Factory;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.paging.LimitOffsetDataSource;
import androidx.room.util.CursorUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.android.codelabs.paging.model.Repo;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class RepoDao_Impl implements RepoDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Repo> __insertionAdapterOfRepo;

  public RepoDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfRepo = new EntityInsertionAdapter<Repo>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `repos` (`id`,`name`,`fullName`,`description`,`url`,`stars`,`forks`,`language`) VALUES (?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Repo value) {
        stmt.bindLong(1, value.getId());
        if (value.getName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getName());
        }
        if (value.getFullName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getFullName());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getDescription());
        }
        if (value.getUrl() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getUrl());
        }
        stmt.bindLong(6, value.getStars());
        stmt.bindLong(7, value.getForks());
        if (value.getLanguage() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getLanguage());
        }
      }
    };
  }

  @Override
  public void insert(final List<Repo> posts) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfRepo.insert(posts);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public DataSource.Factory<Integer, Repo> reposByName(final String queryString) {
    final String _sql = "SELECT * FROM repos WHERE (name LIKE ?) OR (description LIKE ?) ORDER BY stars DESC, name ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 2);
    int _argIndex = 1;
    if (queryString == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, queryString);
    }
    _argIndex = 2;
    if (queryString == null) {
      _statement.bindNull(_argIndex);
    } else {
      _statement.bindString(_argIndex, queryString);
    }
    return new DataSource.Factory<Integer, Repo>() {
      @Override
      public LimitOffsetDataSource<Repo> create() {
        return new LimitOffsetDataSource<Repo>(__db, _statement, false , "repos") {
          @Override
          protected List<Repo> convertRows(Cursor cursor) {
            final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(cursor, "id");
            final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(cursor, "name");
            final int _cursorIndexOfFullName = CursorUtil.getColumnIndexOrThrow(cursor, "fullName");
            final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(cursor, "description");
            final int _cursorIndexOfUrl = CursorUtil.getColumnIndexOrThrow(cursor, "url");
            final int _cursorIndexOfStars = CursorUtil.getColumnIndexOrThrow(cursor, "stars");
            final int _cursorIndexOfForks = CursorUtil.getColumnIndexOrThrow(cursor, "forks");
            final int _cursorIndexOfLanguage = CursorUtil.getColumnIndexOrThrow(cursor, "language");
            final List<Repo> _res = new ArrayList<Repo>(cursor.getCount());
            while(cursor.moveToNext()) {
              final Repo _item;
              final long _tmpId;
              _tmpId = cursor.getLong(_cursorIndexOfId);
              final String _tmpName;
              _tmpName = cursor.getString(_cursorIndexOfName);
              final String _tmpFullName;
              _tmpFullName = cursor.getString(_cursorIndexOfFullName);
              final String _tmpDescription;
              _tmpDescription = cursor.getString(_cursorIndexOfDescription);
              final String _tmpUrl;
              _tmpUrl = cursor.getString(_cursorIndexOfUrl);
              final int _tmpStars;
              _tmpStars = cursor.getInt(_cursorIndexOfStars);
              final int _tmpForks;
              _tmpForks = cursor.getInt(_cursorIndexOfForks);
              final String _tmpLanguage;
              _tmpLanguage = cursor.getString(_cursorIndexOfLanguage);
              _item = new Repo(_tmpId,_tmpName,_tmpFullName,_tmpDescription,_tmpUrl,_tmpStars,_tmpForks,_tmpLanguage);
              _res.add(_item);
            }
            return _res;
          }
        };
      }
    };
  }
}
