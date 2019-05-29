package max.jy.hzl.test.adapter;

import android.annotation.SuppressLint;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.load.resource.bitmap.RoundedCorners;
import com.bumptech.glide.request.RequestOptions;

import java.util.ArrayList;

import max.jy.hzl.test.MeiTuBean;
import max.jy.hzl.test.R;

/**
 * Created by asus on 2019/5/29.
 */

public class RLVadapter extends RecyclerView.Adapter<RLVadapter.ViewHolder> {
    private Context context;

    public RLVadapter(Context context) {
        this.context = context;
    }
    private ArrayList<MeiTuBean.DataEntity> list=new ArrayList<>();

    public void setList(ArrayList<MeiTuBean.DataEntity> list) {
        this.list = list;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(View.inflate(context,R.layout.item,null));
    }

    @SuppressLint("CheckResult")
    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        MeiTuBean.DataEntity dataEntity = list.get(position);
        holder.tv.setText(dataEntity.getCreatedAt());
        RoundedCorners roundedCorners = new RoundedCorners(5);
        RequestOptions options = RequestOptions.bitmapTransform(roundedCorners);
        Glide.with(context).load(dataEntity.getUrl()).apply(options).into(holder.iv);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView  iv;
        private TextView tv;
        public ViewHolder(View itemView) {
            super(itemView);
            iv= itemView.findViewById(R.id.iv);
            tv= itemView.findViewById(R.id.tv);
        }
    }
}
