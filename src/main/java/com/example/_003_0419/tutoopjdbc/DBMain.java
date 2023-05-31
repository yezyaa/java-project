package com.example._003_0419.tutoopjdbc;

import com.example._003_0419.tutoopjdbc.model.BaseDAO;

import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DBMain extends BaseDAO {
    public static void main(String[] args) {
        DBMain dbMain = new DBMain();
        dbMain.initPerson();
        dbMain.insertPerson("leo");
        dbMain.insertPerson("yui");
//        dbMain.getCodeName(); // world.db 테이블 데이터 가져오기
    }

    private int insertPerson(String name) {
        int cnt = 0;
        String sql = "insert into person(name) values(?)";
        try {
            // create a database connection
            getConn();
            psmt = conn.prepareStatement(sql);
            psmt.setString(1, name);
            cnt = psmt.executeUpdate();
        }
        catch(SQLException e) {
            System.err.println(e.getMessage());
        }
        finally {
            close();
        }
        return cnt;
    }

    private void initPerson() {
        String sql = """
                create table person (
                    id integer primary key autoincrement,
                    name string
                )
                """;
        try {
            // create a database connection
            getConn();
            smt = conn.createStatement();
            smt.executeUpdate("drop table if exists person");
            smt.executeUpdate(sql);
        }
        catch(SQLException e) {
            System.err.println(e.getMessage());
        }
        finally {
            close();
        }
    }

    private void getCodeName() {
        String sql = "select code, name from country order by code, name";
        try {
            // create a database connection
            getConn();
            PreparedStatement pstmt = conn.prepareStatement(sql);
            rs = pstmt.executeQuery();
            while (rs.next()) {
                System.out.print(rs.getString("code") + "\t");
                System.out.println(rs.getString("name"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close();
        }
    }
}