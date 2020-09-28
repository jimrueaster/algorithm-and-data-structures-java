package xyz.jekd.onedirectionlinkedlist;

import lombok.Getter;

import java.util.LinkedList;
import java.util.List;

@Getter
public class OneDirectionLinkedList {

    private final OneDirectionNode head = new OneDirectionNode();
    private int size;

    public void add(OneDirectionNode aOneDirectionNode) {
        OneDirectionNode node = head;
        while (null != node.getNext()) {
            node = node.getNext();
        }
        node.setNext(aOneDirectionNode);
        size++;
    }

    public void insertToIndex(OneDirectionNode aOneDirectionNode, int anIndex) {
        int i = 0;
        OneDirectionNode node = head;
        for (; ; ) {
            if (null == node) {
                break;
            }

            if (i == anIndex) {
                OneDirectionNode prevNext = node.getNext();
                node.setNext(aOneDirectionNode);
                aOneDirectionNode.setNext(prevNext);
                break;
            }
            node = node.getNext();
            i++;
        }
        if (i != anIndex) {
            throw new RuntimeException("index exceeded.");
        }
        size++;
    }

    public void removeByIndex(int anIndex) {
        int i = 0;
        OneDirectionNode prevNode = head;
        OneDirectionNode node = head.getNext();

        if (anIndex < 0) {
            throw new RuntimeException("index exceeded.");
        }

        if (null == head.getNext()) {
            throw new RuntimeException("empty list");
        }

        for (; ; ) {
            if (null == node) {
                break;
            }
            if (i == anIndex) {
                OneDirectionNode nextNode = node.getNext();
                prevNode.setNext(nextNode);
                break;
            }
            prevNode = node;
            node = node.getNext();
            i++;
        }
        if (i != anIndex) {
            throw new RuntimeException("index exceeded.");
        }
        size--;
    }

    public void removeLast() {

        OneDirectionNode node = head;
        if (null == head.getNext()) {
            throw new RuntimeException("empty list");
        }
        for (; ; ) {
            if (null == node) {
                throw new RuntimeException("node is null");
            }
            OneDirectionNode nextNode = node.getNext();

            if (null == nextNode.getNext()) {
                node.setNext(null);
                break;
            }

            node = node.getNext();
        }

        size--;
    }

    public Boolean isEmpty(){
        return 0 == size;
    }

    public List<String> toList() {
        LinkedList<String> result = new LinkedList<>();

        OneDirectionNode node = head.getNext();

        for (; ; ) {
            result.add(node.getContent());
            if (null == node.getNext()) {
                break;
            }
            node = node.getNext();
        }

        return result;
    }
}
