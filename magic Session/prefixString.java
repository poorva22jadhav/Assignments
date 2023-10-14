class problem3{
     public static void main(String args[]){
            String s="iloveleetcode";
            String ar1[]={"i","love","leetcode","apples"};
            int size=ar1.length;
            System.out.println(prefixArray(s,ar1,size));

            }

           static boolean prefixArray(String s,String ar1[],int size){
              String temp="";        
              for(int i=0;i<size;i++){
                  temp=temp+ar1[i];
                       if(temp.equals(s)){
                          return true;
                         }
                       }

             return false;
               }
        }

                 
             