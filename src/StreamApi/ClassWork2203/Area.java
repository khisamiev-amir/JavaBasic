package StreamApi.ClassWork2203;

import java.util.List;

public class Area {
    private String name;
    private List<String> peoples;

    public Area(String name, List<String> peoples) {
        this.name = name;
        this.peoples = peoples;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<String> getPeoples() {
        return peoples;
    }

    public void setPeoples(List<String> peoples) {
        this.peoples = peoples;
    }

}
