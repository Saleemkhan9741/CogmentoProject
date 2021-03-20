package com.crm.cogmento.testdata;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

import com.crm.cogmento.genericUtilities.Xls_Reader;

public class DataforCompanyCreation {
	static Xls_Reader reader;
	
	static ArrayList<Object[]> arr=new ArrayList<Object[]>();
	public static ArrayList<Object[]> companydata() throws FileNotFoundException
	{
			reader=new Xls_Reader("./Excel/companydata.xlsx");
			
			for(int rownum=2;rownum<=reader.getRowCount("Sheet1");rownum++) {
			String name = reader.getCellData("Sheet1", "name", rownum).toString();
			String address = reader.getCellData("Sheet1", "address", rownum).toString();	
			String city = reader.getCellData("Sheet1", "city", rownum).toString();
			String state = reader.getCellData("Sheet1", "state", rownum).toString();
			String pincode = reader.getCellData("Sheet1", "pincode", rownum).toString();
			String Phonenumber = reader.getCellData("Sheet1", "Phonenumber", rownum).toString();
			String Homenumber = reader.getCellData("Sheet1", "Homenumber", rownum).toString();
			String tags = reader.getCellData("Sheet1", "tags", rownum).toString();
			String Description = reader.getCellData("Sheet1", "Description", rownum).toString();
			String Socailhandle = reader.getCellData("Sheet1", "Socailhandle", rownum).toString();
			String Industry = reader.getCellData("Sheet1", "Industry", rownum).toString();
			String countofemp = reader.getCellData("Sheet1", "countofemp", rownum).toString();
			String Symbol = reader.getCellData("Sheet1", "Symbol", rownum).toString();
			String Revenue = reader.getCellData("Sheet1", "Revenue", rownum).toString();
			String vatnumber = reader.getCellData("Sheet1", "vatnumber", rownum).toString();
			String identifier = reader.getCellData("Sheet1", "identifier", rownum).toString();
			String image = reader.getCellData("Sheet1", "image", rownum).toString();
			Object[] obj= {name,address,city,state,pincode,Phonenumber,Homenumber,tags,Description,Socailhandle,Industry
					,countofemp,Symbol,Revenue,vatnumber,identifier,image};
			arr.add(obj);
			}
		return arr;
		}
	
}
