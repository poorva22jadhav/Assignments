class productDigits{
      public static void main(String args[]){
             int number=2345;
             int product=1;
             System.out.println(productDigit(number,product));
             System.out.println(approach2(number));
             }

      static int productDigit(int number,int product){
             if(number==0){
                return product;
               }
             int rem=number%10;
             product=product*rem;
             return productDigit(number/10,product);
             }

    static int approach2(int number){
           if(number==0){
              return 1;
             }
           return number%10*approach2(number/10);
          }
 
       }