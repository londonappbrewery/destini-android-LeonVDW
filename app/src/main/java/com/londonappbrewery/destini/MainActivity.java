package com.londonappbrewery.destini;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // TODO: Steps 4 & 8 - Declare member variables here:
    TextView mStoryTextView;
    Button mButtonTop;
    Button mButtonBottom;

    int[] storyChoices = new int[]
            {
                    R.string.T1_Ans1,
                    R.string.T1_Ans2,
                    R.string.T2_Ans1,
                    R.string.T2_Ans2,
                    R.string.T3_Ans1,
                    R.string.T3_Ans2
            };

    int[] storyPaths = new int[]
            {
                    R.string.T1_Story,
                    R.string.T2_Story,
                    R.string.T3_Story,
                    R.string.T4_End,
                    R.string.T5_End,
                    R.string.T6_End
            };

    int mStoryIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        // TODO: Step 5 - Wire up the 3 views from the layout to the member variables:
        mStoryTextView = (TextView)findViewById(R.id.storyTextView);
        mButtonTop = (Button)findViewById(R.id.buttonTop);
        mButtonBottom = (Button)findViewById(R.id.buttonBottom);


        // TODO: Steps 6, 7, & 9 - Set a listener on the top button:
        mButtonTop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mStoryIndex == 0){
                    mStoryIndex = 2;
                    mStoryTextView.setText(storyPaths[mStoryIndex]);
                    mButtonTop.setText(storyChoices[4]);
                    mButtonBottom.setText(storyChoices[5]);
                }
                else if(mStoryIndex == 1){
                    mStoryIndex = 2;
                    mStoryTextView.setText(storyPaths[mStoryIndex]);
                    mButtonTop.setText(storyChoices[4]);
                    mButtonBottom.setText(storyChoices[5]);
                }
                else if(mStoryIndex == 2){
                    mStoryIndex = 5;
                    mStoryTextView.setText(storyPaths[mStoryIndex]);
                    mButtonTop.setVisibility(View.GONE);
                    mButtonBottom.setVisibility(View.GONE);
                }

            }
        });



        // TODO: Steps 6, 7, & 9 - Set a listener on the bottom button:
        mButtonBottom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(mStoryIndex == 0){
                    mStoryIndex = 1;
                    mStoryTextView.setText(storyPaths[mStoryIndex]);
                    mButtonTop.setText(storyChoices[2]);
                    mButtonBottom.setText(storyChoices[3]);
                }
                else if(mStoryIndex == 1){
                    mStoryIndex = 3;
                    mStoryTextView.setText(storyPaths[mStoryIndex]);
                    mButtonTop.setVisibility(View.GONE);
                    mButtonBottom.setVisibility(View.GONE);
                }
                else if(mStoryIndex == 2){
                    mStoryIndex = 4;
                    mStoryTextView.setText(storyPaths[mStoryIndex]);
                    mButtonTop.setVisibility(View.GONE);
                    mButtonBottom.setVisibility(View.GONE);
                }

            }
        });

    }
}
