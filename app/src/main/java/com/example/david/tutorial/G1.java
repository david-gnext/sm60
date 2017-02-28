package com.example.david.tutorial;

/**
 * Created by david on 2/25/2017.
 */
import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class G1 extends Fragment {
    TextView quote;

    public static final String QOUTE_ID = "quoteID";

    public G1() {

    }

    public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle saved) {

        View view = inflater.inflate(R.layout.lm_fragment_1,container,false);
        quote = (TextView) view.findViewById(R.id.bible_quote);
        quote.setText(getArguments().getString(QOUTE_ID));
        return view;

    }
}
