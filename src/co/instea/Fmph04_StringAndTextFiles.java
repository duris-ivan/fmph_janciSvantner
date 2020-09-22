package co.instea;

public class Fmph04_StringAndTextFiles {

    public static int numberOfWordsInString_Ivan(String sentence){
        int index = -1;
        int count = 0;
        int result;
        sentence = sentence.trim();// deletes first and last spaces
        do{
            index = sentence.indexOf(" ",index+1);
            count++;
            if (count>0 & index==-1)
                return count;
            //index--;
        }while (index<sentence.length());
        return count;
    }

    public static int numberOfWords_JanciSvantner(String sentence){
        int i = -1, count = 0;
        sentence = sentence.trim(); // deletes first and last spaces
        do {
            i = sentence.indexOf(" ", i+1);
            if (i>=0){
                count++;
            }
        }while (i>=0);
        return count+1;
    }

    public static String deleteInterpunction(String s){
        // letters with Interpunction
        String[] pd = {"ď","ľ","š","č","ť","ž","ý","á","í","é","ú","ä","ň","ĺ","ŕ",
                "ô","ó","Ď","Ľ","Š","Č","Ť","Ž","Ý","Á","Í","É","Ú","Ň","Ó","Ŕ","Ĺ"};
        // letters without Interpunction responding to the letters in array pd
        String[] p = {"d","l","s","c","t","z","y","a","i","e","u","a","n","l","r",
                "o","o","D","L","S","C","T","Z","Y","A","I","E","U","N","O","R","L"};

        String result = s;
        // loop through all array pd and replace all instances of letters with Interpunction throughout the letters without Interpunction
        for (int i=0;i<pd.length;i++){
            result = result.replaceAll(pd[i], p[i]);
        }
        return result;
    }




    public static void main(String[] args) {

        String sentence = new String("The same rules . remain also when inserting an object as argument into the function.");
        String sentence2 = new String("");
        char firstLetterOfSentence = sentence.charAt(5);
        /**
         * expected Output> Letter "s"
         */
        System.out.println(firstLetterOfSentence);

        //-----------
        int firstPositionOfStringInString = sentence.indexOf("pravidlá");
        /**
         * expected Output> 9
         */
        System.out.println(firstPositionOfStringInString);

        //-----------
        int positionOfStringFromIndex = sentence.indexOf(".", 30);
        /**
         * expected Output> position of second dot is at index 73 searching from index 30...
         */
        System.out.println(positionOfStringFromIndex);

        //-----------
        int lengthOfString = sentence.length();
        /**
         * expected Output> length of String> 74 characters
         */
        System.out.println(lengthOfString);

        //-------------
        /**
         * expected output> replaced String> "Tie isté pravidlá platia . aj keď INSERTUJEME objekt ako argument do funkcie."
         */
        System.out.println(sentence.replaceAll("vkladáme", "INSERTUJEME"));

        //-------------
        /**
         * expected output> substrings separation from Index to Index
         */
        String substr1 = sentence.substring(0,8); // "Tie iste"
        String substr2 = sentence.substring(9,17); // "pravidla"
        System.out.println("substr1: " + substr1 + " ; substr2: " + substr2);

        //-------------
        /**
         * expected output> UPPER CASing of String
         */
        System.out.println(sentence.toUpperCase());

        //-------------
        /**
         * expected output> LOWER CASing of String
         */
        System.out.println(sentence.toLowerCase());

        //-------------
        /**
         * expected output>
         */
        System.out.println(sentence.valueOf("tie"));

        System.out.println(555);
        String s = String.valueOf(123);
        System.out.println(s);

        System.out.println();
        System.out.println("-------------");

        //-------------
        System.out.println("calling functions from Lecture 5");
        System.out.println("-------------");
        //-------------

        int p_Janci = numberOfWords_JanciSvantner(sentence);
        int p_Ivan = numberOfWordsInString_Ivan(sentence);

        int p2_Janci = numberOfWords_JanciSvantner(sentence2);
        int p2_Ivan = numberOfWordsInString_Ivan(sentence2);
        System.out.println("The sentence length is: " + sentence.length());
        System.out.println("The sentence is: \""+sentence+"\"");
        System.out.println("Number of word in sentence is /*Janci Method*/: "+p_Janci);
        System.out.println("Number of word in sentence is /*Ivan Method*/: "+p_Ivan);

        System.out.println("Number of word in sentence2 is /*Janci Method*/: "+p2_Janci);
        System.out.println("Number of word in sentence2 is /*Ivan Method*/: "+p2_Ivan);

        System.out.println("The sentence without Interpunction is : \""+ deleteInterpunction(sentence)+"\"");

    }
}
