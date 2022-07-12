package com.example.thuchanh4.model;

import javax.persistence.*;

@Entity
@Table(name = "bandothanhpho")
public class BanDoThanhPho {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    private String tenThanhPho ;
    private String quocGia ;
    private double dienTich;
    private int danSo;
    private double tongSanPhamNoiDia ;
    private String moTaVeThanhPho ;

    public BanDoThanhPho() {
    }

    public BanDoThanhPho(Long id, String tenThanhPho, String quocGia, double dienTich, int danSo, double tongSanPhamNoiDia, String moTaVeThanhPho) {
        this.id = id;
        this.tenThanhPho = tenThanhPho;
        this.quocGia = quocGia;
        this.dienTich = dienTich;
        this.danSo = danSo;
        this.tongSanPhamNoiDia = tongSanPhamNoiDia;
        this.moTaVeThanhPho = moTaVeThanhPho;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTenThanhPho() {
        return tenThanhPho;
    }

    public void setTenThanhPho(String tenThanhPho) {
        this.tenThanhPho = tenThanhPho;
    }

    public String getQuocGia() {
        return quocGia;
    }

    public void setQuocGia(String quocGia) {
        this.quocGia = quocGia;
    }

    public double getDienTich() {
        return dienTich;
    }

    public void setDienTich(double dienTich) {
        this.dienTich = dienTich;
    }

    public int getDanSo() {
        return danSo;
    }

    public void setDanSo(int danSo) {
        this.danSo = danSo;
    }

    public double getTongSanPhamNoiDia() {
        return tongSanPhamNoiDia;
    }

    public void setTongSanPhamNoiDia(double tongSanPhamNoiDia) {
        this.tongSanPhamNoiDia = tongSanPhamNoiDia;
    }

    public String getMoTaVeThanhPho() {
        return moTaVeThanhPho;
    }

    public void setMoTaVeThanhPho(String moTaVeThanhPho) {
        this.moTaVeThanhPho = moTaVeThanhPho;
    }
}
