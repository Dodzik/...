package Okrêgi;

import java.util.Comparator;

public class ComperX implements Comparator<Kolo>{

	@Override
	public int compare(Kolo o1, Kolo o2) {
		// TODO Auto-generated method stub
		if (o1.getX()!=o2.getX()) 
		{
		return o1.getX()-o2.getX();
	}
		else {
			return o1.getY()-o2.getY();
		}
	
	}

}