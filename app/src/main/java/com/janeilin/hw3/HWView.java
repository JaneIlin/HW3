package com.janeilin.hw3;

import com.arellomobile.mvp.MvpView;

/**
 * Created by janeilin on 4/28/17.
 */

public interface HWView extends MvpView {

    void show(double root1, double root2);
    void show(double root);
    void showNoResult();


}
