package com.example.a0310;

import android.os.Parcel;
import android.os.Parcelable;

public class Counter implements Parcelable {
    private String value;

    public Counter() {
    }

    protected Counter(Parcel in) {
        value = in.readString();
    }


    public static final Creator<Counter> CREATOR = new Creator<Counter>() {
        @Override
        public Counter createFromParcel(Parcel in) {
            return new Counter(in);
        }

        @Override
        public Counter[] newArray(int size) {
            return new Counter[size];
        }
    };

    public String getValue() {
        return value;
    }

    /*public void increase() {
        value++;
    }*/

    public void setValue(String val) {
        value=val;
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(value);
    }
}
