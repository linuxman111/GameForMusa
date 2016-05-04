package com.company;

import java.sql.*;
import java.util.ArrayList;


public class LoadDriver {

    Connection conn = null;
    Statement stmt = null;
    ResultSet rs = null;
    ArrayList<String> ral = new ArrayList<>();

    public boolean grabDriver() {

        String sql = "select * from runners";

        try {

            Class.forName("com.mysql.jdbc.Driver").newInstance();

            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/game?" + "user=root&password=");

            //System.out.println("Catalog of DB is: " + conn.getCatalog());

            stmt = conn.createStatement();

            rs = stmt.executeQuery(sql);

            //System.out.println("Current row is: " + rs.getRow());

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

            //System.out.println("Number of rows is: " +  numberOfRows);

            //System.out.println("Number of columns is: " + numberOfColumns);

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

            ex.printStackTrace();

            return false;

        } finally {

            if (rs != null) {

                try {

                    rs.close();

                } catch (SQLException sqlEx) {

                    sqlEx.printStackTrace();

                }

            }

            if (stmt != null) {

                try {

                    stmt.close();

                } catch (SQLException sqlEx) {

                    sqlEx.printStackTrace();

                }

            }


        }
        return true;
    }




    public boolean addToDB(String name, String weapon, int health, int strength) {

        int insertID = getNextID();

            if (insertID == -1) {

                System.out.println("getNextID method failed");

            }

        String insertName = name;
        String insertWeapon = weapon;
        int insertHealth = health;
        int insertStrength = strength;

        //String sql = "UPDATE runners SET first_name = '" + newName + "' WHERE runner_id = 3";
        String sql = "insert into player (tokenKey, name, weapon, health, strength) values ('" + insertID + "', '" + insertName + "', '" + insertWeapon + "', '" + insertHealth + "', '" + insertStrength + "')";

        try {

            Class.forName("com.mysql.jdbc.Driver").newInstance();

            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/game?" + "user=root&password=");

            stmt = conn.createStatement();

            stmt.executeUpdate(sql);

            return true;

        } catch (Exception ex) {

            ex.printStackTrace();

            return false;

        } finally {

            try {

                conn.close();

            } catch (SQLException es) {

                es.printStackTrace();

            }

            return true;

        }
    }


    public int getNextID() {

        int lastID = -1;

        String sql = "SELECT tokenKey FROM player WHERE tokenKey=(SELECT MAX(tokenKey) FROM player);";

        try {

            Class.forName("com.mysql.jdbc.Driver").newInstance();

            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/game?" + "user=root&password=");

            stmt = conn.createStatement();

            ResultSet result = stmt.executeQuery(sql);

            result.next();

            lastID = result.getInt(1);

                    System.out.println(lastID);


        } catch (Exception ex) {

            ex.printStackTrace();

            return -1;

        } finally {

            try {

                conn.close();

            } catch (SQLException sex) {

                sex.printStackTrace();

            }

        }

        return lastID + 1;

    }



}