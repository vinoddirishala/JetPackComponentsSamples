package com.VinodDirishala.jetpackcomponents.ui.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.VinodDirishala.jetpackcomponents.R;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class Home extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ButterKnife.bind(this);
    }

    @OnClick({R.id.basicScoreCounterApp, R.id.basicScoreCounterVMApp, R.id.basicScoreCounterVMLDApp, R.id.bnMenuwithjpNavigation})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.basicScoreCounterApp:
                startActivity(new Intent(this,BasicScoreCounter.class));
                break;
            case R.id.basicScoreCounterVMApp:
                startActivity(new Intent(this,ScoreCounterVM.class));
                break;
            case R.id.basicScoreCounterVMLDApp:
                startActivity(new Intent(this,ScoreCounterVMLD.class));
                break;
            case R.id.bnMenuwithjpNavigation:
                Toast.makeText(this,"Coming soon....!",Toast.LENGTH_LONG).show();
                break;
        }
    }
}
