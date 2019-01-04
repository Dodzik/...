package Okrêgi;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class NOkregi42 {
		public static void main(String[] args) throws FileNotFoundException {
			PrintWriter wynik2=new PrintWriter("wynik2.txt");
			int count=0;
			String[] tab = {"","",""};
			Scanner sc=new Scanner (new File("C:\\Users\\Przemek\\eclipse-workspace\\Dodzik\\Maturadlaidzika\\Okrêgi\\okregi.txt"));
			List<Kolo> arr=new ArrayList<>();
			List<Kolo> arr2=new ArrayList<>();
			while (sc.hasNextLine()) {
				tab=sc.nextLine().split(" ");
				arr.add(new Kolo(Integer.valueOf(tab[0]),Integer.valueOf(tab[1]),Integer.valueOf(tab[2])));
			}
			for (int i = 0; i < arr.size(); i++) {
				if (arr.get(i).getY()-arr.get(i).getR()==0) {
					arr2.add(arr.get(i));
					count++;
				}
			}
			Collections.sort(arr2,new ComperX());
			wynik2.println(arr2);
			wynik2.println(count);
			wynik2.close();
		}
		
}
