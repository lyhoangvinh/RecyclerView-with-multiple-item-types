package lyhoangvinh.com.testrec.item;


import lyhoangvinh.com.testrec.model.Text;

public class TextItem implements Item {
    private Text mText;

    public TextItem(Text text) {
        mText = text;
    }

    public Text getText() {
        return mText;
    }
}
