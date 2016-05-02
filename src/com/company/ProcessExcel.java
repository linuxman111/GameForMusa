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

            for (int i = 0; i < data.size(); i++) {

                Row row = sheet.createRow(i);

                Cell cell0 = row.createCell(0);
                Cell cell1 = row.createCell(1);

                Integer key = i + 1;
                String value = (String) data.get(key);

                cell0.setCellType(0);
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


    public String[] readWorkbook(String filename) {

        String[] inputArray = null;

        try {

            Workbook wb = WorkbookFactory.create(new File(filename));

            Sheet sheet = wb.getSheet("sheet");

            int numberOfRows = sheet.getPhysicalNumberOfRows();

            inputArray = new String[numberOfRows];

            for (int i = 0; i < numberOfRows; i++) {

                Row row = sheet.getRow(i);

                Cell getCell = row.getCell(0);

                String cellValue = getCell.getStringCellValue();

                inputArray[i] = cellValue;


            }

            wb.close();

            return inputArray;


        } catch (Exception e) {

            System.out.println("Caught exception");

        }

        return inputArray;

    }


}
