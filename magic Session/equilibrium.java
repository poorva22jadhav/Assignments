class equilibrium{
      public static void main(String args[]){
             int ar1[]=new int[]{9};
             int size=ar1.length;
             System.out.println(BruteForce(ar1,size));
             }
        
      static int BruteForce(int ar1[],int size){
             int preFixSum[]=new int[size];
             preFixSum[0]=ar1[0];

             if(size==1){
               return ar1[0];
               }

             for(int i=1;i<size;i++){
                 preFixSum[i]=preFixSum[i-1]+ar1[i];
                }

            for(int i=1;i<size;i++){
                if(preFixSum[i-1]==(preFixSum[size-1]-preFixSum[i])){
                   return i+1;
                  }
               }

           return -1;
          }
      }