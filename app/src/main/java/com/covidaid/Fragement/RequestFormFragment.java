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

public class RequestFormFragment extends Fragment {
    AutoCompleteTextView bloodgroup,selectneed;
    TextInputLayout bloodgroupcontainer;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view= inflater.inflate(R.layout.fragment_request_form, container, false);
        bloodgroup = view.findViewById(R.id.bloodgroup);
        selectneed = view.findViewById(R.id.selectneed);
        bloodgroupcontainer = view.findViewById(R.id.bloodgroupcontainer);
        String[] strings = getResources().getStringArray(R.array.blood_groups);
        String[] quantityArray = getResources().getStringArray(R.array.need);
        ArrayAdapter<String> stringArrayAdapter = new ArrayAdapter<String>(getContext(), android.R.layout.simple_list_item_1,strings);
        bloodgroup.setAdapter(stringArrayAdapter);

        ArrayAdapter<String> stringArrayAdapter1 = new ArrayAdapter<String>(getContext(), android.R.layout.simple_list_item_1,quantityArray);
        selectneed.setAdapter(stringArrayAdapter1);
        return view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        selectneed.setOnItemClickListener(new AdapterView.OnItemClickListener() {
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