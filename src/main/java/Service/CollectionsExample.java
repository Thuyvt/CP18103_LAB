/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.NguoiDung;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

/**
 *
 * @author ThuyVT
 */
public class CollectionsExample {

    public static void main(String[] args) {
        List<Double> listDoub = new ArrayList<>();
        // Them phan tu
        listDoub.add(12.5);
        listDoub.add(20.5);
        listDoub.add(15.1);
        listDoub.add(13.7);
        listDoub.add(12.5);

        System.out.println(listDoub);
        System.out.println("kich thuoc: " + listDoub.size());
        System.out.println("Lay phan tu trong list:" + listDoub.get(4));

        // Loai bo doi tuong trung lap
        Set<Double> hashSetDouble = new HashSet<>();
        hashSetDouble.add(12.5);
        hashSetDouble.add(20.5);
        hashSetDouble.add(15.1);
        hashSetDouble.add(13.7);
        hashSetDouble.add(12.5);

        System.out.println(hashSetDouble);
        for (Double item : hashSetDouble) {
            if (item == 12.5) {
                System.out.println(item);
            }
        }
        // Tree set luoc bo doi tuong tung lap va sap xep lai
        Set<Double> treeSetDob = new TreeSet<>();
        treeSetDob.add(12.5);
        treeSetDob.add(20.5);
        treeSetDob.add(15.1);
        treeSetDob.add(13.7);
        treeSetDob.add(12.5);
        System.out.println("Treeset " + treeSetDob);

        List<NguoiDung> listNguoiDung = new ArrayList<>();
        NguoiDung nd1 = new NguoiDung("thuyvt66", "thuyvt66@fpt.edu.vn",
                "123456", "Giang vien", 2, true);
        NguoiDung nd2 = new NguoiDung("loantt", "loantt@fpt.edu.vn",
                "123456", "Giang vien", 2, true);
        NguoiDung nd3 = new NguoiDung("thienth3", "linhbd9@fpt.edu.vn",
                "123456", "Nhan vien", 2, true);
        NguoiDung nd4 = new NguoiDung("linhbd", "linhbd9@fpt.edu.vn",
                "123456", "Sinh vien", 1, true);
        NguoiDung nd5 = new NguoiDung("thuyvt66", "thuyvt66@fpt.edu.vn",
                "123456", "Giang vien", 2, true);
        // Them nguoi dung vao danh sach
        listNguoiDung.add(nd1);
        listNguoiDung.add(nd2);
        listNguoiDung.add(nd3);
        listNguoiDung.add(nd4);
        listNguoiDung.add(nd5);

        System.out.println("Ds cu: " + listNguoiDung.size());
//        System.out.println("Xoa phan tu tai vi tri 4");
//        listNguoiDung.remove(4);
//        System.out.println("Ds moi: " + listNguoiDung.size());

        NguoiDung removeItem = new NguoiDung("thuyvt66", "thuyvt66@fpt.edu.vn",
                "123456", "Giang vien", 2, true);
        NguoiDung removeItem1 = listNguoiDung.get(4);
        listNguoiDung.remove(removeItem);
//        listNguoiDung.removeIf(item -> Objects.equals(item, removeItem));
        System.out.println("Ds moi: " + listNguoiDung.size());
        // SAP XEP XUOI ASC
        Comparator com = new Comparator<NguoiDung>() {
            @Override
            public int compare(NguoiDung o1, NguoiDung o2) {
                return o1.getEmail().compareTo(o2.getEmail());
            }
        };
        Collections.sort(listNguoiDung, com);
        // SAP XEP NGUOC DESC
        Collections.sort(listNguoiDung, new Comparator<NguoiDung>() {
            @Override
            public int compare(NguoiDung o1, NguoiDung o2) {
                return o2.getEmail().compareTo(o1.getEmail());
            }
        });
        // C2: Implements INTERFACE Comparable ben class doi tuong
        // Trien khai tieu tri so sanh
        // Sap xep tang dan - ASC
        Collections.sort(listNguoiDung);
        
        // In danh sach
        for (NguoiDung nd : listNguoiDung) {
            System.out.println("tk: " + nd.getUserName() + " - email: " + nd.getEmail());
        }
    }
}
