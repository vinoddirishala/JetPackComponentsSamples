package com.VinodDirishala.jetpackcomponents.viewmodels;

import androidx.lifecycle.ViewModel;

/**
 * Created by Vinod Dirishala on 25-05-2020 13:42
 **/
public class ScoreCounterViewModel extends ViewModel {

    Integer score;

    public Integer getScore(){
        if (score ==null){
            score = 0;
        }
        return score;
    }


    public void incScore(){
        if (score == null){
            score = 0;
        }
        score += 1;
    }

    public void decScore(){
        if (score == null || score == 0){
            score = 0;
        }else{
            score -= 1;
        }
    }

    public void resetScore(){
        score = 0 ;
    }


}
