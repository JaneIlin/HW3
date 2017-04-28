package com.janeilin.hw3;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.arellomobile.mvp.MvpAppCompatActivity;
import com.arellomobile.mvp.presenter.InjectPresenter;

public class MainActivity extends MvpAppCompatActivity implements HWView {

    @InjectPresenter
    public HWPresenterImpl presenter;
    private EditText cA;
    private EditText cB;
    private EditText cC;
    private Button calc;
    private TextView xView;
    //private TextView xView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        cA = (EditText)findViewById(R.id.a);
        cB = (EditText)findViewById(R.id.b);
        cC = (EditText)findViewById(R.id.c);
        calc = (Button)findViewById(R.id.calc);
        xView = (TextView)findViewById(R.id.x);
        //xView2 = (TextView)findViewById(R.id.x2);


        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                double a = Double.valueOf(cA.getText().toString());
                double b = Double.valueOf(cB.getText().toString());
                double c = Double.valueOf(cC.getText().toString());

                presenter.solve(a, b, c);

            }
        });
    }




    @Override
    public void show(double root1, double root2) {
        xView.setText("x1=" + root1 + " x2=" + root2);

    }

    @Override
    public void show(double root) {
        xView.setText("x=" + root);

    }

    @Override
    public void showNoResult() {
        xView.setText("no result");

    }
}
