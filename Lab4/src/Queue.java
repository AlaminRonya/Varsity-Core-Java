import java.util.Stack;
public class Queue {
	 Stack<Integer> stack1 = new Stack<Integer>();  
     Stack<Integer> stack2 = new Stack<Integer>();
     boolean isEmpty() {
    	 if(stack1.isEmpty()) {
    		 return false;
    	 }else {
    		 return true;
    	 }
     }
  
    void enQueue(int x){  
        while (!stack1.isEmpty()){  
        	stack2.push(stack1.pop());  
           
        }   
        stack1.push(x);  
  
       
        while (!stack2.isEmpty()){  
        	stack1.push(stack2.pop());              
        }  
    }  
  
    
     int deQueue(){ 
    	 if (stack1.isEmpty())  
         {   
    		 System.out.print("Queue is Empty assign value of ");
             return -1000000000;
         }
	     int x = stack1.peek();  
	     stack1.pop();  
	     return x;  
    }  

}
