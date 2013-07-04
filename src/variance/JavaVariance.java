package variance;

import java.util.ArrayList;
import java.util.List;

public class JavaVariance {

	public static void main(String args[]) {

		Object testObj = null;

		String[] arrayB = { "a", "b", "c" };
		Object[] arrayA = arrayB;
		testObj = arrayA[0];

		List<String> listB = new ArrayList<String>();
		listB.add("123");
		List<Object> listA = (List) listB;
		testObj = listA.get(0);

		List<Double> listC = new ArrayList<Double>();
		listC.add(new Double(10.0));
		listB = (List) listC;
		System.out.println(listB.get(0));
		
	}

}