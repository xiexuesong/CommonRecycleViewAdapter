package adapter;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

/**
 * Created by admin on 2018/12/20.
 */

public abstract class CommonAdapter<T> extends RecyclerView.Adapter {

    private List<T> list;
    private LayoutInflater layoutInflater  ;
    private Context context;
    private int layoutId;

    public CommonAdapter(List<T> list, Context context, @LayoutRes int layoutId) {
        this.list = list;
        this.context = context;
        layoutInflater = LayoutInflater.from(context);
        this.layoutId = layoutId;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View view = layoutInflater.inflate(this.layoutId,null);
        return new CommonHolder(view);
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
        bindViewholder(holder,position);
    }

    @Override
    public int getItemCount() {
        return list.size();
    }

    public abstract  void bindViewholder(RecyclerView.ViewHolder holder , int position);


}
