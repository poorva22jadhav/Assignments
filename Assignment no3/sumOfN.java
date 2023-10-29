class sumOfN{
      public static void main(String args[]){
            int N=1;
            int M=10;
            
            int sum=0;
            System.out.println(recursion(N,sum));
            System.out.println(recursion2(M));
            }

      static int recursion(int N,int sum){
             sum=sum+N;
             if(N==10){
                return sum;
                }

            
            return recursion(++N,sum);
             
                 }


     static int recursion2(int N){
            if(N==0){
               return 0;
              }

            return N+recursion2(--N);

             }
            
             }
               
              
            