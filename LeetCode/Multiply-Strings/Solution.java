1class Solution {
2    public String multiply(String num1, String num2) {
3        
4        if (num1.equals("0") || num2.equals("0")) {
5            return "0";
6        }
7
8        int n = num1.length();
9        int m = num2.length();
10
11        int[] result = new int[n + m];
12
13        for (int i = n - 1; i >= 0; i--) {
14            for (int j = m - 1; j >= 0; j--) {
15
16                int digit1 = num1.charAt(i) - '0';
17                int digit2 = num2.charAt(j) - '0';
18
19                int product = digit1 * digit2;
20
21                int pos1 = i + j;
22                int pos2 = i + j + 1;
23
24                int sum = product + result[pos2];
25
26                result[pos2] = sum % 10;
27                result[pos1] += sum / 10;
28            }
29        }
30
31        StringBuilder ans = new StringBuilder();
32
33        for (int digit : result) {
34            if (ans.length() == 0 && digit == 0) {
35                continue;
36            }
37            ans.append(digit);
38        }
39
40        return ans.toString();
41    }
42}