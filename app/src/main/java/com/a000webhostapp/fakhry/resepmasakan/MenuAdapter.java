package com.a000webhostapp.fakhry.resepmasakan;

import android.content.Context;
import android.content.Intent;
import android.support.v7.view.menu.MenuView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Bro on 09/10/2017.
 */

public class MenuAdapter extends RecyclerView.Adapter<MenuAdapter.MenuHolder> {

    String data1[], data2[];
    int img[];
    Context ctx;

    public MenuAdapter(Context ct, String s1[], String s2[], int it[]){
        ctx = ct;
        data1 = s1;
        data2 = s2;
        img = it;
    }

    @Override
    public MenuHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater myInflator = LayoutInflater.from(ctx);
        View myOwnView =  myInflator.inflate(R.layout.menu_rows, parent, false);

        return new MenuHolder(myOwnView);
    }

    @Override
    public void onBindViewHolder(MenuHolder holder, int position) {
        holder.t1.setText(data1[position]);
        holder.t2.setText(data2[position]);
        holder.myImg.setImageResource(img[position]);
    }

    @Override
    public int getItemCount() {
        return data1.length;
    }

    public class MenuHolder extends RecyclerView.ViewHolder {
        TextView t1, t2;
        ImageView myImg;
        public MenuHolder(View itemView) {
            super(itemView);
            t1 = (TextView)itemView.findViewById(R.id.Menu_judul);
            t2 = (TextView)itemView.findViewById(R.id.Menu_diskripsi);
            myImg = (ImageView)itemView.findViewById(R.id.Menu_image);

        }
    }
}
