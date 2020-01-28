package learnbay.com.sharad;


public final class LinkListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CircularLinkList list = new CircularLinkList();
//		list.insertAtStart(10);
//		list.insertAtStart(20);
//		list.insertAtStart(30);
//		list.insertAtStart(40);
//		list.insertAtLast(50);
//		list.insertAfter(20,25);
		list.insertCircular(5);
		list.insertCircular(10);
		list.insertCircular(100);
		list.printCircularList();
	}

}
