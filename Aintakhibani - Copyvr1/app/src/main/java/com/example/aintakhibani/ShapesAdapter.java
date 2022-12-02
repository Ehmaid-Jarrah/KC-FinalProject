package com.example.aintakhibani;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.List;

public class ShapesAdapter extends ArrayAdapter<Shapes> {
    List<Shapes> shapesList;
    public ShapesAdapter(@NonNull Context context, int resource, @NonNull List<Shapes> objects) {
        super( context, resource, objects );

        shapesList = objects;


    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View view = LayoutInflater.from( getContext()).inflate( R.layout.list_item , parent , false );

        Shapes current = shapesList.get( position );

        TextView shapeName = view.findViewById(R.id.shape_name);
        ImageView shapeImage = view.findViewById( R.id.shape_image );
        shapeName.setText( current.getShapeName());
        shapeImage.setImageResource( current.getShapeImage());
        return view;
    }
}
