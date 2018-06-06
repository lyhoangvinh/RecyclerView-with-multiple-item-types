package lyhoangvinh.com.testrec.viewholder;


import android.view.ViewGroup;
import android.widget.TextView;

import butterknife.BindView;
import lyhoangvinh.com.testrec.R;
import lyhoangvinh.com.testrec.item.TextItem;

public class TextItemViewHolder extends BaseItemViewHolder<TextItem> {

    @BindView(R.id.txt1)
    TextView mTxt1;
    @BindView(R.id.txt2)
    TextView mTxt2;

    public TextItemViewHolder(ViewGroup parent, int resId) {
        super(parent, resId);
    }

    @Override
    public void setItem(TextItem item) {
        super.setItem(item);

        mTxt1.setText(item.getText().getString1());
        mTxt2.setText(item.getText().getString2());
    }
}
