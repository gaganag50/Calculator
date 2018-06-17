package com.example.android.calculator;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainAct";

    int ans = 0;
    Button percentage, ac, clear, delete, divide, multiply, subtract, add, equal;
    TextView zero, one, two, three, four, five, six, seven, eight, nine;
    TextView show, result;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        clear = findViewById(R.id.clear);
        delete = findViewById(R.id.delete);
        divide = findViewById(R.id.divide);
        multiply = findViewById(R.id.multiply);
        percentage = findViewById(R.id.percentage);
        ac = findViewById(R.id.AC);
        subtract = findViewById(R.id.subtract);
        add = findViewById(R.id.add);
        equal = findViewById(R.id.equal);


        zero = findViewById(R.id.zero);
        one = findViewById(R.id.one);
        two = findViewById(R.id.two);
        three = findViewById(R.id.three);
        four = findViewById(R.id.four);
        five = findViewById(R.id.five);
        six = findViewById(R.id.six);
        seven = findViewById(R.id.seven);
        eight = findViewById(R.id.eight);
        nine = findViewById(R.id.nine);

        result = findViewById(R.id.result);
        show = findViewById(R.id.show);

        final int ZERO = 0, ONE = 1, TWO = 2, THREE = 3, FOUR = 4, FIVE = 5, SIX = 6, SEVEN = 7, EIGHT = 8, NINE = 9;
        final char PLUS = '+', MINUS = '-', DIVIDE = '/', MULTIPLY = '*', PERCENTAGE = '%';

        zero.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.append(String.valueOf(ZERO));
            }
        });

        one.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.append(String.valueOf(ONE));
            }
        });

        two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.append(String.valueOf(TWO));
            }
        });

        three.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.append(String.valueOf(THREE));
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.append(String.valueOf(FOUR));
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.append(String.valueOf(FIVE));
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.append(String.valueOf(SIX));
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.append(String.valueOf(SEVEN));
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.append(String.valueOf(EIGHT));
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                result.append(String.valueOf(NINE));
            }
        });


        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String string = result.getText().toString();
                if (string.matches("")) {
                    result.append("+");

                } else {
                    char ch = string.charAt(string.length() - 1);
                    if (ch == '+' ||
                            ch == '-' ||
                            ch == '*' ||
                            ch == '/' ||
                            ch == '%') {
                        string = string.substring(0, string.length() - 1);
                        string = string.concat("+");
                        result.setText(string);
                    } else
                        result.append("+");
                }

            }
        });

        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String string = result.getText().toString();
                if (string.matches("")) {
                    result.append("-");

                } else {
                    char ch = string.charAt(string.length() - 1);
                    if (ch == '+' ||
                            ch == '-' ||
                            ch == '*' ||
                            ch == '/' ||
                            ch == '%') {
                        string = string.substring(0, string.length() - 1);
                        string = string.concat("-");
                        result.setText(string);
                    } else
                        result.append("-");
                }

            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String string = result.getText().toString();
                if (string.matches("")) {
                    Toast.makeText(MainActivity.this, "Invalid input", Toast.LENGTH_SHORT).show();
                    return;

                } else {
                    char ch = string.charAt(string.length() - 1);
                    if (ch == '+' ||
                            ch == '-' ||
                            ch == '*' ||
                            ch == '/' ||
                            ch == '%') {
                        string = string.substring(0, string.length() - 1);
                        string = string.concat("*");
                        result.setText(string);
                    } else
                        result.append("*");
                }

            }
        });

        divide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String string = result.getText().toString();
                if (string.matches("")) {
                    Toast.makeText(MainActivity.this, "Invalid Input", Toast.LENGTH_SHORT).show();
                    return;
                } else {
                    char ch = string.charAt(string.length() - 1);
                    if (ch == '+' ||
                            ch == '-' ||
                            ch == '*' ||
                            ch == '/' ||
                            ch == '%') {
                        string = string.substring(0, string.length() - 1);
                        string = string.concat("/");
                        result.setText(string);
                    } else
                        result.append("/");
                }

            }
        });

        percentage.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String string = result.getText().toString();
                if (string.matches("")) {
                    Toast.makeText(MainActivity.this, "Invalid Input", Toast.LENGTH_SHORT).show();
                    return;
                } else {
                    char ch = string.charAt(string.length() - 1);
                    if (ch == '+' ||
                            ch == '-' ||
                            ch == '*' ||
                            ch == '/' ||
                            ch == '%') {
                        string = string.substring(0, string.length() - 1);
                        string = string.concat("%");
                        result.setText(string);
                    } else
                        result.append("%");
                }

            }
        });

        equal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String exp = result.getText().toString();
                if (exp.matches("")) {
                    show.setText("0");
                    return;
                }
                char CH = exp.charAt(exp.length() - 1);
                if (CH == '+' || CH == '-' || CH == '*' || CH == '/' || CH == '%') {
                    show.setText("Invalid input");
                    return;
                }
                Log.d(TAG, exp);
                int j = 0, i, no, flag = 0;
                String substring;
                char last = 'a';
                ans = 0;
                for (i = 0; i < exp.length(); i++) {

                    char ch = exp.charAt(i);
                    switch (ch) {
                        case PLUS:

                            if (i == 0) {
                                j = i + 1;
                                last = ch;
                                continue;
                            }
                            substring = exp.substring(j, i);

                            no = Integer.valueOf(substring);
                            if (flag == 0) {

                                ans += no;

                            } else {
                                if (last == '+') ans += no;
                                else if (last == '-') ans -= no;
                                else if (last == '*') ans *= no;
                                else if (last == '/') {
                                    try {
                                        ans /= no;
                                    } catch (ArithmeticException e) {
                                        Toast.makeText(MainActivity.this, "Kuch bhi", Toast.LENGTH_SHORT).show();
                                        return;

                                    }
                                } else ans %= no;
                            }
                            flag = 1;
                            j = i + 1;
                            last = ch;
                            break;

                        case MINUS:

                            if (i == 0) {
                                Log.d(TAG, "onClick: ");
                                j = i + 1;

                                last = ch;
                                continue;
                            }
                            substring = exp.substring(j, i);


                            no = Integer.valueOf(substring);
                            if (flag == 0) {
                                ans += no;
                                flag = 1;
                            } else {
                                if (last == '+') ans += no;
                                else if (last == '-') ans -= no;
                                else if (last == '*') ans *= no;
                                else if (last == '/') {
                                    try {
                                        ans /= no;
                                    } catch (ArithmeticException e) {
                                        Toast.makeText(MainActivity.this, "Kuch bhi", Toast.LENGTH_SHORT).show();
                                        return;
                                    }
                                } else ans %= no;
                            }
                            j = i + 1;
                            last = ch;
                            break;

                        case DIVIDE:

                            if (i == 0) {
                                j = i + 1;
                                last = ch;
                                continue;
                            }
                            substring = exp.substring(j, i);


                            no = Integer.valueOf(substring);
                            if (flag == 0) {

                                ans += no;
                                flag = 1;
                            } else {
                                if (last == '+') ans += no;
                                else if (last == '-') ans -= no;
                                else if (last == '*') ans *= no;
                                else if (last == '/') {
                                    try {
                                        ans /= no;
                                    } catch (ArithmeticException e) {
                                        Toast.makeText(MainActivity.this, "Kuch bhi", Toast.LENGTH_SHORT).show();
                                        return;
                                    }
                                } else ans %= no;
                            }
                            j = i + 1;
                            last = ch;
                            break;

                        case MULTIPLY:
                            Log.d(TAG, "*");
                            if (i == 0) {
                                j = i + 1;
                                last = ch;
                                continue;
                            }
                            substring = exp.substring(j, i);
                            Log.d(TAG, substring);


                            no = Integer.valueOf(substring);
                            if (flag == 0) {
                                ans += no;
                                flag = 1;
                            } else {
                                if (last == '+') ans += no;
                                else if (last == '-') ans -= no;
                                else if (last == '*') ans *= no;
                                else if (last == '/') {
                                    try {
                                        ans /= no;
                                    } catch (ArithmeticException e) {
                                        Toast.makeText(MainActivity.this, "Kuch bhi", Toast.LENGTH_SHORT).show();
                                        return;

                                    }
                                } else ans %= no;
                            }
                            j = i + 1;
                            last = ch;
                            break;

                        case PERCENTAGE:
                            Log.d(TAG, "%");
                            if (i == 0) {
                                j = i + 1;
                                last = ch;
                                continue;
                            }
                            substring = exp.substring(j, i);
                            Log.d(TAG, substring);


                            no = Integer.valueOf(substring);
                            if (flag == 0) {
                                ans += no;
                                flag = 1;
                            } else {
                                if (last == '+') ans += no;
                                else if (last == '-') ans -= no;
                                else if (last == '*') ans *= no;
                                else if (last == '/') {
                                    try {
                                        ans /= no;
                                    } catch (ArithmeticException e) {
                                        Toast.makeText(MainActivity.this, "Kuch bhi", Toast.LENGTH_SHORT).show();
                                        return;
                                    }
                                } else ans %= no;
                            }
                            j = i + 1;
                            last = ch;
                            break;

                        default:


                    }
                }

                substring = exp.substring(j, i);
                Log.d(TAG, substring);
                Log.d(TAG, String.valueOf(last));

                no = Integer.valueOf(substring);
                Log.d(TAG, String.valueOf(ans));

                Log.d(TAG, String.valueOf(no));

                if (last == '+') ans += no;
                else if (last == '-') ans -= no;
                else if (last == '*') ans *= no;
                else if (last == '/') {
                    try {
                        ans /= no;
                    } catch (ArithmeticException e) {
                        Toast.makeText(MainActivity.this, "Kuch bhi", Toast.LENGTH_SHORT).show();
                        return;
                    }
                } else if (last == '%') ans %= no;
                else if (last == 'a') ans += no;


                Integer ANS = ans;
                show.setText(ANS.toString());
            }
        });

        delete.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String string = result.getText().toString();
                string = string.substring(0, string.length() - 1);
                result.setText(string);

            }
        });

        ac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ans = 0;
                result.setText("");
                show.setText("");
            }
        });


        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                result.setText("");
                show.setText("0");

            }
        });


    }
}
