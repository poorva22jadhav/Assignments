class printNumbers{
      public static void main(String args[]){
             int N=1;
             printNum(N);
             approach1(N);
             }


     static void approach1(int N){
            for(int i=N;i<11;i++){
               System.out.println(i);
              }
            }

      static void printNum(int N){
              if(N==11){
                return;
                }

              System.out.println(N);
              printNum(++N);
              }
           }
             