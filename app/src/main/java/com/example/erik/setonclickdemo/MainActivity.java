package com.example.erik.setonclickdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
//    TextView txtvHoTen;
//    Button btnHello;

    private EditText edit1;
    private Button btnedit, btnedit2;
    private TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        txtvHoTen = (TextView)findViewById(R.id.textViewHoTen);
//        btnHello = (Button)findViewById(R.id.buttonHello);
//
//        btnHello.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                txtvHoTen.setText("Hello World");
//            }
        connect();
        btnedit.setOnClickListener(this);
        btnedit2.setOnClickListener(this);

        //Đay la cach thu nhat
//        btnedit.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                edit1.setText(tvResult.getText());
//            }
//        });

    }

    //Ham lien ket (giu nguyen)
    private void connect() {
        edit1 = (EditText) findViewById(R.id.edit);
        btnedit = (Button) findViewById(R.id.btn);
        tvResult = (TextView) findViewById(R.id.txtv);
        btnedit2 = (Button) findViewById(R.id.btn2);
    }

    //Day la cach thu hai
    //Ham duoc tao ra de chay Implements View.OnClickListener
    //Uu diem: quan lý duoc nhieu button
    public void onClick(View v) {
        if (v == btnedit) {
            tvResult.setText(edit1.getText());
            return;
        }
        if (v == btnedit2) {
            tvResult.setText("null");
            return;
        }
    }
}

