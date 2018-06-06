package lyhoangvinh.com.testrec.item;


import lyhoangvinh.com.testrec.model.Header;

public class HeaderItem implements Item {
    private Header mHeader;

    public HeaderItem(Header header) {
        mHeader = header;
    }

    public Header getHeader() {
        return mHeader;
    }
}
