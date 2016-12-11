package december;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class hydra {
	public static void main(String[] args) throws FileNotFoundException{
		String student = "C:\\Users\\saibu\\Desktop\\StudentData\\hydra.dat";
		String judge = "E:\\JudgeData\\hydra.dat";
		
//		Scanner file = new Scanner(new File(student));
		Scanner file = new Scanner(new File(judge));
		int number = file.nextInt();
		file.nextLine();
		
		for(int i = 0; i < number; i++){
			int heads = file.nextInt();
			file.nextLine();
			
			int sec = file.nextInt();
			file.nextLine();
			
			String[] array = file.nextLine().split(" ");
			
			for(int z = 0; z < array.length; z++){
				if(array[z].equals("F")){
					heads++;
				} else{
					heads--;
				}
				if(heads <= 0){
					heads = 0;
				}
			}
			System.out.println(heads);
		}
	}
}
