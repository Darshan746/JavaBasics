package ArrayListImpl;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Employee {
    String name;
    Address address;

    Employee(String name, Address address){
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", address=" + address +
                '}';
    }


    public static void main(String[] args) {
        Employee e1 = new Employee("name", new Address());
        Employee e2 = new Employee("name", new Address());
        Employee e3 = new Employee("name", new Address());
        Set<Employee> employees = new HashSet<>();
        employees.add(e1);
        employees.add(e2);
        employees.add(e3);
        System.out.println(employees.size());


    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return Objects.equals(name, employee.name);
    }



    @Override
    public int hashCode() {
        return 2;
    }
}
