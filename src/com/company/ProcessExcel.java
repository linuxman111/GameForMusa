package com.company;


import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import java.io.FileOutputStream;
import java.io.IOException;


public class ProcessExcel {




    public void createWorkbook(String filename, String sheetname) throws IOException {

        try {


            Workbook wb = new HSSFWorkbook();
            Sheet sheet = wb.createSheet(sheetname);

            FileOutputStream fileOut = new FileOutputStream(filename);

            wb.write(fileOut);

            fileOut.close();


        } catch (Exception e) {

            System.out.println("Exception caught attempting to create " + filename);

        }


    }



}
