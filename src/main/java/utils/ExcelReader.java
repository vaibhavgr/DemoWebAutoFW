package utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import context.Constants;
import models.Person;

public class ExcelReader {

	public static  List<Person> readData() throws IOException {
		List<Person> PersonList = new ArrayList<Person>();
		FileInputStream fis = new FileInputStream(Constants.excelFile);
		Workbook workbook = new XSSFWorkbook(fis);
		// will give sheet number
		Sheet sheet = workbook.getSheetAt(0);
		int lastRowNum = sheet.getLastRowNum();
		for (int RowIndex = 1; RowIndex <= lastRowNum; RowIndex++) {
			Row row = sheet.getRow(RowIndex);
			String firstName = row.getCell(0).getStringCellValue();
			String lastname = row.getCell(1).getStringCellValue();
			String email = row.getCell(2).getStringCellValue();
			String password = row.getCell(3).getStringCellValue();
			String confirmPassword = row.getCell(4).getStringCellValue();
			System.out.println(firstName + lastname + email + password + confirmPassword);

			Person person = new Person(firstName, lastname, email, password, confirmPassword);
			PersonList.add(person);

		}
		return PersonList;
	}

}
