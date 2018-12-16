package com.example.underline;

import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.style.CharacterStyle;
import android.text.style.UpdateAppearance;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

import java.lang.reflect.Method;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        LinearLayout linearLayout = new LinearLayout(this);
        // 垂直方向
        linearLayout.setOrientation(LinearLayout.VERTICAL);

        // linearLayoutをContentViewにセット
        setContentView(linearLayout);

        // TextView インスタンス生成
        TextView textView = new TextView(this);
        String str = "Test TextView";
        textView.setText(str);
        textView.setBackgroundResource(R.drawable.values);
        linearLayout.addView(textView,
                new LinearLayout.LayoutParams(
                        LinearLayout.LayoutParams.WRAP_CONTENT,
                        LinearLayout.LayoutParams.WRAP_CONTENT));

        }
    }

