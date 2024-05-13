package collection;
import java.util.*;
public class Sample4 {
	public static void main(String[] args) {
		// LinkedHashSet : 인접한 데이터간에 링크가 존재하는 방식
		// Set임에도 순서가 존재하지만 중복데이터는 허용하지 않는다.
		LinkedHashSet LHS = new LinkedHashSet();
		LHS.add("A");
		LHS.add("B");
		LHS.add("C");
		LHS.add("D");
		LHS.add("E");
		LHS.add("A");
		System.out.println(LHS);
		
		// TreeSet : 데이터를 저장할 때 정렬하여 저장함. Set이므로 중복데이터는 불가
		TreeSet TS = new TreeSet();
		TS.add(9);
		TS.add(7);
		TS.add(1);
		TS.add(5);
		TS.add(6);
		System.out.println(TS);
	}
}
