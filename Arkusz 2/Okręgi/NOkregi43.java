package Okrêgi;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NOkregi43 {
	public static void main(String[] args) throws FileNotFoundException {
		PrintWriter wynik3=new PrintWriter("wynik3.txt");
		int pole=0;
		String[] tab = {"","",""};
		Scanner sc=new Scanner (new File("C:\\Users\\Przemek\\eclipse-workspace\\Dodzik\\Maturadlaidzika\\Okrêgi\\okregi.txt"));
		List<Kolo> arr=new ArrayList<>();
		arr.add(new Kolo(0,0,0));
		while (sc.hasNextLine()) {
			tab=sc.nextLine().split(" ");
			arr.add(new Kolo(Integer.valueOf(tab[0]),Integer.valueOf(tab[1]),Integer.valueOf(tab[2])));
		}
		for (int i = 1; i < arr.size()-1; i++) {
			pole=pole+(Math.abs(arr.get(i-1).getX()*arr.get(i).getY()+arr.get(i).getX()*arr.get(i+1).getY()+arr.get(i+1).getX()*arr.get(i-1).getY()-arr.get(i+1).getX()*arr.get(i).getY()-arr.get(i-1).getX()*arr.get(i+1).getY()-arr.get(i).getX()*arr.get(i-1).getY())/2);		
		}
		wynik3.println(pole);
		wynik3.close();
	}

}
