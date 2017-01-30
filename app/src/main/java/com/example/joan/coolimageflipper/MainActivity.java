package com.example.joan.coolimageflipper;

import android.graphics.drawable.Drawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

import com.example.material.joanbarroso.flipper.CoolImageFlipper;

public class MainActivity extends AppCompatActivity {

    CoolImageFlipper flipper;
    Drawable pizza;
    Drawable burger;
    boolean isBurger = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        flipper = new CoolImageFlipper(this);
        pizza = getResources().getDrawable(R.drawable.pz);
        burger = getResources().getDrawable(R.drawable.bg);

    }

    public void foodClicked(View view) {
        if (isBurger)
            flipper.flipImage(pizza, ((ImageView) view));
        else
            flipper.flipImage(burger, ((ImageView) view));

        isBurger = !isBurger;
    }
}
