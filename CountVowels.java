// Question 6: Count Vowels
// Write a program that counts the number of vowels in a sentence.
// eg " Hello World " => returns 3 


public class CountVowels {
    public static void main(String[] args) {
         char[] vowels = {'a', 'e', 'i', 'o', 'u'};
         String word = "My name is Victor";

         int count = 0;

         for(int i = 0; i < vowels.length; i++){
            for(int j = 0; j < word.length(); j++){
                if(vowels[i] == word.charAt(j)){
                    count++;
                }
            }
         }

         System.out.println(count);
     }
}
