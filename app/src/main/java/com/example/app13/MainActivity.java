package com.example.app13;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = findViewById(R.id.button2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentContainerView container = findViewById(R.id.fragmentContainerView2);
                getSupportFragmentManager().
                        beginTransaction().
                        add(R.id.fragmentContainerView2, Fragment1.class, null).
                        runOnCommit(new Runnable() {
                            @Override
                            public void run() {
                                Fragment1 fragment = (Fragment1) getSupportFragmentManager().findFragmentById(R.id.fragmentContainerView2);
                                TextView textView1 = fragment.getView().findViewById(R.id.textView2);
                                textView1.setText("Success");
                            }
                        }).commit();

            }
        });

    }
}