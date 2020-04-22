package bean;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;
/**
 * @author Lstar
 * @version 1.0
 * @date 2020/4/21 17:43
 * 联系人的实体类
 */
@Entity
@Table(name = "linkman", schema = "studyhibernate", catalog = "studyhibernate")
public class LinkmanEntity  implements Serializable {
    private long lkmId;
    private String lkmName;
    private String lkmGender;
    private String lkmPhone;
    private String lkmMobile;
    private String lkmEmail;
    private String lkmMemo;

    //一对多关系映射，多的一方
    //从表实体包含主表实体的对象引用
    private CustomerEntity customer;

    public CustomerEntity getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerEntity customer) {
        this.customer = customer;
    }

    @Id
    @Column(name = "lkm_id")
    public long getLkmId() {
        return lkmId;
    }

    public void setLkmId(long lkmId) {
        this.lkmId = lkmId;
    }

    @Basic
    @Column(name = "lkm_name")
    public String getLkmName() {
        return lkmName;
    }

    public void setLkmName(String lkmName) {
        this.lkmName = lkmName;
    }

    @Basic
    @Column(name = "lkm_gender")
    public String getLkmGender() {
        return lkmGender;
    }

    public void setLkmGender(String lkmGender) {
        this.lkmGender = lkmGender;
    }

    @Basic
    @Column(name = "lkm_phone")
    public String getLkmPhone() {
        return lkmPhone;
    }

    public void setLkmPhone(String lkmPhone) {
        this.lkmPhone = lkmPhone;
    }

    @Basic
    @Column(name = "lkm_mobile")
    public String getLkmMobile() {
        return lkmMobile;
    }

    public void setLkmMobile(String lkmMobile) {
        this.lkmMobile = lkmMobile;
    }

    @Basic
    @Column(name = "lkm_email")
    public String getLkmEmail() {
        return lkmEmail;
    }

    public void setLkmEmail(String lkmEmail) {
        this.lkmEmail = lkmEmail;
    }

    @Basic
    @Column(name = "lkm_memo")
    public String getLkmMemo() {
        return lkmMemo;
    }

    public void setLkmMemo(String lkmMemo) {
        this.lkmMemo = lkmMemo;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (o == null || getClass() != o.getClass()){ return false;}
        LinkmanEntity that = (LinkmanEntity) o;
        return lkmId == that.lkmId &&
                Objects.equals(lkmName, that.lkmName) &&
                Objects.equals(lkmGender, that.lkmGender) &&
                Objects.equals(lkmPhone, that.lkmPhone) &&
                Objects.equals(lkmMobile, that.lkmMobile) &&
                Objects.equals(lkmEmail, that.lkmEmail) &&
                Objects.equals(lkmMemo, that.lkmMemo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(lkmId, lkmName, lkmGender, lkmPhone, lkmMobile, lkmEmail, lkmMemo);
    }

    @Override
    public String toString() {
        return "LinkmanEntity{" +
                "lkmId=" + lkmId +
                ", lkmName='" + lkmName + '\'' +
                ", lkmGender='" + lkmGender + '\'' +
                ", lkmPhone='" + lkmPhone + '\'' +
                ", lkmMobile='" + lkmMobile + '\'' +
                ", lkmEmail='" + lkmEmail + '\'' +
                ", lkmMemo='" + lkmMemo + '\'' +
                '}';
    }
}
