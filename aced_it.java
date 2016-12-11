package december;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class aced_it {
	public static void main(String[] args) throws FileNotFoundException{
		String student = "C:\\Users\\saibu\\Desktop\\StudentData\\aced_it.dat";
		String judge = "E:\\JudgeData\\aced_it.dat";
		
		Scanner file = new Scanner(new File(student));
//		Scanner file = new Scanner(new File(judge));
		int number = file.nextInt();
		file.nextLine();
		
		for(int i = 0; i < number; i++){
			int classes = file.nextInt();
			file.nextLine();
			String[] array = file.nextLine().split(" ");
			System.out.println(array[array.length - 1]);
		}
	}
}
