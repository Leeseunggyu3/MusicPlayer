package com.cookandroid.dcumusicplayer;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private ListView listView;
    private String[] titles = {"음악 제목 음악 제목", "음악 제목 음악 제목", "음악 제목 음악 제목", "음악 제목 음악 제목", "음악 제목 음악 제목"};
    private String[] artists = {"가수이름", "가수이름", "가수이름", "가수이름", "가수이름"};
    private String[] durations = {"3:20", "3:20", "3:20", "3:20", "3:20"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listView = findViewById(R.id.listView);

        CustomAdapter adapter = new CustomAdapter(this, titles, artists, durations);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(MainActivity.this, PlayerActivity.class);
                startActivity(intent);
            }
        });
    }
}
