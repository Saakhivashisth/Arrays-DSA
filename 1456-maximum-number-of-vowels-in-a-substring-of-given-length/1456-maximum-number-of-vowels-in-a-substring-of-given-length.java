class Solution {
    public int maxVowels(String s, int k) {
       int left=0;
       int vowels=0;
      

       for(int right=0; right<k; right++){
          if(s.charAt(right)=='a'||s.charAt(right)=='e'||s.charAt(right)=='i'||s.charAt(right)=='o'||s.charAt(right)=='u'){
            vowels++;
          }

       }
       int maxVowels=vowels;
       for(int right=k;right<s.length();right++){
        char leftChar=s.charAt(right-k);
        char rightChar=s.charAt(right);
        if(leftChar=='a'||leftChar=='e'||leftChar=='i'||leftChar=='o'||leftChar=='u'){
            vowels--;
        }
        if(rightChar=='a'||rightChar=='e'||rightChar=='i'||rightChar=='o'||rightChar=='u'){
            vowels++;
        }
        maxVowels=Math.max(vowels,maxVowels);
       }
       return maxVowels;
    }
}