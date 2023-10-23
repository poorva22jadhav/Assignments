class ReverseSubArray{
      public static void main(String args[]){
             int ar1[]={1,6,7,4};
         
             int left=1;
             int right=4;
             BruteForce(ar1,left,right);
             }
 
      static void Optimized(int ar1[],int L,int R){
               L=L-1;
               R=R-1;

             while(L<R){
              int temp=ar1[L];
              ar1[L]=ar1[R];
              ar1[R]=temp;
              L++;
              R--;
         
              }

            for(int element: ar1){
               System.out.println(element);
              }

           }

      }
                
             
             
             