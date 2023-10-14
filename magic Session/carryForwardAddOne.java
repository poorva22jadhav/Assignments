class carryForwardAddingOne{
      public static void main(String args[]){
             int ar1[]=new int[]{9,9,9};
             int size=ar1.length;
             int ar2[]=carryForward(ar1,size);

             for(int element:ar2){
                 System.out.println(element);
               }
          }
    
      static  int[] carryForward(int[] ar1,int size) {
             
               for(int n=size-1;n>=0;n--){
                   if(ar1[n]==9){
                      ar1[n]=0;
                      }
                   else{
                        ar1[n]=ar1[n]+1;
                        return ar1;
                       }
                   }
      
        int[] ar2 = new int[size + 1];
        ar2[0] = 1;
        return ar2;
    }
}

                        
                      