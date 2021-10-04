
public class demoObject {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Question no: 1
		Queue1 queue = new Queue1();
		queue.deQueue();
		queue.enQueue(5);
		queue.enQueue(6);
		queue.enQueue(7);
		queue.enQueue(8);
		queue.show();
		//end
		
		
		//Question no:2
	    Queue q2 = new Queue();
	    q2.enQueue(155);  
	    q2.enQueue(25);  
	    q2.enQueue(35);  
	    q2.enQueue(35);
	    
	    Queue q3 = new Queue();
	    q3.enQueue(15);  
	    q3.enQueue(25);  
	    q3.enQueue(355);  
	    q3.enQueue(35);
	    
	    objectDemo obj = new objectDemo();
	    obj.compare(q2, q3);
	    //End
	    
	    //Question no: 3 Create a queue using two stacks.
	    Queue q1 = new Queue();
	    q1.enQueue(15);  
	    q1.enQueue(25);  
	    q1.enQueue(35);  
	    q1.enQueue(35);
	    while(q1.isEmpty()) {
	    	int x = q1.deQueue();
	    	System.out.println(x);	  
	    }
	    //end
	    
	    //Question no : 04
	    InvoiceItem invoiceItem = new InvoiceItem("id-01","Desc - 05",15,4.5);
	    System.out.println("Total Value : "+invoiceItem.getTotal());
	    System.out.println("toString Value : " +invoiceItem.toString());
	    //end
	    

	}

}
