1import java.util.*;
2
3class Solution {
4    public List<List<String>> partition(String s) {
5        List<List<String>> result = new ArrayList<>();
6        backtrack(s, 0, new ArrayList<>(), result);
7        return result;
8    }
9
10    private void backtrack(String s, int start, 
11                           List<String> current, 
12                           List<List<String>> result) {
13
14        // If we reached the end of the string
15        if (start == s.length()) {
16            result.add(new ArrayList<>(current));
17            return;
18        }
19
20        // Try every possible substring
21        for (int end = start; end < s.length(); end++) {
22
23            if (isPalindrome(s, start, end)) {
24
25                // Choose
26                current.add(s.substring(start, end + 1));
27
28                // Explore
29                backtrack(s, end + 1, current, result);
30
31                // Backtrack
32                current.remove(current.size() - 1);
33            }
34        }
35    }
36
37    private boolean isPalindrome(String s, int left, int right) {
38        while (left < right) {
39            if (s.charAt(left) != s.charAt(right)) {
40                return false;
41            }
42
43            left++;
44            right--;
45        }
46
47        return true;
48    }
49}