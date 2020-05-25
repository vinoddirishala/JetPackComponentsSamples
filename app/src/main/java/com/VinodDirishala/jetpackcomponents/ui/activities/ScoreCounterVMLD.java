package com.VinodDirishala.jetpackcomponents.ui.activities;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.VinodDirishala.jetpackcomponents.R;
import com.VinodDirishala.jetpackcomponents.viewmodels.ScoreCounterViewModelLiveData;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ScoreCounterVMLD extends AppCompatActivity {

    @BindView(R.id.scoreTV)
    TextView scoreTV;
    ScoreCounterViewModelLiveData scoreCounterViewModelLiveData;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        scoreCounterViewModelLiveData = ViewModelProviders.of(this).get(ScoreCounterViewModelLiveData.class);
        setContentView(R.layout.activity_score_counter_vmld);
        ButterKnife.bind(this);
        setTitle(getResources().getString(R.string.scoreCounterVMLD));
        scoreCounterViewModelLiveData.getScore().observe(this, new Observer<Integer>() {
            @Override
            public void onChanged(Integer integer) {
                scoreTV.setText(String.valueOf(integer));
            }
        });
    }

    @OnClick({R.id.incrementScore, R.id.decrementScore, R.id.resetScore})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.incrementScore:
                scoreCounterViewModelLiveData.incScore();
                break;
            case R.id.decrementScore:
                scoreCounterViewModelLiveData.decScore();
                break;
            case R.id.resetScore:
                scoreCounterViewModelLiveData.resetScore();
                break;
        }
    }
}
