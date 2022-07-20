

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
    @Test
    public void insert(){
        SimpleLinkedList.lists.add(56);
        SimpleLinkedList.lists.add(30);
        SimpleLinkedList.lists.add(70);

        SimpleLinkedList.lists.add(2,40);
        System.out.println(SimpleLinkedList.lists);
    }
    @Test
    public void delete(){
        SimpleLinkedList.lists.add(56);
        SimpleLinkedList.lists.add(30);
        SimpleLinkedList.lists.add(70);

        SimpleLinkedList.lists.add(2,40);
        SimpleLinkedList.lists.remove(2);
        System.out.println(SimpleLinkedList.lists);
    }
    @Test
    public void sort(){
        SimpleLinkedList.lists.add(56);
        SimpleLinkedList.lists.add(30);
        SimpleLinkedList.lists.add(70);
        SimpleLinkedList.lists.add(2,40);


    }
}
class SortedLinkedList{
    public static void main(String [] args){
        SortedLinkedList sortedLinkedList = new SortedLinkedList();
        sortedLinkedList.sortedLinkedList();
    }
    public void sortedLinkedList(){
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(56);
        linkedList.add(30);
        linkedList.add(40);
        linkedList.add(70);
       if(linkedList.get(0) == null){
           return;
       }
       else {
           for(int i = 0 ; i < linkedList.size(); i++){
               for (int j = i + 1 ; j < linkedList.size()-1 ; j++){
                   if(linkedList.get(i) > linkedList.get(j)){
                       Integer temp = linkedList.get(i);
                       linkedList.set(i,linkedList.get(j));
                       linkedList.set(j,temp);
                   }
               }
           }
       }
        System.out.println(linkedList);

    }
}