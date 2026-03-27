1class Solution {
2    public boolean isPalindrome(int x) {
3        if(x<0||x%10==0&&x!=0){
4            return false;
5        }
6       int rev=0;
7        while
8        (x>rev){
9            rev=rev*10+x%10;
10            x=x/10;
11        }
12        if(x==rev||x==rev/10){
13            return true;
14            
15        }
16        else 
17        return false;
18    }
19
20}