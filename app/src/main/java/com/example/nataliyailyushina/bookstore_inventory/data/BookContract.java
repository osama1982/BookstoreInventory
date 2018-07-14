package com.example.nataliyailyushina.bookstore_inventory.data;

import android.net.Uri;
import android.provider.BaseColumns;

public class BookContract {
    private BookContract() {}
    public static final String CONTENT_AUTHORITY = "com.example.nataliyailyushina.bookstore_inventory";
    public static final Uri BASE_CONTENT_URI = Uri.parse("content://" + CONTENT_AUTHORITY);
    public static final String PATH_BOOKS = "books";

    //Product Name, Price, Quantity, Supplier Name, and Supplier Phone Number
    public static abstract class BookEntry implements BaseColumns {
        public static final Uri CONTENT_URI = Uri.withAppendedPath(BASE_CONTENT_URI,PATH_BOOKS);
        public static final String TABLE_NAME = "books";
        public static final String _ID = BaseColumns._ID;
        public static final String COLUMN_BOOK_NAME = "name";
        public static final String COLUMN_BOOK_PRICE = "price";
        public static final String COLUMN_BOOK_QUANTITY= "quantity";
        public static final String COLUMN_SUPPLIER_NAME = "supplier_name";
        public static final String COLUMN_SUPPLIER_PHONE = "supplier_phone";


    }
}
