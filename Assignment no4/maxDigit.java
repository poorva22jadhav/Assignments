class MaximumDigit{
      public static void main(String args[]){
             int number=1238329;
             int max=Integer.MIN_VALUE;;
             System.out.println(maxNumber(number,max));
             }

      static int maxNumber(int number,int max){
             if(number==0){
                return max;
               }

             if(number%10>max){
                max=number%10;
               }

             return maxNumber(number/10,max);
               }
          }           