package group.project.os.tictactoe;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Game extends Activity implements OnClickListener {
    Button b1, b2, b3, b4, b5, b6, b7, b8, b9;
    Boolean chance;
    int[] A = {-1,-1,-1,-1,-1,-1,-1,-1,-1};

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

    }


    @Override
    public void onClick(View v) {

        if (v.getId() == R.id.btn1) {
            if (chance) {
                b1.setText("X");
                b1.setEnabled(false);
                A[0] = 1;
                chance = false;
            } else {
                b1.setText("0");
                chance = true;
                A[0] = 0;
                b1.setEnabled(false);
            }

        } else if (v.getId() == R.id.btn2) {
            if (chance) {
                b2.setText("X");
                b2.setEnabled(false);
                A[1] = 1;
                chance = false;
            } else {
                b2.setText("0");
                b2.setEnabled(false);
                A[1] = 0;
                chance = true;
            }

        } else if (v.getId() == R.id.btn3) {
            if (chance) {
                b3.setText("X");
                b3.setEnabled(false);
                A[2] = 1;
                chance = false;
            } else {
                b3.setText("0");
                b3.setEnabled(false);
                A[2] = 0;
                chance = true;
            }

        } else if (v.getId() == R.id.btn4) {
            if (chance) {
                b4.setText("X");
                b4.setEnabled(false);
                A[3] = 1;
                chance = false;
            } else {
                b4.setText("0");
                b4.setEnabled(false);
                A[3] = 0;
                chance = true;
            }
        } else if (v.getId() == R.id.btn5) {
            if (chance) {
                b5.setText("X");
                b5.setEnabled(false);
                A[4] = 1;
                chance = false;
            } else {
                b5.setText("0");
                b5.setEnabled(false);
                A[4] = 0;
                chance = true;
            }
        } else if (v.getId() == R.id.btn6) {
            if (chance) {
                b6.setText("X");
                b6.setEnabled(false);
                A[5] = 1;
                chance = false;
            } else {
                b6.setText("0");
                b6.setEnabled(false);
                A[5] = 0;
                chance = true;
            }
        } else if (v.getId() == R.id.btn7) {
            if (chance) {
                b7.setText("X");
                b7.setEnabled(false);
                A[6] = 1;
                chance = false;
            } else {
                b7.setText("0");
                b7.setEnabled(false);
                A[6] = 0;
                chance = true;
            }
        } else if (v.getId() == R.id.btn8) {
            if (chance) {
                b8.setText("X");
                b8.setEnabled(false);
                A[7] = 1;
                chance = false;
            } else {
                b8.setText("0");
                b8.setEnabled(false);
                A[7] = 0;
                chance = true;
            }
        } else if (v.getId() == R.id.btn9) {
            if (chance) {
                b9.setText("X");
                b9.setEnabled(false);
                A[8] = 1;
                chance = false;
            } else {
                b9.setText("0");
                b9.setEnabled(false);
                A[8] = 0;
                chance = true;
            }
        }


    }


}
