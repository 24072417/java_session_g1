public class Day5_loop{
    public static void main(String args []){
        System.out.println("mujju");
    
   for(int i=20; i<=35;i++){
        System.out.println(i);
    }
    for(int j=11;j<=19;j++){
        if(j%2==0){
             System.out.println(j);
       }

    }
    }
}
//Given a string and a non-negative int n, we'll say that the front 
//of the string is the first 3 chars, or whatever is there 
//if the string is less than length 3. Return n copies of the front;

// frontTimes("Chocolate", 2) → "ChoCho"
// frontTimes("Chocolate", 3) → "ChoChoCho"
// frontTimes("Abc", 3) → "AbcAbcAbc"
// public String frontTimes(String str, int n) {
//     String s2="";
//     int end=3;
//     if(str.length()<3){
//       end=str.length();
//     }
    
//     String front=str.substring(0,end);
//     for(int i=0;i<n;i++){
//       s2=front+s2;
//     }
//     return s2;
//   }


// Given a string and a non-negative int n, return a larger string that is n copies of the original string.


// stringTimes("Hi", 2) → "HiHi"
// stringTimes("Hi", 3) → "HiHiHi"
// stringTimes("Hi", 1) → "Hi"
// public String stringTimes(String str, int n) {
//     String s1="";
//     for(int i=0;i<n;i++){
//       s1=s1+str;
//     }
//    return s1;
//   }
  