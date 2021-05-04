package com.covidaid.Fragement;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.covidaid.Adapters.RequestAdapter;
import com.covidaid.Model.RequestData;
import com.covidaid.R;

import java.util.ArrayList;
import java.util.List;

public class DashboardFragment extends Fragment {
    RecyclerView requestRecycler;
     List itemlist = new ArrayList<>();
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_dashboard, container, false);
        requestRecycler = view.findViewById(R.id.request_recycler);
         return  view;
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

         dummydata();
        RequestAdapter adapter = new RequestAdapter(itemlist,getContext());
        requestRecycler.setLayoutManager(new GridLayoutManager(getContext(),1));
        requestRecycler.setAdapter(adapter);
    }

    private void dummydata() {
        RequestData data = new RequestData("Hospital With Beds","19","Urgent need","100ml","O+","M");
        itemlist.add(data);

        RequestData data1 = new RequestData("Donor","19","Urgent need","100ml","O+","M");
        itemlist.add(data1);

        RequestData data2 = new RequestData("Oxygen Suppliers","19","Urgent need","100ml","O+","M");
        itemlist.add(data2);
    }
}