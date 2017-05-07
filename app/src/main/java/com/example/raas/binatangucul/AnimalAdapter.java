package com.example.raas.binatangucul;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

/**
 * Created by RAAS on 5/7/2017.
 */

public class AnimalAdapter extends RecyclerView.Adapter<AnimalAdapter.MyViewHolder>{

    List<AnimalModel> animalModellist;
    Context context;

    public  AnimalAdapter(Context context,List<AnimalModel> animalModellist){
        this.animalModellist=animalModellist;
        this.context=context;
    }
    @Override
    public AnimalAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.aaa,parent,false);
        return  new MyViewHolder(itemView);

    }

    @Override
    public void onBindViewHolder(AnimalAdapter.MyViewHolder holder, int position) {

        final AnimalModel animalModel = animalModellist.get(position);
        holder.judul.setText(animalModel.getNamaIndo());
        holder.gambar.setImageResource(animalModel.getGambar());
        holder.layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context, animalModel.getNamaEng(),Toast.LENGTH_SHORT).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return animalModellist.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView judul;
        ImageView gambar;
        LinearLayout layout;

        public MyViewHolder(View itemView) {
            super(itemView);

            judul = (TextView) itemView.findViewById(R.id.judul);
            gambar= (ImageView) itemView.findViewById(R.id.gambar);
            layout= (LinearLayout) itemView.findViewById(R.id.layout);

        }
    }
}
