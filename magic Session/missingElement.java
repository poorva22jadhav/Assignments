import java.util.*;
class MissingElement{
      public static void main(String args[]){
             int ar1[]=new int[]{6,1,2,8,3,4,5,7,10};
             int size=ar1.length;
             int N=10;
             MissingEle(ar1,size,N);
             }
      
      static void MissingEle(int ar1[],int size,int N){
             HashMap<Integer,Integer>hm=new HashMap<>();
             
             for(int i=0;i<size;i++){
                 hm.put(ar1[i],i);
                 }

             for(int i=1;i<=N;i++){
                 if(!hm.containsKey(i)){
                    System.out.println(i);
                   }
               }
            }
       }

              