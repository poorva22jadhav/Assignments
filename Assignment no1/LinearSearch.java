class LinearSearch{
      public static void main(String args[]){
             int ar1[]={1,2,2,3,4,1,3,2};
             int size=ar1.length;
             int target=2;
             System.out.println(MultipleOccurences(ar1,size,target));
             }
      
      static int MultipleOccurences(int ar1[],int size,int target){
             int count=0;
             for(int i=0;i<size;i++){
                 if(ar1[i]==target){
                    count++;
                    }
                 }
             return count;
             }
        }
             