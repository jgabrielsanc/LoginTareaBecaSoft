package com.android.jsanchez.logintareabecasoft.utils;

import android.content.SharedPreferences;

import com.android.jsanchez.logintareabecasoft.R;
import com.android.jsanchez.logintareabecasoft.models.Person;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;


/**
 * Created by Jesus Sanchez
 */
public class Util {

    private static String[] colors = new String[]
            {"F44336", "E91E63", "9C27B0", "673AB7", "3F51B5",
                    "03A9F4", "009688", "4CAF50", "CDDC39", "FFC107",
                    "FF5722", "795548", "9E9E9E", "455A64", "FF5722"};

    public static List<Person> getDummyData() {
        return new ArrayList<Person>() {{
            add(new Person("Jesus Sanchez", "829-821-2102", R.drawable.yo, "M", "21/05/1993", "Software Engineer", "C/ Tomas Jaime #82"));
            add(new Person("Maria Hernandez", "809-565-1234", R.drawable.maria, "F", "03/05/1995", "Software Engineer", "C/ Tomas Jaime #82"));
            add(new Person("Thor Perez", "829-831-1142", R.drawable.thor, "M", "02/03/1994", "Software Engineer", "C/ Tomas Jaime #82"));
            add(new Person("Capitan Sencion", "809-927-5862", R.drawable.capitanamerica, "M", "03/02/1993", "Software Engineer", "C/ Tomas Jaime #82"));
            add(new Person("Iron Estrella", "809-821-1104",R.drawable.ironman, "M", "04/01/1943", "Software Engineer", "C/ Tomas Jaime #82"));
            add(new Person("Batman Dotel", "809-331-3345", R.drawable.batman, "M", "04/08/1996", "Software Engineer", "C/ Tomas Jaime #82"));
            add(new Person("Melissa Houde", "809-151-5549", R.drawable.melissa, "F", "05/03/1998", "Software Engineer", "C/ Tomas Jaime #82"));
            add(new Person("Emily Corvington", "809-571-4328", R.drawable.emi, "F", "06/02/2000", "Software Engineer", "C/ Tomas Jaime #82"));
            add(new Person("Karla Gutierrez", "809-711-6155", R.drawable.karla, "F", "12/07/1999", "Software Engineer", "C/ Tomas Jaime #82"));
        }};
    }

    public static String getRandomColor() {
        int randomNumber = new Random().nextInt(colors.length);
        return colors[randomNumber];
    }

    public static String getUserMailPrefs(SharedPreferences preferences){
        return preferences.getString("email", "");
    }

    public static String getUserPassPrefs(SharedPreferences preferences){
        return preferences.getString("pass", "");
    }

}
