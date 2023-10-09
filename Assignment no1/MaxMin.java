class MaxMin{
      public static void main(String args[]){
             int ar1[]=new int[]{1,3,4,1};
             int size=ar1.length;
             System.out.println(MaxMinSum(ar1,size));
             }

      static int MaxMinSum(int ar1[],int size){
             int max=Integer.MIN_VALUE;
             int min=Integer.MAX_VALUE;
             for(int i=0;i<size;i++){
                if(ar1[i]>max){
                   max=ar1[i];
                   }
                 }
             for(int j=0;j<size;j++){
                 if(ar1[j]<min){
                    min=ar1[j];
                    }
               }

            return max+min;
           }
       }
            