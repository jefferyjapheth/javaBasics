
class Hello {

    public static void main(String[] arguments){
        /*String foo;
        foo = "IAP 6.092";
        System.out.println("Hello World");
        System.out.println(foo);
        foo = "Something else";
        System.out.println(foo);*/

        //StringBuffer can be altered -mutable
        //String cannot be altered -immutable
        StringBuffer sb = new StringBuffer("uni");
        System.out.println(sb);
        StringBuffer sb1 = new StringBuffer("Intelligent person");
        StringBuffer sb2 = new StringBuffer("University");
        StringBuffer sb3 = new StringBuffer("High cost\n");

        //StringBuffer methods
        sb.append("versity"); //adds the string versity to uni to form university
        System.out.println(sb);
        sb1.insert(11, " young");//inserts young from the 11th index of the StringBuffer sb1
        System.out.println(sb1);
        sb2.delete(0,3);//deletes indices 0,1,2 NB: 3 is not deleted
        System.out.println(sb2);
        sb3.replace(0,4,"low");//replaces from index 0 to 4
        System.out.print(sb3);
        sb3.reverse();//reverses the StringBuffer sb3
        System.out.println(sb3.length());// displays the length of the StringBuffer sb3
        //toString() converts StringBuffer to a String class
        //indexof(str) finds the index of a string in the StringBuffer
        //lastindexof(str) finds the last index of the

        //String methods
        //charAt(i) returns the character in the specified index/position-i
        String s = "window";
        char ch;
        ch = s.charAt(2);
        System.out.println("Character is : "+ch);
        //compareTo() compares 2 strings lexicographically, case-sensitive
        String s1 ="box", s2 = "box";
        int a = s1.compareTo(s2);
        System.out.println(a);
        //compareToIgnoreCase() is similar to compareTo() but it's case insensitive

        //Concantenation
        String word1 = "re", word2 = "think", word3;
        word3 = word1.concat(word2);
        System.out.println(word3);
        //equals() method gives a boolean after comapring two variables, it is case-sensitive
        String o1 = "Hello", o2 = "world", o3 = "hello";
        System.out.println(o1.equals(o2));
        System.out.println(o1.equals(o3));
        System.out.println("Hello".equals(o1));
        //equalsIgnoreCase() is similar to equals() but it is case-insensitive
        //getchars(int i1,int i2, char arr[], int i3)
        String k = "batman";
        char arr[] = new char[20];
        k.getChars(3,6,arr,0);
        System.out.println(arr);
        /*String[] split(delimeter) method splits the entire string based on delimeter
        if your delimeter is a comma or space, it'll break the string after every comma or space
         */
        String str = "This is a Java program";
        String l[];
        l = str.split(" ");
        for(int i=0; i<l.length;i++){
            System.out.println(l[i]);
        }

        //String Comparison Concepts
        //Relational operators <,>,<=,>=,==,!=
        String p1 = "Hello"; //this is a different object
        String p2 = new String("Hello"); //this is a different object,this means different pointers
        if(p1==p2) /*using equal sign compares the pointers assigned to the objects not
             the objects themselves unlike the equals method*/
            System.out.println("Both Strings are same");
        else
            System.out.println("Both Strings are not same");
        /*if String p1= "Hello":
        String p2 = "Hello"; p1 and p2 will have the same pointer in the String constant pool
        since they're the same object*/
        //Substring method returns part of the string by copying existing characters of a given string
        //Syntax:
        String subs = word2.substring(2,5); //word2 is on line 49
        System.out.println(subs);
        //toLowerCase() and toUpperCase() as their names imply
        //trim() is used to remove leading or trailing whitespaces from the string
        String word = "     Hello world       ";
        System.out.println(word);
        String sn = word.trim();
        System.out.println(sn);

        //Counting the number of vowels and consonants from a given String
        String vtr = "This is a Java program";
        int c1 = 0, c2=0;
        vtr = vtr.toLowerCase();
        for(i=0;i<vtr.length();i++){
            if (vtr.charAt(i)=='a'||vtr.charAt(i)== 'e'||vtr.charAt(i)== 'i'||
                    vtr.charAt(i)== 'o'||vtr.charAt(i)== 'u')
            c1++;
            else if(vtr.charAt(i)>= 'a' && vtr.charAt(i) <= 'z' )
                c2++;
            System.out.println(c1);
            System.out.println(c2);
        }






    }
}