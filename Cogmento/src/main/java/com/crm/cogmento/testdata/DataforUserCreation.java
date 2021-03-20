package com.crm.cogmento.testdata;

import java.util.ArrayList;

import com.crm.cogmento.genericUtilities.JavaUtility;
import com.crm.cogmento.genericUtilities.Xls_Reader;

public class DataforUserCreation {
	
	public static ArrayList<Object[]> crmData() throws Throwable{
		
			ArrayList<Object[]> obj=new ArrayList<Object[]>();
			
			Xls_Reader xls=new Xls_Reader("./Excel/CRM user list.xlsx");
			JavaUtility jlib=new JavaUtility();
			
			
			for(int rownum=2;rownum<=xls.getRowCount("Sheet1");rownum++)
			{
			String title = xls.getCellData("Sheet1","Title", rownum)+"_"+jlib.getRanDomData();
			String Tags = xls.getCellData("Sheet1","Tags", rownum);
			String Description = xls.getCellData("Sheet1","Description", rownum);
			String Location = xls.getCellData("Sheet1","Location", rownum);
			String Deal = xls.getCellData("Sheet1","Deal", rownum);
			String Task = xls.getCellData("Sheet1","Task", rownum);
			String AssignedTo = xls.getCellData("Sheet1","'AssignedTo", rownum);
			String Participants = xls.getCellData("Sheet1","Participants", rownum);
			String Company = xls.getCellData("Sheet1","Company", rownum);
			String Recurrence = xls.getCellData("Sheet1","Recurrence", rownum);
			String Identifier= xls.getCellData("Sheet1","Identifier", rownum);
			String Case = xls.getCellData("Sheet1","'Case", rownum);
			String ReminderTime = xls.getCellData("Sheet1","ReminderTime", rownum);		
			Object ob[]= {title,Tags,Description,Location,Deal,Task,AssignedTo,Participants,Company,Recurrence,Identifier,Case,ReminderTime};
			obj.add(ob);
			}
		return obj;
	}
}
