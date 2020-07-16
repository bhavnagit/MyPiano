package com.example.mypiano;

import androidx.appcompat.app.AppCompatActivity;

import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private SoundPool soundpool;
    private int sound_a, sound_b, sound_c, sound_d, sound_e, sound_f, sound_g, sound_h, sound_i, sound_j, sound_k, sound_l;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            soundpool = new SoundPool.Builder().setMaxStreams(5).build();
        } else {
            soundpool = new SoundPool(5, AudioManager.STREAM_MUSIC, 0);
        }
        sound_a = soundpool.load(this, R.raw.a, 1);
        sound_b = soundpool.load(this, R.raw.b, 1);
        sound_c = soundpool.load(this, R.raw.c, 1);
        sound_d = soundpool.load(this, R.raw.d, 1);
        sound_e = soundpool.load(this, R.raw.e, 1);
        sound_f = soundpool.load(this, R.raw.f, 1);
        sound_g = soundpool.load(this, R.raw.g, 1);
        sound_h = soundpool.load(this, R.raw.h, 1);
        sound_i = soundpool.load(this, R.raw.i, 1);
        sound_j = soundpool.load(this, R.raw.j, 1);
        sound_k = soundpool.load(this, R.raw.k, 1);
        sound_l = soundpool.load(this, R.raw.l, 1);
    }

    public void click(View view) {
        switch (view.getId()) {
            case R.id.a:
                soundpool.play(sound_a,1,1,0,0,1);
                break;

            case R.id.b:
                soundpool.play(sound_b,1,1,0,0,1);
                break;

            case R.id.c:
                soundpool.play(sound_c,1,1,0,0,1);
                break;

            case R.id.d:
                soundpool.play(sound_d,1,1,0,0,1);
                break;

            case R.id.e:
                soundpool.play(sound_e,1,1,0,0,1);
                break;

            case R.id.f:
                soundpool.play(sound_f,1,1,0,0,1);
                break;

            case R.id.g:
                soundpool.play(sound_g,1,1,0,0,1);
                break;

            case R.id.h:
                soundpool.play(sound_h,1,1,0,0,1);
                break;

            case R.id.i:
                soundpool.play(sound_i,1,1,0,0,1);
                break;

            case R.id.j:
                soundpool.play(sound_j,1,1,0,0,1);
                break;

            case R.id.k:
                soundpool.play(sound_k,1,1,0,0,1);
                break;

            case R.id.l:
                soundpool.play(sound_l,1,1,0,0,1);
                break;

        }
    }
}