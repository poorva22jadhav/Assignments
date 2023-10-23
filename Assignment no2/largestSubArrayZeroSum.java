class largestSubArray{
      public static void main(String args[]){
              int ar1[]=new int[]{15,-2,2,-8,1,7,10,23};
              int size=ar1.length;
              System.out.println(BruteForce(ar1,size));
            }

     static int BruteForce(int ar1[],int size){
            int max=Integer.MIN_VALUE;
            int length=0;
            
            
            for(int i=0;i<size;i++){
                int sum=0;
                for(int j=i;j<size;j++){
                   sum=sum+ar1[j];
                   if(sum==0){
                      length=j-i+1;
                      if(length>max){
                        max=length;
                       }
                     }
                   }
                }

            return max;
          }
      }
               