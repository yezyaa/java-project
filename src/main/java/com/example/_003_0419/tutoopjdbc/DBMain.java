package com.example._003_0419.tutoopjdbc;

import java.sql.*;

public class DBMain {
    public static void main(String[] args) {
        initPerson();
//        getCodeName(); // 기존 테이블 가져옴
    }
    private static void initPerson() {
        Connection conn = null;
        Statement smt = null;
        PreparedStatement psmt = null;
        ResultSet rs = null;
        try {
            conn = DriverManager.getConnection("jdbc:sqlite:world.db");
            smt = conn.createStatement();
            smt.setQueryTimeout(30);  // set timeout to 30 sec.

            smt.executeUpdate("drop table if exists person");
            smt.executeUpdate("create table person (id integer, name string)");
            smt.executeUpdate("insert into person values(1, 'leo')");
            smt.executeUpdate("insert into person values(2, 'yui')");
            rs = smt.executeQuery("select * from person");
            while(rs.next()) {
                System.out.println("name = " + rs.getString("name"));
                System.out.println("id = " + rs.getInt("id"));
            }
        }
        catch(SQLException e) {
            System.err.println(e.getMessage());
        }
        finally {
            try {
                if (rs != null) rs.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                if (smt != null) smt.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                if (psmt != null) psmt.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            try {
                if (conn != null) conn.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    private static void getCodeName() {
        String sql = "select code, name from country order by code, name";
        Connection conn = null;
        PreparedStatement psmt = null;
        ResultSet rs = null;
        try {
            // create a database connection
            conn = DriverManager.getConnection("jdbc:sqlite:world.db");
            PreparedStatement pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                System.out.print(rs.getString("code") + "\t");
                System.out.println(rs.getString("name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            try {
                if (conn != null) conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}