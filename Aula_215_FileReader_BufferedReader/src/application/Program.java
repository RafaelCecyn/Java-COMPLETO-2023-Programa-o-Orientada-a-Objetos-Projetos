package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Program {

	public static void main(String[] args) {
		String path = "/home/rafael/Desktop/in.txt";
		FileReader fr = null;
		BufferedReader br = null;
		
		try {
			fr = new FileReader(path);
			br = new BufferedReader(fr); // mais abstrato
			
			String line = br.readLine(); // Se for a última linha retorna null
			
			while(line != null) {
				System.out.println(line);
				line = br.readLine();
			}
			
		}
		catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		finally {
			try {
			if (br != null) {
				br.close();
				}
			if (fr != null) {
				fr.close();
				}
			}
			catch (IOException e) {
				e.printStackTrace();
			}
			
		}

	}

}
