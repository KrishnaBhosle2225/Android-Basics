package com.krishna.asciieducation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class RuntimePermissionActivity extends AppCompatActivity {

    Button check;
    int CAMERA_REQUEST_CODE = 101;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_runtime_permission);

        check = findViewById(R.id.btnCheck);
        check.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (checkSelfPermission()) {
                    Toast.makeText(RuntimePermissionActivity.this, "Permission is Given", Toast.LENGTH_LONG).show();
                    openCamera();
                } else {
                    Toast.makeText(RuntimePermissionActivity.this, "Permission Denied", Toast.LENGTH_LONG).show();
                }
            }
        });

    }

    private boolean checkSelfPermission() {

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            if (checkSelfPermission(Manifest.permission.CAMERA)
                    != PackageManager.PERMISSION_GRANTED) {
                requestPermissions(new String[]{Manifest.permission.CAMERA},
                        CAMERA_REQUEST_CODE
                );

                // MY_PERMISSIONS_REQUEST_CAMERA is an
                // app-defined int constant
            }
        }
        return true;
    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if (requestCode == CAMERA_REQUEST_CODE) {
            if (grantResults[0] == PackageManager.PERMISSION_GRANTED) {
                // permission was granted, yay! do the
                // CAMERA task you need to do.
                Toast.makeText(RuntimePermissionActivity.this, "Access Granted", Toast.LENGTH_LONG).show();
                openCamera();

            } else {
                Toast.makeText(RuntimePermissionActivity.this, "Access Denied", Toast.LENGTH_LONG).show();

                // permission denied, boo! Disable the
                // functionality that depends on this permission.
            }
        }
    }

    private void openCamera() {

        Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(intent,CAMERA_REQUEST_CODE);
    }
}