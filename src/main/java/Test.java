import java.util.ArrayList;

public class Test {
        public int id;
        public String title;
        public String value;
        public ArrayList<Test> values;

    @Override
    public String toString() {
        return "Test{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", value='" + value + '\'' +
                ", values=" + values +
                '}';
    }
}



