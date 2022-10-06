/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.Objects;

/**
 *
 * @author ThuyVT
 */
public class NguoiDung implements Comparable<NguoiDung>{
    private String userName;
    private String email;
    private String passWord;
    private String viTri;
    private int quyen; // 1: user - 2: admin
    private boolean status;

    public NguoiDung(String userName, String email, String passWord, String viTri, int quyen, boolean status) {
        this.userName = userName;
        this.email = email;
        this.passWord = passWord;
        this.viTri = viTri;
        this.quyen = quyen;
        this.status = status;
    }

    public NguoiDung() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }
    
    public void inThongTin() {
        System.out.printf("Email %s - UserName %s - Password %s", this.email, this.userName, this.passWord);
    }

    public String getViTri() {
        return viTri;
    }

    public void setViTri(String viTri) {
        this.viTri = viTri;
    }

    public int getQuyen() {
        return quyen;
    }

    public void setQuyen(int quyen) {
        this.quyen = quyen;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final NguoiDung other = (NguoiDung) obj;
        if (this.quyen != other.quyen) {
            return false;
        }
        if (this.status != other.status) {
            return false;
        }
        if (!Objects.equals(this.userName, other.userName)) {
            return false;
        }
        if (!Objects.equals(this.email, other.email)) {
            return false;
        }
        if (!Objects.equals(this.passWord, other.passWord)) {
            return false;
        }
        return Objects.equals(this.viTri, other.viTri);
    }

    @Override
    public int compareTo(NguoiDung o) {
        return this.userName.compareTo(o.getUserName());
    }
    
    
    
}
