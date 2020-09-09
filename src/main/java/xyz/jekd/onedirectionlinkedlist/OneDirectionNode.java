package xyz.jekd.onedirectionlinkedlist;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class OneDirectionNode {

    private String content;
    private OneDirectionNode next;


}
