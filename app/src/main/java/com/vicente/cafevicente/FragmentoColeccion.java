package com.vicente.cafevicente;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import androidx.fragment.app.Fragment;

public class FragmentoColeccion extends Fragment {

    View view;
    Button btn_cafe1;
    Button btn_cafe2;
    Button btn_cafe3;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragmento_coleccion, container, false);
//        Boton Uno
        btn_cafe1 = (Button) view.findViewById(R.id.btn_cafe1);
        btn_cafe1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "cafe capsulado uno", Toast.LENGTH_SHORT).show();
            }
        });

//        Boton dos
            btn_cafe2= (Button) view.findViewById(R.id.btn_cafe2);
            btn_cafe2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Toast.makeText(getActivity(), "cafe dos rico", Toast.LENGTH_SHORT).show();
                }
            });

//        Boton tres
                btn_cafe3 = (Button) view.findViewById(R.id.btn_cafe3);
                btn_cafe3.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Toast.makeText(getActivity(), "cafe capuccino", Toast.LENGTH_SHORT).show();
                    }
                });

        return view;
}
}