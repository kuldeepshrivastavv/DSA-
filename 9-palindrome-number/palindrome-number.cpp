class Solution {
public:
    bool isPalindrome(int x) {
        int original = x ;
        long reverse = 0 ;
        if( x < 0) return false ;
        while(x>0){
            int last_digit = x % 10 ;
            x /=10;
            reverse = (reverse * 10) + last_digit;

        }
    return  reverse == original ;
    }
};