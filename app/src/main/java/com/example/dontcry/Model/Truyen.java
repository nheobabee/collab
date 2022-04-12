package com.example.dontcry.Model;

public class Truyen {
    private Integer IDTruyen;
    private String TenTruyen;
    private String NoiDung;
    private Integer AnhTruyen;
    private String TheLoai;

    public Integer getIDTruyen() {
        return IDTruyen;
    }

    public void setIDTruyen(Integer IDTruyen) {
        this.IDTruyen = IDTruyen;
    }

    public String getTenTruyen() {
        return TenTruyen;
    }

    public void setTenTruyen(String tenTruyen) {
        TenTruyen = tenTruyen;
    }

    public String getNoiDung() {
        return NoiDung;
    }

    public void setNoiDung(String noiDung) {
        NoiDung = noiDung;
    }

    public Integer getAnhTruyen() {
        return AnhTruyen;
    }

    public void setAnhTruyen(Integer anhTruyen) {
        AnhTruyen = anhTruyen;
    }

    public String getTheLoai() {
        return TheLoai;
    }

    public void setTheLoai(String theLoai) {
        TheLoai = theLoai;
    }

    public Truyen(Integer IDTruyen, String tenTruyen, String noiDung, Integer anhTruyen, String theLoai) {
        this.IDTruyen = IDTruyen;
        TenTruyen = tenTruyen;
        NoiDung = noiDung;
        AnhTruyen = anhTruyen;
        TheLoai = theLoai;
    }

    public Truyen() {
    }
}
