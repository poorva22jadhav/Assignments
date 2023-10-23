class MaximumProduct{
      public static void main(String args[]){
             int ar1[]={2,3,4,5,-1,0};
             MaxiProduct(ar1);
             }

      static void MaxiProduct(int ar1[]){
             int max=Integer.MIN_VALUE;
             for(int i=0;i<ar1.length;i++){
                 int product=1;
                 for(int j=i;j<ar1.length;j++){
                     product=product*ar1[j];
                     if(product>max){
                        max=product;
                       }
                    }
                 }

             System.out.println(max);
           
            }
         }
                   