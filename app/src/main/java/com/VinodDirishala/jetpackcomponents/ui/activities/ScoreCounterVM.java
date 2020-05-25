package com.VinodDirishala.jetpackcomponents.ui.activities;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;

import com.VinodDirishala.jetpackcomponents.R;
import com.VinodDirishala.jetpackcomponents.viewmodels.ScoreCounterViewModel;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ScoreCounterVM extends AppCompatActivity {

    @BindView(R.id.scoreTV)
    TextView scoreTV;
    ScoreCounterViewModel scoreCounterVM;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        scoreCounterVM = ViewModelProviders.of(this).get(ScoreCounterViewModel.class);
        setContentView(R.layout.activity_score_counter_vm);
        ButterKnife.bind(this);
        scoreTV.setText(String.valueOf(scoreCounterVM.getScore()));
    }

    @OnClick({R.id.incrementScore, R.id.decrementScore, R.id.resetScore})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.incrementScore:
                scoreCounterVM.incScore();
                scoreTV.setText(String.valueOf(scoreCounterVM.getScore()));
                break;
            case R.id.decrementScore:
                scoreCounterVM.decScore();
                scoreTV.setText(String.valueOf(scoreCounterVM.getScore()));
                break;
            case R.id.resetScore:
                scoreCounterVM.resetScore();
                scoreTV.setText(String.valueOf(scoreCounterVM.getScore()));
                break;
        }
    }
}
