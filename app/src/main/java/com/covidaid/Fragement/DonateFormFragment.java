package com.covidaid.Fragement;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import com.covidaid.R;


public class DonateFormFragment extends Fragment {

AutoCompleteTextView bloodgroup;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_donate_form, container, false);
        bloodgroup = view.findViewById(R.id.bloodgroup);
        String[] strings = getResources().getStringArray(R.array.blood_groups);

        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_list_item_1,strings);
        bloodgroup.setAdapter(stringArrayAdapter);


        return view;
    }
}