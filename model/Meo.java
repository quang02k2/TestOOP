package com.example.testoop.model;

import com.example.test.helper.InputHelper;
import com.example.testoop.controller.MeoKieuKeu;

import java.util.Scanner;

public class Meo {
    private int id;
    private String ten;
    private int tuoi;
    private String gioiTinh;
    private MeoKieuKeu kieuKeu;

    public Meo(int id, String ten, int tuoi, String gioiTinh, MeoKieuKeu kieuKeu) {
        this.id = id;
        this.ten = ten;
        this.tuoi = tuoi;
        this.gioiTinh = gioiTinh;
        this.kieuKeu = kieuKeu;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public MeoKieuKeu getKieuKeu() {
        return kieuKeu;
    }
    public Meo(){

    }
    public void setKieuKeu(MeoKieuKeu kieuKeu) {
        this.kieuKeu = kieuKeu;
    }

    public String keu() {
        return kieuKeu.keu();
    }

    public void input(){
        id = InputHelper.nhapInt("Nhap id");
        ten = InputHelper.nhapString("Nhap ten meo: ");
        tuoi = InputHelper.nhapInt("Nhap tuoi meo");
        gioiTinh = InputHelper.nhapString("Nhap gioi tinh");
        System.out.println("Chọn loại mèo kêu:");
        System.out.println("1. Mèo anh lông dài");
        System.out.println("2. Mèo anh lông ngắn");
        System.out.println("3. Mèo Ba Tư");
        System.out.println("4. Mèo Nga");
        System.out.print("Nhập lựa chọn của bạn: ");
        Scanner scanner = new Scanner(System.in);
        int loaiMeo = scanner.nextInt();
        scanner.nextLine();
        switch (loaiMeo) {
            case 1:
                kieuKeu = new MeoLongDai();
                break;
            case 2:
                kieuKeu = new MeoLongNgan();
                break;
            case 3:
                kieuKeu = new MeoBaTu();
                break;
            case 4:
                kieuKeu = new MeoNga();
                break;
            default:
                System.out.println("KO co loai meo nay");
                break;
        }
    }

    public void tiengKeu(){
        System.out.println("Chọn loại mèo kêu:");
        System.out.println("1. Mèo anh lông dài");
        System.out.println("2. Mèo anh lông ngắn");
        System.out.println("3. Mèo Ba Tư");
        System.out.println("4. Mèo Nga");
        System.out.print("Nhập lựa chọn của bạn: ");
        Scanner scanner = new Scanner(System.in);
        int loaiMeo = scanner.nextInt();
        scanner.nextLine();
        switch (loaiMeo) {
            case 1:
                kieuKeu = new MeoLongDai();
                break;
            case 2:
                kieuKeu = new MeoLongNgan();
                break;
            case 3:
                kieuKeu = new MeoBaTu();
                break;
            case 4:
                kieuKeu = new MeoNga();
                break;
            default:
                System.out.println("KO co loai meo nay");
                break;
        }
    }

}
