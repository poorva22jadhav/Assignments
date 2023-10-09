class InsertionPosition{
      public static void main(String args[]){
             int ar1[]={1,3,5,6,9,10,12,14};
             int size=ar1.length;
             int target=11;
             System.out.println(InsertPosition(ar1,size,target));
             //System.out.println(BinarySearchApproach(ar1,size,target));
             }
     static int InsertPosition(int ar1[],int size,int target){
            for(int i=0;i<size;i++){
                if(ar1[i]==target){
                   return i;
                  }
                if(target==ar1[i]+1){
                   return i+1;
                   }

                if(target==ar1[i]-1){
                   return i-1;
                  }
               }
           return -1;
            }

    static int BinarySearchApproach(int ar1[],int size,int target){
          
        int start = 0;
        int end=size-1;

        while (start<=end) {
            int mid=(start+end)/2;          

            if (ar1[mid] ==target) {
                return mid;}
            if (ar1[mid]<target) {
                end = mid+1;}
            if(ar1[mid]>target) {
                end = mid-1;
            }
        }

        return end;
    }
}