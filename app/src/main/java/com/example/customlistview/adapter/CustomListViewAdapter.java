package com.example.customlistview.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.example.customlistview.R;
import com.example.customlistview.model.Employee;

import java.util.ArrayList;

public class CustomListViewAdapter extends BaseAdapter {
    Context mContext;
    ArrayList<Employee> list;
    LayoutInflater inflater;

    public CustomListViewAdapter(Context mContext, ArrayList<Employee> list) {
        this.mContext = mContext;
        this.list = list;
        inflater=LayoutInflater.from(mContext);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view=inflater.inflate(R.layout.my_list_view,parent,false);
        TextView textId=view.findViewById(R.id.text_view_id);
        TextView textName=view.findViewById(R.id.text_view_name);
        TextView textDepart=view.findViewById(R.id.text_view_depart);
        TextView textSalary=view.findViewById(R.id.text_view_salary);

        Employee employee=list.get(position);

        textId.setText("Id:"+String.valueOf(employee.getId()));
        textName.setText("Name:"+employee.getName());
        textDepart.setText("Apartment:"+employee.getDepartment());
        textSalary.setText("Salary:"+employee.getSalary());

        return view;
    }
}
