package xyz.jekd.onedirectionlinkedlist;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class OneDirectionNode {

    private String content;
    private OneDirectionNode next;
}
