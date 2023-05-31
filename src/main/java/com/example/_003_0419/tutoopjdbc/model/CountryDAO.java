package com.example._003_0419.tutoopjdbc.model;

import java.sql.SQLException;

public class CountryDAO extends BaseDAO {
    public void getCodeName() {
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
