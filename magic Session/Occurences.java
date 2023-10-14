class Occurences{
        public static void main(String args[]){
               int ar1[]={1,3,5,5,5,5,67,123,125};
               int size=ar1.length;
               int target=67;
               BruteForce(ar1,size,target);
               }

               static void BruteForce(int ar1[],int size,int target){
                      int firstOccurence=0;
                      int lastOccurence=0;
                      for(int i=0;i<size;i++){
                         if(ar1[i]==target){
                           firstOccurence=i;
                           break;
                           }
                        }

                      for(int i=size-1;i>=0;i--){
                         if(ar1[i]==target){
                           lastOccurence=i;
                           break;
                           }
                        }


                  System.out.println(firstOccurence);
                   System.out.println(lastOccurence);

                    }
                 }
                      