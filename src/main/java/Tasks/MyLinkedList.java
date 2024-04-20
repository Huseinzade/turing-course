package Tasks;

public class MyLinkedList<E> {

    private int size;
    private Node<E> head;

    public MyLinkedList(E head) {
        this.head = new Node<>(head);
        this.size++;
    }

    public void addTail(E tail) {
        if (head == null) {
            head = new Node<>(tail);
        } else {
            Node<E> curr = head;
            while (curr.getNext() != null) {
                curr = curr.getNext();
            }
            curr.setNext(new Node<>(tail));
        }
        size++;
    }

    public void addHead(E head) {
        this.head = new Node<>(head, this.head);
        size++;
    }

    // get index
    public E getIndex(int index) {
        if (index < 0 || index > size || head == null) {
            throw new IndexOutOfBoundsException("Not found index");
        }
        Node<E> curr = head;
        int count = 0;
        while (curr.getNext() != null && count < index) {
            curr = curr.getNext();
            count++;
        }
        return curr.getData();
    }

    // delete index
    public void deleteIndex(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("not found index");
        }

        if (index == 0) {
            head = head.getNext();
        } else {
            int count = 0;
            Node<E> prev = null;
            Node<E> curr = head;
            while (curr != null && count < index) {
                prev = curr;
                curr = curr.getNext();
                count++;
            }
            prev.setNext(curr.getNext());
        }
        size--;

    }

    //update data
    public void update(int index, E newData)  {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Out of bound: " + index);
        }

        int count = 0;
        Node<E> curr = head;
        while (curr != null && count < index) {
            curr = curr.getNext();
            count++;
        }
        curr.setData(newData);
    }

    // delete
    public void delete (E data) throws NullPointerException {


        if(head == null) {
            return;
        }
        Node<E> prev = null;
        Node<E> curr = head;
        while(curr != null){
            if (curr.getData().equals(data)){
                prev.setNext(curr.getNext());
                return;
            }
        }
        prev = curr;
        curr = curr.getNext();
    }


    public int getSize() {
        return size;
    }

    public E get(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("Out of bound: " + index);
        }

        int count = 0;
        Node<E> curr = head;
        while (curr != null && count < index) {
            curr = curr.getNext();
            count++;
        }
        return curr.getData();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node<E> curr = head;
        while (curr != null) {
            sb.append(curr.toString());
            curr = curr.getNext();
        }
        sb.append("null");
        return sb.toString();
    }
}
