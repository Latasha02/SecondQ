/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package secondq;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author latas
 */
public class Queue {
    
    int number = 1110;
    List<String> queue = new ArrayList<>();

    public int getNewNumber() {
        this.number = number + 1;
        return number;
    }

    public List<String> getQueue() {
        return queue;
    }

    public void setQueue(int number, String action) {
        if("add".equals(action)){
            queue.add(number + "");
        }
        else{
            queue.remove(queue.get(0));
        }
    }

    public List<String> getQueueItems() {
        return queue;
    }

    public int getQueuelength() {
        return queue.size();
    }
    
    public String getQueueHead() {
        return queue.get(0);
    }
    
    public String getQueueTail() {
        int size = queue.size();
       return queue.get(size-1);
    }
    
    public void removeHead(){
        queue.remove(0);
    }
     
}
