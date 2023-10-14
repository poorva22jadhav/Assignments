class maxProductSubArray{
     public static void main(String args[]){
            int ar1[]=new int[]{2,3,4,5,-1,0};
            int size=ar1.length;
            System.out.println(BruteForce(ar1,size));
            }
            
           static int BruteForce(int ar1[],int size){
                   int maxProduct=1;
                   int max=Integer.MIN_VALUE;
                   
                   for(int i=0;i<size;i++){
                       maxProduct=1;
                       for(int j=i;j<size;j++){
                          maxProduct=maxProduct*ar1[j];
                          if(maxProduct>max){
                             max=maxProduct;
                            }
                          }
                    }
                 
                   return max;
                }
            }