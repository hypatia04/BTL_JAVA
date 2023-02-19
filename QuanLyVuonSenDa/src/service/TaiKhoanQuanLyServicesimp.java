package service;

import model.TaiKhoanQuanLy;
import model.UuDai;

import java.util.Scanner;


public class TaiKhoanQuanLyServicesimp implements TaiKhoanQuanLyServices {
    @Override
    public void nhap(TaiKhoanQuanLy taiKhoanQuanLy){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma ưu đãi : ");
        taiKhoanQuanLy.setUsername(sc.nextLine());
        System.out.println("Nhap Ngay bat dau : ");
        taiKhoanQuanLy.setPassword(sc.nextLine());
        System.out.println("Nhap ngay kết thúc : ");
        taiKhoanQuanLy.setSdt(sc.nextLine());

    }

    @Override
    public void xuat(TaiKhoanQuanLy taiKhoanQuanLy){

        System.out.printf("%-20s %-20s %-20s ", taiKhoanQuanLy.getUsername(), taiKhoanQuanLy.getPassword(), taiKhoanQuanLy.getSdt() );
    }

}
