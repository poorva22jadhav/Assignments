import java.util.*;
class SubArraySum{
      public static void main(String args[]){
             int ar1[]={1,2,3,4,5};
             int size=ar1.length;
             int sum=9;
             System.out.println(Bruteforce(ar1,size,sum));
             optimized(ar1,size,sum);
             }

     static ArrayList<Integer> Bruteforce(int ar1[],int size,int s){
              ArrayList<Integer> ar=new ArrayList<>();
               for(int i=0;i<size;i++){
                  int sum=0;
                   for(int j=i;j<size;j++){
                       sum=sum+ar1[j];
                       if(s==sum){
                          ar.add(i+1);
                          ar.add(j+1);
                          return ar;
                          
                          }
                       }              
                  }

                 ar.add(-1);
                 ar.add(-1);
                 return ar;                          

               }                              

              }
                   

  
          }


          
                        