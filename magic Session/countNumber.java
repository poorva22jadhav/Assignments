class CountNum{
      public static void main(String args[]){
              int ar1[]=new int[]{1,2,3};
              int size=ar1.length;
              System.out.println(BruteForce(ar1,size));
              }

              static int BruteForce(int ar1[],int size){
                     int count=0;
                     for(int i=0;i<size;i++){
                        for(int j=i;j<size;j++){
                            count++;
                           }
                      }

                    return count;
                 }
             }