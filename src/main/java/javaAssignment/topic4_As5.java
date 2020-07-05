package javaAssignment;

import java.util.HashSet;
import java.util.Iterator;

public class topic4_As5 {

    public static void main(String args[]){
        HashSet<String> set = new HashSet<>();
        set.add("Aniruth");
        set.add("Pablo");
        set.add("Walter");
        set.add("White");
        set.add("Jesse");
        set.add("Pinkman");
        Iterator it = set.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
