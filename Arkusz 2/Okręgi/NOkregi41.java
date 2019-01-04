package Okrêgi;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NOkregi41 {
	public static void main(String[] args) throws FileNotFoundException {
		int p1=0;
		int p2=0;
		int p3=0;
		int p4=0;
		String[] tab = {"","",""};
		PrintWriter wynik1=new PrintWriter("wynik1.txt");
		Scanner sc=new Scanner (new File("C:\\Users\\Przemek\\eclipse-workspace\\Dodzik\\Maturadlaidzika\\Okrêgi\\okregi.txt"));
		List<Kolo> arr=new ArrayList<>();
		while (sc.hasNextLine()) {
			tab=sc.nextLine().split(" ");
			arr.add(new Kolo(Integer.valueOf(tab[0]),Integer.valueOf(tab[1]),Integer.valueOf(tab[2])));
		}
		for (int i = 0; i < arr.size(); i++) {
			if(arr.get(i).getX()>0&&arr.get(i).getY()>0) {
				p1++;
			}
			if(arr.get(i).getX()<0&&arr.get(i).getY()>0) {
				p2++;
			}
			if(arr.get(i).getX()<0&&arr.get(i).getY()<0) {
				p3++;
			}
			if(arr.get(i).getX()>0&&arr.get(i).getY()<0) {
				p4++;
			}
		}
		wynik1.println(p1+" "+p2+" "+p3+" "+p4);
		wynik1.close();
	}

}
