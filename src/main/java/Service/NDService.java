/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Service;

import Model.NguoiDung;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author ThuyVT
 */
public class NDService {
        List<NguoiDung> listNguoiDung = new ArrayList<>();

        public NDService() {
            NguoiDung nd1 = new NguoiDung("thuyvt66","thuyvt66@fpt.edu.vn",
                    "123456", "Giang vien", 2, true);
            NguoiDung nd2 = new NguoiDung("loantt","loantt@fpt.edu.vn", 
                    "123456", "Giang vien", 2, true);
            NguoiDung nd3 = new NguoiDung("thienth3","linhbd9@fpt.edu.vn", 
                    "123456", "Nhan vien", 2, true);
            NguoiDung nd4 = new NguoiDung("linhbd","linhbd9@fpt.edu.vn", 
                    "123456", "Sinh vien", 1, true);
            
            // Them nguoi dung vao danh sach
            listNguoiDung.add(nd1);
            listNguoiDung.add(nd2);
            listNguoiDung.add(nd3);
            listNguoiDung.add(nd4);
        }
        
        public List<NguoiDung> getListNguoiDung() {
            return listNguoiDung;
        }
        
        public void add(NguoiDung nd) {
            listNguoiDung.add(nd);
        } 
        
        public void update(int index, NguoiDung nd) {
            listNguoiDung.set(index, nd);
        }
        
        public void delete(int index) {
            listNguoiDung.remove(index);
        }
}
