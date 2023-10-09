class InPlacePrefixSum{
      public static void main(String args[]){
             int ar1[]={4,3,2};
             int size=ar1.length;
             InPlacePreSum(ar1,size);
             }

      static void InPlacePreSum(int ar1[],int size){
             
             for(int i=1;i<size;i++){
                 ar1[i]=ar1[i-1]+ar1[i];
                 }

              for(int element:ar1){
                 System.out.println(element);
                 }
              }
         }