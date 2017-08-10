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

public class FragmentB extends Fragment {

    TextView tvFmB;
    EditText etFmB;
    Button btFmB;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_b, container, false);

        tvFmB = (TextView) view.findViewById(R.id.tvFmB);
        etFmB = (EditText) view.findViewById(R.id.etFmB);
        btFmB = (Button) view.findViewById(R.id.btB);

        btFmB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextView tvFmA = (TextView) getActivity().findViewById(R.id.tvFmA);
                tvFmA.setText(etFmB.getText().toString());
            }
        });

        return view;
    }
}
