package com.example.databindingintroduction;

import android.databinding.BindingAdapter;
import android.support.v4.content.ContextCompat;
import android.view.View;
import android.widget.ImageView;

public class Student {
    private String name, standard,bloodGroup;
    private int age, photo;

    public Student(String name,int age, String standard, String bloodGroup, int photo){
        this.name = name;
        this.age = age;
        this.standard = standard;
        this.bloodGroup = bloodGroup;
        this.photo = photo;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getStandard() {
        return standard;
    }

    public String getBloodGroup() {
        return bloodGroup;
    }

    public int getPhoto() {
        return photo;
    }

    @BindingAdapter("android:loadImage")
    public static void loadImage(ImageView view, int image){
        view.setImageResource(image);
    }
}
