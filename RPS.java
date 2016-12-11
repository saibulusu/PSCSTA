package december;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class RPS {
	public static void main(String[] args) throws FileNotFoundException{
		String student = "C:\\Users\\saibu\\Desktop\\StudentData\\rps.dat";
		String judge = "E:\\JudgeData\\rps.dat";
		
		Scanner file = new Scanner(new File(student));
//		Scanner file = new Scanner(new File(judge));
		int number = file.nextInt();
		file.nextLine();

		for(int i = 0; i < number; i++){
			
			String start = "R";
			String[] value = {"R", "P", "S"};
			
			int a = file.nextInt();
			file.nextLine();
			
			String[] array = file.nextLine().split(" ");
			int win = 0,loss = 0,tie = 0;
			
			
			//////////////////////////////

			
			
			for(int z = 0; z < array.length; z++){
				if(array[z].equals(start)){
					tie++;
				} else if(start.equals(value[2])){
					start = value[0];
				} else if(!start.equals(value[2])){
					if(start.equals("R")){
						start = "P";
					}
					if(start.equals("P")){
						start = "S";
					}
					if(start.equals("S")){
						start = "R";
					}
					win++;
				} else{
					loss++;
					if(!start.equals(value[2])){
						start = value[z+1];
					} else{
						start = value[0];
					}
				}
			}
		
//////////////////////		
			System.out.println("W:" + win + " L:" + loss + " T:" + tie);
		}
	}
}











