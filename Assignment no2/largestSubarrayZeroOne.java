import java.util.*;
class largestSubArrayZeroOne{
      public static void main(String args[]){
             int ar1[]={1,0,0,0,0};
             int size=ar1.length;
            
             Bruteforce(ar1,size);
             Optimized(ar1,size);
             }

     static void Bruteforce(int ar1[],int size){
            int count=0;
            int count1=0;
            int max=Integer.MIN_VALUE;
            int length=Integer.MIN_VALUE;
            for(int i=0;i<size;i++){
                  count=0;
                  count1=0;
                for(int j=i;j<size;j++){
                    if(ar1[j]==0){
                       count++;
                       }
                    if(ar1[j]==1){
                       count1++;
                         }
            
                   if(count==count1){
                    length=j-i+1;
                           if(length>max){
                               max=length;
                              }
                          
                         }

                  
                }
            }

            System.out.println(max);
                        
               }


     static void Optimized(int ar1[],int size){
             int count=0;
             int count1=0;
             int max=Integer.MIN_VALUE;

             for(int i=0;i<size;i++){
                 if(ar1[i]==0){
                    count++;
                   }

                 if(ar1[i]==1){
                   count1++;
                  }
              }

            if(count==count1){
              max=count+count1;
               }


          else if(count!=0 && count1>count){
                  max=2*count;
                 }
         else if(count1!=0 && count>count1){
                 max=2*count1;
                }

         System.out.println(max);

            }
                    
 
          }