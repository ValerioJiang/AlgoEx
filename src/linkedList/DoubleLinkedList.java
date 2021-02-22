package linkedList;

import java.util.Iterator;

public class DoubleLinkedList<T> implements Iterable<T>, IDoubleLinkedList{

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public T next() {
                return null;
            }
        };
    }

    private class Node<T> {
        T data;
        Node<T> prev;
        Node<T> succ;

        public Node(T data, Node<T> prev, Node<T> succ){
            this.data = data;
            this.prev = prev;
            this.succ = succ;
        }

        @Override public String toString(){
            return data.toString();
        }
    }

    private int size = 0;
    private Node<T> head = null;
    private Node<T> tail = null;

    public void addLast(){

    }

    @Override
    public void addFirst() {


    }

    @Override
    public void removeFirst() {

    }

    @Override
    public void removeIndex() {

    }

    @Override
    public void removeElem() {

    }

    @Override
    public void removeLast() {

    }

    @Override
    public int indexOf() {
        return 0;
    }

    @Override
    public boolean contains() {
        return false;
    }

    @Override
    public void clear() {

    }


}
