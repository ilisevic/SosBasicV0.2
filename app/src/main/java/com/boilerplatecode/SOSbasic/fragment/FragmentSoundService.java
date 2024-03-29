package com.boilerplatecode.SOSbasic.fragment;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.boilerplatecode.SOSbasic.R;
import com.boilerplatecode.SOSbasic.service.SoundService;


/**
 * A simple {@link Fragment} subclass.
 */
public class FragmentSoundService extends Fragment {
    private Button btnSoundServiceStart, btnSoundServiceStop;

    public FragmentSoundService() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_audio, container, false);


        btnSoundServiceStart = view.findViewById(R.id.btn_start_service);
        btnSoundServiceStop = view.findViewById(R.id.btn_stop_service);

        btnSoundServiceStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().startService(new Intent(getActivity(), SoundService.class));

            }
        });
        btnSoundServiceStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                getActivity().stopService(new Intent(getContext(), SoundService.class));
            }
        });


        return view;
    }


}
