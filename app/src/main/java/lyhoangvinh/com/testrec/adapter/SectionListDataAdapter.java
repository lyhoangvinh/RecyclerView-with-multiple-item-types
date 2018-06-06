package lyhoangvinh.com.testrec.adapter;

import android.support.annotation.NonNull;
import android.view.View;

import java.util.List;

import lyhoangvinh.com.testrec.R;
import lyhoangvinh.com.testrec.object.Persons;
import lyhoangvinh.com.testrec.viewholder.SingleItemRowHolder;

/**
 * Created by LyHoangVinh on 06/06/2018.
 */
public class SectionListDataAdapter extends lyhoangvinh.com.myutil.adapter.BaseAdapter<Persons, SingleItemRowHolder> {

    public SectionListDataAdapter(@NonNull List<Persons> data) {
        super(data);
    }

    @Override
    public int getItemLayoutResource() {
        return R.layout.item;
    }

    @Override
    public SingleItemRowHolder createViewHolder(View view) {
        return new SingleItemRowHolder(view);
    }

    @Override
    protected void onBindViewHolder(SingleItemRowHolder holder, @NonNull Persons persons) {
        holder.tvName.setText(persons.getName());
    }
}
