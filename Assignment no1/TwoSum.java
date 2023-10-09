import java.util.*;
class TwoSumProblem{
      public static void main(String args[]){
             int ar1[]={3,3};
             int target=6;
             //TwoSum(ar1,target);
             TwoSum2(ar1,target);
             }
      static void TwoSum(int ar1[],int target){
             ArrayList<Integer> ar=new ArrayList<>();
             for(int i=0;i<ar1.length;i++){
                 for(int j=i+1;j<ar1.length;j++){
                    if(ar1[i]+ar1[j]==target){
                       ar.add(i);
                       ar.add(j);
                      }
                    }
               }
             System.out.println(ar);
           }

     static void TwoSum2(int ar1[],int target){
            HashMap<Integer,Integer> hs=new HashMap<>();
            ArrayList<Integer> ar=new ArrayList<>();
            int diff=0;
            for(int i=0;i<ar1.length;i++){
                diff=target-ar1[i];
                if(hs.containsKey(diff)){
                   ar.add(hs.get(diff));
                   ar.add(i);
                   break;
                  }
                else{
                   hs.put(ar1[i],i);
                    }
               }

            System.out.println(ar);
            }
                
        }
                       