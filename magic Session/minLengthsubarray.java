class minimalLengthSubArray{
      public static void main(String args[]){
             int ar1[]=new int[]{2,3,1,2,4,3};
             int target=7;
             int size=ar1.length;
             System.out.println(Bruteforce(ar1,target,size));
             }
     static int Bruteforce(int ar1[],int target,int size){
                int min=Integer.MAX_VALUE;
                int sum=0;
                for(int i=0;i<size;i++){
                    sum=0;
                    for(int j=i;j<size;j++){
                        sum=sum+ar1[j];
                        if(sum==target){
                          int newLength=j-i+1;
                               if(newLength<min){
                                  min=newLength;
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
                        