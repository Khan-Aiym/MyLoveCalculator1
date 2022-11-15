package com.example.LoveCalculator.room;

import android.database.Cursor;
import androidx.lifecycle.LiveData;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.example.LoveCalculator.model.LoveModel;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Integer;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;

@SuppressWarnings({"unchecked", "deprecation"})
public final class Dao_Impl implements Dao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<LoveModel> __insertionAdapterOfLoveModel;

  public Dao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfLoveModel = new EntityInsertionAdapter<LoveModel>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `love_table` (`fName`,`sName`,`percentage`,`result`,`id`) VALUES (?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, LoveModel value) {
        if (value.getFName() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindString(1, value.getFName());
        }
        if (value.getSName() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getSName());
        }
        if (value.getPercentage() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getPercentage());
        }
        if (value.getResult() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getResult());
        }
        if (value.getId() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindLong(5, value.getId());
        }
      }
    };
  }

  @Override
  public void insert(final LoveModel loveModel) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfLoveModel.insert(loveModel);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public LiveData<List<LoveModel>> getLove() {
    final String _sql = "SELECT * FROM love_table";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"love_table"}, false, new Callable<List<LoveModel>>() {
      @Override
      public List<LoveModel> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfFName = CursorUtil.getColumnIndexOrThrow(_cursor, "fName");
          final int _cursorIndexOfSName = CursorUtil.getColumnIndexOrThrow(_cursor, "sName");
          final int _cursorIndexOfPercentage = CursorUtil.getColumnIndexOrThrow(_cursor, "percentage");
          final int _cursorIndexOfResult = CursorUtil.getColumnIndexOrThrow(_cursor, "result");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final List<LoveModel> _result = new ArrayList<LoveModel>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final LoveModel _item;
            final String _tmpFName;
            if (_cursor.isNull(_cursorIndexOfFName)) {
              _tmpFName = null;
            } else {
              _tmpFName = _cursor.getString(_cursorIndexOfFName);
            }
            final String _tmpSName;
            if (_cursor.isNull(_cursorIndexOfSName)) {
              _tmpSName = null;
            } else {
              _tmpSName = _cursor.getString(_cursorIndexOfSName);
            }
            final String _tmpPercentage;
            if (_cursor.isNull(_cursorIndexOfPercentage)) {
              _tmpPercentage = null;
            } else {
              _tmpPercentage = _cursor.getString(_cursorIndexOfPercentage);
            }
            final String _tmpResult;
            if (_cursor.isNull(_cursorIndexOfResult)) {
              _tmpResult = null;
            } else {
              _tmpResult = _cursor.getString(_cursorIndexOfResult);
            }
            final Integer _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getInt(_cursorIndexOfId);
            }
            _item = new LoveModel(_tmpFName,_tmpSName,_tmpPercentage,_tmpResult,_tmpId);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public LiveData<List<LoveModel>> sort() {
    final String _sql = "SELECT * FROM love_table ORDER BY fName ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return __db.getInvalidationTracker().createLiveData(new String[]{"love_table"}, false, new Callable<List<LoveModel>>() {
      @Override
      public List<LoveModel> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfFName = CursorUtil.getColumnIndexOrThrow(_cursor, "fName");
          final int _cursorIndexOfSName = CursorUtil.getColumnIndexOrThrow(_cursor, "sName");
          final int _cursorIndexOfPercentage = CursorUtil.getColumnIndexOrThrow(_cursor, "percentage");
          final int _cursorIndexOfResult = CursorUtil.getColumnIndexOrThrow(_cursor, "result");
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final List<LoveModel> _result = new ArrayList<LoveModel>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final LoveModel _item;
            final String _tmpFName;
            if (_cursor.isNull(_cursorIndexOfFName)) {
              _tmpFName = null;
            } else {
              _tmpFName = _cursor.getString(_cursorIndexOfFName);
            }
            final String _tmpSName;
            if (_cursor.isNull(_cursorIndexOfSName)) {
              _tmpSName = null;
            } else {
              _tmpSName = _cursor.getString(_cursorIndexOfSName);
            }
            final String _tmpPercentage;
            if (_cursor.isNull(_cursorIndexOfPercentage)) {
              _tmpPercentage = null;
            } else {
              _tmpPercentage = _cursor.getString(_cursorIndexOfPercentage);
            }
            final String _tmpResult;
            if (_cursor.isNull(_cursorIndexOfResult)) {
              _tmpResult = null;
            } else {
              _tmpResult = _cursor.getString(_cursorIndexOfResult);
            }
            final Integer _tmpId;
            if (_cursor.isNull(_cursorIndexOfId)) {
              _tmpId = null;
            } else {
              _tmpId = _cursor.getInt(_cursorIndexOfId);
            }
            _item = new LoveModel(_tmpFName,_tmpSName,_tmpPercentage,_tmpResult,_tmpId);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
