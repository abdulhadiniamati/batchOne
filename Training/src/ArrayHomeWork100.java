import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ArrayHomeWork100 {
	
	public static void main(String[] args) {
//
		ArrayHomeWork100 r = new ArrayHomeWork100();
		
		Scanner r1 =new Scanner (System.in);
		int [] array = new int[100];
		for (int a = 0; a < array.length; a++) {
		    if ((a + 1) % 10 != 0) {
		        array[a] = (a + 1) * 10;
		    } else {
		      
		    	array[a] = r1.nextInt();
		    }
		    
		}
		    
		}
		    
	}

