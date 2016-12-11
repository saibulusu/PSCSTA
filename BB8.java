package december;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BB8 {
	public static void main(String[] args) throws FileNotFoundException{
		String student = "C:\\Users\\saibu\\Desktop\\StudentData\\bb8.dat";
		String judge = "E:\\JudgeData\\bb8.dat";
		
		Scanner file = new Scanner(new File(student));
//		Scanner file = new Scanner(new File(judge));
		int number = file.nextInt();
		file.nextLine();
		
		for(int i = 0; i < number; i++){
			int w = file.nextInt();
			String answer = "";
			answer += "  ";
			for(int k = 0; k < w - 4; k++){
				answer += ".";
			}
			answer += "\n ";
			for(int k = 0; k < 2; k++){
				for(int dot = 0; dot < w - 2; dot++){
					answer += ".";
				}
				answer += "\n ";
			}
			answer += " ";
			for(int k = 0; k < w - 4; k++){
				answer += ".";
			}
			answer += "\n ";
			
			for(int dot = 0; dot < w - 2; dot++){
				answer += ".";
			}
			answer += "\n";
			for(int row = 0; row < 2; row++){
				for(int dot = 0; dot < w; dot++){
					answer += ".";
				}
				answer += "\n";
			}
			
			answer += " ";
			for(int dot = 0; dot < w - 2; dot++){
				answer += ".";
			}
			
			System.out.println(answer + "\n");
		}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
}
