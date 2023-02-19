package service;

import model.KhachHang;

import java.util.Scanner;


public class KhachHangServicesimp implements KhachHangServices {
    @Override
    public void nhap(KhachHang khachHang){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma khach hang : ");
        khachHang.setMaKh(sc.nextLine());
        System.out.println("Nhap ten khach hang : ");
        khachHang.setTenKH(sc.nextLine());
        System.out.println("Nhap kich co : ");
        khachHang.setDiaChi(sc.nextLine());
        System.out.println("Nhap so luong : ");
        khachHang.setSdt(sc.nextLine());

    }

    @Override
    public void xuat(KhachHang khachHang){

        System.out.printf("%-20s %-20s %-20s %-20s", khachHang.getMaKh(), khachHang.getTenKH(), khachHang.getDiaChi(), khachHang.getSdt() );
    }

}
