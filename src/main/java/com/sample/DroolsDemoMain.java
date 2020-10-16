/*We are building timesheet management system where employer and contractor enter
 * daily start time,end time,project code,task details.
 * We need to execute set of rules whether to pay a timesheet,deny it
 * or ask for adjustments.
 * 
 * 
 */
package com.sample;

import org.kie.api.KieServices;

import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

public class DroolsDemoMain {

	public static final void main(String[] args) {
		try {
			// load up the knowledge base
			KieServices ks = KieServices.Factory.get();
			KieContainer kContainer = ks.getKieClasspathContainer();
			KieSession kSession = kContainer.newKieSession("ksession-rules");

			Timesheet timesheet = getTimesheetValues();
			kSession.insert(timesheet);
			kSession.fireAllRules();
			System.out.println("Final timesheet Payment status " + timesheet.getPayStatus());
		} catch (Throwable t) {

			t.printStackTrace();
		}
	}

	private static Timesheet getTimesheetValues() {

		Timesheet timesheet = new Timesheet();
		timesheet.setEmployeeHours(50); // 5
		timesheet.setProjectBudgetOk(true); // true
		timesheet.setOverlappingTimesheet(false); // true
		return timesheet;
	}

}
