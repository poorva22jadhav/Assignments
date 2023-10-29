class StrictlyIncreasingSubArray{
      public static void main(String args[]){
             int ar1[]=new int[]{ 1,2,2,4};
             
             Contiguous(ar1);
             }

     static void Contiguous(int ar1[]){
            int max=Integer.MIN_VALUE;
            for(int i=0;i<ar1.length;i++){
                 int sum=ar1[i];
                 
                for(int j=i+1;j<ar1.length;j++){

                    if(ar1[j]>ar1[j-1]){
                       sum=sum+ar1[j];   
                    }

                    if(sum>max){
                       max=sum;
                     }

                    else{
                         break;
                        }
                 }
                   
                 
             }

              System.out.println(max);
          }
        }
                    
            