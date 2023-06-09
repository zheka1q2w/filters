import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Class1 cl1 = new Class1("1");
        Class1 cl2 = new Class1("2");
        Class1 cl3 = new Class1("3");
        Class1 cl4 = new Class1("4");
        Class1 cl5 = new Class1("5");
        List<Class1> cls = new ArrayList<>();
        cls.add(cl1);
        cls.add(cl2);
        cls.add(cl3);
        cls.add(cl4);
        cls.add(cl5);

        List<String> strs = new ArrayList<>();
        strs.add("1"); //+
        strs.add("6");
        strs.add("3"); //+
        strs.add("-1");
        strs.add("0");
        strs.add("5"); //+

        List<String> res = cls.stream()
                .map(c -> c.getStr())
                .filter(str -> strs.contains(str))
                .toList();
        System.out.println(res);
    }
}
