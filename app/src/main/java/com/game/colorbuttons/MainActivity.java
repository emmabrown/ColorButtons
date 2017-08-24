package com.game.colorbuttons;

import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.preference.DialogPreference;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.podcopic.animationlib.library.AnimationType;
import com.podcopic.animationlib.library.StartSmartAnimation;

import java.util.HashSet;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button button,button2,button3,button4,button5,button6,
            button7,button8,button9,button10,button11,button12,button13,button14,button15,button16,button17;
    String colorOfButton, colorOfButton2,colorOfButton3,colorOfButton4,
            colorOfButton5,colorOfButton6,colorOfButton7,colorOfButton8,colorOfButton9,
            colorOfButton10,colorOfButton11,colorOfButton12,colorOfButton13, colorOfButton14,colorOfButton15,colorOfButton16,colorOfButton17;
    Random randInt;
    String[] arrayOfColorsOfButtons;
    String[] copyOfArrayOfColorsOfButtons;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.button);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button10 = (Button) findViewById(R.id.button10);
        button11 = (Button) findViewById(R.id.button11);
        button12 = (Button) findViewById(R.id.button12);
        button13 = (Button) findViewById(R.id.button13);
        button14 = (Button) findViewById(R.id.button14);
        button15 = (Button) findViewById(R.id.button15);
        button16 = (Button) findViewById(R.id.button16);
        button17 = (Button) findViewById(R.id.button17);
        //colorOfButton13 = (Button) findViewById(R.id.button13);


        randInt = new Random();
        int temp;
        temp = randInt.nextInt(3) + 1;
        if (temp ==1) {
            colorOfButton = "red";
        } if (temp == 2) {
            colorOfButton = "green";
        }if (temp == 3) {
            colorOfButton = "blue";
        }

        temp = randInt.nextInt(3) + 1;
        if (temp == 1) {
            colorOfButton2 = "red";
        } if (temp == 2) {
            colorOfButton2 = "green";
        }if (temp == 3) {
            colorOfButton2 = "blue";
        }

        temp = randInt.nextInt(3) + 1;
        if (temp == 1) {
            colorOfButton3 = "red";
        } if (temp == 2) {
            colorOfButton3 = "green";
        }if (temp == 3) {
            colorOfButton3 = "blue";
        }

        temp = randInt.nextInt(3) + 1;
        if (temp == 1) {
            colorOfButton4 = "red";
        } if (temp == 2) {
            colorOfButton4 = "green";
        }if (temp == 3) {
            colorOfButton4 = "blue";
        }
        temp = randInt.nextInt(3) + 1;
        if (temp == 1) {
            colorOfButton5 = "red";
        } if (temp == 2) {
            colorOfButton5 = "green";
        }if (temp == 3) {
            colorOfButton5 = "blue";
        }
        temp = randInt.nextInt(3) + 1;
        if (temp == 1) {
            colorOfButton6 = "red";
        } if (temp == 2) {
            colorOfButton6 = "green";
        }if (temp == 3) {
            colorOfButton6 = "blue";
        }

        temp = randInt.nextInt(3) + 1;
        if (temp == 1) {
            colorOfButton7 = "red";
        } if (temp == 2) {
            colorOfButton7 = "green";
        }if (temp == 3) {
            colorOfButton7 = "blue";
        }

        temp = randInt.nextInt(3) + 1;
        if (temp == 1) {
            colorOfButton8 = "red";
        } if (temp == 2) {
            colorOfButton8 = "green";
        }if (temp == 3) {
            colorOfButton8 = "blue";
        }

        temp = randInt.nextInt(3) + 1;
        if (temp == 1) {
            colorOfButton9 = "red";
        } if (temp == 2) {
            colorOfButton9 = "green";
        }if (temp == 3) {
            colorOfButton9 = "blue";
        }

        temp = randInt.nextInt(3) + 1;
        if (temp == 1) {
            colorOfButton10 = "red";
        } if (temp == 2) {
            colorOfButton10 = "green";
        }if (temp == 3) {
            colorOfButton10 = "blue";
        }

        temp = randInt.nextInt(3) + 1;
        if (temp == 1) {
            colorOfButton11 = "red";
        } if (temp == 2) {
            colorOfButton11 = "green";
        }if (temp == 3) {
            colorOfButton11 = "blue";
        }

        temp = randInt.nextInt(3) + 1;
        if (temp == 1) {
            colorOfButton12 = "red";
        } if (temp == 2) {
            colorOfButton12 = "green";
        }if (temp == 3) {
            colorOfButton12 = "blue";
        }
        temp = randInt.nextInt(3) + 1;
        if (temp == 1) {
            colorOfButton13 = "red";
        } if (temp == 2) {
            colorOfButton13 = "green";
        }if (temp == 3) {
            colorOfButton13 = "blue";
        }
        temp = randInt.nextInt(3) + 1;
        if (temp == 1) {
            colorOfButton14 = "red";
        } if (temp == 2) {
            colorOfButton14 = "green";
        }if (temp == 3) {
            colorOfButton14 = "blue";
        }

        temp = randInt.nextInt(3) + 1;
        if (temp == 1) {
            colorOfButton15 = "red";
        } if (temp == 2) {
            colorOfButton15= "green";
        }if (temp == 3) {
            colorOfButton15 = "blue";
        }

        temp = randInt.nextInt(3) + 1;
        if (temp == 1) {
            colorOfButton16 = "red";
        } if (temp == 2) {
            colorOfButton16 = "green";
        }if (temp == 3) {
            colorOfButton16= "blue";
        }
        temp = randInt.nextInt(3) + 1;
        if (temp == 1) {
            colorOfButton17 = "red";
        } if (temp == 2) {
            colorOfButton17 = "green";
        }if (temp == 3) {
            colorOfButton17 = "blue";
        }


        applyColor(button, colorOfButton);
        applyColor(button2, colorOfButton2);
        applyColor(button3, colorOfButton3);
        applyColor(button4, colorOfButton4);
        applyColor(button5, colorOfButton5);
        applyColor(button6, colorOfButton6);
        applyColor(button7, colorOfButton7);
        applyColor(button8, colorOfButton8);
        applyColor(button9, colorOfButton9);
        applyColor(button10, colorOfButton10);
        applyColor(button11, colorOfButton11);
        applyColor(button12, colorOfButton12);
        applyColor(button13, colorOfButton13);
        applyColor(button14, colorOfButton14);
        applyColor(button15, colorOfButton15);
        applyColor(button16, colorOfButton16);
        applyColor(button17, colorOfButton17);

        arrayOfColorsOfButtons = new String[]{colorOfButton,colorOfButton2,colorOfButton3,
        colorOfButton4,colorOfButton5,colorOfButton6,colorOfButton7,colorOfButton8,colorOfButton9,
        colorOfButton10,colorOfButton11,colorOfButton12,colorOfButton14,colorOfButton15,colorOfButton16, colorOfButton17};

        copyOfArrayOfColorsOfButtons = new String[]{colorOfButton, colorOfButton2, colorOfButton3,
                colorOfButton4, colorOfButton5, colorOfButton6, colorOfButton7, colorOfButton8, colorOfButton9,
                colorOfButton10, colorOfButton11, colorOfButton12, colorOfButton14, colorOfButton15, colorOfButton16, colorOfButton17};


        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                String saveColor = colorOfButton;
                colorOfButton = changeColor(colorOfButton);
                applyColor(button, colorOfButton);
                if (saveColor == colorOfButton13) {
                    StartSmartAnimation.startAnimation(findViewById(R.id.button),AnimationType.FadeOut,250,0,true);
                } else {
                    StartSmartAnimation.startAnimation(findViewById(R.id.button),AnimationType.Shake,250,0,true);
                }
                copyOfArrayOfColorsOfButtons[0] = "gray";
                checkDone();
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String saveColor = colorOfButton2;
                colorOfButton2 = changeColor(colorOfButton2);
                applyColor(button2, colorOfButton2);
                if (saveColor == colorOfButton13) {
                    StartSmartAnimation.startAnimation(findViewById(R.id.button2),AnimationType.FadeOut,250,0,true);
                } else {
                    StartSmartAnimation.startAnimation(findViewById(R.id.button2),AnimationType.Shake,250,0,true);
                }
                copyOfArrayOfColorsOfButtons[1] = "gray";
                checkDone();
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String saveColor = colorOfButton3;
                colorOfButton3 = changeColor(colorOfButton3);
                applyColor(button3, colorOfButton3);
                if (saveColor == colorOfButton13) {
                    StartSmartAnimation.startAnimation(findViewById(R.id.button3),AnimationType.FadeOut,250,0,true);
                } else {
                    StartSmartAnimation.startAnimation(findViewById(R.id.button3),AnimationType.Shake,250,0,true);
                }
                copyOfArrayOfColorsOfButtons[2] = "gray";
                checkDone();
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String saveColor = colorOfButton4;
                colorOfButton4 = changeColor(colorOfButton4);
                applyColor(button4, colorOfButton4);
                if (saveColor == colorOfButton13) {
                    StartSmartAnimation.startAnimation(findViewById(R.id.button4),AnimationType.FadeOut,250,0,true);
                } else {
                    StartSmartAnimation.startAnimation(findViewById(R.id.button4),AnimationType.Shake,250,0,true);
                }
                copyOfArrayOfColorsOfButtons[3] = "gray";
                checkDone();
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String saveColor = colorOfButton5;
                colorOfButton5 = changeColor(colorOfButton5);
                applyColor(button5, colorOfButton5);
                if (saveColor == colorOfButton13) {
                    StartSmartAnimation.startAnimation(findViewById(R.id.button5),AnimationType.FadeOut,250,0,true);
                } else {
                    StartSmartAnimation.startAnimation(findViewById(R.id.button5),AnimationType.Shake,250,0,true);
                }
                copyOfArrayOfColorsOfButtons[4] = "gray";
                checkDone();
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String saveColor = colorOfButton6;
                colorOfButton6 = changeColor(colorOfButton6);
                applyColor(button6, colorOfButton6);
                if (saveColor == colorOfButton13) {
                    StartSmartAnimation.startAnimation(findViewById(R.id.button6),AnimationType.FadeOut,250,0,true);
                } else {
                    StartSmartAnimation.startAnimation(findViewById(R.id.button6),AnimationType.Shake,250,0,true);
                }
                copyOfArrayOfColorsOfButtons[5] = "gray";
                checkDone();
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String saveColor = colorOfButton7;
                colorOfButton7 = changeColor(colorOfButton7);
                applyColor(button7, colorOfButton7);
                if (saveColor == colorOfButton13) {
                    StartSmartAnimation.startAnimation(findViewById(R.id.button7),AnimationType.FadeOut,250,0,true);
                } else {
                    StartSmartAnimation.startAnimation(findViewById(R.id.button7),AnimationType.Shake,250,0,true);
                }
                copyOfArrayOfColorsOfButtons[6] = "gray";
                checkDone();
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String saveColor = colorOfButton8;
                colorOfButton8 = changeColor(colorOfButton8);
                applyColor(button8, colorOfButton8);
                if (saveColor == colorOfButton13) {
                    StartSmartAnimation.startAnimation(findViewById(R.id.button8),AnimationType.FadeOut,250,0,true);
                } else {
                    StartSmartAnimation.startAnimation(findViewById(R.id.button8),AnimationType.Shake,250,0,true);
                }
                copyOfArrayOfColorsOfButtons[7] = "gray";
                checkDone();
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String saveColor = colorOfButton9;
                colorOfButton9 = changeColor(colorOfButton9);
                applyColor(button9, colorOfButton9);
                if (saveColor == colorOfButton13) {
                    StartSmartAnimation.startAnimation(findViewById(R.id.button9),AnimationType.FadeOut,250,0,true);
                } else {
                    StartSmartAnimation.startAnimation(findViewById(R.id.button9),AnimationType.Shake,250,0,true);
                }
                copyOfArrayOfColorsOfButtons[8] = "gray";
                checkDone();
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String saveColor = colorOfButton10;
                colorOfButton10 = changeColor(colorOfButton10);
                applyColor(button10, colorOfButton10);
                if (saveColor == colorOfButton13) {
                    StartSmartAnimation.startAnimation(findViewById(R.id.button10),AnimationType.FadeOut,250,0,true);
                } else {
                    StartSmartAnimation.startAnimation(findViewById(R.id.button10),AnimationType.Shake,250,0,true);
                }
                copyOfArrayOfColorsOfButtons[9] = "gray";
                checkDone();
            }
        });

        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String saveColor = colorOfButton11;
                colorOfButton11 = changeColor(colorOfButton11);
                applyColor(button11, colorOfButton11);
                if (saveColor == colorOfButton13) {
                    StartSmartAnimation.startAnimation(findViewById(R.id.button11),AnimationType.FadeOut,250,0,true);
                } else {
                    StartSmartAnimation.startAnimation(findViewById(R.id.button11),AnimationType.Shake,250,0,true);
                }
                copyOfArrayOfColorsOfButtons[10] = "gray";
                checkDone();
            }
        });

        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String saveColor = colorOfButton12;
                colorOfButton12 = changeColor(colorOfButton12);
                applyColor(button12, colorOfButton12);
                if (saveColor == colorOfButton13) {
                    StartSmartAnimation.startAnimation(findViewById(R.id.button12),AnimationType.FadeOut,250,0,true);
                } else {
                    StartSmartAnimation.startAnimation(findViewById(R.id.button12),AnimationType.Shake,250,0,true);
                }
                copyOfArrayOfColorsOfButtons[11] = "gray";
                checkDone();
            }
        });

        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String saveColor = colorOfButton14;
                colorOfButton14 = changeColor(colorOfButton14);
                applyColor(button14, colorOfButton14);
                if (saveColor == colorOfButton13) {
                    StartSmartAnimation.startAnimation(findViewById(R.id.button14),AnimationType.FadeOut,250,0,true);
                } else {
                    StartSmartAnimation.startAnimation(findViewById(R.id.button14),AnimationType.Shake,250,0,true);
                }
                copyOfArrayOfColorsOfButtons[12] = "gray";
                checkDone();
            }
        });

        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String saveColor = colorOfButton15;
                colorOfButton15 = changeColor(colorOfButton15);
                applyColor(button15, colorOfButton15);
                if (saveColor == colorOfButton13) {
                    StartSmartAnimation.startAnimation(findViewById(R.id.button15),AnimationType.FadeOut,250,0,true);
                } else {
                    StartSmartAnimation.startAnimation(findViewById(R.id.button15),AnimationType.Shake,250,0,true);
                }
                copyOfArrayOfColorsOfButtons[13] = "gray";
                checkDone();
            }
        });

        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String saveColor = colorOfButton16;
                colorOfButton16 = changeColor(colorOfButton16);
                applyColor(button16, colorOfButton16);
                if (saveColor == colorOfButton13) {
                    StartSmartAnimation.startAnimation(findViewById(R.id.button16),AnimationType.FadeOut,250,0,true);
                } else {
                    StartSmartAnimation.startAnimation(findViewById(R.id.button16),AnimationType.Shake,250,0,true);
                }
                copyOfArrayOfColorsOfButtons[14] = "gray";
                checkDone();
            }
        });

        button17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String saveColor = colorOfButton17;
                colorOfButton17 = changeColor(colorOfButton17);
                applyColor(button17, colorOfButton17);
                if (saveColor == colorOfButton13) {
                    StartSmartAnimation.startAnimation(findViewById(R.id.button17),AnimationType.FadeOut,250,0,true);
                } else {
                    StartSmartAnimation.startAnimation(findViewById(R.id.button17),AnimationType.Shake,250,0,true);
                }
                copyOfArrayOfColorsOfButtons[15] = "gray";
                checkDone();
            }
        });






    }
    public void checkDone() {
        boolean allButtonsYellow = true;
        for (int i = 0; i < arrayOfColorsOfButtons.length; i++) {
            if (arrayOfColorsOfButtons[i].equals(colorOfButton13)){
                if (!copyOfArrayOfColorsOfButtons[i].equals("gray")){
                    allButtonsYellow = false;
                }

            }

        }
        if (allButtonsYellow == true) {
            /*AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
            alertDialogBuilder.setMessage("Yay! You won!").setCancelable(false).setPositiveButton("PLAY AGAIN",
                    new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                            startActivity(intent);
                            finish();
                        }
                    });*/
            //AlertDialog alertDialog = alertDialogBuilder.create();
            //alertDialog.show();
            //AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(MainActivity.this);
            //alertDialogBuilder.setMessage("YOU WON!!").setCancelable(false);

            Intent intent= new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);
            //StartSmartAnimation.startAnimation(findViewById(R.id.layout),AnimationType.Swing,5000,0,true);
            //need to change this animation^
            finish();
        }
    }


    public String changeColor(String color) {
        if (color.equals("red") && colorOfButton13 == "red"){
            color = "gray";
        } if (color.equals("blue") && colorOfButton13 == "blue") {
            color = "gray";
        } if (color.equals("green") && colorOfButton13 == "green") {
            color = "gray";
        }
        return color;
    }
    public void applyColor(Button button, String color) {
        if (color.equals("red")) {
            button.setBackgroundColor(Color.RED);
        }
        if (color.equals("green")) {
            button.setBackgroundColor(Color.GREEN);
        }
        if (color.equals("blue")) {
            button.setBackgroundColor(Color.BLUE);
        }
        if (color.equals("gray")) {
            button.setBackgroundColor(Color.DKGRAY);
        }

    }
}
