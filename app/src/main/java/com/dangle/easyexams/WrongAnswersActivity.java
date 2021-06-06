package com.dangle.easyexams;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ListView;


import androidx.appcompat.app.AppCompatActivity;

import com.dangle.easyexams.R;

import java.util.ArrayList;

public class WrongAnswersActivity extends AppCompatActivity implements View.OnClickListener {
    private ListView displayWrong;
    private MyAdapter listAdapter;
    private ImageButton backButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_wrong_answers);
        displayWrong = (ListView) findViewById(R.id.displayWrongAnswers);
        backButton = (ImageButton) findViewById(R.id.backButton);
        backButton.setOnClickListener(this);
        ArrayList<ArrayList<String>> wrongAnswers = new ArrayList<ArrayList<String>>();
        ArrayList<String> temp = new ArrayList<String>();
        for (String[] i : ExamActivity.wrong) {
            if (ExamActivity.questions.get(Integer.parseInt(i[2]))[1].equals("Z")) {
                temp.add("(UNANSWERED) "+(Integer.parseInt(i[2])+1)+". "+ ExamActivity.lines.get(Integer.parseInt(i[0]) * 5 ).substring(4));
            } else {
                temp.add((Integer.parseInt(i[2])+1)+". " + ExamActivity.lines.get(Integer.parseInt(i[0]) * 5).substring(4));
            }
            for (int  j = 1; j<5; j++) {
                temp.add(ExamActivity.lines.get(Integer.parseInt(i[0]) * 5 + j));
            }
            temp.add(ExamActivity.answers.get(Integer.parseInt(i[0])));
            temp.add(i[1]);
            wrongAnswers.add(new ArrayList<>(temp));
            temp.clear();
        }
        listAdapter = new MyAdapter(this, wrongAnswers);
        displayWrong.setAdapter(listAdapter);

    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.backButton:
                finish();
        }
    }
}
