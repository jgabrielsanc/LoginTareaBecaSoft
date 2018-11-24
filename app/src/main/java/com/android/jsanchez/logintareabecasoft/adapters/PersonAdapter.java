package com.android.jsanchez.logintareabecasoft.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.jsanchez.logintareabecasoft.R;
import com.android.jsanchez.logintareabecasoft.models.Person;
import com.squareup.picasso.Picasso;

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
                holder.name = convertView.findViewById(R.id.editTextName);
                holder.phone = convertView.findViewById(R.id.textViewPhone);
                holder.photo = convertView.findViewById(R.id.imageViewPhoto);
            }

            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }

        final Person person = getItem(position);

        holder.name.setText(person.getName());
        holder.phone.setText(person.getPhone());

        Picasso.get().load(person.getPhoto()).fit().into(holder.photo);
//        holder.photo.setText(person.getName().substring(0,1));
//        holder.photo.getBackground().setColorFilter(Color.parseColor("#" + person.getColor()), PorterDuff.Mode.SRC);

        return convertView;
    }

    private static class ViewHolder {
        private TextView name;
        private TextView phone;
        private ImageView photo;
    }
}
