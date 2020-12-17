package com.example.exercise2.view;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.exercise2.R;
import com.example.exercise2.net.BannerBean;

import java.util.ArrayList;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.ViewHolder> {
    private Context context;
    private ArrayList<BannerBean.BannerlistDTO> bannerlist;

    public MyAdapter(Context context, ArrayList<BannerBean.BannerlistDTO> bannerlist) {
        this.context = context;
        this.bannerlist = bannerlist;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View inflate = LayoutInflater.from(context).inflate(R.layout.item_my, parent, false);
        return new ViewHolder(inflate);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        BannerBean.BannerlistDTO bannerlistDTO = bannerlist.get(position);
//        ViewHolder viewHolder = holder;
//        viewHolder.banner.setImages(bannerlist).setImageLoader(new ImageLoader() {
//            @Override
//            public void displayImage(Context context, Object path, ImageView imageView) {
//                BannerBean.BannerlistDTO bean = (BannerBean.BannerlistDTO) path;
//                Glide.with(context).load(bean.getImageurl()).into(imageView);
//            }
//        }).start();
        holder.name.setText(bannerlistDTO.getImageurl());
    }

    @Override
    public int getItemCount() {
        return bannerlist.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
//        Banner banner;
        TextView name;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
//            banner = itemView.findViewById(R.id.banner);
            name = itemView.findViewById(R.id.tv_name);
        }
    }
}
