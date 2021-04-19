package OrderedLinkedList;

public class Test {
	
	public static void main(String[] args) {
		OrderedLinkedList list = new OrderedLinkedList();
		list.insert(new Student(1, "ddd", 3.2));
		list.insert(new Student(2, "aaa", 3.5));
		list.insert(new Student(3, "ccc", 3.4));
		list.outputList();
		System.out.println("---------------");
		
		Student stu = new Student(4, "zzz", 3.7);
		list.insert(stu);
		list.outputList();

		if (list.search(stu))
			System.out.println("Student " + stu + " is found");
		else
			System.out.println("Not found");

	}
	
}
