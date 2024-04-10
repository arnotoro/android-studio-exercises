package com.example.week9;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioGroup;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class AddUserActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_add_user);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }

    public void addUser(View view) {
        String firstName = ((EditText) findViewById(R.id.editFirstName)).getText().toString();
        String lastName = ((EditText) findViewById(R.id.editLastName)).getText().toString();
        String email = ((EditText) findViewById(R.id.editEmail)).getText().toString();

        RadioGroup degreeProgram = findViewById(R.id.radioDegreeProgram);

        int checkedRadioButtonId = degreeProgram.getCheckedRadioButtonId();
        if (checkedRadioButtonId == R.id.ceRadioButton) {
            UserStorage.getInstance().addUser(new User(firstName, lastName, email, "Computational Engineering"));
        } else if (checkedRadioButtonId == R.id.seRadioButton) {
            UserStorage.getInstance().addUser(new User(firstName, lastName, email, "Software Engineering"));
        } else if (checkedRadioButtonId == R.id.imRadioButton) {
            UserStorage.getInstance().addUser(new User(firstName, lastName, email, "Industrial Management"));
        } else if (checkedRadioButtonId == R.id.eeRadioButton) {
            UserStorage.getInstance().addUser(new User(firstName, lastName, email, "Electrical Engineering"));
        }
    }
}