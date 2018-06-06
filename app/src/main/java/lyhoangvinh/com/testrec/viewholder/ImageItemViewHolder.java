package lyhoangvinh.com.testrec.viewholder;


import android.view.ViewGroup;
import android.widget.ImageView;

import butterknife.BindView;
import lyhoangvinh.com.testrec.R;
import lyhoangvinh.com.testrec.item.ImageItem;

public class ImageItemViewHolder extends BaseItemViewHolder<ImageItem> {

    @BindView(R.id.imgAvatarItem)
    ImageView mImageView;

    public ImageItemViewHolder(ViewGroup parent, int resId) {
        super(parent, resId);
    }

    @Override
    public void setItem(ImageItem item) {
        super.setItem(item);

        mImageView.setImageResource(item.getImage().getResId());
    }
}
