/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author ThuyVT
 */
public class NguoiDung {
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
    
    
}
