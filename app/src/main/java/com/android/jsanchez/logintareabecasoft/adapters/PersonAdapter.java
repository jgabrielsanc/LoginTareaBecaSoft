package com.android.jsanchez.logintareabecasoft.adapters;

import android.content.Context;
import android.graphics.Color;
import android.graphics.PorterDuff;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import com.android.jsanchez.logintareabecasoft.R;
import com.android.jsanchez.logintareabecasoft.models.Person;

import java.util.List;

public class PersonAdapter extends BaseAdapter {

    private Context context;
    private List<Person> people;
    private int layout;

    public PersonAdapter(Context context, List<Person> people, int layout) {
        this.context = context;
        this.people = people;
        this.layout = layout;
    }

    @Override
    public int getCount() {
        return people.size();
    }

    @Override
    public Person getItem(int position) {
        return people.get(position);
    }

    @Override
    public long getItemId(int id) {
        return id;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup viewGroup) {

        ViewHolder holder;

        if (convertView == null) {

            convertView = LayoutInflater.from(context).inflate(layout, null);

            holder = new ViewHolder();
            {
                holder.name = convertView.findViewById(R.id.textViewName);
                holder.phone = convertView.findViewById(R.id.textViewPhone);
                holder.roundedName = convertView.findViewById(R.id.textViewRoundedName);
            }

            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        final Person person = getItem(position);

        holder.name.setText(person.getName());
        holder.phone.setText(person.getPhone());

        holder.roundedName.setText(person.getName().substring(0,1));
        holder.roundedName.getBackground().setColorFilter(Color.parseColor("#" + person.getColor()), PorterDuff.Mode.SRC);

        return convertView;
    }

    private static class ViewHolder {
        private TextView name;
        private TextView phone;
        private TextView roundedName;
    }
}
