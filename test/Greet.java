/*
Big Apples (Weichen Liu + Blueface, Jeffrey Tang + , Lior + )
APCS
HW34 -- Looping to find the index and frequency of a string
2021-11-13
time spent: .8 hours


DISCO
- 

QCC
-
*/

  import java.lang.Math;

  public class Greet {

    public static int[] arrayRandInts(int size) {
      int[] randInts = new int[size];
      for (int x = 0 ; x < size ; x += 1) {
        randInts[x] = (int)(Math.random() * 10);
      }
      return randInts;
    }


    public static String strArrayInts(int[] intArray) {
      String out = ("{" + intArray[0]);
      for (int x = 1 ; x < intArray.length ; x += 1) {
        out += ", " + intArray[x];
      }
      out += "}";
      return out;
    }


    public static int linSearch(int[] a, int target) {
      for (int x = 0 ; x < a.length ; x += 1) {
        if (a[x] == target) {
          return x;
        }
      }
      return -1;
    }


    public static int linSearchR(int[] a, int target) {
      return helperSearchR(a , target, 0);
  }

   public static int helperSearchR(int[] a, int target, int counter) {
     if (counter == a.length) { // returns -1 if target was not found in array
       return -1;
     }
     else if (a[counter] == target) {
       return counter; // returns  counter if target was found in array
     }
     else {
       return helperSearchR(a, target, counter + 1); // recursion continues until target is found, or the array is completely parsed through
     }
   }

    public static int freq( int[] a, int target ) {
      int answer = 0;
      int counter = 0;
      while (counter < a.length - 1) {
        if (a[counter] == target) {
          answer ++;
        }
        counter ++;
      }
      return answer;
    }

    public static int freqR( int[] a, int target) {
      return helperFreqR(a, target, 0, 0);
    }

    public static int helperFreqR(int[] a, int target, int counter, int freq) {
      if (counter == a.length) {
        return freq;
      } else {
        if (a[counter] == target) {
          return helperFreqR(a, target, counter + 1, freq + 1);
        }
        return helperFreqR(a, target, counter + 1, freq);
      }
    }


    public static void main(String[] args) {
      int[] local = arrayRandInts(5);
      System.out.println("Testing printing the string: " + strArrayInts(local));
      System.out.println("Testing looking for an index of an int(5) in the string: " + linSearch(local, 5));
      System.out.println("Testing looking for an index of an int(5) in the string using recursion: " + linSearchR(local, 5));
      System.out.println("Testing looking for a frequency of an int(5) in the string: " + freq(local, 5));
      System.out.println("Testing looking for a frequency of an int(5) in the string using recursion: " + freqR(local, 5));
    }
}
