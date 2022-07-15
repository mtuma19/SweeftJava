
import java.lang.String;

public class Main
{
	public static void main(String[] args) {
		System.out.println(minSplit(75));
	}
	public static boolean isPalindrome(String text){
        for (int i = 0; i < (text.length()/2); ++i) {
         if (text.charAt(i) != text.charAt( text.length() - i - 1)) {
            return false;
         }
        }

        return true;

	}
        public static int minSplit(int amount) {
           int[] arr= {1, 5, 10, 20, 50};
            int n=0;
            int am = amount;
            while(am>0){
                int i=4;
                while(i>0){
                    if(arr[i]<=am){
                        am=am-arr[i];
                        n++;
                        break;
                    }
                    i--;
                }
                 
            }
            return n;
        }
        
        
        public static int notContains(int[] array){
            int n =1;
            while (true){
                int i=0;
                 while(true){
                    if(n==array[i]){
                       n++;
                       break;
                    }
                    if( i==array.length-1){
                        return n;
                    }
                    i++;
                }
                
            }
        }
        
        
          public static boolean isProperly(String expr){
         	Deque<Character> stack = new ArrayDeque<Character>();
 
		for (int i = 0; i < expr.length(); i++) {
		    char x = expr.charAt(i);
	 
		    if (x == '(' ){
		        stack.push(x);
		        continue;
		    } 
		    if (stack.isEmpty()){
		        return false;
		    }
		    char check;
		    
		        check = stack.pop();
		        if (check == ')' ){
		            return false;
		        }
	 
		    
		}
		 return (stack.isEmpty());
          }
           public static boolean int countVariants(int stearsCount){
           int n= stairsCount;
            if(n==1 || n ==0) {
                return 1;
            } else {
                return countVariants(num-2)+countVariants(num-1);
            }
        }
          
          
}
        


