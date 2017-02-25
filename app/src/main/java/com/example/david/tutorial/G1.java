package com.example.david.tutorial;

/**
 * Created by david on 2/25/2017.
 */
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class G1 extends Fragment {
    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle saved) {
        return inflater.inflate(R.layout.lm_fragment,container,false);
    }
}
