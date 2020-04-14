package ru.falchio.popularlibrary.standard.presenter;

import ru.falchio.popularlibrary.standard.model.Model;
import ru.falchio.popularlibrary.standard.view.MainActivity;

public class Presenter {
    private final MainActivity mainActivity;
    private final Model model;

    public Presenter(MainActivity mainActivity) {
        this.mainActivity=mainActivity;
        this.model=new Model();
    }

    public void onButtonClick() {
        String eT = mainActivity.getEditText().getText().toString();
        mainActivity.getEditText().getText().clear();
        String txt = model.getFieldText();


        if (txt==null){
            mainActivity.getTextView().setText(eT);
            model.setFieldText(eT);
        } else {
            mainActivity.getTextView().setText(txt+eT);
            model.setFieldText(txt+eT);
        }

    }
}
