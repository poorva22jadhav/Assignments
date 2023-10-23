class MaximumContiguousSubArray{
      public static void main(String args[]){
             int ar1[]=new int[]{ 1,2,3,1,4,5,2,3,6};
             int k=4;
             Contiguous(ar1,k);
             }

     static void Contiguous(int ar1[],int k){
           
            for(int i=0;i<=ar1.length-k;i++){
                 int max=Integer.MIN_VALUE;
                for(int j=i;j<i+k && j<ar1.length;j++){
                    if(ar1[j]>max){
                       max=ar1[j];
                       }
                    }
            
               System.out.println(max);
                   
                 
             }
          }
        }
                    
            