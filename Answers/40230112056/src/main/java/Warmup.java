public class Warmup {

    /**
     * Goal : Simple Introduction To Strings
     * In the first function, your inputs are a number and a sentence
     * @return is the number th word of the sentence
     */
    public String wordFinder(String sentence, int number) {
        String[] s = sentence.split(" ");
        return (number > s.length) ? " Number = " + number + " is out Of Bound" : s[number-1];
    }

    /**
     * Goal : Basic introduction to Strings & using foreach
     * @param number        is in String type
     * @param searchForEven is a boolean entry
     * @return if searchForEven is true ? return the number of even numbers : return the number of odd numbers
     */
    public int oddEvenCounter(String number, boolean searchForEven) {
        int m=0;
        char[] t = number.toCharArray();
        for (int i=0;i<number.length();i++){
            if (searchForEven==true) {
                if (t[i]%2==0) m++;
            } else {
                if (t[i]%2==1) m++;
            }
        }
        return m;
    }

    /**
     * @param wordA --> first word
     * @param wordB --> second word
     * @return The word that is first in alphabet column
     */
    public String firstWord(String wordA, String wordB) {
        int j=0;
        char[] a = wordA.toCharArray();
        char[] b = wordB.toCharArray();
        while (true) {
            if (a[j]>b[j]) return wordB ;
            else if (a[j]<b[j]) return wordA ;
            else j++ ;
        }
    }
}
