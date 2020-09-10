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
