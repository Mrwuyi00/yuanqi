package com.linwu.yuanqi.util;

/**
 * Created by linwu on 8/18/2017.
 */

import jxl.write.WritableWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;

public class Ruiou {


    /*public static void main(String[] args) {
        try {
            InputStream fis1 = new FileInputStream("D://aaa.xlsx");
            InputStream fis2 = new FileInputStream("D://bbb.xlsx");

            Workbook wb = new XSSFWorkbook();


            Workbook wb1 = new XSSFWorkbook(fis1);
            Workbook wb2 = new XSSFWorkbook(fis2);

            if(wb != null) {
                Sheet sheet = wb.createSheet("testdata");
                Row row0 = sheet.createRow(0);
                for(int i = 0; i < 11; i++) {
                   Cell cell_1 = row0.createCell(i, Cell.CELL_TYPE_STRING);
                   CellStyle style = getStyle(workbook);
                   cell_1.setCellStyle(style);
                   cell_1.setCellValue("HELLO" + i + "Column");
                   sheet.autoSizeColumn(i);
                }
                for (int rowNum = 1; rowNum < 200; rowNum++) {
                    Row row = sheet.createRow(rowNum);
                    for(int i = 0; i < 11; i++) {
                        Cell cell = row.createCell(i, Cell.CELL_TYPE_STRING);
                        cell.setCellValue("cell" + String.valueOf(rowNum+1) + String.valueOf(i+1));
                    }
                }
                try {
                     FileOutputStream outputStream = new FileOutputStream(excelPath);
                     workbook.write(outputStream);
                     outputStream.flush();
                     outputStream.close();
                     isCreateSuccess = true;
                    } catch (Exception e) {
                    e.printStackTrace();
                }
            }
            for (Sheet sheet : wb1) {

            }



            *//*WritableWorkbook newWb = jxl.Workbook.createWorkbook(new File("D://jxl.xlsx"));
			*//**//*SheetImpl lastSheet;
			lastSheet =*//**//*
            newWb.importSheet("NewSheet0", 0, (jxl.Sheet)wb1.getSheetAt(0));
            newWb.importSheet("NewSheet1", 1, (jxl.Sheet)wb1.getSheetAt(0));*//*
            fis1.close();
            fis2.close();
            wb1.close();
            wb2.close();
            newWb.write();
            newWb.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }*/


}
