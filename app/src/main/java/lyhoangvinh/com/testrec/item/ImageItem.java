package lyhoangvinh.com.testrec.item;


import lyhoangvinh.com.testrec.model.Image;

public class ImageItem implements Item {
    private Image mImage;

    public ImageItem(Image image) {
        mImage = image;
    }

    public Image getImage() {
        return mImage;
    }
}
