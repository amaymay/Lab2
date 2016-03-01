import java.util.Scanner; // Program uses Scanner class
import java.io.File; // Program uses File class
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
/**
 * This class reads an input file that contains the name of a student
 * and a list of their grades. The program will then print out the 
 * student's name, length, average, median, maximum, and minimum.
 * @author Amy Wong (xoo873)
 *
 */
public class Lab2 {
	/**
	 * This is the main method.
	 * @param args command line argument
	 */

	public static void main(String[] args) {
		Scanner in = null;
		try {
		    in = new Scanner(new File("data.txt"));
		} catch (FileNotFoundException exception) {
		    System.err.println("failed to open data.txt");
		    System.exit(1);
		}
		while (in.hasNext()) {
		    String name = in.next();
		    List<Integer> grades = new ArrayList<>();
		    while (in.hasNextInt()) {
		        grades.add(in.nextInt());
		    }
		testGrades(new Grades(name, grades));
		}   
		
	}// end main
	
	/**
	 * This prints out the student's name, length, average, 
	 * median, maximum, and minimum.
	 * @param grades list of grades
	 */
	public static void testGrades(Grades grades) {
	    System.out.println(grades.toString()); 
	    System.out.printf("\tName:    %s\n", grades.getName());
	    System.out.printf("\tLength:  %d\n", grades.length());
	    System.out.printf("\tAverage: %.2f\n", grades.average());
	    System.out.printf("\tMedian:  %.1f\n", grades.median());
	    System.out.printf("\tMaximum: %d\n", grades.maximum());
	    System.out.printf("\tMininum: %d\n", grades.minimum());
	}

}// end class 
