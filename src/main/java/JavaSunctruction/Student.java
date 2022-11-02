package JavaSunctruction;

public class Student {
    public String stdName="Tom hanks";
    private String sdtId="TH202201";
    private double gpa = 3.8;
    private boolean retired =true;

    public String getSdtId() {
        return sdtId;
    }

    public double getGpa() {
        return gpa;
    }

    public boolean isRetired() {
        return retired;

    }

    public void setSdtId(String sdtId) {
        this.sdtId = sdtId;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public boolean setRetired(boolean retired) {
        this.retired = retired;
        return retired;
    }
}
