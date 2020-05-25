package com.VinodDirishala.jetpackcomponents.ui.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.VinodDirishala.jetpackcomponents.R;
import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class BasicScoreCounter extends AppCompatActivity {

    @BindView(R.id.scoreTV)
    TextView scoreTV;
    Integer score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basic_score_counter);
        ButterKnife.bind(this);
        setTitle(getResources().getString(R.string.scoreCounter));
        scoreTV.setText(String.valueOf(score));
    }

    @OnClick({R.id.incrementScore, R.id.decrementScore, R.id.resetScore})
    public void onViewClicked(View view) {
        switch (view.getId()) {
            case R.id.incrementScore:
                score += 1;
                scoreTV.setText(String.valueOf(score));
                break;
            case R.id.decrementScore:
                if (score !=0 ){
                    score -= 1;
                    scoreTV.setText(String.valueOf(score));
                }else {
                    scoreTV.setText("Minimum score is 0");
                }
                break;
            case R.id.resetScore:
                score = 0;
                scoreTV.setText(String.valueOf(score));
                break;
        }
    }
}
