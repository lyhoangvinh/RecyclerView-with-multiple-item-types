package lyhoangvinh.com.testrec.object;

import java.util.List;

/**
 * Created by LyHoangVinh on 06/06/2018.
 */
public class SectionDataModel {
    private String headerTitle;
    private List<Persons> allItemsInSection;
    private boolean isSection;

    public boolean isSection() {
        return isSection;
    }

    public SectionDataModel setSection(boolean section) {
        isSection = section;
        return this;
    }

    public SectionDataModel() {
    }
    public SectionDataModel(String headerTitle, List<Persons> allItemsInSection) {
        if (isSection()){
            this.allItemsInSection = allItemsInSection;
        }else {
            this.allItemsInSection = null;
        }
        this.headerTitle = headerTitle;
    }



    public String getHeaderTitle() {
        return headerTitle;
    }

    public void setHeaderTitle(String headerTitle) {
        this.headerTitle = headerTitle;
    }

    public List<Persons> getAllItemsInSection() {
        return allItemsInSection;
    }

    public void setAllItemsInSection(List<Persons> allItemsInSection) {
        this.allItemsInSection = allItemsInSection;
    }
}
