package com.example.whawha.uts_1157050174;

import android.content.Context;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;

public class MatchAdapter extends RecyclerView.Adapter<MatchAdapter.MatchViewHolder> {

    private Context context;
    private final ArrayList<Match> matchArrayList;

    public MatchAdapter(Context context, ArrayList<Match> matchArrayList) {
        this.context = context;
        this.matchArrayList = matchArrayList;
    }

    @Override
    public MatchViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.match_adapter, null, false);

        RecyclerView.LayoutParams layoutParams = new RecyclerView.LayoutParams(ViewGroup.LayoutParams.MATCH_PARENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        itemView.setLayoutParams(layoutParams);

        return new MatchViewHolder(itemView, this);
    }

    @Override
    public void onBindViewHolder(MatchViewHolder holder, final int position) {
        final Match current = matchArrayList.get(position);

        holder.tim1.setText(matchArrayList.get(position).getTim1());
        holder.tim2.setText(matchArrayList.get(position).getTim2());

        holder.layout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                getDetail(matchArrayList.get(position).getTim1(), matchArrayList.get(position).getSkor1(), matchArrayList.get(position).getTim2(), matchArrayList.get(position).getSkor2());
            }
        });
    }

    public void getDetail(String tim1, int skor1, String tim2, int skor2){
        //Toast.makeText(context,""+skor1+skor2, Toast.LENGTH_LONG).show();
        Intent goToDetail = new Intent(context, DetailMatch.class);
        goToDetail.putExtra("Tim1", tim1);
        goToDetail.putExtra("Skor1", skor1);
        goToDetail.putExtra("Tim2", tim2);
        goToDetail.putExtra("Skor2", skor2);
        context.startActivity(goToDetail);
    }

    @Override
    public int getItemCount() {
        return matchArrayList.size();
    }

    public class MatchViewHolder extends RecyclerView.ViewHolder{
        private TextView tim1, tim2;
        private View layout;

        final MatchAdapter adapter;

        public MatchViewHolder(View itemView, MatchAdapter adapter) {
            super(itemView);
            layout = itemView;
            tim1 = itemView.findViewById(R.id.Tim1);
            tim2 = itemView.findViewById(R.id.Tim2);

            this.adapter = adapter;
        }
    }

}

