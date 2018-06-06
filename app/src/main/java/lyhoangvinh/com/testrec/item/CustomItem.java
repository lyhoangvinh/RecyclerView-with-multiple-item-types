package lyhoangvinh.com.testrec.item;

import lyhoangvinh.com.testrec.model.Custom;

/**
 * Created by LyHoangVinh on 07/06/2018.
 */
public class CustomItem implements Item{

    private Custom mCustom;

    public CustomItem(Custom custom) {
        mCustom = custom;
    }

    public Custom getCustom() {
        return mCustom;
    }
}
