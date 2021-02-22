package linkedList;

import java.util.Iterator;

public class DoubleLinkedList<T> implements Iterable<T>{

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

}
