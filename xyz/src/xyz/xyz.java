package xyz;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class xyz {
public static void main(String[] args) {
Set set = new TreeSet<>();
set.add(1);
set.add("2");
set.add(3);
Iterator iterator = set.iterator();
while(iterator.hasNext()){
System.out.println(iterator.next() +" ");
}
}
}



