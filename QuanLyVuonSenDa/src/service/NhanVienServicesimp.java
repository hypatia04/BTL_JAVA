package service;

import model.KhachHang;
import model.NhanVien;

import java.util.Scanner;


public class NhanVienServicesimp implements NhanVienServices {
    @Override
    public void nhap(NhanVien nhanVien){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma nhan vien : ");
        nhanVien.setMaNV(sc.nextLine());
        System.out.println("Nhap ten nhan vien : ");
        nhanVien.setTenNV(sc.nextLine());
        System.out.println("Nhap kich co : ");
        nhanVien.setDiaChi(sc.nextLine());
        System.out.println("Nhap so luong : ");
        nhanVien.setSdt(sc.nextLine());

    }

    @Override
    public void xuat(NhanVien nhanVien){

        System.out.printf("%-20s %-20s %-20s %-20s", nhanVien.getMaNV(), nhanVien.getTenNV(), nhanVien.getDiaChi(), nhanVien.getSdt() );
    }

}
