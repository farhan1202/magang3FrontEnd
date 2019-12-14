package com.example.kalkulatorfrontend2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText txta, txtb, txtc, txthasil;
    Button btn1, btn2, btn3, btn4;
    CheckBox chk1, chk2, chk3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txta = findViewById(R.id.txtNilai1);
        txtb = findViewById(R.id.txtNilai2);
        txtc = findViewById(R.id.txtNilai3);
        txthasil = findViewById(R.id.txtHasil);

        btn1 = findViewById(R.id.btntambah);
        btn2 = findViewById(R.id.btnkurang);
        btn3 = findViewById(R.id.btnkali);
        btn4 = findViewById(R.id.btnbagi);

        chk1 = findViewById(R.id.chk1);
        chk2 = findViewById(R.id.chk2);
        chk3 = findViewById(R.id.chk3);

        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);
        btn4.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btntambah:
                if (chk1.isChecked() && !chk2.isChecked() && !chk3.isChecked() ||
                        !chk1.isChecked() && chk2.isChecked() && !chk3.isChecked() ||
                        !chk1.isChecked() && !chk2.isChecked() && chk3.isChecked()){
                    Toast.makeText(getApplicationContext(), "Minimal 2 Input!!", Toast.LENGTH_LONG).show();
                }else{
                    tambah();
                }
                break;
            case R.id.btnkurang:
                if (chk1.isChecked() && !chk2.isChecked() && !chk3.isChecked() ||
                        !chk1.isChecked() && chk2.isChecked() && !chk3.isChecked() ||
                        !chk1.isChecked() && !chk2.isChecked() && chk3.isChecked()){
                    Toast.makeText(getApplicationContext(), "Minimal 2 Input!!", Toast.LENGTH_LONG).show();
                }else{
                    kurang();
                }
                break;
            case R.id.btnkali:
                if (chk1.isChecked() && !chk2.isChecked() && !chk3.isChecked() ||
                        !chk1.isChecked() && chk2.isChecked() && !chk3.isChecked() ||
                        !chk1.isChecked() && !chk2.isChecked() && chk3.isChecked()){
                    Toast.makeText(getApplicationContext(), "Minimal 2 Input!!", Toast.LENGTH_LONG).show();
                }else{
                    kali();
                }

                break;
            case R.id.btnbagi:
                if (chk1.isChecked() && !chk2.isChecked() && !chk3.isChecked() ||
                        !chk1.isChecked() && chk2.isChecked() && !chk3.isChecked() ||
                        !chk1.isChecked() && !chk2.isChecked() && chk3.isChecked()){
                    Toast.makeText(getApplicationContext(), "Minimal 2 Input!!", Toast.LENGTH_LONG).show();
                }else{
                    bagi();
                }

                break;
        }
    }

    private void bagi() {
        if (cek()){
            int a,b,c;
            if (chk1.isChecked()){
                a = Integer.parseInt(txta.getText().toString());
            }else{
                a = 1;
            }

            if (chk2.isChecked()){
                b = Integer.parseInt(txtb.getText().toString());
            }else{
                b = 1;
            }

            if (chk3.isChecked()){
                c = Integer.parseInt(txtc.getText().toString());
            }else{
                c=1;
            }


            int total = a / b / c;
            txthasil.setText(total+ "");
        }
    }

    private void kali() {
        if (cek() ){
            int a,b,c;
            if (chk1.isChecked()){
                a = Integer.parseInt(txta.getText().toString());
            }else{
                a = 1;
            }

            if (chk2.isChecked()){
                b = Integer.parseInt(txtb.getText().toString());
            }else{
                b = 1;
            }

            if (chk3.isChecked()){
                c = Integer.parseInt(txtc.getText().toString());
            }else{
                c=1;
            }

            int total = a * b * c;
            txthasil.setText(total+ "");
        }
    }

    private void kurang() {
        if (cek()){
            int a,b,c;
            if (chk1.isChecked()){
                a = Integer.parseInt(txta.getText().toString());
            }else{
                a = 0;
            }

            if (chk2.isChecked()){
                b = Integer.parseInt(txtb.getText().toString());
            }else{
                b = 0;
            }

            if (chk3.isChecked()){
                c = Integer.parseInt(txtc.getText().toString());
            }else{
                c=0;
            }

            int total = a - b - c;
            txthasil.setText(total+ "");
        }
    }

    private void tambah() {
        if (cek()){
            int a,b,c;
            if (chk1.isChecked()){
                a = Integer.parseInt(txta.getText().toString());
            }else{
                a = 0;
            }

            if (chk2.isChecked()){
                b = Integer.parseInt(txtb.getText().toString());
            }else{
                b = 0;
            }

            if (chk3.isChecked()){
                c = Integer.parseInt(txtc.getText().toString());
            }else{
                c=0;
            }



            int total = a + b + c;
            txthasil.setText(total+ "");
        }

    }

    private boolean cek(){
        if (TextUtils.isEmpty(txta.getText().toString())){
            txta.setError("Tidak Boleh Kosong");
            return false;

        }
        if (TextUtils.isEmpty(txtb.getText().toString())){
            txtb.setError("Tidak Boleh Kosong");
            return false;
        }
        if (TextUtils.isEmpty(txtc.getText().toString())){
            txtc.setError("Tidak Boleh Kosong");
            return false;
        }
        return true;
    }
}
