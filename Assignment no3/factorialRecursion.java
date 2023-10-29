class factorial{
      public static void main(String args[]){
             int N=6;
             int mult=1;
             approach1(N);
             System.out.println(recursion(N,mult));
             System.out.println(recursion2(N));
             }

      static void approach1(int N){
             int mult=1;
             for(int i=1;i<=N;i++){
                mult=mult*i;
              }

             System.out.println(mult);
             }

      static int recursion(int N,int mult){
             if(N==1){
                return mult;
               }
            mult=mult*N;

            return recursion(--N,mult);
         }

   static int recursion2(int N){
          if(N==0){
             return 1;
            }

         return N*recursion2(--N);

       }
     }