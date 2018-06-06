package lyhoangvinh.com.testrec.viewholder;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

import lyhoangvinh.com.testrec.R;

/**
 * Created by LyHoangVinh on 06/06/2018.
 */
public class ListItemViewHolder extends RecyclerView.ViewHolder {

    public TextView tvTitleHeader;
    public RecyclerView rcv;

    public ListItemViewHolder(View itemView) {
        super(itemView);
        tvTitleHeader = itemView.findViewById(R.id.itemTitle);
        rcv = itemView.findViewById(R.id.recycler_view_list);
    }
}
