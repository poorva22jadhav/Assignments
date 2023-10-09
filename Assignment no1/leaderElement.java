import java.util.*;
class LeaderElements{
      public static void main(String args[]){
             int ar1[]=new int[]{5,4};
             int size=ar1.length;
             leaderBruteforce(ar1,size);
             System.out.println("*****");
             leaderOptimized(ar1,size);
             }
     static void leaderBruteforce(int ar1[],int size){
            ArrayList<Integer> ar=new ArrayList<Integer>();
            for(int i=0;i<size;i++){
                for(int j=i+1;j<size;j++){
                   if(ar1[i]<ar1[j]){
                      break;
                     }
                   if(j==size-1){
                       ar.add(ar1[i]);
                     }
                   }
               
               }
           ar.add(ar1[size-1]);
           System.out.println(ar);
            }


     static void leaderOptimized(int ar1[],int size){
            ArrayList<Integer> ar=new ArrayList<Integer>();
            int rightMax=ar1[size-1];
            ar.add(rightMax);
            for(int i=size-2;i>=0;i--){
               if(ar1[i]>rightMax){
                 rightMax=ar1[i];
                 ar.add(rightMax);
                 }
              }

             System.out.println(ar);
          }     
            
         }
                