

import org.testng.annotations.Test;

import java.awt.event.ItemEvent;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

import static java.util.Collections.sort;

public class SimpleLinkedListTest {
    @Test
    public void search(){
        SimpleLinkedList.lists.add(56);
        SimpleLinkedList.lists.add(30);
        SimpleLinkedList.lists.add(70);

        for(Integer a : SimpleLinkedList.lists){
            if(a == 30){
                System.out.println("Yes");
            }
        }
    }
    



}
