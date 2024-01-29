package application;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {
    public static void main(String[] args) {
        List<?> myObj = new ArrayList<>(); // este é o supertipo de qualquer tipo de Lista
        List<Integer> myInteger = new ArrayList<>(); // List<Object> não é o supertipo de List<Integer>
        myObj = myInteger;

        Object obj;
        Integer x = 0;
        obj = x;

        List<Integer> myInts = Arrays.asList(5, 2, 10);
        printList(myInts);

        List<String> myStrs = Arrays.asList("Midorya", "Bakugou");
        printList(myStrs);
    }

    public static void printList (List <?> list){
        for (Object obj : list) {
            System.out.println(obj);
        }
    }


}
