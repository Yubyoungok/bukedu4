package collection;
import java.util.*;

public class Sample3 {
	public static void main(String[] args) {
		// Set : 순서가 없는 데이터 집합, 데이터의 중복을 허락하지 않는다.
		// Set역시 interface이므로 implements가 된 class로 이용해야 한다.
//		Set s = new HashSet();
		HashSet<String> s = new HashSet<String>();
		boolean result;
		s.add("apple");
		s.add("mango");
		s.add("grape");
		s.add("orange");
		s.add("banana");
		result = s.add("apple"); // 중복 처리 안됨 중복 데이터가 있어서 데이터가 입력되지 않은 경우 false
//		s.add("");
		s.add("null"); // 가급적 데이터에 문자 null은 입력하지 마세요. 구별이 안됩니다.
		s.add(null);
		System.out.println(s);
		System.out.println(result);
		result = s.add("bear");
		System.out.println(result); // 새로 데이터가 잘 들어간 경우 true
		System.out.println("");
		// set의 for문을 통한 운행
		// 배열고 변경해서 for문으로 출력하는 방법
		String[] array = new String[s.size()];   // set과 동일한 크기의 배열을 준비
		s.toArray(array);                      // set과 내용물을 배열로 옮겨적기(index가 부여됨)
		System.out.println(array[0]);
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
		// List로 변환해서 for문으로 출력하는 방법
		List<String> L = new ArrayList<String>(s); // 생성자를 통해 set데이터를 전달해서 list제작
		System.out.println(L);
		for(int i=0; i<L.size(); i++) {
			System.out.println(L.get(i));
		}
		// 향상된 for문을 이용하는 방법, set데이터도 iterator가 존재하므로 향상된 for문 사용가능
		for(String str:s) {
			System.out.print(str+"\t");
		}
		System.out.println();
		// iterator를 이용해서 출력하는 방법
		Iterator itr = s.iterator();
		while(itr.hasNext()) {
			System.out.print(itr.next()+"\t");
		}
	}
}
