package com.sample;

public class Timesheet {

	private int EmployeeHours;
	private Boolean projectBudgetOk;
	private Boolean duplicateTimesheet;
	private Boolean overlappingTimesheet;
	private String payStatus;

	public int getEmployeeHours() {
		return EmployeeHours;
	}

	public Boolean getProjectBudgetOk() {
		return projectBudgetOk;
	}

	public Boolean getDuplicateTimesheet() {
		return duplicateTimesheet;
	}

	public Boolean getOverlappingTimesheet() {
		return overlappingTimesheet;
	}

	public String getPayStatus() {
		return payStatus;
	}

	public void setEmployeeHours(int employeeHours) {
		EmployeeHours = employeeHours;
	}

	public void setProjectBudgetOk(Boolean projectBudgetOk) {
		this.projectBudgetOk = projectBudgetOk;
	}

	public void setDuplicateTimesheet(Boolean duplicateTimesheet) {
		this.duplicateTimesheet = duplicateTimesheet;
	}

	public void setOverlappingTimesheet(Boolean overlappingTimesheet) {
		this.overlappingTimesheet = overlappingTimesheet;
	}

	public void setPayStatus(String payStatus) {
		this.payStatus = payStatus;
	}

}
