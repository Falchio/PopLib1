package ru.falchio.popularlibrary.standard.presenter;

import ru.falchio.popularlibrary.standard.model.Model;
import ru.falchio.popularlibrary.standard.view.Concatenate;


public class Presenter {
    private final Concatenate mainActivity;
    private final Model model;

    public Presenter(Concatenate mainActivity) {
        this.mainActivity=mainActivity;
        this.model=new Model();
    }

    public String onButtonClick(String eT) {
            String txt = model.getFieldText();
            if (txt == null){
                model.setFieldText(eT);
                return eT;
            }
            return txt + eT;
    }
}
