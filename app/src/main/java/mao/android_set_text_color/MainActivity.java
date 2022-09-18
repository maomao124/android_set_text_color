package mao.android_set_text_color;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{

    @SuppressLint("ResourceAsColor")
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView textView1 = findViewById(R.id.t1);
        textView1.setTextColor(Color.RED);
        textView1.setTextSize(30);
        TextView textView3 = findViewById(R.id.t3);
        textView3.setTextColor(0xffffff);
        TextView textView5 = findViewById(R.id.t5);
        textView5.setTextColor(R.color.teal_200);
        TextView textView6 = findViewById(R.id.t6);
        //从红色、绿色、蓝色分量返回一个 color-int。
        // alpha 分量隐式为 255（完全不透明）。
        // 这些组件值应该是\([0..255]\)，但是没有执行范围检查，
        // 所以如果它们超出范围，则返回的颜色是未定义的
        textView6.setTextColor(Color.rgb(0,255,0));
    }
}