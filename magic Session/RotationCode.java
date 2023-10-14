import java.util.*;
class Rotation{
      public static void main(String args[]){
             int ar1[]=new int[]{1,2,3,4,5,6,7,8,9,20};
             int R=2;
             int size=ar1.length;
             BruteForce(ar1,size,R);
             }

              static void BruteForce(int ar1[],int size,int R){
                     ArrayList<Integer> ar=new ArrayList<>();
                     int ar2[]=new int[size];
                     int temp=R;
                     
                     for(int i=temp;i<size;i++){
                         ar.add(ar1[i]);
                        }
 
                     for(int j=0;j<R;j++){
                         ar.add(ar1[j]);
                        }
                   
                     for(int i=0;i<size;i++){
                        ar2[i]=ar.get(i);
                        }

                     
                    
                 }
          }
                     