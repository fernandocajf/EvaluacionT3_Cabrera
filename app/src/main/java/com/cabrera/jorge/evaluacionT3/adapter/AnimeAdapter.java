package com.cabrera.jorge.evaluacionT3.adapter;

import android.content.Context;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.cabrera.jorge.evaluacionT3.ListaAnimes;
import com.cabrera.jorge.evaluacionT3.R;

import java.util.List;

public class AnimeAdapter extends RecyclerView.Adapter<AnimeAdapter.AnimeViewHolder> {


    private List<ListaAnimes.Animes> data;
    private Context context;
    public AnimeAdapter(List<ListaAnimes.Animes> data, Context context){
        this.data = data;
        this.context = context;
    }

    int[] images = {R.drawable.blackstar,R.drawable.whitestar};
    int imageCurrent = 0;

    @NonNull
    @Override
    public AnimeViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_anime,parent,false);
        AnimeViewHolder animeViewHolder = new AnimeViewHolder(view);

        return animeViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull AnimeAdapter.AnimeViewHolder holder, int position) {

        TextView textNameAnim = holder.itemView.findViewById(R.id.textNameAnim);
        TextView textContentAnim = holder.itemView.findViewById(R.id.textContentAnim);
        TextView textFavorito = holder.itemView.findViewById(R.id.textFavorito);
        ImageView imageAnim = holder.itemView.findViewById(R.id.imageAnim);


        ImageView favoriteButton = holder.itemView.findViewById(R.id.favoriteButton);

        String nombre = data.get(position).nombre;
        String contenido = data.get(position).contenido;
        String url = data.get(position).url;

        textNameAnim.setText(nombre);
        textContentAnim.setText(contenido);

        Glide.with(context).load(url).into(imageAnim);

        favoriteButton.setOnClickListener(view ->
        {
            if(imageCurrent == 0) {
                favoriteButton.setImageResource(images[0]);
                textFavorito.setText("Favorito");
                imageCurrent++;
            }else {
                favoriteButton.setImageResource(images[1]);
                textFavorito.setText(null);
                imageCurrent = 0;
            }
        });


    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    public class AnimeViewHolder extends RecyclerView.ViewHolder{

        public AnimeViewHolder(@NonNull View itemView){
            super(itemView);
        }

    }

}