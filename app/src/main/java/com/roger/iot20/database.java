package com.roger.iot20;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.os.strictmode.SqliteObjectLeakedViolation;

import androidx.annotation.Nullable;

    public class database extends SQLiteOpenHelper {

        public static final String DATABASE_NAME = "Data.db";
        public static final String TABLE_NAME = "payment_Data";
        public static final String COL1 = "Registration_Number";
        public static final String COL2 = "Name";
        public static final String COL3 = "MailId";
        public static final String COL4 = "PhoneNo";
        public static final String COL5 = "Department";

        public database(@Nullable Context context) {
            super(context, DATABASE_NAME, null, 1);
        }

        @Override
        public void onCreate(SQLiteDatabase sqLiteDatabase) {
            sqLiteDatabase.execSQL("CREATE TABLE " + TABLE_NAME + "(Registration_Number INTEGER primary key,Name TEXT,MailId TEXT,PhoneNo TEXT,Department TEXT)");
            insertData(11717098,"Abdirahman Muhumed Mohamed","cabalaan08@gmail.com","7702494205","ECE",sqLiteDatabase);
            insertData(11714771,"ILYAS ABDULAHI JIMALE","engduceysane@gmail.com","9877396756","ECE",sqLiteDatabase);
            insertData(11903633,"Juganta Phukan","jugantaphukan556@gmail.com","9101422750","BTech CSE",sqLiteDatabase);
            insertData(11906647,"Bondhila Jayanth","jayanthpatel108@gmail.com","8247732661","ECE",sqLiteDatabase);
            insertData(11907978,"NARSIN KARTHIK","narsinkarthik035@gmail.com","9989113213","ECE",sqLiteDatabase);
            insertData(11808018,"Debankyajyoti Das","debankya2000@gmail.com","7086614135","BTech ECE",sqLiteDatabase);
            insertData(11902522,"D. Supriya","Supriyadigavalli@gmail.com","8639110068","Btech CSE (hons)",sqLiteDatabase);
            insertData(11902508,"Nallamothu Monisha","monisha.nallamothu@gmail.com","9398817756","Btech CSE (hons)",sqLiteDatabase);
            insertData(11801670,"Saurabh katwal","Soccerfootballsk@gmail.com","7018225350","Btech CSE",sqLiteDatabase);
            insertData(11903169,"Rahul Saroj","Rahulsaroj.rs2652@gmail.com","8917769229","Btech CSE",sqLiteDatabase);
            insertData(11918603,"Tharun Raj Prakash","tharunraj434@gmail.com","9629782084","Automobile",sqLiteDatabase);
            insertData(11908612,"Wangchen Tamang","wangchentamang999@gmail.com","8116548707","ME-MECHATRONICS",sqLiteDatabase);
            insertData(11909059,"Priyank Singh","Ikoncity449@gmail.com","9568148745","Btech CSE",sqLiteDatabase);
            insertData(11910800,"G Revanth Redy","revanthreddy9988@gmail.com","9989994215","ECE",sqLiteDatabase);
            insertData(11910756,"Rajavardhan Reddy","rajavardhanreddygogulamudi01@gmail.com","9666033987","B.Tech,E.C.E",sqLiteDatabase);
            insertData(11917511,"Rohit singh","rohitsingh50567@gmail.com","8054341903","B.Tech,CSE",sqLiteDatabase);
            insertData(11715358,"K jahnavi","jahnavi.kesavarapu13@gmail.com","9121635714","Btech ECE(hons)",sqLiteDatabase);
            insertData(11801708,"Sudarshan Shukla","sudarshanshukla20@gmail.com","7860333877","Btech CSE",sqLiteDatabase);
            insertData(11904578,"Kethoji Nithish","Ktmnithish1289@gmail.com","7995644601","Btech CSE",sqLiteDatabase);
            insertData(11801696,"Aman Nanda","nandaaman.99948@gmail.com","8209277266","Btech CSE",sqLiteDatabase);
            insertData(11910376,"Siddhu Naik Battu","battusiddhunaik123@gmail.com","6301749834","Btech CSE",sqLiteDatabase);
            insertData(11905126,"PRINCE KESHARWANI","kesharwanip206@gmail.com","6306644595","Btech CSE",sqLiteDatabase);
            insertData(11904538,"B.Om meher","Ommeher24@gmail.com","9133168495","Btech CSE",sqLiteDatabase);
            insertData(11902104,"A.Vaishnavi","vaishnavi04@gmail.com","9704231902","Btech CSE",sqLiteDatabase);
            insertData(11703924,"SABAREESHWARAN.N","Sowsabareesh@gmail.com","9080992294","Btech CSE",sqLiteDatabase);
            insertData(11900294,"Suraj Gupta","surajhthegod@gmail.com","8400376271","Btech(EEE)",sqLiteDatabase);
            insertData(11910990,"AYUSH GUPTA","001majorgeone@gmail.com","8279340325","Btech CSE",sqLiteDatabase);
            insertData(11911793,"Jeevaa Natarajan ","jeevaanatarajan@gmail.com","9842717686","Btech CSE (hons)",sqLiteDatabase);
            insertData(11903273,"Yogesh M","yogeshmahe04@gmail.com","9606333380","Btech CSE (hons)",sqLiteDatabase);
            insertData(11912610,"Aayush Arya","tomriddle257@gmail.com","8949576741","B.Sc.(Hons) Physics",sqLiteDatabase);
            insertData(11914563,"Vaibhav Kumar Swami","vaibhavswami140@gmail.com","8386849604","B.Sc.(Hons) Physics",sqLiteDatabase);
            insertData(11913422,"Harshit mishra","Mishraharshit970@gmail.com","7017455126","Biomedical engeneering",sqLiteDatabase);
            insertData(11916159,"Arjun kumar","Kumararjundamai1999@gmail.com","7076279481","Bachelor of Computer Applications",sqLiteDatabase);
            insertData(11719143,"Taher Mareai","tahermareai42@gmail.com","9316050622","Mechatronics",sqLiteDatabase);
            insertData(11803218,"Arivolee V N","arivoleen@gmail.com","9442554819","B.Tech IT",sqLiteDatabase);
            insertData(11917165,"Satendra Mani Tiwari","tsatendra220@gmail.com","8778507953","BTech CSE",sqLiteDatabase);
            insertData(11719120,"YOUSEF HUSSEIN MOHAMMED AL-QARDAI","yofhmq9997@gmail.com","9988512813","Mechatronics Engineering",sqLiteDatabase);

        }
        public void insertData( double RegdNo,String Name,String MailId,String PhoneNo,String Department,SQLiteDatabase database){
            ContentValues contentValues=new ContentValues();
            contentValues.put("Registration_Number",RegdNo);
            contentValues.put("Name",Name);
            contentValues.put("MailId",MailId);
            contentValues.put("PhoneNo",PhoneNo);
            contentValues.put("Department",Department);
            database.insert(TABLE_NAME,null,contentValues);
        }
        @Override
        public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
            sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
            onCreate(sqLiteDatabase);
        }
    }

