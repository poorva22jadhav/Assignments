class SubArrayZeroSum{
      public static void main(String args[]){
             int ar1[]=new int[]{4,2,0,1,6};
             int size=ar1.length;
             System.out.println(BruteForce(ar1,size));
                 }
             
             static String BruteForce(int ar1[],int size){
                    for(int i=0;i<size;i++){
                    int sum=0;
                        for(int j=i;j<size;j++){
                            sum=sum+ar1[j];
                            if(sum==0){
                               return "Yes";
                            }
                          }
                        }

                    return "No";
                 }

         
                     

             
             
              }

                    