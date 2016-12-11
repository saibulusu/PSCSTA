package december;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Radical {
	public static void main(String[] args) throws FileNotFoundException{
		String student = "C:\\Users\\saibu\\Desktop\\StudentData\\radical.dat";
		String judge = "E:\\JudgeData\\radical.dat";
		
		Scanner file = new Scanner(new File(student));
//		Scanner file = new Scanner(new File(judge));
		int number = file.nextInt();
		file.nextLine();
		
		for(int z = 0; z < number; z++){
			int a = file.nextInt();
			file.nextLine();
			
			int out = (int)(Math.sqrt(number));
			int in = a / (out * out);
			
			System.out.println(out + ";" + in);
		}
	}
}


















