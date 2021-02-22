package linkedList;


import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class SingleLinkedList <T> implements Iterable<T> {

    private class Node <T>{
        T data;
        Node <T> next;

        public Node(T data, Node<T> next){
            this.data = data;
            this.next = next;
        }

        @Override public String toString(){
            return data.toString();
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            private Node<T> trav = head;

            @Override
            public boolean hasNext() {
                return trav != null;
            }

            @Override
            public T next() {
                T data = trav.data;
                trav = trav.next;
                return data;
            }
        };
    }

    private int size = 0;
    private Node <T> head = null;

    public int getSize(){
        return size;
    }

    public void add(T elem){

        if(head == null){
            head = new Node<>(elem,null);
            size++;
        }

        else if(head.next == null){
            head.next = new Node<>(elem,null);
            size++;
        }
        else{
            Node<T> trav = head;
            while(trav.next != null){
                trav = trav.next;
                if(trav.next == null){
                    trav.next = new Node<T>(elem,null);
                    trav = trav.next;
                    size++;
                }
            }
        }
    }

    public int indexOf(Object obj){
        int index = 0; //index fino a size poi return -1
        Node <T> trav = head;

        //we check even for null elements
        if(obj == null){
            for(trav = head; trav != null; trav = trav.next, index++){
                if(trav.data == null){
                    return index;
                }
            }
        }
        else{
            for (trav = head; trav != null; trav = trav.next, index++){
                if(obj.equals(trav.data)){
                    return index;
                }
            }
            index = -1;
        }
        return index;
    }

    public boolean contains(T elem){
        return indexOf(elem) != -1;
    }

    public void removeAt(int index){
        if(index > size){
            return;
        }
        else{
            if(index == 0){
                Node<T> temp = head.next;
                head = null;
                head = temp;
                size--;
            }
            else{
                Node<T> temp = head;
                for (int i = 0; i < index-1; i++){
                    temp = temp.next;
                }
                Node<T> nextNew = temp.next.next;
                temp.next = null;
                temp.next = nextNew;
                size--;
            }
        }
    }

    public void removeElement(T elem){
        if(contains(elem)){
            removeAt(indexOf(elem));
        }
    }

    public void clear(){
        head.next = null;
        head = null;
        size = 0;
    }

    @Override public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("[ ");
        if(head != null) {
            Node<T> trav = head;
            sb.append(trav.data);
            trav = trav.next;
            while (trav != null) {
                sb.append(", " + trav.data);
                trav = trav.next;
            }
        }
        sb.append(" ]");
        return sb.toString();
    }
}
