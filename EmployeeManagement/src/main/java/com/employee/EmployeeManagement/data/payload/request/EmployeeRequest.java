package com.employee.EmployeeManagement.data.payload.request;

import java.time.LocalDate;
import java.time.LocalDateTime;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

public class EmployeeRequest {
	    @NotBlank
	    @NotNull
	    private String name;
	    @NotBlank
	    @NotNull
	    private String department;
	    @NotBlank
	    @NotNull
	    private LocalDate dob;
	    @NotBlank
	    @NotNull
	    private LocalDateTime created_date_time;
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
	    
}

		