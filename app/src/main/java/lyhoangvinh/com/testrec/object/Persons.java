package lyhoangvinh.com.testrec.object;

/**
 * Created by LyHoangVinh on 06/06/2018.
 */
public class Persons {
    private String name;

    public Persons(String name){
        this.name = name;
    }

    public Persons setName(String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return name;
    }
}
