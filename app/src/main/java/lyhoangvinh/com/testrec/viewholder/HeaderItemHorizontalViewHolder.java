package lyhoangvinh.com.testrec.viewholder;

import android.content.Context;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.ViewGroup;
import android.widget.TextView;

import butterknife.BindView;
import lyhoangvinh.com.testrec.R;
import lyhoangvinh.com.testrec.adapter.SectionListDataAdapter;
import lyhoangvinh.com.testrec.item.HeaderHorizontalItem;

/**
 * Created by LyHoangVinh on 07/06/2018.
 */
public class HeaderItemHorizontalViewHolder extends BaseItemViewHolder<HeaderHorizontalItem> {

    @BindView(R.id.recycler_view_list)
    RecyclerView recyclerView;

    @BindView(R.id.itemTitle)
    TextView itemTitle;

    private Context context;

    public HeaderItemHorizontalViewHolder(ViewGroup parent, int resId) {
        super(parent, resId);
        this.context = parent.getContext();
    }

    @Override
    public void setItem(HeaderHorizontalItem item) {
        super.setItem(item);
        itemTitle.setText(item.getHeaderHorizontal().getTitle());
        SectionListDataAdapter itemListDataAdapter = new SectionListDataAdapter(item.getHeaderHorizontal().getPersons());
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(context, LinearLayoutManager.HORIZONTAL, false));
        recyclerView.setAdapter(itemListDataAdapter);
    }
}
