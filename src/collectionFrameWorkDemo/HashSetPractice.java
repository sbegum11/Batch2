package collectionFrameWorkDemo;

import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class HashSetPractice {
    //hashset class can not contain duplicate elements
    //good for search
    //hashset class does not maintain insertion order
    public void hashsetdemo(){
        HashSet<String>cars=new HashSet<String>();

        cars.add("toyota");
        cars.add("nissan");
        cars.add("honda");
        cars.add("audi");
        cars.add("audi");
        cars.add("BMW");
        cars.add("ford");
        cars.add("crystler");

        System.out.println(cars);
        System.out.println(cars.size());
        System.out.println("=====================================================");
        HashSet<Integer>num=new HashSet<Integer>();
        num.add(2);
        num.add(1);
        num.add(3);
        num.add(4);
        num.add(5);

        System.out.println(num);
        System.out.println(num.size());
    }

    public static void main(String[] args) {
        HashSetPractice obj = new HashSetPractice();
        obj.hashsetdemo();
    }
}
