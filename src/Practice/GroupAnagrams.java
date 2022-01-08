package Practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

class GroupAnagrams {
	public List<List<String>> groupAnagrams(String[] strs) {
		Map<String, List<String>> m = new HashMap<>();

		for (String s : strs) {
			char charArray[] = s.toCharArray();
			Arrays.sort(charArray);
			String sorted = new String(charArray);

			if (!m.containsKey(sorted)) {
				m.put(sorted, new LinkedList<String>());
			}
			m.get(sorted).add(s);

		}
		return new LinkedList<>(m.values());

	}
}
