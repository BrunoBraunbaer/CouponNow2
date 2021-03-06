package de.couponnow.couponnow2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    public Button MainActivity;

    public void init0(){

        MainActivity= (Button)findViewById(R.id.start);
        MainActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent MainActivity = new Intent(MainActivity.this, MainActivity.class);
                startActivity(MainActivity);
            }
        });

    }

    public Button mySite;

        public void init1(){

            mySite= (Button)findViewById(R.id.mySite);
            mySite.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent mySite = new Intent(MainActivity.this, mySite.class);
                    startActivity(mySite);
                }
            });

        }

    public Button search;

        public void init2(){

            search= (Button)findViewById(R.id.search);
            search.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Intent search = new Intent(MainActivity.this, search.class);
                    startActivity(search);
                }
            });

        }

    public Button alert;

    public void init3(){

        alert= (Button)findViewById(R.id.alerts);
        alert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent alert = new Intent(MainActivity.this, alert.class);
                startActivity(alert);
            }
        });

    }

    public Button sell;

    public void init4(){

        sell= (Button)findViewById(R.id.sell);
        sell.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent sell = new Intent(MainActivity.this, sell.class);
                startActivity(sell);
            }
        });

    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init0();
        init1();
        init2();
        init3();
        init4();
    }


}

