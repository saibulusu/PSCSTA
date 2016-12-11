package december;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Flavors {
	public static void main(String[] args) throws FileNotFoundException{
		String student = "C:\\Users\\saibu\\Desktop\\StudentData\\flavors.dat";
		String judge = "E:\\JudgeData\\flavors.dat";
		
		Scanner file = new Scanner(new File(student));
//		Scanner file = new Scanner(new File(judge));
		int number = file.nextInt();
		file.nextLine();
		
		for(int i = 0; i < number; i++){
			int classes = file.nextInt();
			file.nextLine();
			
			String[] array = file.nextLine().split(" ");
			String[] list = file.nextLine().split(" ");
			
			int swap = 0;
			
			
		}
	}
}
