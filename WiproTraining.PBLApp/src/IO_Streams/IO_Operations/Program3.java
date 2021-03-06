package IO_Streams.IO_Operations;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeMap;

public class Program3 {

    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the file name: ");
		String fileName = br.readLine();
		System.out.println("Enter the character to be counted: ");
		Character ch = Character.toLowerCase((char)br.read());
		
		FileReader in = new FileReader(fileName);  
		int i;
		int counter = 0;
		while((i = in.read()) != -1) {
			if(ch.equals(Character.toLowerCase((char)i))){
				counter ++;
			}
		}
		
		System.out.println("File " + "'" +  fileName + "' has " + counter + " instances of letter  " + "'" + ch + "'");
		in.close();
    }
}

