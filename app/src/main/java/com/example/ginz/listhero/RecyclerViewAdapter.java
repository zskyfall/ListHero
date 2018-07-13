package com.example.ginz.listhero;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.RecyclerViewHolder> {
    private List<String> mDataTitle = new ArrayList<>();
    private List<Integer> mDataAvatar = new ArrayList<>();

    public RecyclerViewAdapter(List<String> mDataTitle, List<Integer> mDataAvatar){
        this.mDataTitle = mDataTitle;
        this.mDataAvatar = mDataAvatar;
    }

    @NonNull
    @Override
    public RecyclerViewAdapter.RecyclerViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.item, parent, false);
        return new RecyclerViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerViewAdapter.RecyclerViewHolder holder, int position) {
        holder.mTextTitle.setText(mDataTitle.get(position));
        holder.mImageAvatar.setImageResource(mDataAvatar.get(position));
    }

    @Override
    public int getItemCount() {
        return mDataTitle.size();
    }

    public class RecyclerViewHolder extends RecyclerView.ViewHolder {
        private TextView mTextTitle ;
        private ImageView mImageAvatar;
        public RecyclerViewHolder(View itemView) {
            super(itemView);
            mTextTitle = (TextView) itemView.findViewById(R.id.text_title);
            mImageAvatar = (ImageView) itemView.findViewById(R.id.image_avatar);
        }
    }
}
