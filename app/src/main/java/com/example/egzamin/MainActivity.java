package com.example.egzamin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.egzamin.R;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ImageView k1, k2, k3, k4, k5, k6;
    Button start;
    Button reset;
    TextView textView;
    TextView textView2;
    int sumaGlowna=0;
    int[] images = {R.drawable.k1, R.drawable.k2, R.drawable.k3, R.drawable.k4, R.drawable.k5, R.drawable.k6};
int sum = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        k1 = findViewById(R.id.imageView);
        k2 = findViewById(R.id.imageView2);
        k3 = findViewById(R.id.imageView3);
        k4 = findViewById(R.id.imageView4);
        k5 = findViewById(R.id.imageView5);
        k6 = findViewById(R.id.imageView6);
        start = findViewById(R.id.button);
        reset=findViewById(R.id.button3);
        textView = findViewById(R.id.textView);
        textView2 = findViewById(R.id.textView2);

        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random rand = new Random();
                int[] randomNums = new int[6];


                for (int i = 0; i < 6; i++) {

                    int randomNum = rand.nextInt(6);
                    randomNums[i] = randomNum+1;

                    //  sum += randomNum ;

                }


                    k1.setImageResource(images[randomNums[0]-1]);
                    k2.setImageResource(images[randomNums[1]-1]);
                    k3.setImageResource(images[randomNums[2]-1]);
                    k4.setImageResource(images[randomNums[3]-1]);
                    k5.setImageResource(images[randomNums[4]-1]);
                    k6.setImageResource(images[randomNums[5]-1]);



sum=0;
                for(int i=1;i<=6;i++){
                    int ilosc=0;


                    for(int x=0;x<randomNums.length;x++){
                        if(randomNums[x]==i){
                            ilosc++;
                        }
                    }
                    if(ilosc>=2){
                        sum+=ilosc*i;

                    }


                }
                textView.setText("Suma: " + String.valueOf(sum));
                sumaGlowna+=sum;
                textView2.setText("Suma: " + String.valueOf(sumaGlowna));
                }

        });
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                k1.setImageResource(R.drawable.question);
                k2.setImageResource(R.drawable.question);
                k3.setImageResource(R.drawable.question);
                k4.setImageResource(R.drawable.question);
                k5.setImageResource(R.drawable.question);
                k6.setImageResource(R.drawable.question);
                sum=0;
                sumaGlowna=0;
                textView.setText("Suma: " + String.valueOf(sum));
                textView2.setText("Suma: " + String.valueOf(sumaGlowna));
            }
        });

    }

}