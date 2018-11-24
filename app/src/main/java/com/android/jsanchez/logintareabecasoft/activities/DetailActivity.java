package com.android.jsanchez.logintareabecasoft.activities;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.ImageView;

import com.android.jsanchez.logintareabecasoft.R;
import com.android.jsanchez.logintareabecasoft.models.Person;
import com.squareup.picasso.Picasso;

/**
 * Create by Jesus Sanchez
 */
public class DetailActivity extends AppCompatActivity {

    private ImageView imageViewPhoto;
    private EditText editTextName;
    private EditText editTextCareer;
    private EditText editTextGenre;
    private EditText editTextAddress;
    private EditText editTextBirthday;

    private Person person;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        getSupportActionBar().setHomeButtonEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        bindUI();

        Bundle extras = getIntent().getExtras();
        if (extras != null) {
            person = (Person) getIntent().getSerializableExtra("people");

            getSupportActionBar().setTitle(person.getName());

            Picasso.get().load(person.getPhoto()).fit().into(imageViewPhoto);

            editTextName.setText(person.getName());
            editTextCareer.setText(person.getCareer());
            editTextGenre.setText(person.getGenre());
            editTextAddress.setText(person.getAddress());
            editTextBirthday.setText(person.getBirthday());
        }
    }

    public void bindUI(){
        imageViewPhoto = findViewById(R.id.imageViewPhotoDetail);
        editTextName = findViewById(R.id.editTextName);
        editTextCareer = findViewById(R.id.editTextCareer);
        editTextGenre = findViewById(R.id.editTextGenre);
        editTextAddress = findViewById(R.id.editTextAddress);
        editTextBirthday = findViewById(R.id.editTextBirthday);

    }
}

