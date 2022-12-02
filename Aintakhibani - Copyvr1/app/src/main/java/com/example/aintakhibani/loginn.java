package com.example.aintakhibani;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.io.Serializable;
import java.util.ArrayList;

public class loginn extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_loginn );


        Button loginbtn = findViewById( R.id.loginbtn );
        TextView pascode = findViewById( R.id.username );

        loginbtn.setOnClickListener( new View.OnClickListener() {
            @Override
            public void onClick(View view) { openactivity3()};
        } );
        Intent intent2 = new Intent( loginn.this, MainActivity.class );
        startActivity( intent2 );
    }
}