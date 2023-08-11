package com.example.testoop.controller;

import com.example.testoop.model.Meo;

import java.util.ArrayList;
import java.util.List;

public class QuanLyMeo {
    private List<Meo> danhSachMeo;

    public QuanLyMeo() {
        danhSachMeo = new ArrayList<>();
    }

    public boolean themMeo(Meo meo){
        if(checkMeo(meo.getId())){
            return false;
        }
        meo.input();
        danhSachMeo.add(meo);
        return true;
    }
    public void xoaMeo(int id) {
        danhSachMeo.removeIf(meo -> meo.getId() == id);
    }

    public void hienThiDanhSachMeo() {
        for (Meo meo : danhSachMeo) {
            System.out.println("ID: " + meo.getId());
            System.out.println("Tên: " + meo.getTen());
            System.out.println("Tuổi: " + meo.getTuoi());
            System.out.println("Giới tính: " + meo.getGioiTinh());
            System.out.println("Tiếng kêu: " + meo.keu());
            System.out.println("--------------------");
        }
    }

    public void hienThiMeoTheoID(int id) {
        for (Meo meo : danhSachMeo) {
            if (meo.getId() == id) {
                System.out.println("ID: " + meo.getId());
                System.out.println("Tên: " + meo.getTen());
                System.out.println("Tuổi: " + meo.getTuoi());
                System.out.println("Giới tính: " + meo.getGioiTinh());
                System.out.println("Tiếng kêu: " + meo.keu());
                System.out.println("--------------------");
                return;
            }
        }
        System.out.println("Không tìm thấy mèo với ID: " + id);
    }

    public void thayDoiTiengKeu(int id) {
        for (Meo meo : danhSachMeo) {
            if (meo.getId() == id) {
                meo.tiengKeu();
                return;
            }
        }
        System.out.println("Không tìm thấy mèo với ID: " + id);
    }

    public boolean checkMeo(int id){
        for (Meo meo : danhSachMeo) {
            if (meo.getId() == id) {
                return true;
            }
        }
        return false;
    }
}
