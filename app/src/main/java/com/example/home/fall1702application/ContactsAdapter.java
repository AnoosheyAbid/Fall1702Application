package com.example.home.fall1702application;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.ActivityCompat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by home on 10/16/2017.
 */

public class ContactsAdapter extends ArrayAdapter<Contacts> {

    Contacts c = new Contacts();
    ImageView pic;
    TextView name;
    Button btn;

    class ViewHolder {
        ImageView viewpic;
        TextView viewname;
        Button viewbtn;
    }

    public static final String TAG = "MTAG";

    public ContactsAdapter(@NonNull Context context, List<Contacts> items) {
        super(context, 0, items);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {


        View view = convertView;
        ViewHolder vh;
        c = getItem(position);


        if (view == null) {
            view = LayoutInflater.from(getContext()).inflate(R.layout.contactlayout, parent, false);

            ImageView image = (ImageView) view.findViewById(R.id.pic);
            TextView name = (TextView) view.findViewById(R.id.name);
            Button button = (Button) view.findViewById(R.id.button);

            vh = new ViewHolder();
            vh.viewpic = image;
            vh.viewname = name;
            vh.viewbtn = button;
            view.setTag(vh);

        }

        vh = (ViewHolder) view.getTag();

        //vh.viewpic.setText(c.getName());
        vh.viewname.setText(c.getName());
        //vh.viewbtn.setText(c.getGender());

        vh.viewbtn = (Button) view.findViewById(R.id.button);
        vh.viewbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Toast.makeText(getContext(), "Contact Removed", Toast.LENGTH_SHORT).show();
            }


        });

        return view;


    }
}
