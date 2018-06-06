package lyhoangvinh.com.testrec.viewholder;


import android.view.ViewGroup;
import android.widget.TextView;

import butterknife.BindView;
import lyhoangvinh.com.testrec.R;
import lyhoangvinh.com.testrec.item.CustomItem;

public class CustomItemViewHolder extends BaseItemViewHolder<CustomItem> {

    @BindView(R.id.txtCustom1)
    TextView mTxtCustom1;
    @BindView(R.id.txtCustom2)
    TextView mTxtCustom2;
    @BindView(R.id.txtCustom3)
    TextView mTxtCustom3;

    public CustomItemViewHolder(ViewGroup parent, int resId) {
        super(parent, resId);
    }

    @Override
    public void setItem(CustomItem item) {
        super.setItem(item);

        mTxtCustom1.setText(item.getCustom().getString());
        mTxtCustom2.setText(item.getCustom().getString());
        mTxtCustom3.setText(item.getCustom().getString());
    }
}
