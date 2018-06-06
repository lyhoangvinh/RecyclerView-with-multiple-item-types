package lyhoangvinh.com.testrec.adapter;

import android.support.v7.widget.RecyclerView;

import java.util.List;

import lyhoangvinh.com.testrec.item.Item;
import lyhoangvinh.com.testrec.viewholder.BaseItemViewHolder;

/**
 * Created by LyHoangVinh on 07/06/2018.
 */
public abstract class BaseItemAdapter extends RecyclerView.Adapter<BaseItemViewHolder> {

    protected List<Item> mItemList = null;

    public void setItemList(List<Item> itemList) {
        mItemList = itemList;
        notifyDataSetChanged();
    }

    @Override
    public void onBindViewHolder(BaseItemViewHolder holder, int position) {
        holder.setItem(mItemList.get(position));
    }

    @Override
    public int getItemCount() {
        return mItemList != null ? mItemList.size() : 0;
    }

    public Item getItemAt(int position) {
        return mItemList != null ? mItemList.get(position) : null;
    }
}
