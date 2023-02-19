package service;
import model.Hang;
import java.util.Scanner;
import java.util.*;

public class HangServicesimp implements HangServices {
    @Override
    public void nhap(Hang hang){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ma hang : ");
        hang.setMasp(sc.nextLine());
        System.out.println("Nhap ten hang : ");
        hang.setTensp(sc.nextLine());
        System.out.println("Nhap kich co : ");
        hang.setKichCo(sc.nextLine());
        System.out.println("Nhap so luong : ");
        hang.setSoLuong(sc.nextLong());
        System.out.println("Nhap don Gia : ");
        hang.setDonGia(sc.nextLong());
        System.out.println("Nhap ten khu : ");
        hang.setDiaChi(sc.nextLine());
    }

    @Override
    public void xuat(Hang hang){

        System.out.printf("%-20s %-20s %-20l %-20l %-20s", hang.getMasp(), hang.getTensp(), hang.getKichCo(), hang.getSoLuong(), hang.getDonGia(), hang.getDiaChi() );
    }

}
