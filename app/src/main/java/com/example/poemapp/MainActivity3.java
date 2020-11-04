package com.example.poemapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.IOException;

public class MainActivity3 extends AppCompatActivity {

    MediaPlayer player1, player2, player3;
    Button btnPlay, btnPause, btnStop;
    boolean isPlaying = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        ImageView imgPoem;
        TextView txtName, txtLyrics;


        imgPoem = findViewById(R.id.img_poem);
        txtName = findViewById(R.id.txt_name);
        txtLyrics = findViewById(R.id.txt_lyrics);
        btnPlay = findViewById(R.id.btn_play);
        btnPause = findViewById(R.id.btn_pause);
        btnStop = findViewById(R.id.btn_stop);


        String getRecipe = getIntent().getExtras().getString("poem");

        if (getRecipe.equals("poem1")) {
            imgPoem.setImageResource(R.drawable.poem1);
            txtName.setText("Bulbul Pakhi");
            txtLyrics.setText(R.string.poem1);
            player1 = MediaPlayer.create(MainActivity3.this, R.raw.poem1);

            btnPlay.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (!isPlaying) {
                        player1.start();
                        isPlaying = true;
                    }
                }
            });
            btnPause.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (isPlaying) {
                        player1.pause();
                        isPlaying = false;
                    }
                }
            });

            btnStop.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (isPlaying) {
                        player1.stop();
                        isPlaying = false;


                        try {
                            player1.prepare();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }


                    }
                }
            });


        } else if (getRecipe.equals("poem2")) {
            imgPoem.setImageResource(R.drawable.poem2);
            txtName.setText("Twinkle Twinkle");
            txtLyrics.setText(R.string.poem2);
            player2 = MediaPlayer.create(MainActivity3.this, R.raw.poem2);

            btnPlay.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (!isPlaying) {
                        player2.start();
                        isPlaying = true;
                    }
                }
            });
            btnPause.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (isPlaying) {
                        player2.pause();
                        isPlaying = false;
                    }
                }
            });

            btnStop.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (isPlaying) {
                        player2.stop();
                        isPlaying = false;


                        try {
                            player2.prepare();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }


                    }
                }
            });




        } else if (getRecipe.equals("poem3")) {
            imgPoem.setImageResource(R.drawable.poem3);
            txtName.setText("Johny Johny");
            txtLyrics.setText(R.string.poem3);
            player3 = MediaPlayer.create(MainActivity3.this, R.raw.poem3);

            btnPlay.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (!isPlaying) {
                        player3.start();
                        isPlaying = true;
                    }
                }
            });
            btnPause.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (isPlaying) {
                        player3.pause();
                        isPlaying = false;
                    }
                }
            });

            btnStop.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (isPlaying) {
                        player3.stop();
                        isPlaying = false;


                        try {
                            player3.prepare();
                        } catch (IOException e) {
                            e.printStackTrace();
                        }


                    }
                }
            });


        }








    }
}

   




