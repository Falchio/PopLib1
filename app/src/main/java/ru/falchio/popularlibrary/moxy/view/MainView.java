package ru.falchio.popularlibrary.moxy.view;

import android.view.View;

import moxy.MvpView;

import moxy.viewstate.strategy.AddToEndStrategy;
import moxy.viewstate.strategy.StateStrategyType;

public interface MainView extends MvpView {

//    @StateStrategyType(value = AddToEndStrategy.class)
    void buttonClick(View view1);

    @StateStrategyType(value = AddToEndStrategy.class)
    void setTextView(String txt);
}
