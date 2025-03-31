package javabasicallprograms;
 import java.util.*;
public class RemoveDuplicateNoUsingArrayList {
	public static void main(String[] args) {
		ArrayList<Integer> al=new ArrayList<>();
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(2);
		al.add(4);
		al.add(5);
		System.out.println(al);
		
		Set <Integer> set=new HashSet<>(al);
		ArrayList<Integer> removeelement=new ArrayList<>(set);
		System.out.println(removeelement);
		
		ArrayList<String> list=new ArrayList<>();
		list.add("apple");
		list.add("banana");
		list.add("apple");
		list.add("orange");
		System.out.println(list);
		
		Set<String> set1=new HashSet<>(list);
		ArrayList<String> removestring=new ArrayList<>(set1);
		System.out.println(removestring);
			

	}

}
