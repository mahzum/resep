package com.a000webhostapp.fakhry.resepmasakan;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Detail_Menu extends AppCompatActivity {

    TextView Judul, Desc;
    ImageView img;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail__menu);

        Judul   = (TextView)    findViewById(R.id.detail_judul);
        Desc    = (TextView)    findViewById(R.id.detail_txt);
        img     = (ImageView)   findViewById(R.id.detail_img);

        if (getIntent().getExtras()!=null){
            Bundle a = getIntent().getExtras();

            Judul.setText(a.getString("judul"));
            Desc.setText(a.getString("desc"));
            /*img.setImageResource(a.getInt("img"));*/
        }
    }

}
