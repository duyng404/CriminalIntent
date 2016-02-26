package com.ryuko.criminalintent;

import android.os.Bundle;

public class CrimeFragment extends android.support.v4.app.Fragment {

    private Crime mCrime;

    @Override
    public void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        mCrime = new Crime();
    }
}
