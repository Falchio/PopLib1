package ru.falchio.popularlibrary.moxy.view;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import moxy.presenter.InjectPresenter;
import ru.falchio.popularlibrary.R;
import ru.falchio.popularlibrary.moxy.presenter.Presenter;

public class MainActivity extends AppCompatActivity implements MainView {
    private String TAG = this.getClass().getSimpleName();
    private EditText editText;
    private TextView textView;
    private Button button;

    @InjectPresenter
    Presenter presenter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.edit_text);
        textView = findViewById(R.id.text_field);
        presenter = new Presenter(this);
        button = findViewById(R.id.button);
    }

    public void buttonClick(android.view.View view) {
        if (editText.getText().equals("")){return;}
        Log.e(TAG, "buttonClick: " + editText.getText().toString());
        presenter.onButtonClick(editText.getText().toString());
        editText.getText().clear();

    }

    public void setTextView(String txt){
        Log.e(TAG, "setTextView: "+txt);
        this.textView.setText(txt);
    }

    public EditText getEditText() {
        return editText;
    }

    public TextView getTextView() {
        return textView;
    }
}
