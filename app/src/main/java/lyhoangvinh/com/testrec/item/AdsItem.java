package lyhoangvinh.com.testrec.item;


import lyhoangvinh.com.testrec.model.Ads;

public class AdsItem implements Item {
    private Ads mAds;

    public AdsItem(Ads ads) {
        mAds = ads;
    }

    public Ads getAds() {
        return mAds;
    }
}
