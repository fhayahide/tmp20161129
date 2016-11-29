import java.util.*;
import java.io.*;

public class Aloha {

	public static void main(String[] args) {

		try{
			File f = new File("Aloha.txt");
			FileWriter fw = new FileWriter(f);
			BufferedWriter bw = new BufferedWriter(fw);
			PrintWriter pw = new PrintWriter(bw); 

				pw.println(args[0]+"さん、あろは");

			pw.close();
		}catch (IOException e) {
			System.out.println("エラーです。");
			e.printStackTrace();
		}

	}

}
