package cts.practise.seleniumprgrm;

import cts.miniproject.utility.ExcelDataConfig;

public class ReadExcelData {

public static void main(String[] args) {
// TODO Auto-generated method stub
ExcelDataConfig excel=new ExcelDataConfig("C:\\Users\\DELL\\eclipse-workspace\\awde\\src\\test\\resources\\XLSL\\Testdata.xlsx");
System.out.println(excel.getData(0, 0, 0));
System.out.println(excel.getData(0, 0, 1));
}

}