package com.a000webhostapp.fakhry.resepmasakan;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.view.menu.MenuView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    RecyclerView List;
    String s1[], s2[];
    int ImageResource [] = {R.drawable.opor, R.drawable.rendang, R.drawable.gudeg, R.drawable.gule, R.drawable.sate, R.drawable.nasigoreng, R.drawable.pepes};

    MenuAdapter ad;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        List = (RecyclerView)findViewById(R.id.ListMenu);

        s1 = getResources().getStringArray(R.array.menu);
        s2 = getResources().getStringArray(R.array.desc);

        ad = new MenuAdapter(this,s1,s2,ImageResource);

        List.setAdapter(ad);
        List.setLayoutManager(new LinearLayoutManager(this));
    }
    public void Menu_Detail(View v){
        TextView judul, deskripsi;
        ImageView img;
        Bundle a = getIntent().getExtras();

        judul = (TextView)v.findViewById(R.id.Menu_judul);
        deskripsi = (TextView)v.findViewById(R.id.Menu_diskripsi);
        img = (ImageView)v.findViewById(R.id.Menu_image);

        Intent in = new Intent(MainActivity.this, Detail_Menu.class);
        in.putExtra("judul", judul.getText());
        in.putExtra("desc", deskripsi.getText());
        /*in.putExtra("img", ImageResource.toString());*/
        /*in.putExtra("img", getResources().getIntArray(ImageResource[a.getInt("img")]));*/
        startActivity(in);
    }
}
