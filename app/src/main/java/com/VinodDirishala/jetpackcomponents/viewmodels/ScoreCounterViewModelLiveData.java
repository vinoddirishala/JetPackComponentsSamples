package com.VinodDirishala.jetpackcomponents.viewmodels;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

/**
 * Created by Vinod Dirishala on 25-05-2020 14:57
 **/
public class ScoreCounterViewModelLiveData extends ViewModel {

    MutableLiveData<Integer> score;


    public MutableLiveData<Integer> getScore(){
        if (score == null){
            score = new MutableLiveData<>();
            score.setValue(0);
        }
        return score;
    }


    public void incScore(){
        if (score.getValue() !=null){
            score.setValue(score.getValue() +1);
        }
    }

    public void decScore(){
        if (score.getValue() !=null && score.getValue() != 0){
                score.setValue(score.getValue() - 1);
        }
    }

    public void resetScore(){
        score.setValue(0);
    }

}
