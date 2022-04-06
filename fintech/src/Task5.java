import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task5 {

    public static void func (){
    }
    public static void func(int a){
        a = 0;
    }
    public static void main(String[] args) {
        List list = new ArrayList(10);
        for(int i = 0;i < 11; i++){
            list.add(i);
        }
        for(int i = 0; i < list.size();i++){
            System.out.println(list.get(i));
        }
        List<String> numbers = new ArrayList(Arrays.asList("first", "second", "third"));
        for (String number : numbers) {
            if ("third".equals(number)) {
                numbers.add("fourth");
            }
        }
        System.out.println(numbers.size());
    }
}
