package SinglyLinkedList;

public class Test {
	public static void main(String[] args) {
		
		LinkedList list = new LinkedList();
		
		Node x= new Node();
		Node y = new Node();
		Node z = new Node();
		y.setValue(7);
		y.setLink(null);
		list.addToFront(y);
		for(int i = 6; i<10; i+=2) {
			x = new Node(i * 3 % 7, null);
			z = new Node(i * 2 % 5, null);
			while(y.getLink() != null) {
				y = y.getLink();
			}
			if(i*3%7<3)
				y.setLink(z);
			else
				y.setLink(x);
		}
		
		Node a = new Node();
		a.setValue(12);
		a.setLink(null);
		x.setLink(a);
		Node b = new Node();
		b.setValue(10);
		b.setLink(null);
		a.setLink(b);
		Node c = new Node();
		c.setValue(21);
		c.setLink(null);
		c.setLink(list.head.getLink());
		list.head.setLink(c);
		list.printData();
		c=c.getLink();
		System.out.println(x.getValue()+2); //5
		
		System.out.println(y.getValue()+2); //3
	
		System.out.println(z.getValue()); //0
		System.out.println("well done");
	}
}
