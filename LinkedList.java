package com.company;

public class LinkedList {

    Node head;
    int size;

    public LinkedList(Node head){
        this.head = head;
        this.size = 1;
    }

    public void add(Node node){
        Node temp = head;
        Node prev;
        do{
            prev = temp;
            temp = temp.next;
        }while(temp != null);
        // correct place to insert
        prev.next = node;
        this.size += 1;
    }

    @Override
    public String toString(){
        Node temp = head;
        StringBuilder stringBuilder = new StringBuilder();
        do{
            stringBuilder.append(temp.data).append(" -> ");
            temp = temp.next;
        }while(temp != null);
        return stringBuilder + "NULL";
    }

    public void delete(Object searchString) {
        Node temp = head;
        Node prev;
        boolean found = false;
        do{
            prev = temp;
            temp = temp.next;
            if(temp.data.equals(searchString)){
                found = true;
            }
        }while(! temp.data.equals(searchString) && temp.next != null);
        if(!found){
            return;
        }
        prev.next = temp.next;
        this.size -= 1;
    }

    public int size() {
        return this.size;
    }
}
