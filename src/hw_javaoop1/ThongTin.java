package hw_javaoop1;

import java.util.ArrayList;

public class ThongTin {
    public static void main(String[] args) {
        System.out.println("Cách 1: đơn giản, chỉ gọi lại thông tin từ class NhanVien");
        NhanVien nv0 = new NhanVien("Mỹ Anh", 39, "CEO","Sales");

        System.out.println(nv0.getHoTen());
        System.out.println(nv0.getTuoi());
        System.out.println(nv0.getChucVu());
        System.out.println(nv0.getPhongBan());

        System.out.println("______________________________");

        nv0.getEmployeeInfo();

        System.out.println("______________________________");

        System.out.println("Cách 2: phức tạp hơn, sử dụng ArrayList");

        NhanVien nv1 = new NhanVien("Anh", 23, "nhân viên", "cussea");
        NhanVien nv2 = new NhanVien("Mai", 25, "trưởng phòng", "cussea");
        NhanVien nv3 = new NhanVien("Hoa", 43, "quản lý", "cusair");

        ArrayList<NhanVien> DanhSachNhanVien = new ArrayList<>();
        DanhSachNhanVien.add(nv1);
        DanhSachNhanVien.add(nv2);
        DanhSachNhanVien.add(nv3);

        for(NhanVien nv: DanhSachNhanVien){
            System.out.println("__________________");
            nv.getEmployeeInfo();
        }


    }
}

