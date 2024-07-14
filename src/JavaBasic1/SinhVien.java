package JavaBasic1;

public class SinhVien {

    String tenLop_instance = "A123";
    public static String truong_static = "FTU";
    public void ThongTinSinhVien() {
        int siso_local = 50;      // Đây là biến local
        System.out.println("Tổng sĩ số: " + siso_local);
        System.out.println("Lớp: " + tenLop_instance);
    }

    public static void main(String[] args) {
        SinhVien SiSo = new SinhVien();
        SiSo.ThongTinSinhVien();
        //System.out.println(siso_local);
        System.out.println("Khối: " + khoi.khoi_static);
        System.out.println("Trường: " + truong_static);

    }
}
