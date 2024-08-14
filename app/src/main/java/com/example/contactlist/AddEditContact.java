package com.example.contactlist;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import androidx.appcompat.widget.Toolbar;

public class AddEditContact extends AppCompatActivity {

    private ImageView profileIv;
    private EditText nameEt,phoneEt,emailEt;
    private FloatingActionButton fab;

    String name,email,phone;

    ActionBar actionBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_edit_contact);
        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setTitle("Adicionar Contato");
            actionBar.setDisplayHomeAsUpEnabled(true);
            actionBar.setDisplayShowHomeEnabled(true);
        }

        profileIv = findViewById(R.id.profileIv);
        nameEt = findViewById(R.id.nameEt);
        phoneEt = findViewById(R.id.phoneEt);
        emailEt = findViewById(R.id.emailEt);
        fab = findViewById(R.id.fab);

        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                saveData();
            }
        });
    }


    private void saveData() {
        name = nameEt.getText().toString();
        phone = phoneEt.getText().toString();
        email = emailEt.getText().toString();

        if(!name.isEmpty() || !phone.isEmpty() || !email.isEmpty()) {

        } else {
            Toast.makeText(getApplicationContext(), "Preencha ao menos um campo", Toast.LENGTH_SHORT).show();
        }
    }
    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return super.onSupportNavigateUp();
    }
}
