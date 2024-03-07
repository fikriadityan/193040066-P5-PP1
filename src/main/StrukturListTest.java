/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author fikri aditya
 */
public class StrukturListTest {
    public static void main(String[] args) {
        StrukturList myList = new StrukturList();

        // Menambahkan elemen ke list
        myList.addNode(1);
        myList.addNode(5);
        myList.addNode(3);
        myList.addNode(6);
        myList.addNode(2);

        // Menampilkan list sebelum penghapusan
        System.out.print("List sebelum penghapusan: ");
        myList.displayList();

        // Melakukan operasi penghapusan elemen list di awal
        myList.removeHead();
        System.out.print("List setelah removeHead: ");
        myList.displayList();

        // Melakukan operasi penghapusan elemen list di akhir
        myList.removeTail();
        System.out.print("List setelah removeTail: ");
        myList.displayList();

        // Melakukan operasi penghapusan elemen list di tengah
        myList.removeMiddle();
        System.out.print("List setelah removeMiddle: ");
        myList.displayList();
    }
}

