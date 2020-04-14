package ru.falchio.popularlibrary.moxy.presenter;

import android.util.Log;

import moxy.InjectViewState;
import moxy.MvpPresenter;
import ru.falchio.popularlibrary.moxy.model.Model;
import ru.falchio.popularlibrary.moxy.view.MainView;

@InjectViewState
public class Presenter extends MvpPresenter<MainView> {
    private String TAG = this.getClass().getSimpleName();
    private final MainView mainActivity;
    private final Model model;

    public Presenter(MainView mainActivity) {
        this.mainActivity=mainActivity;
        this.model=new Model();
    }

    public void onButtonClick(String eT) {
        Log.e(TAG, "onButtonClick: "+eT );
            String txt = model.getFieldText();
            if (txt == null){
                Log.e(TAG, "onButtonClick: null " + eT );
                model.setFieldText(eT);
                getViewState().setTextView(eT);
            } else {
                Log.e(TAG, "onButtonClick: NOT null " + eT + txt );
                model.setFieldText(eT+txt);
                getViewState().setTextView(eT+txt);
            }
        }
}
