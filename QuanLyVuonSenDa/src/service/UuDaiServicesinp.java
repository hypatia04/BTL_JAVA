package service;

import model.NhanVien;
import model.UuDai;

import java.util.Scanner;


public class UuDaiServicesinp implements UuDaiServices {
    @Override
    public void nhap(UuDai uuDai){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma ưu đãi : ");
        uuDai.setMaUD(sc.nextLine());
        System.out.println("Nhap Ngay bat dau : ");
        uuDai.setNgayBatDau(sc.nextLine());
        System.out.println("Nhap ngay kết thúc : ");
        uuDai.setNgayKetThuc(sc.nextLine());
        System.out.println("Nhap ty le chiet khau : ");
        uuDai.setTyLe(sc.nextFloat());
        System.out.println("Nhap so luong ma uu dai: ");
        uuDai.setSoluong(sc.nextInt());

    }

    @Override
    public void xuat(UuDai uuDai){

        System.out.printf("%-20s %-20s %-20s %-20f %-20i", uuDai.getMaUD(), uuDai.getNgayBatDau(), uuDai.getNgayKetThuc(), uuDai.getTyLe(), uuDai.getSoluong() );
    }

}
