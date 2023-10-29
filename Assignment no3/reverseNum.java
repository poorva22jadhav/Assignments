class reverseNum{
      public static void main(String args[]){
              int N=0;
              printNum(N);
              }


      static void approach1(int N){
             for(int i=10;i>=1;i--){
                System.out.println(i);
                     }
                  }

      static void printNum(int N){
             if(N==10){
                return;
                }

           
            printNum(++N);
            System.out.println(N);
            }
        }