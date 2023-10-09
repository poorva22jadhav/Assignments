class RangeSumArray{
      public static void main(String args[]){
             int ar1[]=new int[]{2,2,2};
             int ar2[][]=new int[][]{{0,0},{1,2}};
             int size=ar1.length;
             RangeSumArrayBruteForce(ar1,ar2);
             }

      static void RangeSumArrayBruteForce(int ar1[],int ar2[][]){
             int start=0;
             int end=0;
             
             int ar3[]=new int[ar2.length];
             for(int i=0;i<ar2.length;i++){
                 int sum=0;
                 for(int j=0;j<ar2[i].length;j++){
                     if(j%2==0){
                        start=ar2[i][j];
                       }
                     else{
                        end=ar2[i][j];
                          }
                    }
             
                for(int j=start;j<=end;j++){
                    sum=sum+ar1[j];
                    } 
                ar3[i]=sum; 

                
              }
              
             for(int element:ar3){
                System.out.println(element);
                }
           

                  
             }


        static void RangeSumOptimized(int ar1[],int ar2[][]){
               int rangeSum[]=new int[ar1.length];
               rangeSum[0]=ar1[0];

              
               for(int k=1;k<rangeSum.length;k++){
                   rangeSum[k]=rangeSum[k-1]+ar1[k];
                  }

               for(int i=0;i<ar2.length;i++){
                 int sum=0;
                 for(int j=0;j<ar2[i].length;j++){
                     if(j%2==0){
                        start=ar2[i][j];
                       }
                     else{
                        end=ar2[i][j];
                          }
                    }

                 for(int l=start;l<=end;)

            }
               
         }
             