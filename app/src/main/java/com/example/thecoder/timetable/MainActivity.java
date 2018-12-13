package com.example.thecoder.timetable;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.SeekBar;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final ArrayList<Integer> timeTableList = new ArrayList<Integer>();
        timeTableList.add(1);
        timeTableList.add(2);
        timeTableList.add(3);
        timeTableList.add(4);
        timeTableList.add(5);
        timeTableList.add(6);
        timeTableList.add(7);
        timeTableList.add(8);
        timeTableList.add(9);
        timeTableList.add(10);

        SeekBar seekBar = (SeekBar)findViewById(R.id.seekBar);
        final ListView listView = (ListView)findViewById(R.id.listView);
        final ArrayAdapter<Integer> adapter = new ArrayAdapter<Integer>(this, android.R.layout.simple_list_item_1, timeTableList);
        listView.setAdapter(adapter);

        seekBar.setMax(20);
        //seekBar.setProgress(1);
        //int currentV = seekBar.getProgress();

        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                for(int i=0; i<10; i++)
                {
                    //timeTableList.add((i+1)*progress);
                    timeTableList.set(i, (i+1)*progress);
                    Log.i("i = ", " "+i);
                    Log.i("progress = ", " "+progress);
                }
                listView.setAdapter(adapter);
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });




    }
}
