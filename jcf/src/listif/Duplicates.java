package listif;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Duplicates {

	public static void main(String[] args) {

		List<Integer> list = new ArrayList<Integer>();

		list.add(10);
		list.add(20);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);
		System.out.println(List_Remover.remove(list));

	}

}

class List_Remover {

	public static List<Integer> remove(List<Integer> list2) {
		List<Integer> list = list2;

		List<Integer> list3 = new ArrayList<Integer>();
		for (int i = 0; i < list.size(); i++) {
			for (int j = i + 1; j < list.size(); j++) {
				if (list.get(i) == list.get(j)) {
					list3.add(list.get(i));
					break;
				}

			}
		}

		System.out.println("Before :" + list);

		for (int i : list3) {
			list.remove(Integer.valueOf(i));
		}

		return list;
	}
}