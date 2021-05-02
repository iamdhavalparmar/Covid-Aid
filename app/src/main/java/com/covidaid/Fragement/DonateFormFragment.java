package com.covidaid.Fragement;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

import com.covidaid.R;
import com.google.android.material.textfield.TextInputLayout;


public class DonateFormFragment extends Fragment {

AutoCompleteTextView bloodgroup,need;
TextInputLayout bloodgroupcontainer;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view= inflater.inflate(R.layout.fragment_donate_form, container, false);
        bloodgroup = view.findViewById(R.id.bloodgroup);
        bloodgroupcontainer = view.findViewById(R.id.bloodgroupcontainer);
        need = view.findViewById(R.id.need);
        String[] strings = getResources().getStringArray(R.array.blood_groups);
        String[] string2 = getResources().getStringArray(R.array.need);

        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_list_item_1,strings);
        bloodgroup.setAdapter(stringArrayAdapter);

        ArrayAdapter<String> stringArrayAdapter2 = new ArrayAdapter<String>(getContext(), android.R.layout.simple_list_item_1,string2);
        need.setAdapter(stringArrayAdapter2);


        return view;
    }
    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        need.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0 )
                    bloodgroupcontainer.setVisibility(View.VISIBLE);
                else
                    bloodgroupcontainer.setVisibility(View.GONE);






            }
        });
    }
}