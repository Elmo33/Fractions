import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.TransformerException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    static int disc(int a, int b, int c){
        return (int)Math.pow(b, 2) - (4*a*c);
    }
    static String shortest(String[] strings){
        String shortest = strings[0];
        for (String i : strings){
            if (i.length() < shortest.length()){
                shortest = i;
            }
        }
        return shortest;
    }

    static double average(Integer[] numbers){
//        List<Integer> above150 = new ArrayList<>();
        double sum = 0;
        int x = 0;
        for (Integer i : numbers)
            if (i>150){
                sum += i;
                x ++;
            }
        return sum/x;
    }

    static float geometricMean(Integer[] arr)
    {
        int n = arr.length;
        float product = 1;
        for (Integer integer : arr) product *= integer;
        return (float)Math.pow(product, (float)1 / n);
    }
    public static void main(String[] args) throws ParserConfigurationException, TransformerException, IOException {

        Integer[] nums = {200,300,250,42, 125};
        System.out.println(average(nums));
        System.out.println(geometricMean(nums));

        Department a = new Department();
        a.numerator = 0;
        a.denominator = 5;
        Department b = new Department();
        b.numerator = 2;
        b.denominator = 5;
        System.out.println(a.equals(b));

        Xml.createXml();

        File write = new File();
        write.write();
    }
}

