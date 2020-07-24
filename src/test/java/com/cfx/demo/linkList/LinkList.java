package com.cfx.demo.linkList;

public class LinkList {

    private Node header;

    public LinkList() {
        header = new Node(null);
    }

    public Node getHeader() {
        return header;
    }

    public void reverse() {
        Node temp = header;
        while (temp.next != null) {
            Node curr = temp.next.next;

        }


    }

    public void add(int data) {
        Node node = new Node(data);
        Node temp = header;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.setNext(node);
    }

    public void setHeader(Node header) {
        this.header = header;
    }

    class Node {
        private Integer data;
        private Node next;

        public Node(Integer data) {
            this.data = data;
        }

        public Integer getData() {
            return data;
        }

        public void setData(int data) {
            this.data = data;
        }

        public Node getNext() {
            return next;
        }

        public void setNext(Node next) {
            this.next = next;
        }
    }
}
