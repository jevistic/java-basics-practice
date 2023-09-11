import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        System.out.println();
        System.out.println("Strings");

        String hello = "Hello World!";
        System.out.println(hello);

        String hello1;
//        System.out.println(hello1); //can't access without initialization
        hello1 = new String("This is Strings Practice");
        System.out.println(hello1);

        char[] charArr = {'j', 'a', 'v', 'e', 'd'};
        String name = new String(charArr);
        System.out.println(charArr);


        //String.length()    &&    String.charAt()
        String palindrome = "Dot saw I was Tod";
        int len = palindrome.length();
        System.out.println("Length: "+ len);


        //Reversing palindrome
        char[] tempCharArray = new char[len];
        char[] charArray = new char[len];

        // put original string in an array of chars
//        for (int i = 0; i < len; i++) {
//            tempCharArray[i] = palindrome.charAt(i);
//        }

        //getChars
        palindrome.getChars(0, len, tempCharArray, 0 );

        // Now reverse array of chars
        int i =0;
        for (int j = len-1; j >=0; j--) {
            charArray[i] = tempCharArray[j];
            i++;
        }

        String reversePalindrome = new String(charArray);
        System.out.println("Original: " + palindrome);
        System.out.println("Reversed: " + reversePalindrome);


        //concat  equals
        String s1 = "My name is :";
        String s2 = " Javed";

        boolean equals = s1.equals(s2);
        boolean equals1 = s1==s2;
        System.out.println(equals);
        System.out.println(equals1);

        String s3 = s1+s2;
        String s4 = s1.concat(s2);
        System.out.println(s3);
        System.out.println(s4);


        //printf
        float floatVar = 43.3f;
        int intVar = 43;
        String stringVar = "Hello World";
        System.out.printf("The value of the float variable is %f, while the value of the integer variable is %d, and the string is %s",
                floatVar, intVar, stringVar);

        System.out.println();
        String fs;
        fs = String.format("The value of the float variable is %f, while the value of the integer variable is %d, and the string is %s",
                floatVar, intVar, stringVar);
        System.out.println(fs);



        //Converting String to Numbers

        String a = "23";
        String b = "45.34f";

        int aInt = Integer.valueOf(a);
        System.out.println(aInt);

        float bFloat = Float.valueOf(b);
        System.out.println(bFloat);

        System.out.println("a+b : " + (aInt+bFloat));


        //Converting Numbers to Strings

        int x = 123;
        s1 = "" + x;
        System.out.println(s1);

        //valueOf
        s2 = String.valueOf(x);
        System.out.println(s2);

        //toString
        int c = 0;
        double d = 912.46;
        s3 = Integer.toString(i);
        s4 = Double.toString(d);
        System.out.println(s3);
        System.out.println(s4);


        int dot = s4.indexOf('.');
        System.out.println(dot + " digits before decimal point.");
        System.out.println( (s4.length() - dot - 1) + " digits after decimal point.");


        //String Manipulation

        //Substring 1
        String anotherPalindrome = "Niagara. O roar again!";
        String roar = anotherPalindrome.substring(11, 15);
        System.out.println(roar);

        //Substring2
        roar = anotherPalindrome.substring(11);
        System.out.println(roar);


        //Split
        String[] splitTest = anotherPalindrome.split(" ");
        System.out.println(splitTest.length);
        for(String s: splitTest){
            System.out.print(s+",");
        }


        //trim
        anotherPalindrome = "   Niagara. O roar again!   ";
        s1 = anotherPalindrome.trim();
        System.out.println();
        System.out.println("Trimmed: "+ s1);

        System.out.println();

        //toUpperCase   toLowerCase
        s1 = s1.toUpperCase();
        System.out.println(s1);

        s1 = s1.toLowerCase();
        System.out.println(s1);

        //indexOf
        int ind = s1.indexOf('b');
        System.out.println("Index of b: "+ ind);

        ind = s1.indexOf('n', 6);
        System.out.println("Index of n from index 6 : "+ ind);

        ind = s1.indexOf("gain");
        System.out.println("Index of gain: "+ ind);


        //lastIndexOf
        ind = s1.lastIndexOf('a');
        System.out.println("Last index of a: "+ ind);

        ind = s1.lastIndexOf('o', 11);
        System.out.println("Last index of o from index 11: " + ind);

        ind = s1.lastIndexOf("gain");
        System.out.println("Last index of gain: "+ ind);


        //contains
        boolean contain = s1.contains("again");
        System.out.println("s1 contains again: "+ contain);



        //replace
        s2 = s1.replace('a', 'b');
        System.out.println(s2);
        s2 = s1.replace('z', 'b');
        System.out.println(s2);

        s2 = s1.replace("ain", "hello");
        System.out.println(s2);

        s2 = s1.replaceFirst("aga", "hello");
        System.out.println(s2);

        s2 = s1.replaceAll("aga", "hello");
        System.out.println(s2);



        //example: path separator

        String fullPath = "/home/user/index.html";
        char extensionSeparator = '.';
        char pathSeparator = '/';
        System.out.println();
        System.out.println("Full Path: " + fullPath);

        //separating filename
        dot = fullPath.lastIndexOf(extensionSeparator);
        int sep = fullPath.lastIndexOf(pathSeparator);
        String filename = fullPath.substring(sep + 1, dot);
        System.out.println("Filename: "+ filename);

        //separating extension
        dot = fullPath.lastIndexOf(extensionSeparator);
        String extension = fullPath.substring(dot + 1);
        System.out.println("Extension: " + extension);

        //Separating path
        sep = fullPath.lastIndexOf(pathSeparator);
        String path = fullPath.substring(0, sep);
        System.out.println("Path: "+ path);



        //startsWith
        boolean flag = fullPath.startsWith("/");
        System.out.println("The path starts with / : " + flag);

        flag = fullPath.startsWith("/", 5);
        System.out.println("The path with offset 5 starts with / : " + flag);

        //endsWith
        flag = fullPath.endsWith("/");
        System.out.println("The path ends with / : " + flag);


        //compareTo
        s1 = "Hello";
        s2 = "hello";
        System.out.println("s1 comes before s2 : " + s1.compareTo(s2));  //outputs -32 that means true

        s1 = "hello";
        System.out.println("s1 is equal to s2 : " + s1.compareTo(s2));  //outputs 0 that means equal

        s1 = "apple";
        s2 = "banana";
        System.out.println("s1 comes before s2 : " + s1.compareTo(s2));  //outputs -1 that means true


        //equals
        System.out.println("s1 is equal to s2 : " + s1.equals(s2));

        //regionmatches
        String str1 = "Hello, world!";
        String str2 = "WORLD";
//        boolean caseSensitiveMatch = str1.regionMatches(0, str2, 0, 5);
//        boolean caseInsensitiveMatch = str1.regionMatches(true, 0, str2, 0, 5);

        boolean caseSensitiveMatch = str1.regionMatches(7, str2, 0, 5);
        boolean caseInsensitiveMatch = str1.regionMatches(true, 7, str2, 0, 5);

        System.out.println("Case-sensitive match: " + caseSensitiveMatch);
        System.out.println("Case-insensitive match: " + caseInsensitiveMatch);



        //example
        String searchMe = "Green Eggs and Ham";
        String findMe = "Eggs";
        System.out.println(searchMe.contains(findMe));

        //another way
        int searchMeLength = searchMe.length();
        int findMeLength = findMe.length();
        boolean foundIt = false;

        for (i = 0; i <= (searchMeLength - findMeLength); i++) {
            if (searchMe.regionMatches(i, findMe, 0, findMeLength)) {
                foundIt = true;
                System.out.println(searchMe.substring(i, i + findMeLength));
                break;
            }
        }
        if (!foundIt)
            System.out.println("No match found.");



        //String Builder Class

        // creates empty builder, capacity 16
        StringBuilder sb = new StringBuilder();

        // adds 9 character string at beginning
        sb.append("Greetings");
        System.out.println("Capacity: " + sb.capacity());
//        sb.setLength(40);
        System.out.println("Capacity: " + sb.capacity());
        System.out.println("Length: " + sb.length());
        System.out.println(sb);

        sb.append(true);
        sb.append('b');
        char[] ch = {'a', 'b', 'c'};
        sb.append(ch);
        System.out.println(sb);

        sb.delete(9, 13); //true will be deleted
        System.out.println(sb);

        sb.deleteCharAt(9); //b will be deleted
        System.out.println(sb);

        sb.insert(9, 45.65f);
        System.out.println(sb);

        sb.replace(9, 14, "xyz");
        System.out.println(sb);

        sb.setCharAt(13, '1');
        System.out.println(sb);

        sb = sb.reverse();
        System.out.println(sb);

        sb = sb.reverse();
        String s = sb.toString();
        System.out.println(s);

        palindrome = "Dot saw I was Tod";
        sb = new StringBuilder(palindrome);
        sb.reverse();  // reverse it
        System.out.println(sb);



        String str = new String("Welcome to JavaTpoint");
        String str1 = new String("Welcome to JavaTpoint");
        String s3 = str1;
        System.out.println(str1 == str); // prints false
        System.out.println(str.equals(str1));
        System.out.println(s3==str1);

    }
}