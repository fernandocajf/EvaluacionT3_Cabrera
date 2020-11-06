package com.cabrera.jorge.evaluacionT3;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import com.cabrera.jorge.evaluacionT3.adapter.AnimeAdapter;

import java.util.ArrayList;
import java.util.List;

public class ListaAnimes extends AppCompatActivity {


    public class Animes{
        public String nombre;
        public String contenido;
        public String url;

        public Animes() {

        }
        public Animes(String nombre, String contenido, String url) {
            this.nombre = nombre;
            this.contenido = contenido;
            this.url = url;
        }

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista_animes);

        RecyclerView rvAnime = findViewById(R.id.rvAnime);
        rvAnime.setHasFixedSize(true);
        rvAnime.setLayoutManager(new LinearLayoutManager(this));

        List<Animes> data = new ArrayList<>();
        data.add(new Animes(
                "Dragon Ball",
                "Dragon Ball es un manga escrito e ilustrado por Akira Toriyama. Fue publicado originalmente en la revista Shōnen Jump, de la editorial japonesa Shūeisha, entre 1984 y 1995",
                "https://as01.epimg.net/meristation/imagenes/2019/12/12/avances/1576175321_723620_1576327909_noticia_normal.jpg"));
        data.add(new Animes(
                "Naruto",
                "Naruto, romanizada como NARUTO, es una serie de manga escrita e ilustrada por Masashi Kishimoto.",
                "https://www.cinemascomics.com/wp-content/uploads/2020/10/naruto.jpeg"));
        data.add(new Animes(
                "Pokemon",
                "La serie sigue las aventuras de Ash Ketchum y su amigo Brock ",
                "https://assets.pokemon.com/assets//cms2-es-xl/img/watch-pokemon-tv/_tiles/season04/season04-announce-169.jpg"));
        data.add(new Animes(
                "Digimon",
                "Digimon Adventure, es una serie de anime producida por TOEI ANIMATION. Es la primera serie de la franquicia Digimon, creada por Akiyoshi Hongō.",
                "https://www.latercera.com/resizer/nUfi0cUHUQZcdgHKMKJ4Z02l7Pg=/900x600/smart/arc-anglerfish-arc2-prod-copesa.s3.amazonaws.com/public/MUDQBCZAYVGLVDG7CHIVAGFXQY.jpg"));
        data.add(new Animes(
                "Inuyasha",
                "InuYasha, romanizado como INUYASHA y también conocido como Sengoku Otogizōshi InuYasha, es un manga escrito e ilustrado por Rumiko Takahashi, cuya adaptación a serie de anime fue dirigida por Yasunao Aoki y Masashi Ikeda..",
                "https://upload.wikimedia.org/wikipedia/commons/thumb/2/20/Logo_de_InuYasha_en_kanji.png/1920px-Logo_de_InuYasha_en_kanji.png"));
        data.add(new Animes(
                "Yu-Gi-Oh!",
                "Yu-Gi-Oh! es un manga creado por Kazuki Takahashi, que ha dado lugar a una franquicia, además de múltiples series de anime, juegos de cartas y numerosos videojuegos..",
                "https://as01.epimg.net/meristation/imagenes/2020/03/13/cover/731531331584090795.jpg"));
        data.add(new Animes(
                "One Piece",
                "One Piece es una serie de aventuras de acción que sigue la historia de Monkey D. Luffy, un chico que posee el poder de la elasticidad con la que consigue dar puñetazos y patadas tremendos.",
                "http://omegacenter.es/blog/wp-content/uploads/2016/08/onepieceanime-1024x747.jpg"));
        data.add(new Animes(
                "Bleach",
                "Con tan sólo quince años Ichigo Kurosaki es un típico adolescente con habilidades de combate, dos hermanas que cuidar y un rasgo especial: puede ver fantasmas.",
                "http://omegacenter.es/blog/wp-content/uploads/2016/08/bleachanime.jpg"));
        data.add(new Animes(
                "Hunter x Hunter",
                "Gon Freecss vive en un mundo lleno de cazadores, personas que son capaces de realizar hazañas casi imposibles, tales como la búsqueda de los criminales más peligrosos o de tesoros perdidos.",
                "http://omegacenter.es/blog/wp-content/uploads/2016/08/hunterxhunteranime-1024x640.jpg"));
        data.add(new Animes(
                "Code Geass",
                "Cuando un niño aparentemente normal adquiere la capacidad de controlar a la gente para hacer su voluntad, usa este poder para derribar el imperio de la poderosa Britannia que se ha hecho cargo de todo el planeta.",
                "http://omegacenter.es/blog/wp-content/uploads/2016/08/codegeassanime-1024x640.png"));


        Context context = this.getApplicationContext();

        AnimeAdapter adapter = new AnimeAdapter(data,context);

        rvAnime.setAdapter(adapter);



    }
}