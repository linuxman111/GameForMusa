package com.company;


import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;
import java.io.File;
import java.io.FileOutputStream;
import java.util.Map;



public class ProcessExcel {




    public String createWorkbook(String filename, Map data) {

        Workbook wb = new HSSFWorkbook();
        Sheet sheet;

        try {

            FileOutputStream fileOut = new FileOutputStream(filename);

            sheet = wb.createSheet("TestSheet");

            //CreationHelper helper = wb.getCreationHelper();

            for (int i = 0; i < data.size(); i++) {

                Row row = sheet.createRow(i);

                Cell cell0 = row.createCell(0);
                Cell cell1 = row.createCell(1);

                Integer key = (Integer) i + 1;
                String value = (String) data.get(key);

                cell0.setCellValue(key);
                cell1.setCellValue(value);

            }

            wb.write(fileOut);

            fileOut.close();


        } catch (Exception e) {

            System.out.println("Exception caught attempting to create " + filename);

        }

        return filename;


    }


    public void readWorkbook() {

        try {

            Workbook wb = WorkbookFactory.create(new File("newFile.xls"));

            Sheet sheet = wb.getSheet("TestSheet");

            Row row = sheet.getRow(0);

            Cell firstCell = row.getCell(0);

            Cell secondCell = row.getCell(1);

            System.out.println(firstCell);
            System.out.println(secondCell);

            wb.close();


        } catch (Exception e) {

            System.out.println("Caught exception");

        }

    }


}
