package com.example.vaibhav.tictactoe;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Context context;
    Button a11,a12,a13,a21,a22,a23,a31,a32,a33;
    TextView Result;
    int count;
    boolean flag,result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        this.context = this;
        a11 = (Button) findViewById(R.id.a11);
        a12 = (Button) findViewById(R.id.a12);
        a13 = (Button) findViewById(R.id.a13);
        a21 = (Button) findViewById(R.id.a21);
        a22 = (Button) findViewById(R.id.a22);
        a23 = (Button) findViewById(R.id.a23);
        a31 = (Button) findViewById(R.id.a31);
        a32 = (Button) findViewById(R.id.a32);
        a33 = (Button) findViewById(R.id.a33);
        flag=true;
        count=0;
        Result = (TextView)findViewById(R.id.result);
        a11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag) a11.setText("x");
                else a11.setText("o");
                flag=!flag;
                //a11.setEnabled(false);
                if(flag) Result.setText("Player x move");
                else Result.setText("Player o move");
                if((a11.getText()==a12.getText()&&a11.getText()==a13.getText())||
                        (a11.getText()==a21.getText()&&a11.getText()==a31.getText())||
                        (a11.getText()==a22.getText()&&a11.getText()==a33.getText()))
                    game_over();

            }
        });
        a12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag) a12.setText("x");
                else a12.setText("o");
                flag=!flag;
                //a12.setEnabled(false);
                if(flag) Result.setText("Player x move");
                else Result.setText("Player o move");
                if((a11.getText()==a12.getText()&&a11.getText()==a13.getText())||
                        (a12.getText()==a22.getText()&&a12.getText()==a32.getText())    )
                    game_over();
            }
        });
        a13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag) a13.setText("x");
                else a13.setText("o");
                flag=!flag;
                //a13.setEnabled(false);
                if(flag) Result.setText("Player x move");
                else Result.setText("Player o move");
                if((a11.getText()==a12.getText()&&a11.getText()==a13.getText())||
                        (a23.getText()==a13.getText()&&a23.getText()==a33.getText())||
                        (a13.getText()==a22.getText()&&a13.getText()==a31.getText()))
                    game_over();

            }
        });
        a21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag) a21.setText("x");
                else a21.setText("o");
                flag=!flag;
                //a21.setEnabled(false);
                if(flag) Result.setText("Player x move");
                else Result.setText("Player o move");
                if((a21.getText()==a22.getText()&&a21.getText()==a23.getText())||
                        (a21.getText()==a11.getText()&&a21.getText()==a31.getText())    )
                    game_over();

            }
        });
        a22.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag) a22.setText("x");
                else a22.setText("o");
                flag=!flag;
                //a22.setEnabled(false);
                if(flag) Result.setText("Player x move");
                else Result.setText("Player o move");
                if((a11.getText()==a22.getText()&&a11.getText()==a33.getText())||
                        (a12.getText()==a22.getText()&&a12.getText()==a32.getText())||
                        (a13.getText()==a22.getText()&&a13.getText()==a31.getText())||
                        (a21.getText()==a22.getText()&&a21.getText()==a23.getText()))
                    game_over();

            }
        });
        a23.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag) a23.setText("x");
                else a23.setText("o");
                flag=!flag;
                //a23.setEnabled(false);
                if(flag) Result.setText("Player x move");
                else Result.setText("Player o move");
                if((a23.getText()==a22.getText()&&a23.getText()==a21.getText())||
                        (a23.getText()==a13.getText()&&a23.getText()==a33.getText())    )
                    game_over();

            }
        });
        a31.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag) a31.setText("x");
                else a31.setText("o");
                flag=!flag;
                //a31.setEnabled(false);
                if(flag) Result.setText("Player x move");
                else Result.setText("Player o move");
                if((a31.getText()==a32.getText()&&a31.getText()==a33.getText())||
                        (a11.getText()==a21.getText()&&a11.getText()==a31.getText())||
                        (a13.getText()==a22.getText()&&a31.getText()==a13.getText()))
                    game_over();

            }
        });
        a32.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag) a32.setText("x");
                else a32.setText("o");
                flag=!flag;
                //a32.setEnabled(false);
                if(flag) Result.setText("Player x move");
                else Result.setText("Player o move");
                if((a32.getText()==a12.getText()&&a32.getText()==a22.getText())||
                        (a32.getText()==a31.getText()&&a32.getText()==a33.getText())    )
                    game_over();

            }
        });
        a33.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(flag) {
                    a33.setText("x");
                    Result.setText("Player o move");
                }
                else {
                    a33.setText("o");
                    Result.setText("Player x move");
                }
                flag=!flag;
                //a33.setEnabled(false);
                if((a31.getText()==a32.getText()&&a31.getText()==a33.getText())||
                        (a13.getText()==a23.getText()&&a13.getText()==a33.getText())||
                        (a11.getText()==a22.getText()&&a11.getText()==a33.getText()))
                    game_over();

            }
        });
    }

    private void game_over() {
        Result.setText("Shubham wins!\n" +
                " You pathetic fucker!\n" +
                " You lost again!\n");
        a11.setText("");
        a12.setText("");
        a13.setText("");
        a21.setText("");
        a22.setText("");
        a23.setText("");
        a31.setText("");
        a32.setText("");
        a33.setText("");
        a11.setEnabled(true);
        a12.setEnabled(true);
        a13.setEnabled(true);
        a31.setEnabled(true);
        a32.setEnabled(true);
        a33.setEnabled(true);
        a21.setEnabled(true);
        a22.setEnabled(true);
        a23.setEnabled(true);
    }
}
