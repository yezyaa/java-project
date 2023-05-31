package com.example._003_0419.tutoopjdbc;

import com.example._003_0419.tutoopjdbc.model.BaseDAO;
import com.example._003_0419.tutoopjdbc.model.Person;
import com.example._003_0419.tutoopjdbc.model.PersonDAO;

import java.util.List;

public class DBMain extends BaseDAO {
    public static void main(String[] args) {
        PersonDAO personDAO = new PersonDAO();
        personDAO.initPerson();
        System.out.println(personDAO.insertPerson("leo"));
        System.out.println(personDAO.insertPerson("yui"));
        List<Person> personList = personDAO.findAllPerson();
        System.out.println(personList.toString());
        System.out.println(personDAO.findByNamePerson("leo"));
//        dbMain.getCodeName(); // world.db 테이블 데이터 가져오기
    }
}