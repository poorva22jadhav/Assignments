class SmallestSubArray{
      public static void main(String args[]){
              int ar1[]=new int[]{1,10,5,2,7};
              int x=9;
              int size=ar1.length;
              System.out.println(BruteForce(ar1,size,x));
            }

     static int BruteForce(int ar1[],int size,int x){
            int min=Integer.MAX_VALUE;
            int length=0;
            
            
            for(int i=0;i<size;i++){
                int sum=0;
                for(int j=i;j<size;j++){
                   sum=sum+ar1[j];
                   if(sum>x){
                      length=j-i+1;
                      if(length<min){
                        min=length;
                       }
                     }
                   }
                }
             
           if(min==Integer.MAX_VALUE){
              return 0;
              }
           else{
               return min;
              }
            
          }
      }
               