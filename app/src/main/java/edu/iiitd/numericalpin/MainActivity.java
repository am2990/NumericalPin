package edu.iiitd.numericalpin;


import android.app.Activity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends Activity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0;
    Button bclr,bdot,bequal,bplu,bmin,bmul,bdiv;
    Button brec,bsqrt,bmod;
    TextView ans;

    long oneint=0,twoint=0,ansint=0;
    double onefloat=0,twofloat=0,ansfloat=0;
    int flag=0,operations=0,intorfloat=0,onetime=0;
    String num1,num2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        b1 = (Button) findViewById(R.id.b1);
        b2 = (Button) findViewById(R.id.b2);
        b3 = (Button) findViewById(R.id.b3);
        b4 = (Button) findViewById(R.id.b4);
        b5 = (Button) findViewById(R.id.b5);
        b6 = (Button) findViewById(R.id.b6);
        b7 = (Button) findViewById(R.id.b7);
        b8 = (Button) findViewById(R.id.b8);
        b9 = (Button) findViewById(R.id.b9);
        b0 = (Button) findViewById(R.id.b0);
        bclr = (Button) findViewById(R.id.bclr);
        bdot = (Button) findViewById(R.id.bdot);
        bequal = (Button) findViewById(R.id.bequal);
        bplu = (Button) findViewById(R.id.bplu);
        bmin = (Button) findViewById(R.id.bmin);
        bmul = (Button) findViewById(R.id.bmul);
        bdiv = (Button) findViewById(R.id.bdiv);
        brec = (Button) findViewById(R.id.brec);
        bsqrt = (Button) findViewById(R.id.bsqrt);
        bmod = (Button) findViewById(R.id.bmod);
        ans = (TextView) findViewById(R.id.textView1);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                if(flag==0)
                {
                    num1="1";
                    flag=1;
                    ans.setText(num1);
                }
                else if(flag==1)
                {
                    num1 = num1.concat("1");
                    ans.setText(num1);
                }
                else if(flag==3)
                {
                    num2="1";
                    flag=4;
                    ans.setText(num2);
                }
                else if(flag==4)
                {
                    num2 = num2.concat("1");
                    ans.setText(num2);
                }

            }
        });

        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                if(flag==0)
                {
                    num1="2";
                    flag=1;
                    ans.setText(num1);
                }
                else if(flag==1)
                {
                    num1 = num1.concat("2");
                    ans.setText(num1);
                }
                else if(flag==3)
                {
                    num2="2";
                    flag=4;
                    ans.setText(num2);
                }
                else if(flag==4)
                {
                    num2 = num2.concat("2");
                    ans.setText(num2);
                }

            }
        });

        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                if(flag==0)
                {
                    num1="3";
                    flag=1;
                    ans.setText(num1);
                }
                else if(flag==1)
                {
                    num1 = num1.concat("3");
                    ans.setText(num1);
                }
                else if(flag==3)
                {
                    num2="3";
                    flag=4;
                    ans.setText(num2);
                }
                else if(flag==4)
                {
                    num2 = num2.concat("3");
                    ans.setText(num2);
                }

            }
        });

        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                if(flag==0)
                {
                    num1="4";
                    flag=1;
                    ans.setText(num1);
                }
                else if(flag==1)
                {
                    num1 = num1.concat("4");
                    ans.setText(num1);
                }
                else if(flag==3)
                {
                    num2="4";
                    flag=4;
                    ans.setText(num2);
                }
                else if(flag==4)
                {
                    num2 = num2.concat("4");
                    ans.setText(num2);
                }

            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                if(flag==0)
                {
                    num1="5";
                    flag=1;
                    ans.setText(num1);
                }
                else if(flag==1)
                {
                    num1 = num1.concat("5");
                    ans.setText(num1);
                }
                else if(flag==3)
                {
                    num2="5";
                    flag=4;
                    ans.setText(num2);
                }
                else if(flag==4)
                {
                    num2 = num2.concat("5");
                    ans.setText(num2);
                }

            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                if(flag==0)
                {
                    num1="6";
                    flag=1;
                    ans.setText(num1);
                }
                else if(flag==1)
                {
                    num1 = num1.concat("6");
                    ans.setText(num1);
                }
                else if(flag==3)
                {
                    num2="6";
                    flag=4;
                    ans.setText(num2);
                }
                else if(flag==4)
                {
                    num2 = num2.concat("6");
                    ans.setText(num2);
                }

            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                if(flag==0)
                {
                    num1="7";
                    flag=1;
                    ans.setText(num1);
                }
                else if(flag==1)
                {
                    num1 = num1.concat("7");
                    ans.setText(num1);
                }
                else if(flag==3)
                {
                    num2="7";
                    flag=4;
                    ans.setText(num2);
                }
                else if(flag==4)
                {
                    num2 = num2.concat("7");
                    ans.setText(num2);
                }

            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                if(flag==0)
                {
                    num1="8";
                    flag=1;
                    ans.setText(num1);
                }
                else if(flag==1)
                {
                    num1 = num1.concat("8");
                    ans.setText(num1);
                }
                else if(flag==3)
                {
                    num2="8";
                    flag=4;
                    ans.setText(num2);
                }
                else if(flag==4)
                {
                    num2 = num2.concat("8");
                    ans.setText(num2);
                }

            }
        });

        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                if(flag==0)
                {
                    num1="9";
                    flag=1;
                    ans.setText(num1);
                }
                else if(flag==1)
                {
                    num1 = num1.concat("9");
                    ans.setText(num1);
                }
                else if(flag==3)
                {
                    num2="9";
                    flag=4;
                    ans.setText(num2);
                }
                else if(flag==4)
                {
                    num2 = num2.concat("9");
                    ans.setText(num2);
                }

            }
        });

        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                if(flag==0)
                {
                    num1="0";
                    flag=1;
                    ans.setText(num1);
                }
                else if(flag==1)
                {
                    num1 = num1.concat("0");
                    ans.setText(num1);
                }
                else if(flag==3)
                {
                    num2="0";
                    flag=4;
                    ans.setText(num2);
                }
                else if(flag==4)
                {
                    num2 = num2.concat("0");
                    ans.setText(num2);
                }

            }
        });

        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                if(flag==1 && onetime==0)
                {
                    num1 = num1.concat(".");
                    ans.setText(num1);
                }
                else if(flag==4 && onetime==0)
                {
                    num2 = num2.concat(".");
                    ans.setText(num2);
                }

                onetime=1;
                intorfloat=1;
            }
        });

        bplu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                if(flag!=0)
                {
                    operations=1;
                    flag=3;
                    ans.setText("");
                }
                else
                {
                    ans.setText("INVALID DATA");
                    oneint=0;twoint=0;ansint=0;
                    onefloat=0;twofloat=0;ansfloat=0;
                    flag=0;operations=0;intorfloat=0;onetime=0;
                }
            }
        });

        bmin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                if(flag!=0)
                {
                    operations=2;
                    flag=3;
                    ans.setText("");
                }
                else
                {
                    ans.setText("INVALID DATA");
                    oneint=0;twoint=0;ansint=0;
                    onefloat=0;twofloat=0;ansfloat=0;
                    flag=0;operations=0;intorfloat=0;onetime=0;
                }
            }
        });

        bmul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                if(flag!=0)
                {
                    operations=3;
                    flag=3;
                    ans.setText("");
                }
                else
                {
                    ans.setText("INVALID DATA");
                    oneint=0;twoint=0;ansint=0;
                    onefloat=0;twofloat=0;ansfloat=0;
                    flag=0;operations=0;intorfloat=0;onetime=0;
                }
            }
        });

        bdiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                if(flag!=0)
                {
                    operations=4;
                    flag=3;
                    ans.setText("");
                }
                else
                {
                    ans.setText("INVALID DATA");
                    oneint=0;twoint=0;ansint=0;
                    onefloat=0;twofloat=0;ansfloat=0;
                    flag=0;operations=0;intorfloat=0;onetime=0;
                }
            }
        });

        bclr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                oneint=0;twoint=0;ansint=0;
                onefloat=0;twofloat=0;ansfloat=0;
                flag=0;operations=0;intorfloat=0;onetime=0;
                ans.setText("");
            }
        });

        brec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                if(flag!=0 && num1.length() < 10  && operations==0)
                {
                    onefloat=Double.parseDouble(num1);
                    ansfloat=1/onefloat;
                    ans.setText("RECIPROC("+onefloat+"):"+String.valueOf(ansfloat));
                }
                else
                {
                    ans.setText("INVALID DATA");
                }
                oneint=0;twoint=0;ansint=0;
                onefloat=0;twofloat=0;ansfloat=0;
                flag=0;operations=0;intorfloat=0;onetime=0;
            }
        });

        bsqrt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {


                if(flag!=0 && num1.length() < 10  && operations==0)
                {
                    onefloat=Double.parseDouble(num1);
                    ansfloat=Math.sqrt(onefloat);
                    ans.setText("SQRT("+onefloat+"):"+String.valueOf(ansfloat));
                }
                else
                {
                    ans.setText("INVALID DATA");
                }

                oneint=0;twoint=0;ansint=0;
                onefloat=0;twofloat=0;ansfloat=0;
                flag=0;operations=0;intorfloat=0;onetime=0;
            }
        });

        bmod.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                if(flag!=0)
                {
                    operations=5;
                    flag=3;
                    ans.setText("");
                }
                else
                {
                    ans.setText("INVALID DATA");
                    oneint=0;twoint=0;ansint=0;
                    onefloat=0;twofloat=0;ansfloat=0;
                    flag=0;operations=0;intorfloat=0;onetime=0;
                }
            }
        });

        bequal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View arg0) {

                if(flag == 4)
                {

                    if(num1.length() < 10 && num2.length() < 10 )
                    {

                        switch(operations)
                        {
                            case 1:
                                if(intorfloat==0)
                                {
                                    oneint=Integer.parseInt(num1);
                                    twoint=Integer.parseInt(num2);
                                    ansint=oneint+twoint;
                                    ans.setText("ANS:"+String.valueOf(ansint));
                                }
                                else
                                {
                                    onefloat=Double.parseDouble(num1);
                                    twofloat=Double.parseDouble(num2);
                                    ansfloat=onefloat+twofloat;
                                    ans.setText("ANS:"+String.valueOf(ansfloat));

                                }
                                break;
                            case 2:
                                if(intorfloat==0)
                                {
                                    oneint=Integer.parseInt(num1);
                                    twoint=Integer.parseInt(num2);
                                    ansint=oneint-twoint;
                                    ans.setText("ANS:"+String.valueOf(ansint));
                                }
                                else
                                {
                                    onefloat=Double.parseDouble(num1);
                                    twofloat=Double.parseDouble(num2);
                                    ansfloat=onefloat-twofloat;
                                    ans.setText("ANS:"+String.valueOf(ansfloat));
                                }
                                break;
                            case 3:
                                if(intorfloat==0)
                                {
                                    oneint=Integer.parseInt(num1);
                                    twoint=Integer.parseInt(num2);
                                    ansint=oneint*twoint;
                                    ans.setText("ANS:"+String.valueOf(ansint));
                                }
                                else
                                {
                                    onefloat=Double.parseDouble(num1);
                                    twofloat=Double.parseDouble(num2);
                                    ansfloat=onefloat*twofloat;
                                    ans.setText("ANS:"+String.valueOf(ansfloat));
                                }
                                break;
                            case 4:
                                onefloat=Double.parseDouble(num1);
                                twofloat=Double.parseDouble(num2);
                                ansfloat=onefloat/twofloat;
                                ans.setText("ANS:"+String.valueOf(ansfloat));
                                break;
                            case 5:
                                onefloat=Double.parseDouble(num1);
                                twofloat=Double.parseDouble(num2);
                                ansfloat=onefloat % twofloat;
                                ans.setText("ANS:"+String.valueOf(ansfloat));
                                break;
                        }//switch
                    }//lenght
                    else
                        ans.setText("INVALID DATA");

                }//flag
                else
                    ans.setText("INVALID DATA");

                oneint=0;twoint=0;ansint=0;
                onefloat=0;twofloat=0;ansfloat=0;
                flag=0;operations=0;intorfloat=0;onetime=0;
            }

        });

    }

    /*back key */
    //for android 3.0 and above
    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event)
    {
        if(keyCode == KeyEvent.KEYCODE_BACK)
        {
            finish();

            return true;
        }

        return super.onKeyDown(keyCode, event);
    }

    //for android 2.0
    @Override
    public void onBackPressed(){

        finish();

        return;
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item){

        switch(item.getItemId())
        {
            case R.id.exit:

                finish();

                return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
