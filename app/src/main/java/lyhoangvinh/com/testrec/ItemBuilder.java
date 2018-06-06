package lyhoangvinh.com.testrec;


import android.content.Context;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import lyhoangvinh.com.testrec.item.AdsItem;
import lyhoangvinh.com.testrec.item.CustomItem;
import lyhoangvinh.com.testrec.item.HeaderHorizontalItem;
import lyhoangvinh.com.testrec.item.ImageItem;
import lyhoangvinh.com.testrec.item.Item;
import lyhoangvinh.com.testrec.item.TextItem;
import lyhoangvinh.com.testrec.model.Ads;
import lyhoangvinh.com.testrec.model.Custom;
import lyhoangvinh.com.testrec.model.HeaderHorizontal;
import lyhoangvinh.com.testrec.model.Image;
import lyhoangvinh.com.testrec.model.Text;
import lyhoangvinh.com.testrec.object.Persons;

public class ItemBuilder {
    public static List<Item> randomList(Context context) {
//        HeaderItem headerItem = new HeaderItem(new Header("This is Header"));
        HeaderHorizontalItem headerHorizontalItem =
                new HeaderHorizontalItem(new HeaderHorizontal(String.format("Size: %s", createPersons().size()), createPersons()));
        TextItem textItem = new TextItem(new Text(context.getString(R.string.text_1), context.getString(R.string.text_2)));
        ImageItem imageItem = new ImageItem(new Image(R.drawable.sample));
        AdsItem adsItem = new AdsItem(new Ads(context.getString(R.string.ads)));
        CustomItem customItem = new CustomItem(new Custom("Something"));

        List<Item> itemList = new ArrayList<>();
        itemList.add(headerHorizontalItem);
        itemList.add(imageItem);
        itemList.add(textItem);
        itemList.add(customItem);

        int i = 0;
        Random random = new Random();
        while (i < 10) {
            i++;
            switch (random.nextInt(3)) {
                case 0:
                    itemList.add(textItem);
                    break;
                case 1:
                    itemList.add(imageItem);
                    break;
                case 2:
                    itemList.add(customItem);
                    break;
            }
        }

        itemList.add(adsItem);

        return itemList;
    }

    public static List<Persons> createPersons() {
        List<Persons> singleItem = new ArrayList<>();
        for (int j = 0; j <= 10; j++) {
            singleItem.add(new Persons("Item " + j));
        }
        return singleItem;
    }
}
