package com.example.hapzhu.andrioddemotest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class ButterKnifeTestActivity extends AppCompatActivity {


    @BindView(R.id.tv_test1)
    TextView tvTest1;
    @BindView(R.id.btn_test1)
    Button btnTest1;
    @BindView(R.id.et_test1)
    EditText etTest1;
    @BindView(R.id.lv_test1)
    ListView lvTest1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_butter_knife_test);
        ButterKnife.bind(this);
        tvTest1.setText("文本控件已被初始化");
        btnTest1.setText("按钮被初始化");

    }


    @OnClick(R.id.btn_test1)
    public void onViewClicked() {
        btnTest1.setText("我被点击了");
        tvTest1.setText("天若有情天亦老");
    }
}
