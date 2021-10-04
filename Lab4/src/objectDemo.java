
public class objectDemo {
	
	void compare(Queue a, Queue b) {
		while(a.isEmpty()&& b.isEmpty()) {
	    	int x = a.deQueue();
	    	int y = b.deQueue();
	    	if(x>y) {
	    		System.out.println("Object one : "+x);	
	    	}else if(x<y) {
	    		System.out.println("Object two : "+y);	
	    	}else if(x==y) {
	    		System.out.println("Objects same : "+y);	
	    	}
	    	
	    	  
	    }
	}

}
