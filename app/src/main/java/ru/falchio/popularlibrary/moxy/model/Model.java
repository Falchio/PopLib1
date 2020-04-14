package ru.falchio.popularlibrary.moxy.model;

public class Model {
    private String TAG = this.getClass().getSimpleName();
    private String fieldText;
    private String editText;

    public String getFieldText() {
        return fieldText;
    }

    public void setFieldText(String fieldText) {
        this.fieldText = fieldText;
    }

    public String getEditText() {
        return editText;
    }

    public void setEditText(String editText) {
        this.editText = editText;
    }
}
