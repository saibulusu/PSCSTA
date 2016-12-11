package december;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Yoda {
	public static void main(String[] args) throws FileNotFoundException{
		String student = "C:\\Users\\saibu\\Desktop\\StudentData\\yoda.dat";
		String judge = "E:\\JudgeData\\yoda.dat";
		
		Scanner file = new Scanner(new File(student));
//		Scanner file = new Scanner(new File(judge));
		int number = file.nextInt();
		file.nextLine();
		
		for(int i = 0; i < number; i++){
			String k = file.nextLine();
			String[] array = k.split(" ");
			for(int j = 2; j < array.length; j++){
				System.out.print(array[j] + " ");
			}
			System.out.print(array[0] + " " + array[1] + "\n");
		}
	}
}
