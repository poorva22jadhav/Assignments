class productArray{
     public static void main(String args[]){
             int ar1[]=new int[]{5,1,10,1}; 
             int size=ar1.length; 
             productArray(ar1,size);
             System.out.println("*********");
             int ar2[]=productArray2(ar1,size);
             for(int element:ar2){
                System.out.println(element);
               }
             }
     static void productArray(int ar1[],int size){
            int ar2[]=new int[size];
            
            for(int i=0;i<size;i++){
                int product=1;
                for(int j=0;j<size;j++){
                    if(ar1[j]!=ar1[i]){
                       product=product*ar1[j];
                       }
                     }
                ar2[i]=product;
                   
               }

            for(int element:ar2){
                System.out.println(element);
               } 
          
             }


   static int[] productArray2(int ar1[],int size){

          int[] leftProducts = new int[size];
        int[] rightProducts = new int[size];
        int[] result = new int[size];
          leftProducts[0] = 1;
        for (int i = 1; i < size; i++) {
            leftProducts[i] = leftProducts[i - 1] * ar1[i - 1];
        }

       
        rightProducts[size - 1] = 1;
        for (int i = size - 2; i >= 0; i--) {
            rightProducts[i] = rightProducts[i + 1] * ar1[i + 1];
        }

        
        for (int i = 0; i < size; i++) {
            result[i] = leftProducts[i] * rightProducts[i];
        }

        return result;
    } 
           
         }