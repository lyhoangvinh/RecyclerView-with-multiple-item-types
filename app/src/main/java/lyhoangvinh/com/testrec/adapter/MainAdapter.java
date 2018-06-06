package lyhoangvinh.com.testrec.adapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.LinearLayoutManager;
import android.view.View;

import java.util.List;

import lyhoangvinh.com.myutil.adapter.BaseAdapter;
import lyhoangvinh.com.testrec.R;
import lyhoangvinh.com.testrec.object.SectionDataModel;
import lyhoangvinh.com.testrec.viewholder.ListItemViewHolder;

/**
 * Created by LyHoangVinh on 06/06/2018.
 */
public class MainAdapter extends BaseAdapter<SectionDataModel, ListItemViewHolder> {

    public MainAdapter(@NonNull List<SectionDataModel> data) {
        super(data);
    }

    private Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    @Override
    public int getItemLayoutResource() {
        return R.layout.list_item;
    }

    @Override
    public ListItemViewHolder createViewHolder(View view) {
        return new ListItemViewHolder(view);
    }

    @Override
    protected void onBindViewHolder(ListItemViewHolder holder, @NonNull SectionDataModel model) {
        holder.tvTitleHeader.setText(model.getHeaderTitle());
        SectionListDataAdapter itemListDataAdapter = new SectionListDataAdapter(model.getAllItemsInSection());
        holder.rcv.setHasFixedSize(true);
        holder.rcv.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
        holder.rcv.setAdapter(itemListDataAdapter);
    }
}
