package adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.wangzhen.admin.commonrecycleviewadapter.R;

import java.util.List;

import bean.Adult;

/**
 * Created by admin on 2018/12/20.
 */

public class MyAdapter extends CommonAdapter {

    private List<Adult> list;
    private Context context;

    public MyAdapter(List list, Context context, int layoutId) {
        super(list, context, layoutId);
        this.list = list;
        this.context = context;
    }

    @Override
    public void bindViewholder(RecyclerView.ViewHolder holder, final int position) {
        CommonHolder commonHolder = (CommonHolder) holder;
        TextView textView = (TextView) commonHolder.getViewById(R.id.textView);
        textView.setText(list.get(position).getName());
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(context,"第" + position + "位置被点击了",Toast.LENGTH_SHORT).show();
            }
        });
    }

}
