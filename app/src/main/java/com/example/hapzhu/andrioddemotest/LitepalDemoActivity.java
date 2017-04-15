package com.example.hapzhu.andrioddemotest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.litepal.crud.DataSupport;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class LitepalDemoActivity extends AppCompatActivity {


    @BindView(R.id.name)
    EditText name;
    @BindView(R.id.director)
    EditText director;
    @BindView(R.id.duration)
    EditText duration;
    @BindView(R.id.type)
    EditText type;
    @BindView(R.id.btn_summit)
    Button btnSummit;
    @BindView(R.id.movie_text)
    TextView movieText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_litepal_demo);
        ButterKnife.bind(this);
    }

    @OnClick(R.id.btn_summit)
    public void onViewClicked() {
        Movie movie=new Movie();
        movie.setId(1001);
        movie.setName(name.getText().toString());
        movie.setDirector(director.getText().toString());
        movie.setDuration(Integer.valueOf(duration.getText().toString()));
        movie.setType(type.getText().toString());
        if(movie.save()){
         movieText.setText(DataSupport.findAll(movie.getClass()).toString());
        }

        Movie movie1=new Movie();
        movie1.setId(1002);
        movie1.setName("东成西就");
        movie1.setDirector("刘镇伟");
        movie1.setDuration(100);
        movie1.setType("喜剧");
        movie1.save();

    }
}
