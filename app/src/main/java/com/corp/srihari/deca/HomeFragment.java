package com.corp.srihari.deca;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.support.v4.app.Fragment;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;
import android.widget.ImageView;

/**
 * Created by sriharivishnu on 2018-09-08.
 */

public class HomeFragment extends Fragment {
    private ImageButton startExam;
    private ImageButton piButton;
    private ImageButton learnButton;
    private ImageView mainLogo;
    public static HomeFragment newInstance() {
        HomeFragment fragment = new HomeFragment();
        return fragment;
    }
    @Override
    public void onCreate(Bundle savedInstanceState) {super.onCreate(savedInstanceState);}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.home_fragment,container,false);
        startExam = (ImageButton) view.findViewById(R.id.startExam);
        piButton = (ImageButton) view.findViewById(R.id.PIButton);
        learnButton = (ImageButton) view.findViewById(R.id.learnButton);
        mainLogo = (ImageView) view.findViewById(R.id.logoView);

        buttonAnimation(startExam);
        buttonAnimation(piButton);
        buttonAnimation(learnButton);

        return view;
    }
    public void buttonAnimation(final ImageButton button) {
        button.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View v, MotionEvent event) {
                switch(event.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        ObjectAnimator scaleDownX = ObjectAnimator.ofFloat(button, "scaleX", 0.9f);
                        ObjectAnimator scaleDownY = ObjectAnimator.ofFloat(button, "scaleY", 0.9f);
                        scaleDownX.setDuration(0);
                        scaleDownY.setDuration(0);

                        AnimatorSet scaleDown = new AnimatorSet();
                        scaleDown.play(scaleDownX).with(scaleDownY);

                        scaleDown.start();

                        return true;
                    case MotionEvent.ACTION_UP:
                        buttonAction(button);
                        ObjectAnimator scaleDownX2 = ObjectAnimator.ofFloat(button, "scaleX", 1f);
                        ObjectAnimator scaleDownY2 = ObjectAnimator.ofFloat(button, "scaleY", 1f);
                        scaleDownX2.setDuration(0);
                        scaleDownY2.setDuration(0);

                        AnimatorSet scaleDown2 = new AnimatorSet();
                        scaleDown2.play(scaleDownX2).with(scaleDownY2);

                        scaleDown2.start();

                        return true;
                }
                return true;
            }
        });
    }
    private void buttonAction(ImageButton button) {
        switch(button.getId()) {
            case R.id.startExam:
                Intent intent = new Intent(getActivity(), ChooseExam.class);
                startActivity(intent);
                getActivity().finish();
                break;
            case R.id.PIButton:
                Intent in = new Intent(getActivity(), PerformanceIndicators.class);
                startActivity(in);
                getActivity().finish();
                break;
        }
    }
}