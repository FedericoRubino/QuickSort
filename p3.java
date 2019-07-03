/*
  Federico Rubino
  Assignment #3
  Quicksort
  main.java
  not tested/not working
*/

import java.util.ArrayList; 
import java.util.Scanner;

public class p3{

    public static void main(String args[]){
	QuickSort toBeSorted = new QuickSort();
        Scanner input = new Scanner(System.in);
        int tempInt;
	ArrayList<Integer> list;

        while(input.hasNextInt()){
            tempInt = input.nextInt();
	    toBeSorted.insert(tempInt);
        }

        input.close();
	toBeSorted.sort();

	list = toBeSorted.getArray();

	for(int i = 0; i < list.size(); i++){
	    System.out.printf("%09d%n", list.get(i));
	}
    }//end of main
}//end of class p3
