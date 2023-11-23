package com.employee.EmployeeManagement.data.model;
import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Objects;
import java.time.LocalDate;

@Entity
public class Employee {
	  @Id
	    @GeneratedValue(strategy = GenerationType.AUTO)
	    private Integer id;
	    private String name;
	    private String department;
	    private LocalDate dob;
	    private LocalDateTime created_date_time;

	    public Employee(){}

		
		public Integer getId() {
			return id;
		}


		public void setId(Integer id) {
			this.id = id;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public String getDepartment() {
			return department;
		}


		public void setDepartment(String department) {
			this.department = department;
		}


		public LocalDate getDob() {
			return dob;
		}


		public void setDob(LocalDate dob) {
			this.dob = dob;
		}


		public LocalDateTime getCreated_date_time() {
			return created_date_time;
		}


		public void setCreated_date_time(LocalDateTime created_date_time) {
			this.created_date_time = created_date_time;
		}


		@Override
		public String toString() {
			return "Employee {id=" + id + 
					", name=" + name +'\''+
			       " department=" + department +'\''+
			       " dob=" + dob+'\''
				+ "created_date_time=" + created_date_time + "}";
		}


		@Override
		public int hashCode() {
			return Objects.hash(created_date_time, department, dob, id, name);
		}


		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Employee other = (Employee) obj;
			return Objects.equals(created_date_time, other.created_date_time)
					&& Objects.equals(department, other.department) && Objects.equals(dob, other.dob)
					&& Objects.equals(id, other.id) && Objects.equals(name, other.name);
		}

}