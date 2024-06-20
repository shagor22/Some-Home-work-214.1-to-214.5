package com.shagor.homework;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    TextView Display_division,Display_year,Display_day,Display_result,Display_Amount;
    Button click_Here,click_Here2,click_Here3,click_Here4,click_Here5;
    EditText divion1,leap_year,Number,Number1,Number2,Number3,Number4,Number5,Before,After;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
       /* ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });*/

        //214.1
        divion1 = findViewById(R.id.divion1);
        click_Here = findViewById(R.id.click_Here);
        Display_division = findViewById(R.id.Display_division);

        //214.2
        leap_year = findViewById(R.id.leap_year);
        click_Here2 = findViewById(R.id.click_Here2);
        Display_year = findViewById(R.id.Display_year);

        //214.3
        Number = findViewById(R.id.Number);
        click_Here3 = findViewById(R.id.click_Here3);
        Display_day = findViewById(R.id.Display_day);

        //214.4
        Display_result = findViewById(R.id.Display_result);
        click_Here4 = findViewById(R.id.click_Here4);
        Number1 = findViewById(R.id.Number1);
        Number2 = findViewById(R.id.Number2);
        Number3 = findViewById(R.id.Number3);
        Number4 = findViewById(R.id.Number4);
        Number5 = findViewById(R.id.Number5);

        //214.5
        Display_Amount = findViewById(R.id.Display_Amount);
        click_Here5 = findViewById(R.id.click_Here5);
        Before = findViewById(R.id.Before);
        After = findViewById(R.id.After);

        // 214.1
        click_Here.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mdivision1;
                mdivision1 = divion1.getText().toString();
                if (mdivision1.length()>0){
                int condivision1 = Integer.parseInt(mdivision1);
                if (condivision1%5==0 && condivision1%11==0) {
                    Display_division.setText(condivision1+": It is divisible by 5 and 11");
                }
                else {
                    Display_division.setText(condivision1+": It is can't divisible by 5 and 11");
                }
            }
                else {
                    Display_division.setText("Put the value first");
                }
                }
        });
        
        
        // leap year Code
        
        click_Here2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mleap_year = leap_year.getText().toString();

                if (mleap_year.length()>0)
                {

                float eleap_year = Float.parseFloat(mleap_year);

                if (eleap_year%400 == 0) {
                    Display_year.setText(eleap_year+"Leap Year");
                }
                else if (eleap_year%4==0 && eleap_year%100!=0) {
                    Display_year.setText(eleap_year+"Leap Year");
                }
                else {
                    Display_year.setText(eleap_year+" Not Leap Year");
                }
            }
                else {
                    Display_year.setText("Put Year ");
                }
                }
        });

        //214.3 Week day

        click_Here3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mnumber;
                mnumber = Number.getText().toString();

                if (mnumber.length()>0) {
                    int eday = Integer.parseInt(mnumber);
                    if (eday <= 7 && eday > 0) {
                        if (eday == 1) {
                            Display_day.setText("Sunday");
                        } else if (eday == 2) {

                            Display_day.setText("Monday");
                        } else if (eday == 3) {
                            Display_day.setText("Tuesday");
                        } else if (eday == 4) {
                            Display_day.setText("Wednesday");

                        } else if (eday == 5) {
                            Display_day.setText("Thursday");

                        } else if (eday == 6) {
                            Display_day.setText("Friday");
                        } else if (eday == 7) {
                            Display_day.setText("Saturday");
                        }
                    } else {
                        Display_day.setText("Please Enter the Number between 1 to 7");
                    }
                } else
                {
                    Display_day.setText("Please Enter the Number in input box");
                }
            }
        });


        
        // 214.4 Subject Marks Code Here
        click_Here4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mnumber1, mnumber2, mnumber3, mnumber4, mnumber5;

                mnumber1 = Number1.getText().toString();
                mnumber2 = Number2.getText().toString();
                mnumber3 = Number3.getText().toString();
                mnumber4 = Number4.getText().toString();
                mnumber5 = Number5.getText().toString();


                if (Number1.length() > 0 && Number2.length() > 0 && Number3.length() > 0 && Number4.length() > 0
                        && Number5.length() > 0) {


                    float enumber1 = Float.parseFloat(mnumber1);
                    float enumber2 = Float.parseFloat(mnumber2);
                    float enumber3 = Float.parseFloat(mnumber3);
                    float enumber4 = Float.parseFloat(mnumber4);
                    float enumber5 = Float.parseFloat(mnumber5);

                    float percentage = ((enumber1 + enumber2 + enumber3 + enumber4 + enumber5) / 5);

                    if (percentage > 0 && percentage < 40) {
                        Display_result.setText("F");
                    } else if (percentage >= 40 && percentage < 60) {
                        Display_result.setText("E");
                    } else if (percentage >= 60 && percentage < 70) {
                        Display_result.setText("D");

                    } else if (percentage >= 70 && percentage < 80) {
                        Display_result.setText("C");
                    } else if (percentage >= 80 && percentage < 90) {
                        Display_result.setText("B");

                    } else if (percentage >= 90 && percentage < 100) {
                        Display_result.setText("A+");

                    } else {
                        Display_result.setText("wrong input");
                    }


                } else {
                    Display_result.setText("Put All Value first");
                }
            }
                
            
        });

        //214.5 H.w Code Electricity
        click_Here5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String mBefore, mAfter;
                mBefore = Before.getText().toString();
                mAfter = After.getText().toString();

                if (Before.length() > 0 && After.length() > 0) {

                    float eBefore = Float.parseFloat(mBefore);
                    float eAfter = Float.parseFloat(mAfter);

                    float units = eAfter - eBefore;



                    if (units <= 50) {
                        float bill1 = (float) (units * 0.50);
                        float Bill1 = (float) (bill1 + (bill1 * 0.20));
                        Display_Amount.setText("" + Bill1);
                    } else if (units <= 150) {
                        float bill2 = (float) (25 + (units - 50) * 0.75);
                        float Bill2 = (float) (bill2 + (bill2 * 0.20));
                        Display_Amount.setText("" + Bill2);
                    } else if (units <= 250) {
                        float bill3 = (float) (25 + 75 + (units - 150) * 1.20);
                        float Bill3 = (float) (bill3 + (bill3 * 0.20));
                        Display_Amount.setText("" + Bill3);
                    } else {
                        float bill4 = (float) (25 + 75 + 120 + (units - 250) * 1.50);
                        float Bill4 = (float) (bill4 + (bill4 * 0.20));
                        Display_Amount.setText("" + Bill4);
                    }
                  /*

                  // bellow This code also Right
                  float bill = 0;

                  if (units <= 50) bill = (float) (units * 0.50);
                    else if (units <= 150) bill = (float) (25 + (units - 50) * 0.75);
                    else if (units <= 250) bill = (float) (25 + 75 + (units - 150) * 1.20);
                    else bill = (float) (25 + 75 + 120 + (units - 250) * 1.50);

                    bill = (float) (bill + bill * 0.20);
                    Display_Amount.setText("Total Amount : " + bill + "Tk");

                     */
                } else {
                    Display_Amount.setText("Put The Units first");
                }
            }
        });




    }
}