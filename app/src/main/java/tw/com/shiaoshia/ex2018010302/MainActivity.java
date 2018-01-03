package tw.com.shiaoshia.ex2018010302;

import android.media.Image;
import android.support.annotation.DrawableRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Switch;

import com.squareup.picasso.Picasso;

public class MainActivity extends AppCompatActivity {

    ImageView iv,iv2;
    int n;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iv = (ImageView)findViewById(R.id.imageView2);
        iv2 = (ImageView)findViewById(R.id.imageView);
        n=0;
    }

    public void click01(View v) {

        switch (n) {
            case 0:
                iv.setImageResource(R.drawable.images);
                n=1;
                break;
            case 1:
                iv.setImageResource(R.drawable.ic_launcher_background);
                n=0;
                break;
        }

    }

    public void click02(View v) {
        Picasso.with(MainActivity.this).load("http://www.pcschool.com.tw/updimg/act/2017RWD_AD/7bAD_945d.jpg").into(iv2);
    }

}
