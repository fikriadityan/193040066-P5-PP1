/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author fikri aditya
 */
public class StrukturList {
    private Node HEAD;

    public StrukturList() {
        HEAD = null;
    }

    public boolean isEmpty() {
        return HEAD == null;
    }

    public void addNode(int data) {
        Node newNode = new Node(data);
        newNode.setNext(HEAD);
        HEAD = newNode;
    }

    public void removeHead() {
        if (isEmpty()) {
            System.out.println("List kosong");
        } else {
            Node temp = HEAD;
            HEAD = HEAD.getNext();
            dispose(temp);
        }
    }

    public void removeTail() {
        if (isEmpty()) {
            System.out.println("List kosong");
        } else {
            if (HEAD.getNext() == null) {
                // Jika hanya ada satu elemen dalam list
                HEAD = null;
            } else {
                Node current = HEAD;
                while (current.getNext().getNext() != null) {
                    current = current.getNext();
                }
                Node temp = current.getNext();
                current.setNext(null);
                dispose(temp);
            }
        }
    }

    public void removeMiddle() {
        if (isEmpty()) {
            System.out.println("List kosong");
        } else {
            Node slow = HEAD;
            Node fast = HEAD;
            Node prev = null;

            while (fast != null && fast.getNext() != null) {
                fast = fast.getNext().getNext();
                prev = slow;
                slow = slow.getNext();
            }

            if (prev != null) {
                // Jika jumlah elemen ganjil, remove middle
                prev.setNext(slow.getNext());
                dispose(slow);
            } else {
                // Jika jumlah elemen genap, remove middle (kedua elemen tengah)
                HEAD = HEAD.getNext();
                dispose(slow);
            }
        }
    }

    private void dispose(Node temp) {
        temp.setNext(null);
        temp = null;
    }

    public void displayList() {
        Node current = HEAD;
        while (current != null) {
            System.out.print(current.getData() + " ");
            current = current.getNext();
        }
        System.out.println();
    }

    public static void main(String[] args) {
        StrukturList myList = new StrukturList();

        // Menambahkan elemen ke list
        myList.addNode(1);
        myList.addNode(2);
        myList.addNode(9);
        myList.addNode(7);
        myList.addNode(5);

        // Menampilkan list sebelum operasi remove
        System.out.print("List sebelum operasi remove: ");
        myList.displayList();

        // Operasi remove head
        myList.removeHead();
        System.out.print("List setelah remove head: ");
        myList.displayList();

        // Operasi remove tail
        myList.removeTail();
        System.out.print("List setelah remove tail: ");
        myList.displayList();

        // Operasi remove middle
        myList.removeMiddle();
        System.out.print("List setelah remove middle: ");
        myList.displayList();
    }
}

