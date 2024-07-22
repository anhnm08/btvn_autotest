package hw_javaoop1;

public class NhanVien {

    //Khai báo biến để lưu trữ thông tin nhân viên
    private String hoTen;
    private int tuoi;
    private String chucVu;
    private String phongBan;

    //Hàm xây dựng
    public NhanVien(String hoTen, int tuoi, String chucVu, String phongBan){
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.chucVu = chucVu;
        this.phongBan = phongBan;
    }

    //Các hàm getter để lấy giá trị từ các biến
    public String getHoTen(){
        return hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public String getChucVu() {
        return chucVu;
    }

    public String getPhongBan() {
        return phongBan;
    }

    public void getEmployeeInfo(){
        System.out.println(hoTen);
        System.out.println(tuoi);
        System.out.println(chucVu);
        System.out.println(phongBan);
    }
}
