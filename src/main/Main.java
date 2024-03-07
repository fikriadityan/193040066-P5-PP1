/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author fikri aditya
 */
public class Main {
    public static void main(String[] args) {
        StrukturList myList = new StrukturList();

        myList.addNode(2);
        myList.addNode(4);
        myList.addNode(6);
        myList.addNode(8);
        myList.addNode(10);

        System.out.print("List awal: ");
        myList.displayList();

        myList.removeHead();
        System.out.print("List setelah removeHead: ");
        myList.displayList();

        myList.removeTail();
        System.out.print("List setelah removeTail: ");
        myList.displayList();

        myList.removeMiddle();
        System.out.print("List setelah removeMiddle: ");
        myList.displayList();
    }
}