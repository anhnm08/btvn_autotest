package hw_javaoop3_common;

public class BaseTest {
//Lưu ý: biến static truy cập bằng cách [tên class].[tên biến]
    public void createDriver(String browser) {
        System.out.println("Open browser: " + browser);
        System.out.println("Init Report: " + Constants.report);
        System.out.println("Headless mode: " + Constants.headless);
    }

    public void closeDriver(String browser){
        System.out.println("Close browser: "+ browser);
    }


}
