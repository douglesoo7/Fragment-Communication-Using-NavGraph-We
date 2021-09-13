package com.example.fragment3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class PreviewActivity1 extends AppCompatActivity {
    private TextView mTvName,mTvAGe,mTvGrade,mTvPercentage;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_preview1);
        initvies();
        getDataFromIntent();
    }

    private void getDataFromIntent() {
        Model model=(Model) getIntent().getSerializableExtra("model");
        mTvName.setText(model.getName());
        mTvGrade.setText(model.getGrade());
        mTvAGe.setText(model.getAge()+" ");

        mTvPercentage.setText(model.getPercentage());
    }

    private void initvies() {
        mTvName=findViewById(R.id.tvStudentName);
        mTvAGe=findViewById(R.id.tvStudentAge);
        mTvGrade=findViewById(R.id.tvStudentGrade);
        mTvPercentage=findViewById(R.id.tvStudentPercentage);
    }
}