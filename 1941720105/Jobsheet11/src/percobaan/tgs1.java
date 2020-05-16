/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package percobaan;

/**
 *
 * @author hp
 */
public class tgs1 {

    Node1 head;
    int size;

    public tgs1() {
        head = null;
        size = 0;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public void addFrist(String nma, String Nim, String almt) {
        head = new Node1(nma, Nim, almt, head);
        size++;
    }

    public void add(String nma, String Nim, String almt) {
        if (isEmpty()) {
            addFrist(nma, Nim, almt);
        } else {
            Node1 tmp = head;
            while (tmp.next != null) {
                tmp = tmp.next;
            }
            tmp.next = new Node1(nma, Nim, almt, null);
            size++;
        }
    }

    public void print() {
        if (!isEmpty()) {
            Node1 tmp = head;
            while (tmp != null) {

                System.out.print(tmp.nim + "\t");
                System.out.print(tmp.nama + "\t");
                System.out.println(tmp.alamat);

                tmp = tmp.next;
            }
            System.out.println("");
        } else {
            System.out.println("LinkedList kosong");
        }
    }

    public void removeByValue(String nim) {

        Node1 prev = head;
        Node1 cur = head.next;
        for (int i = 1; i < size; i++) {
            if (nim != prev.nim) {
                prev = prev;
                cur = prev.next;
            }
        }
        prev.next = cur.next;
        size--;
    }

    public void carikey(String key) {
        Node1 tmp = head;

        for (int i = 1; i < size; i++) {
            if (key != tmp.nim) {

                tmp = tmp.next;

            }
        }
        System.out.println("Data yang anda cari :");
        System.out.print(tmp.nim + "\t");
        System.out.print(tmp.nama + "\t");
        System.out.println(tmp.alamat);
    }
}
