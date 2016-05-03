package com.company;

import java.sql.*;
import java.util.ArrayList;


public class LoadDriver {

    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;
    ArrayList<String> ral = new ArrayList<>();

    public boolean grabDriver() {
        try {

            Class.forName("com.mysql.jdbc.Driver").newInstance();

            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/hfjq_race_info?" + "user=root&password=");

            System.out.println("Catalog of DB is: " + conn.getCatalog());

            stmt = conn.createStatement();

            rs = stmt.executeQuery("select * from runners");

            System.out.println("Current row is: " + rs.getRow());

            //rs.absolute(3);

            //System.out.println("Current row is: " + rs.getRow());

            //int i = 1;

            ResultSetMetaData metadata = rs.getMetaData();

            int numberOfColumns = metadata.getColumnCount();
            int numberOfRows = 0;

            if (rs.last()) {

                numberOfRows = rs.getRow();
                rs.beforeFirst();
            }

            System.out.println("Number of rows is: " +  numberOfRows);

            System.out.println("Number of columns is: " + numberOfColumns);

            while (rs.next()) {

                int i = 1;

                while (i <= numberOfColumns) {

                    ral.add(rs.getString(i++));

                }

                System.out.println(rs.getString("runner_id"));
                System.out.println(rs.getString("first_name"));
                System.out.println(rs.getString("last_name"));
                System.out.println(rs.getString("gender"));
                System.out.println(rs.getString("finish_time"));

            }


            System.out.println("RAL size is: " +  ral.size());




        } catch (Exception ex) {

            System.out.println("Caught exception trying to grab driver");

            ex.printStackTrace();

            return false;

        } finally {

            if (rs != null) {

                try {

                    rs.close();

                } catch (SQLException sqlEx) {

                    System.out.println("exception closing execute query");

                }

            }

            if (stmt != null) {

                try {

                    stmt.close();

                } catch (SQLException sqlEx) {

                    System.out.println("exception closing statement");

                }

            }


        }
        return true;
    }








}