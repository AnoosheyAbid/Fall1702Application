package com.example.home.fall1702application;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

import layout.ContactsFragment;

public class MainActivity extends AppCompatActivity implements ContactsFragment.OnFragmentInteractionListener {
    Contacts c= new Contacts();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //dataset
        final List<Contacts> contacts = new ArrayList<Contacts>();
        contacts.add(new Contacts(1,"AbidShah",84442,"abidshah_abidshah@gmail.com"));


        //creating adapter
        ListView list = (ListView) findViewById(R.id.list);
        ContactsAdapter adapter = new ContactsAdapter(this, contacts);
        list.setAdapter(adapter);

    }

    public void OnButtonPressed(){
        Intent intent= new Intent(this,ContactsFragment.class);
        startActivity(intent);
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
