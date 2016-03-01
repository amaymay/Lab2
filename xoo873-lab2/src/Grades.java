import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * This class contains the methods: getName, length, 
 * average, median, maximum, and minimum.
 * @author Amy Wong (xoo873)
 *
 */

public class Grades {
	private String name;
	private List<Integer> grades;
	private List<Integer> sort;
	
	public Grades(String name, List<Integer> grades){
		this.name = name;
		this.grades = grades;	
		sort = new ArrayList<>(grades);
		Collections.sort(sort);
	}
	
	public String toString(){
		return name + " " + grades;
	}
		
	public String getName(){
		return name;
	}
	
	public int length(){
		return grades.size();
	}

	public double average() {
		double sum = 0.0;		
		for(int grade : grades){
			sum += grade;
		}
		return (sum / grades.size());
	}

	public double median(){
		if (sort.size() % 2 == 0){
			int median1 = (sort.size() -1) / 2;
			int median2 = median1 + 1;
			return (sort.get((int)median1) + sort.get((int)median2)) / 2.0;
		}
		else{
			int middle = (sort.size() -1) / 2;
			return sort.get((int)middle);
		}
	}
	
	public int maximum(){
		int max = 0;
		for(int grade : grades){
			if (grade > max)
				max = grade;
		}
		return max;
	}
	
	public int minimum(){
		int min = 100;
		for(int grade : grades){
			if (grade < min)
				min = grade;
		}
		return min;
	}
	
}// end class 
