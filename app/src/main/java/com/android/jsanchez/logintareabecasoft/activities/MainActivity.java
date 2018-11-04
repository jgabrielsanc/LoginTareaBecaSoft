package com.android.jsanchez.logintareabecasoft.activities;

import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;
import android.widget.Toast;

import com.android.jsanchez.logintareabecasoft.R;
import com.android.jsanchez.logintareabecasoft.adapters.PersonAdapter;
import com.android.jsanchez.logintareabecasoft.models.Person;
import com.android.jsanchez.logintareabecasoft.utils.Util;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private SharedPreferences prefs;

    private ListView listView;
    private List<Person> people;
    private PersonAdapter personAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportActionBar().setTitle("Contacts");

        prefs = getSharedPreferences("Preferences", MODE_PRIVATE);

        Bundle bundle = getIntent().getExtras();
        if (bundle != null && bundle.getString("welcome") != null) {
            String welcome = bundle.getString("welcome");
            Toast.makeText(this, welcome, Toast.LENGTH_LONG).show();
        } else {
            Toast.makeText(this, "It is empty!", Toast.LENGTH_LONG).show();
        }



        listView = findViewById(R.id.listView);
        people = Util.getDummyData();
        personAdapter = new PersonAdapter(this, people, R.layout.list_view_item_person);

        listView.setAdapter(personAdapter);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        switch (item.getItemId()) {

            case R.id.menu_logout:
                removeSharedPreferences();
                logOut();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    private void logOut(){
        Intent intent = new Intent(this, LoginActivity.class);
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
        startActivity(intent);

    }

    private void removeSharedPreferences(){
        prefs.edit().clear().apply();
    }
}
