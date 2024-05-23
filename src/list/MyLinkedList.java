package list;

import org.w3c.dom.Node;

import java.util.Iterator;

public class MyLinkedList <U extends Comparable<U>> implements MyList<U>{

    private Node<U> firstNode;
    private Node<U> lastNode;
    private int size;

    public MyLinkedList(){
        lastNode = new Node<U>(null, null, firstNode);
        firstNode = new Node<U>(null, lastNode, null);
        this.size = 0;
    }

    private class Node<U>{
        private U currentElement;
        private Node<U> nextElement;
        private Node<U> prevElement;

        private Node(U currentElement, Node<U> nextElement, Node<U> prevElement){
            this.currentElement = currentElement;
            this.nextElement = nextElement;
            this.prevElement = prevElement;
        }

        public U getCurrentElement() {
            return currentElement;
        }

        public void setCurrentElement(U currentElement) {
            this.currentElement = currentElement;
        }

        public Node<U> getNextElement() {
            return nextElement;
        }

        public void setNextElement(Node<U> nextElement) {
            this.nextElement = nextElement;
        }

        public Node<U> getPrevElement() {
            return prevElement;
        }

        public void setPrevElement(Node<U> prevElement) {
            this.prevElement = prevElement;
        }
    }


    private Node<U> getNextElement(Node<U> current){
        return current.getNextElement();
    }


    @Override
    public void addFirst(U arg) {
        Node<U> next = firstNode;
        next.setCurrentElement(arg);
        firstNode = new Node<>(null, next, null);
        next.setPrevElement(firstNode);
        size++;
    }

    @Override
    public void addLast(U arg) {
        Node<U> prev = lastNode;
        prev.setCurrentElement(arg);
        lastNode = new Node<>(null, null, prev);
        prev.setNextElement(lastNode);
        size++;
    }

    @Override
    public U getElement(int index) {
        Node<U> target = firstNode.getNextElement();
        for (int i = 0; i < index; i++) {
            target = getNextElement(target);
        }
        return target.getCurrentElement();
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public Iterator<U> iterator() {
        return new Iterator<U>() {
            int index = 0;
            @Override
            public boolean hasNext() {
                return index < size;
            }

            @Override
            public U next() {
                return getElement(index++);
            }
        };
    }
}
