package onetoone;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;


@Entity
public class Computer {

    @Id
    private Long id;

    private String serialNo;
    @Column(length = 8)
    private String brand;


   @OneToOne(mappedBy = "computer")
   private Developer03 developer;


    public Computer() {
    }

    public Computer(Long id, String serialNo, String brand) {
        this.id = id;
        this.serialNo = serialNo;
        this.brand = brand;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Developer03 getDeveloper() {
        return developer;
    }

    public void setDeveloper(Developer03 developer) {
        this.developer = developer;
    }

    @Override
    public String toString() {

        return "Computer{" +
                "id=" + id +
                ", serialNo='" + serialNo + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}
