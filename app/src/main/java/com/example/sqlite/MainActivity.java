package com.example.sqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

import com.example.sqlite.MyHandler.MyDbHandler;
import com.example.sqlite.Model.Contact;


import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        MyDbHandler db = new MyDbHandler(MainActivity.this);

        // Creating a contact object for the db
        Contact harry = new Contact();
        harry.setPhoneNumber("03007802367");
        harry.setName("Eman");

        // Adding a contact to the db
        db.addContact(harry);

        // Creating a contact object for the db
        Contact larry = new Contact();
        larry.setPhoneNumber("03485690125");
        larry.setName("Ammar");

        // Adding a contact to the db
        db.addContact(larry);

        // Creating a contact object for the db
        Contact tehri = new Contact();
        tehri.setPhoneNumber("03164587091");
        tehri.setName("Ahmed");

        // Adding a contact to the db
        db.addContact(tehri);
        Log.d("dbSQLITE", "Id for Ammar and Ahmed are successfully added to the db");



        tehri.setId(46);
        tehri.setName("Changed Tehri");
        tehri.setPhoneNumber("0000000000");
        int affectedRows = db.updateContact(tehri);

        Log.d("dbharry", "No of affected rows are: " + affectedRows);










        // Get all contacts
        List<Contact> allContacts = db.getAllContacts();
        for(Contact contact: allContacts){
            Log.d("DBSQLITE", "\nId: " + contact.getId() + "\n" +
                    "Name: " + contact.getName() + "\n"+
                    "Phone Number: " + contact.getPhoneNumber() + "\n" );}




        }
}

