package com.android.jsanchez.logintareabecasoft.utils;

import android.content.SharedPreferences;

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
            add(new Person("Jesus Sanchez", "829-821-2102"));
            add(new Person("Maria Hernandez", "809-565-1234"));
            add(new Person("Juan Perez", "829-831-1142"));
            add(new Person("Carlos Sencion", "809-927-5862"));
            add(new Person("Martin Estrella", "809-821-1104"));
            add(new Person("Junior Dotel", "809-331-3345"));
            add(new Person("Melissa Houde", "809-151-5549"));
            add(new Person("Emily Corvington", "809-571-4328"));
            add(new Person("Karla Gutierrez", "809-711-6155"));
            add(new Person("Marcos Santos", "829-721-8273"));
            add(new Person("Michael De la Cruz", "829-631-5381"));

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
