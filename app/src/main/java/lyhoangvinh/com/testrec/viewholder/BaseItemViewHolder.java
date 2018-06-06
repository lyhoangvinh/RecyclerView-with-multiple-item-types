package lyhoangvinh.com.testrec.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.ViewGroup;

import butterknife.ButterKnife;
import lyhoangvinh.com.testrec.item.Item;

/**
 * Created by LyHoangVinh on 07/06/2018.
 */
public class BaseItemViewHolder<T extends Item> extends RecyclerView.ViewHolder {

    private T mItem = null;

    public BaseItemViewHolder(ViewGroup parent, int resId) {
        super(LayoutInflater.from(parent.getContext()).inflate(resId, parent, false));
        ButterKnife.bind(this, itemView);
        itemView.setTag(this);
    }

    public void setItem(T item) {
        mItem = item;
    }

    public T getItem() {
        return mItem;
    }
}

