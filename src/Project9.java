

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Project9 {

	//main method
	public static void main(String[] args) {
		HashTable h = new HashTable();
		try {
			//read the word file 
			File in = new File("words.txt");
			Scanner input = new Scanner(in);
			while (input.hasNextLine()) {

				h.put(input.nextLine());

			}
            //read the checkme file
			Scanner file = new Scanner(new FileInputStream("Checkme.txt"));

			int lineNumber = 0;
			String[] inputString;

			while (file.hasNext()) {
				
				String data = file.nextLine().toLowerCase();
				lineNumber++;

				inputString = data.split(" ");
				for (int i = 0; i < inputString.length; i++) {
					
					h.checkWord(inputString[i], lineNumber);
				}

			}

		}

		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("File not found");
		}
	}
}
