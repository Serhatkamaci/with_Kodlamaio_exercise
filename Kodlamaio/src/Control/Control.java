package Control;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Control {
    private String name;
    public boolean bool;

    public boolean control(String name,List<String> list) {

        if(list.size()==0)
        {
            return false;
        }
        else
        {
            this.name = name;
            bool = list.contains(name);
            return bool;
        }

    }
}

