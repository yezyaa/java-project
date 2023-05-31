package com.example._003_0419.tutoopjdbc;

import com.example._003_0419.tutoopjdbc.model.BaseDAO;
import com.example._003_0419.tutoopjdbc.model.Person;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class DBMain extends BaseDAO {
    public static void main(String[] args) {
        DBMain dbMain = new DBMain();
        dbMain.initPerson();
        System.out.println(dbMain.insertPerson("leo"));
        System.out.println(dbMain.insertPerson("yui"));
        List<Person> personList = dbMain.findAllPerson();
        System.out.println(personList.toString());
        System.out.println(dbMain.findByNamePerson("leo"));
//        dbMain.getCodeName(); // world.db 테이블 데이터 가져오기
    }

    private Person findByNamePerson(String pname) {
        String sql = "select id, name from person where name = ?";
        try {
            // create a database connection
            getConn();
            psmt = conn.prepareStatement(sql);
            psmt.setString(1, pname);
            rs = psmt.executeQuery();
            if (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                return new Person(id, name);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close();
        }
        return null;
    }

    private List<Person> findAllPerson() {
        List<Person> result = new ArrayList<>();
        String sql = "select id, name from person";
        try {
            // create a database connection
            getConn();
            psmt = conn.prepareStatement(sql);
            rs = psmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                result.add(new Person(id, name));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            close();
        }
        return result;
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
            psmt = conn.prepareStatement(sql);
            rs = psmt.executeQuery();
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