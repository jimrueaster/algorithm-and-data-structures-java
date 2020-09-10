package xyz.jekd.onedirectionlinkedlist;

import java.util.LinkedList;

public class OneDirectionLinkedListUtils {

    public static OneDirectionNode generateLinkedList() {
        OneDirectionNode result = new OneDirectionNode(null, null);

        OneDirectionNode n1 = new OneDirectionNode("aa", null);
        OneDirectionNode n2 = new OneDirectionNode("bb", null);
        OneDirectionNode n3 = new OneDirectionNode("cc", null);

        result.setNext(n1);
        n1.setNext(n2);
        n2.setNext(n3);

        return result;
    }

    public static LinkedList<String> traverseOneDirectionLinkedList(OneDirectionNode aHead) {
        LinkedList<String> result = new LinkedList<>();

        OneDirectionNode node = aHead.getNext();

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
