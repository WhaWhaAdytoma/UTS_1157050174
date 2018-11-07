package com.example.whawha.uts_1157050174;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;

public class MatchFragment extends Fragment {

    RecyclerView recyclerView;
    MatchAdapter adapter;
    ArrayList<Match> matchArrayList = new ArrayList<>();

    public MatchFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.match_fragment, container, false);


        recyclerView = view.findViewById(R.id.rv_match);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));


        matchArrayList.add(new Match("PSM", 2, "PERSIJA", 2));
        matchArrayList.add(new Match("PSM", 4, "BALI UNITED", 3));
        matchArrayList.add(new Match("PERSIB", 3, "PSM", 4));
        matchArrayList.add(new Match("PERSIJA", 1, "PERSIB", 2));
        matchArrayList.add(new Match("BALI UNITED", 1, "PERSIJA", 4));
        matchArrayList.add(new Match("PERSIB", 3, "BALI UNITED", 3));



        adapter = new MatchAdapter(this.getContext(),matchArrayList);
        recyclerView.setAdapter(adapter);

        return view;

    }
}

