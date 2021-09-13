package com.example.fragment3;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class Student_PerformanceDeatails extends Fragment {
    private EditText mEtGrade,mEtPercaentage;
    private Button mEtPrev;
    private String name;
    private int age;


    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments()!=null){
            name=getArguments().getString("name");
            age=getArguments().getInt("age");
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_student__performance_deatails, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initViews(view);
    }

    private void initViews(View view) {
        mEtGrade=view.findViewById(R.id.etStudentGrade);
        mEtPercaentage=view.findViewById(R.id.etStudentPercentage);
        mEtPrev=view.findViewById(R.id.btnPreview);
        mEtPrev.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String grade=mEtGrade.getText().toString();
                String percentage=mEtPercaentage.getText().toString();
                Model model=new Model(name,grade,percentage,age);
                Intent intent=new Intent(getContext(),PreviewActivity1.class);
                intent.putExtra("model",model);
                startActivity(intent);
            }
        });
    }
}