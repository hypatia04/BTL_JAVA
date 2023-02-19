package service;

import model.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;


public class PhieuXuatServicesimp implements PhieuXuatServices {
    @Override
    public void nhap(PhieuXuat phieuXuat) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma phieu : ");
        phieuXuat.setMaPh(sc.nextLine());
        System.out.println("Nhap Ngay xuat: ");
        phieuXuat.setNgayXuat(sc.nextLine());
        KhachHangServicesimp  khachHangServicesimp = new KhachHangServicesimp();
        KhachHang khachHang = new KhachHang();
        khachHangServicesimp.nhap(khachHang);
        phieuXuat.setKhachHang(khachHang);
        System.out.println("Nhap so loai hang: ");
        phieuXuat.setSoLoai(sc.nextInt());
        HangServicesimp hangServicesimp = new HangServicesimp();

        ArrayList<Hang> hangs = null;
        for (int i = 0; i < phieuXuat.getSoLoai(); i++) {
            Hang hang = new Hang();
            hangs.add(hang);
        }
        phieuXuat.setHangs(hangs);
        NhanVienServicesimp nhanVienServicesimp = new NhanVienServicesimp();
        NhanVien nhanVien = new NhanVien();
        nhanVienServicesimp.nhap(nhanVien);
        phieuXuat.setNguoiGui(nhanVien);
        UuDaiServicesinp uuDaiServicesinp = new UuDaiServicesinp();
        UuDai uuDai = new UuDai();
        uuDaiServicesinp.nhap(uuDai);
        phieuXuat.setUuDai(uuDai);
    }

    @Override
    public void xuat(PhieuXuat phieuXuat){

        System.out.printf("%-20s %-20s %-20s ", phieuXuat.getMaPh(), phieuXuat.getNgayXuat(), phieuXuat.getKhachHang() );
        for(int i=0; i<phieuXuat.getSoLoai(); i++){
            System.out.println( phieuXuat.getHangs());
        }
        System.out.println(phieuXuat.getNguoiGui());
        System.out.println(phieuXuat.getUuDai());
    }

}
