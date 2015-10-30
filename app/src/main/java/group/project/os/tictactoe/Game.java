package group.project.os.tictactoe;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;



public class Game extends Activity implements OnClickListener {
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9;
    Boolean chance;
    int A[][] = new int[3][3];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        requestWindowFeature(Window.FEATURE_NO_TITLE);
//        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.tic_tac_toe_main);

        b1 = (Button) findViewById(R.id.btn1);
        b2 = (Button) findViewById(R.id.btn2);
        b3 = (Button) findViewById(R.id.btn3);

        b4 = (Button) findViewById(R.id.btn4);
        b5 = (Button) findViewById(R.id.btn5);
        b6 = (Button) findViewById(R.id.btn6);

        b7 = (Button) findViewById(R.id.btn7);
        b8 = (Button) findViewById(R.id.btn8);
        b9 = (Button) findViewById(R.id.btn9);

        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);

        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);

        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);

        chance = true;

        A[0][0] = -1;
        A[0][1] = -1;
        A[0][2] = -1;

        A[1][0] = -1;
        A[1][1] = -1;
        A[1][2] = -1;

        A[2][0] = -1;
        A[2][1] = -1;
        A[2][2] = -1;

    }


    @Override
    public void onClick(View v) {

        Boolean win;

        if (v.getId() == R.id.btn1) {
            if (chance) {
                b1.setText("X");
                b1.setTextColor(Color.parseColor("#ff0000"));
                b1.setEnabled(false);
                A[0][0] = 1;
                chance = false;
                win = check();
                if(win){
                    Toast.makeText(Game.this,"Player 1 wins",Toast.LENGTH_LONG).show();
                }
            } else {
                b1.setText("0");
                b1.setTextColor(Color.parseColor("#32cd32"));
                chance = true;
                A[0][0] = 0;
                b1.setEnabled(false);
                win = check();
                if(win){
                    Toast.makeText(Game.this,"Player 2 wins",Toast.LENGTH_LONG).show();
                }
            }

        } else if (v.getId() == R.id.btn2) {
            if (chance) {
                b2.setText("X");
                b2.setTextColor(Color.parseColor("#ff0000"));
                b2.setEnabled(false);
                A[0][1] = 1;
                chance = false;
                win = check();
                if(win){
                    Toast.makeText(Game.this,"Player 1 wins",Toast.LENGTH_LONG).show();
                }
            } else {
                b2.setText("0");
                b2.setTextColor(Color.parseColor("#32cd32"));
                b2.setEnabled(false);
                A[0][1] = 0;
                chance = true;
                win = check();
                if(win){
                    Toast.makeText(Game.this,"Player 2 wins",Toast.LENGTH_LONG).show();
                }
            }

        } else if (v.getId() == R.id.btn3) {
            if (chance) {
                b3.setText("X");
                b3.setTextColor(Color.parseColor("#ff0000"));
                b3.setEnabled(false);
                A[0][2] = 1;
                chance = false;
                win = check();
                if(win){
                    Toast.makeText(Game.this,"Player 1 wins",Toast.LENGTH_LONG).show();
                }
            } else {
                b3.setText("0");
                b3.setTextColor(Color.parseColor("#32cd32"));
                b3.setEnabled(false);
                A[0][2] = 0;
                chance = true;
                win = check();
                if(win){
                    Toast.makeText(Game.this,"Player 2 wins",Toast.LENGTH_LONG).show();
                }
            }

        } else if (v.getId() == R.id.btn4) {
            if (chance) {
                b4.setText("X");
                b4.setTextColor(Color.parseColor("#ff0000"));
                b4.setEnabled(false);
                A[1][0] = 1;
                chance = false;
                win = check();
                if(win){
                    Toast.makeText(Game.this,"Player 1 wins",Toast.LENGTH_LONG).show();
                }
            } else {
                b4.setText("0");
                b4.setTextColor(Color.parseColor("#32cd32"));
                b4.setEnabled(false);
                A[1][0] = 0;
                chance = true;
                win = check();
                if(win){
                    Toast.makeText(Game.this,"Player 2 wins",Toast.LENGTH_LONG).show();
                }
            }
        } else if (v.getId() == R.id.btn5) {
            if (chance) {
                b5.setText("X");
                b5.setTextColor(Color.parseColor("#ff0000"));
                b5.setEnabled(false);
                A[1][1] = 1;
                chance = false;
                win = check();
                if(win){
                    Toast.makeText(Game.this,"Player 1 wins",Toast.LENGTH_LONG).show();
                }
            } else {
                b5.setText("0");
                b5.setTextColor(Color.parseColor("#32cd32"));
                b5.setEnabled(false);
                A[1][1] = 0;
                chance = true;
                win = check();
                if(win){
                    Toast.makeText(Game.this,"Player 2 wins",Toast.LENGTH_LONG).show();
                }
            }
        } else if (v.getId() == R.id.btn6) {
            if (chance) {
                b6.setText("X");
                b6.setTextColor(Color.parseColor("#ff0000"));
                b6.setEnabled(false);
                A[1][2] = 1;
                chance = false;
                win = check();
                if(win){
                    Toast.makeText(Game.this,"Player 1 wins",Toast.LENGTH_LONG).show();
                    block();
                }
            } else {
                b6.setText("0");
                b6.setTextColor(Color.parseColor("#32cd32"));
                b6.setEnabled(false);
                A[1][2] = 0;
                chance = true;
                win = check();
                if(win){
                    Toast.makeText(Game.this,"Player 2 wins",Toast.LENGTH_LONG).show();
                }
            }
        } else if (v.getId() == R.id.btn7) {
            if (chance) {
                b7.setText("X");
                b7.setTextColor(Color.parseColor("#ff0000"));
                b7.setEnabled(false);
                A[2][0] = 1;
                chance = false;
                win = check();
                if(win){
                    Toast.makeText(Game.this,"Player 1 wins",Toast.LENGTH_LONG).show();
                }
            } else {
                b7.setText("0");
                b7.setTextColor(Color.parseColor("#32cd32"));
                b7.setEnabled(false);
                A[2][0] = 0;
                chance = true;
                win = check();
                if(win){
                    Toast.makeText(Game.this,"Player 2 wins",Toast.LENGTH_LONG).show();
                }
            }
        } else if (v.getId() == R.id.btn8) {
            if (chance) {
                b8.setText("X");
                b8.setTextColor(Color.parseColor("#ff0000"));
                b8.setEnabled(false);
                A[2][1] = 1;
                chance = false;
                win = check();
                if(win){
                    Toast.makeText(Game.this,"Player 1 wins",Toast.LENGTH_LONG).show();
                }
            } else {
                b8.setText("0");
                b8.setTextColor(Color.parseColor("#32cd32"));
                b8.setEnabled(false);
                A[2][1] = 0;
                chance = true;
                win = check();
                if(win){
                    Toast.makeText(Game.this,"Player 2 wins",Toast.LENGTH_LONG).show();
                }
            }
        } else if (v.getId() == R.id.btn9) {
            if (chance) {
                b9.setText("X");
                b9.setTextColor(Color.parseColor("#ff0000"));
                b9.setEnabled(false);
                A[2][2] = 1;
                chance = false;
                win = check();
                if(win){
                    Toast.makeText(Game.this,"Player 1 wins",Toast.LENGTH_LONG).show();
                }
            } else {
                b9.setText("0");
                b9.setTextColor(Color.parseColor("#32cd32"));
                b9.setEnabled(false);
                A[2][2] = 0;
                chance = true;
                win = check();
                if(win){
                    Toast.makeText(Game.this,"Player 2 wins",Toast.LENGTH_LONG).show();
                }
            }
        }


    }

    private void block() {

    }


    public boolean check() {

        for (int i = 0; i < 3; i++) {
            if(A[i][0]==A[i][1] && A[i][1]==A[i][2] && A[i][0]!=-1){
                if(i==0){
                    b1.setTextColor(Color.parseColor("#007bff"));
                    b2.setTextColor(Color.parseColor("#007bff"));
                    b3.setTextColor(Color.parseColor("#007bff"));
                }
                else if(i==1){
                    b4.setTextColor(Color.parseColor("#007bff"));
                    b5.setTextColor(Color.parseColor("#007bff"));
                    b6.setTextColor(Color.parseColor("#007bff"));
                }
                else if(i==2){
                    b7.setTextColor(Color.parseColor("#007bff"));
                    b8.setTextColor(Color.parseColor("#007bff"));
                    b9.setTextColor(Color.parseColor("#007bff"));
                }
                return true;
            }
            if(A[0][i]==A[1][i] && A[1][i]==A[2][i] && A[0][i]!=-1){
                if(i==0){
                    b1.setTextColor(Color.parseColor("#007bff"));
                    b4.setTextColor(Color.parseColor("#007bff"));
                    b7.setTextColor(Color.parseColor("#007bff"));
                }
                else if(i==1){
                    b2.setTextColor(Color.parseColor("#007bff"));
                    b5.setTextColor(Color.parseColor("#007bff"));
                    b8.setTextColor(Color.parseColor("#007bff"));
                }
                else if(i==2){
                    b3.setTextColor(Color.parseColor("#007bff"));
                    b6.setTextColor(Color.parseColor("#007bff"));
                    b9.setTextColor(Color.parseColor("#007bff"));
                }
                return true;
            }
        }

            if(A[0][0]==A[1][1] && A[1][1]==A[2][2] && A[0][0]!=-1){
                b1.setTextColor(Color.parseColor("#007bff"));
                b5.setTextColor(Color.parseColor("#007bff"));
                b9.setTextColor(Color.parseColor("#007bff"));
                return true;
            }
            if(A[2][0]==A[1][1] && A[1][1]==A[0][2] && A[2][0]!=-1){
                b3.setTextColor(Color.parseColor("#007bff"));
                b5.setTextColor(Color.parseColor("#007bff"));
                b7.setTextColor(Color.parseColor("#007bff"));
                return true;

            }


        return false;
    }


}
