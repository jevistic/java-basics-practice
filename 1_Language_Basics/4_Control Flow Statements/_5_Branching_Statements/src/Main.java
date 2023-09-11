public class Main {
    public static void main(String[] args) {
        System.out.println("Branching Statements");

        //Break statement

       // example 1
        int[] arrayOfInts = { 32, 87, 3, 589, 12, 1076, 2000, 8, 622, 127 };
        int searchfor = 12;

        int i;
        boolean foundIt = false;

        for (i = 0; i < arrayOfInts.length; i++) {
            if (arrayOfInts[i] == searchfor) {
                foundIt = true;
                break;  //unlabeled break
            }
        }

        if (foundIt) {
            System.out.println("Found " + searchfor + " at index " + i);
        }
        else {
            System.out.println(searchfor + " not in the array");
        }


        //example 2

        int[][] arrayOfInts2D = {
                { 32, 87, 3, 589 },
                { 12, 1076, 2000, 8 },
                { 622, 127, 77, 955 }
        };
        searchfor = 12;

        int j = 0;
        foundIt = false;

        search:
        for (i = 0; i < arrayOfInts2D.length; i++) {
            for (j = 0; j < arrayOfInts2D[i].length; j++) {
                if (arrayOfInts2D[i][j] == searchfor) {
                    foundIt = true;
                    break search;  //labelled break
                }
            }
        }

        if (foundIt) {
            System.out.println("Found " + searchfor + " at " + i + ", " + j);
        } else {
            System.out.println(searchfor + " not in the array");
        }




        //Continue Statement

        //example 1
        String searchMe = "peter piper picked a peck of pickled peppers pppp";
        int max = searchMe.length();
        int numPs = 0;

        for (i = 0; i < max; i++) {
            if (searchMe.charAt(i) != 'p')
                continue;  //unlabeled continue

            numPs++;
        }
        System.out.println("Found " + numPs + " p's in the string.");


        //example 2
        searchMe = "Look for a substring in me";
        String substring = "sub";
        foundIt = false;

        max = searchMe.length() -  substring.length();

        test:
        for (i = 0; i <= max; i++) {
            int n = substring.length();
            j = i;
            int k = 0;
            while (n-- != 0) {
                if (searchMe.charAt(j++) != substring.charAt(k++)) {
                    continue test; //labelled continue
                }
            }
            foundIt = true;
            break test;  //labelled break
        }
        System.out.println(foundIt ? "Found it" : "Didn't find it");

    }
}