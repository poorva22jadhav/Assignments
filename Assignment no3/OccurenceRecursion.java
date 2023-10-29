class occurence{
      public static void main(String args[]){
             int N=123232422;
             int count=0;
             int target=2;
             System.out.println(approach1(N,count,target));
             System.out.println(Recursion(N,count,target));
             }

     static int approach1(int N,int count,int target){
             
            while(N!=0){
              int rem=N%10;
              if(rem==target){
                 count++;
                }
             N=N/10;
                }

             return count;
               }


   static int Recursion(int N,int count,int target){
          if(N==0){
             return count;
            }

           if(N%10==target){
                 count++;
                }
          return Recursion(N/10,count,target);
          
            }

        }    
            
            