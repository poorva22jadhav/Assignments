class minimumSubArray{
      public static void main(String args[]){
             int ar1[]={2,6,8,1,4};
             int size=ar1.length;
             
             Bruteforce(ar1,size);
             }
      static void Bruteforce(int ar1[],int size){
             int min=Integer.MAX_VALUE;
             int minSum=0;
              for(int i=0;i<size;i++){
                  minSum=0;
                  for(int j=i;j<size;j++){
                     minSum=minSum+ar1[j];
                     if(minSum<min){
                        min=minSum;
                       }
                    }
               }

               System.out.println(min);
           }
         }
                      