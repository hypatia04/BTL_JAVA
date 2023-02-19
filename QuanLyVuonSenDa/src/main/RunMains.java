package main;

import dao.Hangdao;
import dao.KhachHangdao;
import dao.NhanViendao;
import dao.TaiKhoanQuanLydao;
import model.Hang;
import model.KhachHang;
import model.NhanVien;
import model.TaiKhoanQuanLy;
import service.HangServicesimp;
import service.KhachHangServicesimp;
import service.NhanVienServicesimp;

import java.util.List;
import java.util.Scanner;

public class RunMains {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        do{
            String username;
            String password;
            System.out.println("Dang nhap vao he thong");
            System.out.println("Nhap vao ten tai khoan");
            username = sc.nextLine();
            System.out.println("Nhap mat khau tai khoan");
            password = sc.nextLine();
            int chose;
            List<TaiKhoanQuanLy> taiKhoanQuanLyList = listtk();
            for(int i=0; i< taiKhoanQuanLyList.size(); i++){
                if(username.equals(taiKhoanQuanLyList.get(i).getUsername()) && password.equals(taiKhoanQuanLyList.get(i).getPassword())){
                    do{
                        System.out.println("Quan Ly Vuon SEN DA:  ");
                        System.out.println("1.Quan Ly Hang SEN");
                        System.out.println("2.Quan ly Khach Hang");
                        System.out.println("3.Quan Ly Nhan vien");
                        System.out.println("4.Quan Ly Phieu Xuat");
                        System.out.println("5.quan ly Uu dai");
                        System.out.println("6.Thoat");
                        System.out.println("Lua chon cua ban: ");
                        chose = sc.nextInt();
                        switch (chose){
                            case 1:{
                                quanlyhang();
                                break;
                            }
                            case 2:{
                                quanlyKhachhang();
                                break;
                            }
                            case 3:{
                                quanglyNhanvien();
                                break;
                            }
                            case 4:{
                                //quanlyPhieu();
                                System.out.println("Chuc nang chua cap nhat");
                                break;
                            }
                            case 5:{
                                //quanlyUuDai();
                                System.out.println("Chuc nang chua cap nhat");
                                break;
                            }

                        }
                    }while(chose != 5);
                }
            }
        }while(true);

    }
    public static List<TaiKhoanQuanLy> listtk(){
        TaiKhoanQuanLydao taiKhoanQuanLydao = new TaiKhoanQuanLydao();
        return taiKhoanQuanLydao.getTaiKhoan();

    }


    public static void quanlyhang(){
        int chose2 ;
        do{
            System.out.println("QUAN LY HANG SEN DA");
            System.out.println("1.Them hang: ");
            System.out.println("2.Cap nhat thong tin Hang: ");
            System.out.println("3.Xoa Hang: ");
            System.out.println("4.Hien thi tat ca: ");
            System.out.println("5.Tim kiem theo ma hang: ");
            System.out.println("6.Tim kiem theo ten: ");
            System.out.println("7.thoat");
            System.out.println("Ban lua chon : ");
            chose2 = sc.nextInt();
            switch (chose2){
                case 1:{
                    themhang();
                    break;
                }
                case 2:{
                    capnhathang();
                    break;
                }
                case 3:{
                    xoahang();
                    break;
                }
                case 4:{
                    hienthihang();
                    break;
                }
                case 5:{
                    timkiemhangid();
                    break;
                }
                case 6:{
                    timkiemhangten();
                    break;
                }

            }
        }while(chose2 != 6);
    }

    public static void themhang(){
        HangServicesimp hangServicesimp = new HangServicesimp();
        Hangdao hangdao = new Hangdao();
        Hang hang = new Hang();
        hangServicesimp.nhap(hang);
        hangdao.them(hang);
    }
    public static void capnhathang(){

        // sửa thành 2 trường hợp nếu đúng id thì sửa không thì in lỗi
        HangServicesimp hangServicesimp = new HangServicesimp();
        Hangdao hangdao  = new Hangdao();
        Hang hang = new Hang();

        hangServicesimp.nhap(hang);
        hangdao.capnhat(hang);
    }
    public static void xoahang(){
        Hangdao hangdao = new Hangdao();
        System.out.println("Nhap ma hang muon xoa: ");
        String mah =sc.nextLine();

        hangdao.xoa(mah);
    }
    public  static void hienthihang(){
        Hangdao hangdao = new Hangdao();
        hangdao.hienthi();
    }

    public static void timkiemhangid(){
        Hangdao hangdao = new Hangdao();
        System.out.println("Nhap ma hang can tim: ");
        String mah = sc.nextLine();

        hangdao.timtheoid(mah);
    }
    public static void timkiemhangten(){
        Hangdao hangdao = new Hangdao();
        System.out.println("Nhap ten hang can tim: ");
        String ten = sc.nextLine();

        hangdao.timtheoid(ten);
    }


    public static void quanlyKhachhang(){
        int chose3 ;
        do{
            System.out.println("QUAN LY Khach Hang");
            System.out.println("1.Them khach hang: ");
            System.out.println("2.Cap nhat thong tin khach Hang: ");
            System.out.println("3.Xoa khach hang: ");
            System.out.println("4.Hien thi danh sach: ");
            System.out.println("5.Tim kiem theo ma khach hang: ");
            System.out.println("6.Tim kiem theo ten khach hang: ");
            System.out.println("7.Thoat");
            System.out.println("Ban lua chon :");
            chose3 = sc.nextInt();
            switch (chose3){
                case 1:{
                    themkhachhang();
                    break;
                }
                case 2:{
                    capnhatkhachhang();
                    break;
                }
                case 3:{
                    xoakhachhang();
                    break;
                }
                case 4:{
                    hienthikhachhang();
                    break;
                }
                case 5:{
                    timkiemkhachhangid();
                    break;
                }
                case 6:{
                    timkiemkhachhangten();
                    break;
                }

            }
        }while(chose3 != 6);
    }

    public static void themkhachhang(){
        KhachHangServicesimp khachHangServicesimp = new KhachHangServicesimp();
        KhachHangdao khachHangdao = new KhachHangdao();
        KhachHang khachHang= new KhachHang();
        khachHangServicesimp.nhap(khachHang);
        khachHangdao.them(khachHang);
    }
    public static void capnhatkhachhang(){

        // sửa thành 2 trường hợp nếu đúng id thì sửa không thì in lỗi
        KhachHangServicesimp khachHangServicesimp = new KhachHangServicesimp();
        KhachHangdao khachHangdao  = new KhachHangdao();
        KhachHang khachHang = new KhachHang();

        khachHangServicesimp.nhap(khachHang);
        khachHangdao.capnhat(khachHang);
    }
    public static void xoakhachhang(){
        KhachHangdao khachHangdao = new KhachHangdao();
        System.out.println("Nhap ma khach hang muon xoa: ");
        String makh =sc.nextLine();

        khachHangdao.xoa(makh);
    }
    public  static void hienthikhachhang(){
        KhachHangdao khachHangdao = new KhachHangdao();
        khachHangdao.hienThi();
    }

    public static void timkiemkhachhangid(){
        KhachHangdao khachHangdao = new KhachHangdao();
        System.out.println("Nhap ma khach hang can tim: ");
        String mah = sc.nextLine();

        khachHangdao.timtheoid(mah);
    }
    public static void timkiemkhachhangten(){
        KhachHangdao khachHangdao = new KhachHangdao();
        System.out.println("Nhap ten khach hang can tim: ");
        String ten = sc.nextLine();

        khachHangdao.timtheoid(ten);
    }


    public static void quanglyNhanvien(){
        int chose4 ;
        do{
            System.out.println("QUAN LY Nhan Vien");
            System.out.println("1.Them Nhan vien: ");
            System.out.println("2.Cap nhat thong tin nhan vien: ");
            System.out.println("3.Xoa nhan: ");
            System.out.println("4.Hien thi nhan vien: ");
            System.out.println("5.Tim kiem theo ma nhan vien: ");
            System.out.println("6.Tim kiem theo ten nhan vien: ");
            System.out.println("7.Thoat");
            System.out.println("Ban lua chon :");
            chose4 = sc.nextInt();
            switch (chose4){
                case 1:{
                    themnhanvien();
                    break;
                }
                case 2:{
                    capnhatnhanvien();
                    break;
                }
                case 3:{
                    xoanhanvien();
                    break;
                }
                case 4:{
                    hienthinhanvien();
                    break;
                }
                case 5:{
                    timkiemnhanvienid();
                    break;
                }
                case 6:{
                    timkiemnhanvienten();
                    break;
                }

            }
        }while(chose4!= 6);
    }

    public static void themnhanvien(){
        NhanVienServicesimp nhanVienServicesimp = new NhanVienServicesimp();
        NhanViendao nhanViendao = new NhanViendao();
        NhanVien nhanVien= new NhanVien();
        nhanVienServicesimp.nhap(nhanVien);
        nhanViendao.them(nhanVien);
    }
    public static void capnhatnhanvien(){

        // sửa thành 2 trường hợp nếu đúng id thì sửa không thì in lỗi
        NhanVienServicesimp nhanVienServicesimp = new NhanVienServicesimp();
        NhanViendao   nhanViendao = new NhanViendao();
        NhanVien nhanVien = new NhanVien();

        nhanVienServicesimp.nhap(nhanVien);
        nhanViendao.capnhat(nhanVien);
    }
    public static void xoanhanvien(){
        NhanViendao nhanViendao = new NhanViendao();
        System.out.println("Nhap ma nhan vien muon xoa: ");
        String makh =sc.nextLine();

        nhanViendao.xoa(makh);
    }
    public  static void hienthinhanvien(){
        NhanViendao nhanViendao = new NhanViendao();
        nhanViendao.hienThi();
    }

    public static void timkiemnhanvienid(){
        NhanViendao nhanViendao = new NhanViendao();
        System.out.println("Nhap ma nhan vien can tim: ");
        String mah = sc.nextLine();

        nhanViendao.timtheoid(mah);
    }
    public static void timkiemnhanvienten(){
        NhanViendao nhanViendao = new NhanViendao();
        System.out.println("Nhap ten nhan can tim: ");
        String ten = sc.nextLine();

        nhanViendao.timtheoid(ten);
    }
}
