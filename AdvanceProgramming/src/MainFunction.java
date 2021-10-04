
public class MainFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape obj = new Shape(2,2,3,4);
		obj.rectangleOfArea();
		obj.circleOfArea();
		obj.triangleOfArea();
		obj.squareOfArea();
		Queue queue = new Queue();
		queue.deQueue();
		queue.enQueue(5);
		queue.enQueue(6);
		queue.enQueue(7);
		queue.enQueue(8);
		queue.show();
		
		queue.deQueue();
		queue.deQueue();
		queue.show();
		
		queue.enQueue(27);
		queue.enQueue(27);
		queue.enQueue(277);
		queue.enQueue(28);
		queue.enQueue(29);
		queue.enQueue(6);
		queue.enQueue(7);
		queue.enQueue(766);
		queue.show();
		queue.enQueue(555);
	}
}
