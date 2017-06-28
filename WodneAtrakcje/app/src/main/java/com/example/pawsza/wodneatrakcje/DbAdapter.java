package com.example.pawsza.wodneatrakcje;

/**
 * Created by pawsza on 28.06.17.
 */

public class DbAdapter {
    private static final String DEBUG_TAG = "SqLiteManager";
    private static final int DB_VERSION = 1;
    private static final String DB_NAME = "database.db";
    private static final String DB_TABLE = "Plywalnie";

    public static final String KEY_ID = "_id";
    public static final String ID_OPTIONS = "INTEGER PRIMARY KEY AUTOINCREMENT";
    public static final int ID_COLUMN = 0;
}