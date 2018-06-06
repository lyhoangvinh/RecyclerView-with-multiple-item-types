package lyhoangvinh.com.testrec.viewholder;

import android.view.ViewGroup;
import android.widget.TextView;

import butterknife.BindView;
import lyhoangvinh.com.testrec.R;
import lyhoangvinh.com.testrec.item.HeaderItem;

/**
 * Created by LyHoangVinh on 07/06/2018.
 */
public class HeaderItemViewHolder extends BaseItemViewHolder<HeaderItem> {

    @BindView(R.id.txtHeader)
    TextView mTxtHeader;

    public HeaderItemViewHolder(ViewGroup parent, int resId) {
        super(parent, resId);
    }

    @Override
    public void setItem(HeaderItem item) {
        super.setItem(item);

        mTxtHeader.setText(item.getHeader().getString());

    }
}
