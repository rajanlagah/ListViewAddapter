//new drawAble coustome
//at mainxml u have to give @drawable/name to background
//<corners android:radius="20dp"/>
//@android:id/list is important set it to listviews id
//@android:id/empty so if list is empty then view with this id will apper

package com.exapmle.rajan.listviewaddapter;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {
public Button b1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.button2);

        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =new Intent(MainActivity.this,ListView.class);
                startActivity(intent);
            }
        });
    }


}
