package com.example.android.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


 
 





public class MainActivity extends AppCompatActivity {
    public String str ="";
    Character op = 'q';
       double i,num,numtemp;
     EditText showResult;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        showResult = (EditText)findViewById(R.id.display);
    }
    public void clickedbtn1(View v){
        insert("1");
    }
    public void clickedbtn2(View v){
        insert("2");
    }
    public void clickedbtn3(View v){
        insert("3");
    }
    public void clickedbtn4(View v){
        insert("4");
    }
    public void clickedbtn5(View v){
        insert("5");
    }
    public void clickedbtn6(View v){
        insert("6");
    }
    public void clickedbtn7(View v){
        insert("7");
    }
    public void clickedbtn8(View v){
        insert("8");
    }
    public void clickedbtn9(View v){
        insert("9");
    }
    public void clickedbtn0(View v){
        insert("0");
    }
    public void clickedbtndot(View v){
        insert(".");
    }
    public void clickedbtnadd(View v){
        perform();
        op='+';
    }
    public void clickedbtnsub(View v){
        perform();
        op='-';
    }
    public void clickedbtnmul(View v){
        perform();
        op='*';
    }
    public void clickedbtndivide(View v){
        perform();
        op='/';
    }
    public void clickedbtnequal(View v){
            calculate();

                   }

             public void clickedbtnC(View v){
    reset();
          }
    private void calculate() {



                         if(op == '+')
                            num = numtemp+num;
                else if(op == '-')
                          num = numtemp-num;
                else if(op == '/')
                           num = numtemp/num;
                 else if(op == '*')
           num = numtemp*num;
        showResult.setText(String.valueOf(num).toString());
             }





    private void reset() {

                   str ="";
            op ='q';
               num = 0;
               numtemp = 0;
              showResult.setText("");
        }

    private void perform() {
        str = "";
        numtemp = num;
           }



    public void insert(String j) {


                  str = str+j;

                 num = Double.valueOf(str);

                     showResult.setText(str);

                  }

}
