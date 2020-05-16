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
public class Node1 {
    String nama;
    String nim;
    String alamat;
    Node1 next;

    public Node1(String nama, String nim, String alamat, Node1 next) {
        this.nama = nama;
        this.nim = nim;
        this.alamat = alamat;
        this.next = next;
    }
}
