package adapter;

import android.support.annotation.IdRes;
import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.View;

/**
 * Created by admin on 2018/12/20.
 */

public class CommonHolder extends RecyclerView.ViewHolder {

    private View itemView;
    private SparseArray sparseArray;

    public CommonHolder(View itemView) {
        super(itemView);
        this.itemView = itemView;
        sparseArray = new SparseArray<>();
    }

    public View getViewById(@IdRes int viewId) {
        //其实放入到SparseArray是减少findViewById的次数，毕竟findViewById挺耗费内存
        View view = (View) sparseArray.get(viewId);
        if(view == null){
            view = itemView.findViewById(viewId);
            sparseArray.put(viewId,view);
        }
        return view;
    }



}
