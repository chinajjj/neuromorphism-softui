package com.basel.softui.adapters;

import android.content.Context;

import com.basel.neumorphism.Neu;
import com.basel.softui.R;
import com.basel.softui.models.item;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.List;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

public class ListAdapter extends RecyclerView.Adapter<ListAdapter.CustomViewHolder> {

    private Context context;
    private List<item> list;

    public ListAdapter(Context context, List<item> list) {
        this.list = list;
        this.context = context;
    }

    @Override
    public CustomViewHolder onCreateViewHolder(ViewGroup viewGroup, int i) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.list_item, viewGroup, false);
        return new CustomViewHolder(view);
    }

    @Override
    public void onBindViewHolder(CustomViewHolder customViewHolder, int i) {
        item itm = list.get(i);

        customViewHolder.song_title.setText(itm.getName());
        customViewHolder.song_des.setText(itm.getDes());
        customViewHolder.song_thumb.setImageDrawable(ContextCompat.getDrawable(context,itm.getIconRes()));

        new Neu(context, true).with(customViewHolder.itemView)
                .clipChildren(customViewHolder.song_thumb)
                .parentColor(ContextCompat.getColor(context, R.color.colorPrimary))
                .withRoundedCorners(24)
                .neuIt();
    }


    @Override
    public int getItemViewType(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public int getItemCount() {
        return (null != list ? list.size() : 0);
    }

    class CustomViewHolder extends RecyclerView.ViewHolder {

        private LinearLayout song_info;
        private TextView song_title,song_des;
        private ImageView song_thumb;

        private CustomViewHolder(View itemView) {
            super(itemView);

            this.song_info = itemView.findViewById(R.id.song_info);
            this.song_title = itemView.findViewById(R.id.song_title);
            this.song_des = itemView.findViewById(R.id.song_des);
            this.song_thumb = itemView.findViewById(R.id.song_thumb);

        }

    }


}