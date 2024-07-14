package JavaBasic1;

public class VongLapFor {
    public static void main(String[] args) {

            // Khởi tạo mảng để lưu trữ các số chẵn
            int[] soChan = new int[26]; // Có 26 số chẵn từ 0 đến 50

            // Vòng lặp FOR để in ra các số chẵn từ 0 đến 50 và lưu vào mảng
            for (int i = 0, n = 0; i < 51; i += 2, n++) {
                soChan[n] = i;
            //System.out.println(soChan[n]);
            }

            // Duyệt mảng để in ra kết quả sau khi nạp vào

            System.out.println("Các số chẵn trong mảng:");

            for (int num : soChan) {    //vòng lặp for -each để duyệt qua tất cả các phần tử của một mảng hoặc một tập hợp
                System.out.println(num);
            }


            //Cách for đơn giản
            for (int n = 0; n< soChan.length; n++){
                System.out.println(soChan[n]);
            }
        }
    }
