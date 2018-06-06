package lyhoangvinh.com.testrec.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lyhoangvinh.com.testrec.object.Persons;

/**
 * Created by LyHoangVinh on 07/06/2018.
 */

@Getter
@Setter
@AllArgsConstructor
public class HeaderHorizontal {
    private String title;
    private List<Persons> persons;
}
