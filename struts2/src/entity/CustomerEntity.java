package entity;

import javax.persistence.*;
import java.util.Objects;

/**
 * @author Lstar
 * @version 1.0
 * @date 2020/4/26 19:25
 */
@Entity
@Table(name = "customer", schema = "studyhibernate", catalog = "studyhibernate")
public class CustomerEntity {
    @Id
    @Column(name = "cust_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long custId;

    @Basic
    @Column(name = "cust_name")
    private String custName;

    @Basic
    @Column(name = "cust_source")
    private String custSource;

    @Basic
    @Column(name = "cust_industry")
    private String custIndustry;

    @Basic
    @Column(name = "cust_level")
    private String custLevel;

    @Basic
    @Column(name = "cust_address")
    private String custAddress;

    @Basic
    @Column(name = "cust_phone")
    private String custPhone;


    public long getCustId() {
        return custId;
    }

    public void setCustId(long custId) {
        this.custId = custId;
    }


    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }


    public String getCustSource() {
        return custSource;
    }

    public void setCustSource(String custSource) {
        this.custSource = custSource;
    }


    public String getCustIndustry() {
        return custIndustry;
    }

    public void setCustIndustry(String custIndustry) {
        this.custIndustry = custIndustry;
    }


    public String getCustLevel() {
        return custLevel;
    }

    public void setCustLevel(String custLevel) {
        this.custLevel = custLevel;
    }


    public String getCustAddress() {
        return custAddress;
    }

    public void setCustAddress(String custAddress) {
        this.custAddress = custAddress;
    }


    public String getCustPhone() {
        return custPhone;
    }

    public void setCustPhone(String custPhone) {
        this.custPhone = custPhone;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (o == null || getClass() != o.getClass()){ return false;}
        CustomerEntity that = (CustomerEntity) o;
        return custId == that.custId &&
                Objects.equals(custName, that.custName) &&
                Objects.equals(custSource, that.custSource) &&
                Objects.equals(custIndustry, that.custIndustry) &&
                Objects.equals(custLevel, that.custLevel) &&
                Objects.equals(custAddress, that.custAddress) &&
                Objects.equals(custPhone, that.custPhone);
    }

    @Override
    public int hashCode() {
        return Objects.hash(custId, custName, custSource, custIndustry, custLevel, custAddress, custPhone);
    }

    @Override
    public String toString() {
        return "CustomerEntity{" +
                "custId=" + custId +
                ", custName='" + custName + '\'' +
                ", custSource='" + custSource + '\'' +
                ", custIndustry='" + custIndustry + '\'' +
                ", custLevel='" + custLevel + '\'' +
                ", custAddress='" + custAddress + '\'' +
                ", custPhone='" + custPhone + '\'' +
                '}';
    }
}
