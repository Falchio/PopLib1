package ru.falchio.popularlibrary.moxy.view;

import android.view.View;

import moxy.MvpView;

import moxy.viewstate.strategy.AddToEndStrategy;
import moxy.viewstate.strategy.StateStrategyType;

public interface MainView extends MvpView {

    @StateStrategyType(value = AddToEndStrategy.class)
    void buttonClick(View view1); // почему-то ругается на название переменной view, так как генериться Moxy переменная с тем же именем.

    @StateStrategyType(value = AddToEndStrategy.class)
    void setTextView(String txt);
}
