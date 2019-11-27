package be.intecbrussel.classiccars.entity;
import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "employees")
public class Employee {
    @Id
    private int employeeNumber;
    private String lastName;
    private String firstName;
    private String extension;
    private String email;
    private String jobTitle;
    @ManyToOne
    @JoinColumn(name ="reportsTo")
    private Employee reportsTo;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "officeCode")
    @MapsId("officeCode")
    private Office officeCode;

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public void setEmployeeNumber(int employeeNumber) {
        this.employeeNumber = employeeNumber;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public Employee getReportsTo() {
        return reportsTo;
    }

    public void setReportsTo(Employee reportsTo) {
        this.reportsTo = reportsTo;
    }

    public Office getOfficeCode() {
        return officeCode;
    }

    public void setOfficeCode(Office officeCode) {
        this.officeCode = officeCode;
    }

    @Override
    public String toString() {
        return "EmployeeDao{" +
                "employeeNumber=" + employeeNumber +
                ", lastName='" + lastName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", extension='" + extension + '\'' +
                ", email='" + email + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", reportsTo=" + reportsTo +
                ", officeCode=" + officeCode +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return employeeNumber == employee.employeeNumber &&
                Objects.equals(lastName, employee.lastName) &&
                Objects.equals(firstName, employee.firstName) &&
                Objects.equals(extension, employee.extension) &&
                Objects.equals(email, employee.email) &&
                Objects.equals(jobTitle, employee.jobTitle) &&
                Objects.equals(reportsTo, employee.reportsTo) &&
                Objects.equals(officeCode, employee.officeCode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(employeeNumber, lastName, firstName, extension, email, jobTitle, reportsTo, officeCode);
    }
}
