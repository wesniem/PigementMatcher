package com.example.pigmentmatcher;


import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.ImageFormat;
import android.hardware.Camera;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Environment;
import android.provider.MediaStore;
import android.util.Log;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.FileProvider;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;

import static android.os.Environment.getExternalStorageDirectory;

public class CameraCaptureActivity extends AppCompatActivity {
    private Context myContext;
    static final int REQUEST_IMAGE_CAPTURE = 1;

//    private static final String TAG ="ghgvgnv" ;
//    private Camera mCamera;
//        private Camera.PictureCallback mPicture;
//        private CameraManager cameraManager;
//        private CameraPreview mPreview;
//        private Context myContext;
        private ImageView frameLayout;
//
        @Override
        protected void onCreate(Bundle savedInstanceState) {

            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_launch_camera);
            myContext = this;
            frameLayout = findViewById(R.id.camera_preview);
                Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                if (takePictureIntent.resolveActivity(getPackageManager()) != null) {
                    startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE);
                }
            }

//        private FrameLayout frameLayout;
//            super.onCreate(savedInstanceState);
//            setContentView(R.layout.activity_launch_camera);
//            myContext = this;
//            cameraManager = new CameraManager(this);
//
//            frameLayout= (FrameLayout) findViewById(R.id.camera_preview);
//
//            mPreview = new CameraPreview(this, mCamera);
//            frameLayout.addView(mPreview);
//            int camerasNumber = Camera.getNumberOfCameras();
//            if (camerasNumber > 1) {
//                //release the old camera instance
//                //switch camera, from the front and the back and vice versa
//
//                releaseCamera();
//                chooseCamera();
//            } else {
//                Toast toast = Toast.makeText(getApplicationContext(), "Sorry, your phone has only one camera!", Toast.LENGTH_LONG);
//                toast.show();
//            }
//
//            Button captureBtn = (Button) findViewById(R.id.button_capture);
//            captureBtn.setOnClickListener(new View.OnClickListener() {
//                @Override
//                public void onClick(View v) {
//                    mCamera.takePicture(null, null, mPicture);
//                }
//            });
        }
//
//        public void onResume(){
//
//            super.onResume();
//            if (!cameraManager.hasCamera()){
//                Toast toast = Toast.makeText(myContext, "Sorry, your phone does not have a camera!", Toast.LENGTH_LONG);
//                toast.show();
//                finish();
//            }
//            if (mCamera == null) {
//                //if the front facing camera does not exist
//                if (CameraManager.findFrontFacingCamera() < 0) {
//                    Toast.makeText(this, "No front facing camera found.", Toast.LENGTH_LONG).show();
//                }
//                try {
//                    mCamera = Camera.open(CameraManager.findFrontFacingCamera());
//                    mPicture = getPictureCallback();
//                    mPreview.refreshCamera(mCamera);
//                }
//                catch (Exception e){
//                    Log.e("camera", e.getMessage());
//                }
//            }
//        }
//
//
//        @Override
//        protected void onPause() {
//            super.onPause();
//            //when on Pause, release camera in order to be used from other applications
//            releaseCamera();           // release the camera immediately on pause event
//        }
//
//        @Override
//        public void onBackPressed() {
//            super.onBackPressed();
//            releaseCamera();
//            finish();
//
//        }
//
//        private void releaseCamera(){
//            if (mCamera != null){
//                mCamera.release();        // release the camera for other applications
//                mCamera = null;
//            }
//        }
//
//        public void chooseCamera() {
//            int cameraId = CameraManager.findFrontFacingCamera();
//            if (cameraId >= 0) {
//                //open the backFacingCamera
//                //set a picture callback
//                //refresh the preview
//                try {
//                    mCamera = Camera.open(cameraId);
//                    mPicture = getPictureCallback();
//                    mPreview.refreshCamera(mCamera);
//                }
//                catch(Exception e){
//                    Log.e("Camera",e.getMessage());
//                }
//            }
//        }
//
//
//        private Camera.PictureCallback getPictureCallback() {
//            Camera.PictureCallback picture = new Camera.PictureCallback() {
//
//                @RequiresApi(api = Build.VERSION_CODES.KITKAT)
//                @Override
//                public void onPictureTaken(byte[] data, Camera camera) {
//
//                    File pictureFile = generateMediaFile();
//
//                    try {
//                        ImageProcessing imageProcessing = new ImageProcessing(myContext);
//                        imageProcessing.createImage(pictureFile, data);
//                    } catch (IOException e) {
//                        e.printStackTrace();
//                    }
//
//                    //refresh camera to continue preview
//                    mPreview.refreshCamera(mCamera);
//                }
//            };
//            return picture;
//        }
//
//        @RequiresApi(api = Build.VERSION_CODES.KITKAT)
//        public File generateMediaFile(){
//            // Create an image file name
//            String timeStamp = new SimpleDateFormat("yyyyMMdd_HHmmss", Locale.getDefault()).format(new Date());
//            String imageFileName = "JPEG_" + timeStamp + "_";
//
//            File storageDir =
//                    new File(Environment.getExternalStoragePublicDirectory(
//                            Environment.DIRECTORY_DOCUMENTS).getPath() + "/pigmentMatcher");
//            storageDir.mkdir();
//
//            File imageFile = null;
//
//            try {
//                imageFile = File.createTempFile(
//                        imageFileName,  /* prefix */
//                        ".jpg",         /* suffix */
//                        storageDir      /* directory */
//                );
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//
//            return imageFile;
//        }

