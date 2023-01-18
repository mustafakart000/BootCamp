package core_java_practice.encapsulation;

public class CreditCard {
    private String ccn ="1232323409430423";
    private int age =21;
    private boolean isExpired= false;

    public String getCcn() {
        return ccn;
    }

    public void setCcn(String ccn) {
        this.ccn = ccn;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    //finish time of card
    public boolean isExpired() {
        return isExpired;
    }

    public void setExpired(boolean expired) {
        isExpired = expired;
    }
}
