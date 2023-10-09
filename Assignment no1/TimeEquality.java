class TimeEquality{
      public static void main(String args[]){
             int ar1[]={2,4,1,3,2};
             int size=ar1.length;
             System.out.println(TimeToEquality(ar1,size));
             }
     static int TimeToEquality(int ar1[],int size){
             int max=Integer.MIN_VALUE;
             int diff=0;
             for(int i=0;i<size;i++){
                if(ar1[i]>max){
                   max=ar1[i];
                  }
               }
         
             for(int i=0;i<size;i++){
                diff=diff+max-ar1[i];
                ar1[i]=(max-ar1[i])+ar1[i]; 
                }

            return diff;

             
         }
   }