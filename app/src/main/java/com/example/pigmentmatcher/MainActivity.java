package com.example.pigmentmatcher;

import android.content.ContentResolver;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileDescriptor;
import java.io.InputStream;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;

import pl.droidsonroids.gif.GifDrawable;

public class MainActivity extends AppCompatActivity {
    Button photoBtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initviews();
        initClickListeners();
//        initGifs();

    }

    private void initviews() {
        photoBtn = (Button) findViewById(R.id.camera_btn);
    }

    private void initClickListeners() {
        photoBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), CameraCaptureActivity.class);
                startActivity(intent);
            }
        });
    }




}
