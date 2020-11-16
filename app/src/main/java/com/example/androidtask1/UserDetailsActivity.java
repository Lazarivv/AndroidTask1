package com.example.androidtask1;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class UserDetailsActivity extends AppCompatActivity {

    TextView username,email,dob,firstname,lastname;
    UserResponse userResponse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_details);

        username  = findViewById(R.id.username);
        email  = findViewById(R.id.email);
        dob  = findViewById(R.id.dob);
        firstname = findViewById(R.id.firstname);
        lastname = findViewById(R.id.lastname);

        Intent intent = getIntent();
        if(intent.getExtras() !=null){
            userResponse = (UserResponse) intent.getSerializableExtra("data");

            String usernamedata = userResponse.getUsername();
            String useremail = userResponse.getEmail();
            String birthdate = userResponse.getDob();
            String userfirstname = userResponse.getFirstName();
            String userlastname = userResponse.getLastName();

            username.setText("Username: " + usernamedata);
            email.setText("Email: "+ useremail);
            dob.setText("Birthdate: " +birthdate);
            firstname.setText("FirstName: "+ userfirstname);
            lastname.setText("LastName: "+ userlastname);
        }
    }
}
