package com.tashfia.customlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {

    ListView customlist;
String countryLst[]={ "bangladesh","India","america","Chaina","New Zealand","Portugal"};
int flag[]={R.drawable.bd,R.drawable.india,R.drawable.america,R.drawable.china,R.drawable.new_zealand,R.drawable.portugle};

@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    customlist=(ListView)findViewById(R.id.listview);
    CustomAdapter customAdapter=new CustomAdapter(getApplicationContext(),countryLst,flag);
    customlist.setAdapter(customAdapter);


}
}
