package class_tasks.lesson12;

import class_tasks.lesson9.StringUtils;

import java.util.*;

public class CollectionsImpl {
    public Set<String> getPalindroms(Collection<String> words) {
        Set<String> polindroms = new HashSet<>();
        for (String word : words) {
            if (StringUtils.isPalindrome(word)) {
                polindroms.add(word);
            }
        }
        return polindroms;
    }

    public <T> List<T> createArrayList(T... elements) {
        List<T> list = new ArrayList<>();
        for (T element : elements) {
            list.add(element);
        }
        return list;
    }

    public <T> List<T> random(ArrayList<T> list) {
        List<T> out = new ArrayList<>();
        out.addAll(list);
        Random random = new Random();
        for (int i = 0; i < out.size(); i++) {
            int pos = random.nextInt(out.size());
            T first = out.get(pos);
            T second = out.get(i);
            out.set(i, first);
            out.set(pos, second);
        }
        return out;
    }

    public Character findMostFrequentChar(String s) {
        char[] array = s.toCharArray();
        Map<Character, Integer> map = new HashMap<>();
        for (char c : array) {
            if (map.containsKey(c)) {
                int num = map.get(c);
                map.replace(c, ++num);
            } else {
                map.put(c, 1);
            }
        }

        int max = 0;
        Character character = null;
        for (Map.Entry<Character, Integer> item : map.entrySet()) {
            if (item.getValue() > max) {
                max = item.getValue();
                character = item.getKey();
            }
        }

        return character;
    }

    public List<String> sort(List<String> strings) {
        List<String> list = new ArrayList<>(strings);
        list.sort((o1, o2) -> {
            int l1 = o1.length();
            int l2 = o2.length();
            if (l1 > l2) {
                return 1;
            } else if (l2 > l1){
                return -1;
            }
            return o1.compareTo(o2);
        });
        return list;
    }
}
