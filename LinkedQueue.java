
public class LinkedQueue<T> implements QueueInterface<T> {

	private Node firstNode;
	private Node lastNode;
	
	private class Node {
		private Node next;
		private T data;
		
		public Node(T data) {
			this.data = data;
		}
		
		public T getData() {
			return data;
		}
		
		public Node getNext() {
			return next;
		}
		
		public boolean hasNext() {
			return next == null ? false : true;
		}
		
		public void setNextNode(Node newNext) {
			this.next = newNext;
		}
	}
	
	@Override
	public void enqueue(T newEntry) {
		Node newNode = new Node(newEntry);
		
		if (isEmpty())
			firstNode = newNode;
		else
			lastNode.setNextNode(newNode);
	
		lastNode = newNode;
	}

	
	
	@Override
	public T dequeue() throws EmptyQueueException {
		T front = getFront();
		
		firstNode = firstNode.getNext();
		if (firstNode == null)
			lastNode = null;
		
		return front;
	}

	@Override
	public T getFront() throws EmptyQueueException {
		if (isEmpty())
			throw new EmptyQueueException();
		else 
			return firstNode.getData();
	}

	@Override
	public boolean isEmpty() {
		return firstNode == null && lastNode == null;
	}

	@Override
	public void clear() {
		firstNode = null;
		lastNode = null;
	}

}
