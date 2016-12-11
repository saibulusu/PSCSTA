package december;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Sequence {
	public static void main(String[] args) throws FileNotFoundException{
		String student = "C:\\Users\\saibu\\Desktop\\StudentData\\sequence.dat";
		String judge = "E:\\JudgeData\\sequence.dat";
		
		Scanner file = new Scanner(new File(student));
//		Scanner file = new Scanner(new File(judge));
		int number = file.nextInt();
		file.nextLine();

		
	}
}
