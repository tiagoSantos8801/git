package com.example.jamiltondamasceno.sliderprojeto;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.heinrichreimersoftware.materialintro.app.IntroActivity;
import com.heinrichreimersoftware.materialintro.slide.FragmentSlide;
import com.heinrichreimersoftware.materialintro.slide.SimpleSlide;

public class MainActivity extends IntroActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);

        setButtonBackVisible(false);
        setButtonNextVisible(false);

        addSlide(new FragmentSlide.Builder()
              .background(android.R.color.white)
              .fragment(R.layout.intro_1)
              .build()
        );

        addSlide(new FragmentSlide.Builder()
                .background(android.R.color.white)
                .fragment(R.layout.intro_2)
                .build()
        );

        /*
        setButtonBackVisible(false);
        setButtonNextVisible(false);

        addSlide(new SimpleSlide.Builder()
                .title("Titulo")
                .description("Descricao")
                .image(R.drawable.um)
                .background(android.R.color.holo_orange_light)
                .build()

        );

        addSlide(new SimpleSlide.Builder()
                .title("Titulo 2")
                .description("Descricao 2")
                .image(R.drawable.dois)
                .background(android.R.color.holo_orange_light)
                .build()

        );

        addSlide(new SimpleSlide.Builder()
                .title("Titulo 3")
                .description("Descricao 3")
                .image(R.drawable.tres)
                .background(android.R.color.holo_orange_light)
                .build()

        );*/



    }
}
