package com.janeilin.hw3;

import com.arellomobile.mvp.InjectViewState;
import com.arellomobile.mvp.MvpPresenter;

/**
 * Created by janeilin on 4/28/17.
 */

//D=b2−4·a·c
@InjectViewState
public class HWPresenterImpl extends MvpPresenter<HWView> implements HWPresenter {
    @Override
    public void solve(double a, double b, double c) {

        double d = b*b - 4*a*c;


        if (d<0){
            getViewState().showNoResult();
        }
        else if (d==0){
            double x = (-b) / 2 * a;
            getViewState().show(x);
        }
        else {
            double x1 = (-b + Math.sqrt(d)) / 2 * a;
            double x2 = (-b - Math.sqrt(d)) / 2 * a;
            getViewState().show(x1, x2);
        }


    }
}
