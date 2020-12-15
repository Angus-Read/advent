import java.util.*;
import java.io.*;
public class day2{
    public static void main(String[] args) throws Exception{
	File file = new File("./input.txt");
	Scanner sc = new Scanner(file);
	ArrayList<Integer> numbers = new ArrayList<Integer>();
	int total = 0;
	while(sc.hasNextLine()){
	    String line  = sc.nextLine();
	    int end = line.indexOf("-");
	    int min = Integer.parseInt(line.substring(0,end));
	    line = line.substring(end+1);
	    end = line.indexOf(":");
	    int max = Integer.parseInt(line.substring(0, line.indexOf(" ")));
	    char target = line.charAt(end - 1);
	    line  = line.substring(end+2);
	    System.out.print(min + "\t" + max + "\t" + target + "\t" + line + "\t\t");
	    if((line.charAt(min - 1) == target && line.charAt(max - 1) != target) || (line.charAt(min - 1) != target && line.charAt(max - 1) == target)){
		System.out.println("This Works.");
		total++;
	    }else{
		System.out.println("This Doesn't Work.");
	    }
	    
	}
	System.out.println(total);
    }

    public static boolean isNull(String line){
	if(line.isEmpty() || line == null)
	    return true;
	return false;
    }
}
