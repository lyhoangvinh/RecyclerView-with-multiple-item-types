package lyhoangvinh.com.testrec.adapter;

import android.view.ViewGroup;

import lyhoangvinh.com.testrec.R;
import lyhoangvinh.com.testrec.item.AdsItem;
import lyhoangvinh.com.testrec.item.CustomItem;
import lyhoangvinh.com.testrec.item.HeaderHorizontalItem;
import lyhoangvinh.com.testrec.item.ImageItem;
import lyhoangvinh.com.testrec.item.Item;
import lyhoangvinh.com.testrec.item.TextItem;
import lyhoangvinh.com.testrec.viewholder.AdsItemViewHolder;
import lyhoangvinh.com.testrec.viewholder.BaseItemViewHolder;
import lyhoangvinh.com.testrec.viewholder.CustomItemViewHolder;
import lyhoangvinh.com.testrec.viewholder.HeaderItemHorizontalViewHolder;
import lyhoangvinh.com.testrec.viewholder.ImageItemViewHolder;
import lyhoangvinh.com.testrec.viewholder.TextItemViewHolder;

/**
 * Created by LyHoangVinh on 07/06/2018.
 */
public class MyAdapter extends BaseItemAdapter {
    private static final int ITEM_HEADER = 0;
    private static final int ITEM_TEXT = 1;
    private static final int ITEM_IMAGE = 2;
    private static final int ITEM_ADS = 3;
    private static final int ITEM_CUSTOM = 4;

    @Override
    public int getItemViewType(int position) {
        Item item = getItemAt(position);

//        if (item instanceof HeaderItem) {
//            return ITEM_HEADER;
//        }

        if (item instanceof HeaderHorizontalItem) {
            return ITEM_HEADER;
        }

        if (item instanceof TextItem) {
            return ITEM_TEXT;
        }

        if (item instanceof ImageItem) {
            return ITEM_IMAGE;
        }

        if (item instanceof AdsItem) {
            return ITEM_ADS;
        }

        if (item instanceof CustomItem) {
            return ITEM_CUSTOM;
        }

        throw new RuntimeException("Not support item " + item);
    }

    @Override
    public BaseItemViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        switch (viewType) {

//            case ITEM_HEADER:
//                return new HeaderItemViewHolder(parent, R.layout.item_header);

            case ITEM_HEADER:
                return new HeaderItemHorizontalViewHolder(parent, R.layout.list_item);

            case ITEM_TEXT:
                return new TextItemViewHolder(parent, R.layout.item_text);

            case ITEM_IMAGE:
                return new ImageItemViewHolder(parent, R.layout.item_image);

            case ITEM_ADS:
                return new AdsItemViewHolder(parent, R.layout.item_ads);

            case ITEM_CUSTOM:
                return new CustomItemViewHolder(parent, R.layout.item_custom);

            default:
                throw new RuntimeException("Not support type=" + viewType);
        }
    }
}

