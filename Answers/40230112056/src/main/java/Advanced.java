import java.util.Objects;

public class Advanced {

    /**
     * Goal : Changing a Sentence Content

     * In this function, you have a sentence, a word & a newWord as Entry
     * You have to search the sentence to find the word that you were given as input and change it with the newWord

     */
    public String wordCensor(String sentence, String word, String newWord){
        String[] s = sentence.split(" ");
        String[] e = word.split(" ");
        int g=0;
        for (int t=0; t<s.length ; t++) {
            for(int f=0;f<e.length;f++){
                if (s[f+t]==e[f]) {
                    g++;
                }
            }
            if(g==e.length) s[t]=newWord;
        }
        String q = "";
        for (int i=0; i<s.length ; i++) q=(q+s[i]+" ");
        return q ;
    }

    /**
     * In this function You have a firstName and a lastName as Entry and you have to normalize them as a fullName
     * @param firstName is a first name with irregular letters (example : hARry)
     * @param lastName is a last name with irregular letters (example : pOtTeR)
     * @return fullName is a normal full name that just the first letter of firstName & lastName is Capitalized (example : Harry Potter)
     */
    public String normalizingName(String firstName, String lastName){
        String q = (!lastName.isBlank()) ? " "+lastName.substring(0, 1).toUpperCase()+lastName.substring(1).toLowerCase(): "";
        return firstName.substring(0, 1).toUpperCase()+firstName.substring(1).toLowerCase()+q;
        
    }

    /**
     * Removing repeated letter in a word
     * @param word This input could have Consecutive repeated letters or not
     * @return if word contains Consecutive repeated letters, one of the repeated letters should be omitted
     */
    public String doubleChar(String word) {
        char[] w = word.toCharArray();
        char[] r = {};
        int j=0;
        for(int i=0;i<w.length;i++){
            for(int j=1;;j++){
                if (w[i]==w[i+j]){

                } else {

                }
            }
        }
        return null;
    }
}

