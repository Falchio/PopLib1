package ru.falchio.popularlibrary.standard.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import ru.falchio.popularlibrary.R;
import ru.falchio.popularlibrary.standard.presenter.Presenter;

public class MainActivity extends AppCompatActivity implements Concatenate {
    private Presenter presenter;
    private EditText editText;
    private TextView textView;
    private Button button;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editText = findViewById(R.id.edit_text);
        textView = findViewById(R.id.text_field);
        presenter = new Presenter(this);
        button = findViewById(R.id.button);
    }

    public void buttonClick(View view) {
       String txt = presenter.onButtonClick(editText.getText().toString());
        editText.getText().clear();
        textView.setText(txt);
    }

    public EditText getEditText() {
        return editText;
    }

    public TextView getTextView() {
        return textView;
    }
}
