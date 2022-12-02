package com.example.aintakhibani;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<Shapes> shapesList = new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_item );
//ما لقيت اسامي غير هذي هههه
        Shapes circle = new Shapes( "circle", R.drawable.mahmad);
        Shapes square = new Shapes( "square" , R.drawable.salman );
        Shapes octagon = new Shapes( "octagon", R.drawable.habeb );

        shapesList.add( circle );
        shapesList.add( square );
        shapesList.add( octagon );

        com.example.aintakhibani.ShapesAdapter shapesAdapter = new com.example.aintakhibani.ShapesAdapter( this, 0, shapesList);
        ListView listView = findViewById( R.id.listView );
        listView.setAdapter( shapesAdapter );
    }

}
