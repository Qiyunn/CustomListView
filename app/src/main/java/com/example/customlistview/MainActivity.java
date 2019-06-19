package com.example.customlistview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import com.example.customlistview.adapter.CustomListViewAdapter;
import com.example.customlistview.model.Employee;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView listView;
    ArrayList<Employee> arrayList;
    CustomListViewAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        generateData();
        init();
    }

    private void init(){
        adapter=new CustomListViewAdapter(this, arrayList);
        listView=findViewById(R.id.list_view);
        listView.setAdapter(adapter);

    }

    private void generateData(){
        arrayList=new ArrayList<>();
        Employee employee;

        employee=new Employee(1,"Jack","Math","1234");
        arrayList.add(employee);
        employee=new Employee(2,"Julia","English","2345");
        arrayList.add(employee);
        employee=new Employee(3,"Rose","Science","3456");
        arrayList.add(employee);
    }
}
