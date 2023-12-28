package application;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Program {

	public static void main(String[] args) {
		
		/*
		List<Object> myObjs = new ArrayList<Object>();
		List<Integer> myNumbers = new ArrayList<Integer>();
		myObjs = myNumbers; // erro de compilação
		*/
		
		List<?> myObjs = new ArrayList<Object>();
		List<Integer> myNumbers = new ArrayList<Integer>();
		myObjs = myNumbers;
		
		List<Integer> myInts = Arrays.asList(5, 2, 10);
		printList(myInts);
		
		/*
		List<?> list = new ArrayList<Integer>();
		list.add(3); // erro de compilação
		*/
		
	}
	
	public static void printList(List<?> list) {
		for (Object obj : list) {
		System.out.println(obj);
		}
	}


}
