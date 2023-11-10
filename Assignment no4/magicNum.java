class magicNumber{
      public static void main(String args[]){
             int num=10;
             int sum=0;
             System.out.println(magicNum(num));
             System.out.println(recursion(num));
            
             }
      
      static boolean magicNum(int num){
             int sum=0;
           
             while(num>9){
                

             while(num!=0){

                sum=sum+num%10;
                num=num/10;
                }

             num=sum;
             sum=0;
          
             }

             return num==1;
           
          }

    

 static boolean recursion(int num) {
        if (num < 10) {
        return num == 1;
              }

    int sum = 0;
        while (num != 0) {
        sum += num % 10;
        num = num / 10;
    }

    return recursion(sum);
     }

       }
               
                  
             