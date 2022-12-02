package com.example.aintakhibani;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class LikeDeslike extends AppCompatActivity {

            Button pepsiBtn;
            Button cokeBtn;

            TextView pepsiText;
            TextView cokeText;

            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate( savedInstanceState );
                setContentView( R.layout.activity_like_deslike );

                cokeText = findViewById( R.id.tv_coke_count );

                pepsiText = findViewById( R.id.tv_pepsi_count );

                //Bouton is now leasing clear
                cokeBtn = findViewById( R.id.btn_coke_vote );

                pepsiBtn = findViewById( R.id.btn_pepsi_vote );
            }

            public void opposerCliced(View v){
                String cokeCount = cokeText.getText().toString().trim();
                int count = Integer.parseInt( cokeCount );
                count++;
                cokeText.setText( String.valueOf( count ) );
            }
            public void supporterCliced(View v){
                String pepsiCount = pepsiText.getText().toString().trim();
                int count = Integer.parseInt( pepsiCount );
                count++;
                pepsiText.setText( String.valueOf( count ) );
            }

        }