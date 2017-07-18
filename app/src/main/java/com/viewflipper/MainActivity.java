package com.viewflipper;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ViewFlipper;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    Button ileri,geri,oto;
    ViewFlipper vf;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ileri=(Button)findViewById(R.id.btIleri);
        geri=(Button)findViewById(R.id.btGeri);
        oto=(Button)findViewById(R.id.btOto);
        vf=(ViewFlipper)findViewById(R.id.vflipper);

        ileri.setOnClickListener(this);
        geri.setOnClickListener(this);
        oto.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btGeri:
                if(vf.isFlipping())vf.stopFlipping();
                vf.showPrevious();
                break;
            case R.id.btIleri:
                if(vf.isFlipping())vf.stopFlipping();
                vf.showNext();
                break;
            case  R.id.btOto:
                vf.setFlipInterval(2000);
                vf.startFlipping();
                break;


        }
    }
}
