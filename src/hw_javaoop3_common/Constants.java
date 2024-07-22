package hw_javaoop3_common;

public class Constants {

    public static String browser = "Chrome";
    public static Boolean report = true;
    public static Boolean headless = false;



    public String getBrowser() {
        return browser;
    }

    public boolean isReport() {
        return report;
    }

    public boolean isHeadless() {
        return headless;
    }

    public void setBrowser(String browser) {
        this.browser = browser;
    }

    public void setReport(boolean report) {
        this.report = report;
    }

    public void setHeadless(boolean headless) {
        this.headless = headless;
    }
}
