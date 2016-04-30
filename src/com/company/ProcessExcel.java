package com.company;


import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.*;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Map;
import java.util.Set;


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

/*
    public void writeToWorkbook(Map data) {


        for (int i = 0; i < data.size(); i++) {

            Row row = sheet.createRow(i);

            Cell cell = row.createCell(3);

            cell.setCellValue("hi");


        } */






}
