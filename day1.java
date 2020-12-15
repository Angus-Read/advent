import java.util.*;
import java.io.*;
public class day1{
    public static void main(String[] args) throws Exception{
	File file = new File("./input.txt");
	Scanner sc = new Scanner(file);
	ArrayList<Integer> numbers = new ArrayList<Integer>();
	while(sc.hasNextLine()){
	    numbers.add(Integer.parseInt(sc.nextLine()));
	    // System.out.println(sc.nextLine());
	}
	
	//	while(!numbers.isEmpty()){
	int cur = 0;
	int amt = 0;
	while(!numbers.isEmpty()){

	    cur = numbers.remove(0);
	    ArrayList<Integer> newnums = new ArrayList<Integer>(numbers);
	    while(!newnums.isEmpty()){
		ArrayList<Integer> newnums2 = new ArrayList<Integer>(newnums);
		newnums2.remove(0);
		 while(!newnums2.isEmpty()){
		     if(cur + newnums.get(0) + newnums2.get(0) == 2020)
			 System.out.println(cur +" " + newnums.get(0) + " "+ newnums2.get(0) + " " + );  
		     newnums2.remove(0);
		     amt++;
		 }
		 newnums.remove(0);	
	    }
	    
	}
    }
}
