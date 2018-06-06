package lyhoangvinh.com.testrec.viewholder;


import android.view.ViewGroup;
import android.widget.TextView;

import butterknife.BindView;
import lyhoangvinh.com.testrec.R;
import lyhoangvinh.com.testrec.item.AdsItem;

public class AdsItemViewHolder extends BaseItemViewHolder<AdsItem> {

    @BindView(R.id.txtAds)
    TextView mTxtAds;

    public AdsItemViewHolder(ViewGroup parent, int resId) {
        super(parent, resId);
    }

    @Override
    public void setItem(AdsItem item) {
        super.setItem(item);

        mTxtAds.setText(item.getAds().getString());
    }
}
