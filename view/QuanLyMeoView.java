package com.example.testoop.view;

import com.example.oop9.model.SanPham;
import com.example.test.helper.InputHelper;
import com.example.testoop.controller.MeoKieuKeu;
import com.example.testoop.controller.QuanLyMeo;
import com.example.testoop.model.*;

import java.util.Scanner;

public class QuanLyMeoView {
    private QuanLyMeo quanLyMeo;
    public QuanLyMeoView(){
        quanLyMeo = new QuanLyMeo();
    }

    public void Menu(){
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("1. Thêm mèo.");
            System.out.println("2. Xóa Mèo theo ID.");
            System.out.println("3. Hiển thị toàn bộ mèo.");
            System.out.println("4. Hiển thị mèo theo ID.");
            System.out.println("5. Thay đổi tiếng kêu theo ID.");
            System.out.println("6. Thoát chương trình.");
            System.out.print("Vui lòng chọn: ");
            String luaChon = scanner.nextLine();
            System.out.println("------------------------");
            switch (luaChon) {
                case "1":
                    quanLyMeo.themMeo(new Meo());
                    break;
                case "3":
                    quanLyMeo.hienThiDanhSachMeo();
                    break;
                case  "4":
                    int id = InputHelper.nhapInt("Nhap id can tim kiem");
                    quanLyMeo.hienThiMeoTheoID(id);
                    break;
                case "2":
                    int idMeoXoa = InputHelper.nhapInt("Nhap id can xoa");
                    quanLyMeo.xoaMeo(idMeoXoa);
                    break;
                case "5":
                    int idThayDoi = InputHelper.nhapInt("Nhap id can thay doi tieng keu");
                    quanLyMeo.thayDoiTiengKeu(idThayDoi);
                    break;
                case "6":
                    System.out.println("Ban da thoat khoi chuong trinh");
                    System.exit(0);
                default:
                    System.out.println("Khong thoa man. Moi nhap lai tu 1 -> 5 : ");
                    break;
            }
        }
    }
}