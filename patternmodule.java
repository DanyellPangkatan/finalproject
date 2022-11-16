package com.example.imageclassification;

import androidx.appcompat.app.AppCompatActivity;

import android.app.ActivityManager;
import android.app.Dialog;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class patternmodule extends AppCompatActivity {
    Dialog myDialog;
    Dialog myDialog2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_patternmodule);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        myDialog = new Dialog(this);
        myDialog2 = new Dialog(this);
        ImageButton btnBack = (ImageButton) findViewById(R.id.backbtn);

        Intent backIntent = new Intent(getApplicationContext(),fourtofivemoduleandactivitiesselection.class);

        btnBack.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        finish();
                    }
                }
        );

        ImageView homeIcon = (ImageView) findViewById(R.id.navhome);
        ImageView uploadIcon = (ImageView) findViewById(R.id.imageView15);
        Intent ageGroup = new Intent(getApplicationContext(),agegroups.class);
        Intent uploadPage = new Intent(getApplicationContext(),uploadpageact.class);

        Intent thisnew = new Intent (this, MyService.class);

        Intent seti = new Intent(getApplicationContext(),settingsact.class);
        ImageView settings = (ImageView) findViewById(R.id.imageView16);
        settings.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        startActivity(seti);

                    }
                }
        );

        homeIcon.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        startActivity(ageGroup);
                        finish();
                    }
                }
        );

        uploadIcon.setOnClickListener(
                new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        startActivity(uploadPage);
                        finish();
                    }
                }
        );

    }
    public void ShowPopup(View v) {
        TextView txtclose,txtclose2;
        ImageView m1,m2;


        myDialog.setContentView(R.layout.patternmodule1);
        txtclose =(TextView) myDialog.findViewById(R.id.txtclose);
        m1 = (ImageView) myDialog.findViewById(R.id.basicsound2);
        final MediaPlayer mp =  MediaPlayer.create(this, R.raw.pattern_star);

        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.dismiss();
            }
        });
        m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();

            }
        });

        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();
    }

    public void ShowPopup2(View v) {
        TextView txtclose,txtclose2;
        ImageView m1,m2;


        myDialog.setContentView(R.layout.patternmodule2);
        txtclose =(TextView) myDialog.findViewById(R.id.txtclose);
        m1 = (ImageView) myDialog.findViewById(R.id.basicsound2);
        final MediaPlayer mp =  MediaPlayer.create(this, R.raw.pattern_dog);

        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.dismiss();
            }
        });
        m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();

            }
        });

        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();
    }

    public void ShowPopup3(View v) {
        TextView txtclose,txtclose2;
        ImageView m1,m2;


        myDialog.setContentView(R.layout.patternmodule3);
        txtclose =(TextView) myDialog.findViewById(R.id.txtclose);
        m1 = (ImageView) myDialog.findViewById(R.id.basicsound2);
        final MediaPlayer mp =  MediaPlayer.create(this, R.raw.pattern_fish);

        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.dismiss();
            }
        });
        m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();

            }
        });

        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();
    }

    public void ShowPopup4(View v) {
        TextView txtclose,txtclose2;
        ImageView m1,m2;


        myDialog.setContentView(R.layout.patternmodule4);
        txtclose =(TextView) myDialog.findViewById(R.id.txtclose);
        m1 = (ImageView) myDialog.findViewById(R.id.basicsound2);
        final MediaPlayer mp =  MediaPlayer.create(this, R.raw.pattern_starfish);

        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.dismiss();
            }
        });
        m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();

            }
        });

        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();
    }

    public void ShowPopup5(View v) {
        TextView txtclose,txtclose2;
        ImageView m1,m2;


        myDialog.setContentView(R.layout.patternmodule5);
        txtclose =(TextView) myDialog.findViewById(R.id.txtclose);
        m1 = (ImageView) myDialog.findViewById(R.id.basicsound2);
        final MediaPlayer mp =  MediaPlayer.create(this, R.raw.pattern_mouse);

        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.dismiss();
            }
        });
        m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();

            }
        });

        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();
    }

    public void ShowPopup6(View v) {
        TextView txtclose,txtclose2;
        ImageView m1,m2;


        myDialog.setContentView(R.layout.patternmodule6);
        txtclose =(TextView) myDialog.findViewById(R.id.txtclose);
        m1 = (ImageView) myDialog.findViewById(R.id.basicsound2);
        final MediaPlayer mp =  MediaPlayer.create(this, R.raw.pattern_car);

        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.dismiss();
            }
        });
        m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();

            }
        });

        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();
    }
    public void ShowPopup7(View v) {
        TextView txtclose,txtclose2;
        ImageView m1,m2;


        myDialog.setContentView(R.layout.patternmodule7);
        txtclose =(TextView) myDialog.findViewById(R.id.txtclose);
        m1 = (ImageView) myDialog.findViewById(R.id.basicsound2);
        final MediaPlayer mp =  MediaPlayer.create(this, R.raw.pattern_square);

        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.dismiss();
            }
        });
        m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();

            }
        });

        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();
    }
    public void ShowPopup8(View v) {
        TextView txtclose,txtclose2;
        ImageView m1,m2;


        myDialog.setContentView(R.layout.patternmodule8);
        txtclose =(TextView) myDialog.findViewById(R.id.txtclose);
        m1 = (ImageView) myDialog.findViewById(R.id.basicsound2);
        final MediaPlayer mp =  MediaPlayer.create(this, R.raw.pattern_triangle);

        txtclose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                myDialog.dismiss();
            }
        });
        m1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mp.start();

            }
        });

        myDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
        myDialog.show();
    }
    @Override
    public void onPause() {
        Context context = getApplicationContext();
        ActivityManager am = (ActivityManager) context.getSystemService(Context.ACTIVITY_SERVICE);
        List<ActivityManager.RunningTaskInfo> taskInfo = am.getRunningTasks(1);
        if (!taskInfo.isEmpty()) {
            ComponentName topActivity = taskInfo.get(0).topActivity;
            if (!topActivity.getPackageName().equals(context.getPackageName())) {
                stopService(new Intent(this, MyService.class));
            }
        }
        super.onPause();
    }


    public void onBackPressed(){
    }




}

