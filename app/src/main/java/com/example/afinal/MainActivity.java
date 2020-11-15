package com.example.afinal;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    GridView gridView;
    String[] name={"Bí ẩn","Cổ điển","Hài hước","Hành động","KH viễn tưởng","Kinh dị","Lãng mạn",
    "Người sói","Ngẫu nhiên","Phi tiểu thuyết","Phiêu lưu","Siêu nhiên","Thơ ca","TT chung",
            "Thriller","TT lịch sử","TT thiếu niên","Truyện ngắn","Truyện tâm linh","Viễn tưởng"};
    int[] img={R.drawable.mystery,R.drawable.newadult,R.drawable.humor,R.drawable.action,R.drawable.scifi,R.drawable.horror,
            R.drawable.romance,R.drawable.werewolf,R.drawable.random,R.drawable.nonfiction,R.drawable.adventure,R.drawable.paranormal,
            R.drawable.poetry,R.drawable.urban,R.drawable.thriller,R.drawable.historicalfic,R.drawable.teenfic,R.drawable.shortstory,R.drawable.diverselit,
            R.drawable.fanfic};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        gridView=findViewById(R.id.grid);
        MainAdapter adapter=new MainAdapter(MainActivity.this,name,img);
        gridView.setAdapter(adapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                if(position==0) {
                    Intent intent = new Intent(MainActivity.this,one.class);
                    startActivity(intent);
                }else if(position==1){
                    Intent intent = new Intent(MainActivity.this,two.class);
                    startActivity(intent);
                }
            }
        });
    }
}