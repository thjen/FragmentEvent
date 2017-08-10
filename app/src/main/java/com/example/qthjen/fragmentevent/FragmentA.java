package com.example.qthjen.fragmentevent;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class FragmentA extends Fragment {

    TextView tvFmA;
    EditText etFmA;
    Button btA;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_a, container, false);

        tvFmA = (TextView) view.findViewById(R.id.tvFmA);
        etFmA = (EditText) view.findViewById(R.id.etFmA);
        btA = (Button) view.findViewById(R.id.btA);

        btA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView tvMA = (TextView) getActivity().findViewById(R.id.tvMA);
                tvMA.setText(etFmA.getText().toString());
            }
        });


        return view;
    }

    public void GanNoiDung(String nd) {

        tvFmA.setText(nd);
    }

}



