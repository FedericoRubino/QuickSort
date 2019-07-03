
/*
  Federico Rubino
  frubino
  Assignment #3
  Quicksort
  QuickSort.java
  untested/not working
*/

import java.util.ArrayList;

public class QuickSort {

    //constructor
    public QuickSort(){
	A = new ArrayList<Integer>();
	//	size = 0;
    }

    //inserts data into the ArrayList
    //and increments the size
    public void insert(int data){
	A.add(data);
	//	size++;
    }

    //The Quicksort function
    private void Quicksort(int p, int r){
	if(p < r){
	    int q = Partition(p, r);
	    Quicksort(p, q - 1);
	    Quicksort(q + 1, r);
	}//end of if
    }

    //Lomuto partition method
    private int Partition(int p, int r){
	if(r - p >= 5)
	    MedianOfThree(p, r);
	int x = A.get(r);
	int i = p - 1;
	int j = p;
	for(;j < r; j++){
	    if(A.get(j) <= x){
		i++;
		swap(i, j);
	    }//if
	}//for
	swap(i + 1, r);
	return i + 1;
    } //end Partition

    //swap method
    private void swap(int a, int b){
	//	if(a < A.size() && b < A.size()){
	    int temp = A.get(a);
	    A.set(a, A.get(b));
	    A.set(b, temp);
	    //	}
    }

    //move the median of the first, middle and end index to the end
    private void MedianOfThree(int p, int r){
	int mid = p + (r - p)/2;
	if((A.get(r) >= A.get(mid) && A.get(r) <= A.get(p)) || (A.get(r) <= A.get(mid) && A.get(r) >= A.get(p))){
	    return;
	} else if((A.get(r) <= A.get(mid) && A.get(mid) <= A.get(p)) || (A.get(r) >= A.get(mid) && A.get(mid) >= A.get(p))){
	    swap(mid, r);
	}  else {
	    swap(p, r);
	}
    }

    //wrapper function
    public void sort(){
	Quicksort(0, A.size() - 1);
    }

    //get the Sorted Array
    public ArrayList<Integer> getArray(){
	ArrayList<Integer> list = A;
	return list;
    }

    //member variables
    private ArrayList<Integer> A;
} //end of class
