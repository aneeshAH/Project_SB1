package model;

import java.math.BigInteger;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/** Main Class.*/
@Entity
public class Company {

/** Variable.*/
@Id
@GeneratedValue
@Column(name = "company_id")
private Integer companyId;

/** Variable.*/
@Column(name = "company_name")
private String companyName;

/** Variable.*/
@Column(name = "company_type")
private String companyType;

/** Variable.*/
@Column(name = "company_phone")
private BigInteger companyPhone;

/** Variable.*/
@Column(name = "company_email")
private String companyEmail;

/** Variable.*/
public Company() {
}

/** Company ID Getter.
* @return companyEmail **this returns Company ID**.
**/
public final Integer getCompanyId() {
return companyId;
}

/** Company ID Setter.
* @param companyId **this is an argument of application**.
**/
public final void setCompanyId(final Integer companyId) {
this.companyId = companyId;
}

/** Company Name Getter.
* @return companyEmail **this returns Company Name**.
**/
public final String getCompanyName() {
return companyName;
}

/** Company Name Setter.
* @param companyName **this is an argument of application**.
**/
public final void setCompanyName(final String companyName) {
this.companyName = companyName;
}

/** Company Type Getter.
* @return companyEmail **this returns Company Type**.
**/
public final String getCompanyType() {
return companyType;
}

/** Company Type Setter.
* @param companyType **this is an argument of application**.
**/
public final void setCompanyType(final String companyType) {
this.companyType = companyType;
}

/** Company Phone Getter.
* @return companyEmail **this returns Company Phone**.
**/
public final BigInteger getCompanyPhone() {
return companyPhone;
}

/** Company Phone Setter.
* @param companyPhone **this is an argument of application**.
**/
public final void setCompanyPhone(final BigInteger companyPhone) {
this.companyPhone = companyPhone;
}

/** Company Email Getter.
* @return companyEmail **this returns Company Email**.
**/
public final String getCompanyEmail() {
return companyEmail;
}

/** Company Email Setter.
* @param companyEmail **this is an argument of application**.
**/
public final void setCompanyEmail(final String companyEmail) {
this.companyEmail = companyEmail;
}
}