package gr.giliopoulos.sample.domain;


import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "employees")
@NamedQuery(name = "gr.giliopoulos.sample.domain.Employee.findAllEmployees", query = "SELECT e FROM Employee e")
public class Employee {

    @Id
    @GeneratedValue
    @Column(name = "emp_no")
    private Long id;

    @Column(name = "birth_date")
    private Date birthDate;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

/*    @Enumerated(EnumType.STRING)
    @Type(type = "org.hibernate.type.EnumType")
    private Gender gender;*/

    @Column(name = "hire_date")
    private Date hireDate;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

 /*   public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }*/

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }
}
