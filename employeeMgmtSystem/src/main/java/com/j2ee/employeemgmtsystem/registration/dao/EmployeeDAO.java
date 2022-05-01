package com.j2ee.employeemgmtsystem.registration.dao;

import com.j2ee.employeemgmtsystem.registration.model.Employee;

import java.sql.*;

public class EmployeeDAO {
    final String INSERT_QUERY = "insert into employee(id, first_name, last_name, username, password, address, contact) values(?,?,?,?,?,?,?)";
    final String DELETE_QUERY = "delete from employee where id=?";
    final String UPDATE_QUERY = "update employee set first_name=?, last_name=?, username=?, password=?, address=?, contact=? where id=?";
    final String AUTHORIZE = "SELECT * FROM employee WHERE USERNAME=?";

    public Connection getConnection() throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.jdbc.Driver");
        Connection con =
                DriverManager.getConnection("jdbc:mysql://localhost:3306/employee", "root", "root");
        return con;
    }

    public boolean registerEmployee(Employee e) throws SQLException, ClassNotFoundException {

        boolean result = false;
        Connection con = getConnection();
        PreparedStatement preparedStatement = con.prepareStatement(INSERT_QUERY);
        preparedStatement.setString(1, null);
        preparedStatement.setString(2, e.getFirst_name());
        preparedStatement.setString(3, e.getLast_name());
        preparedStatement.setString(4, e.getUsername());
        preparedStatement.setString(5, e.getPassword());
        preparedStatement.setString(6, e.getContact());
        preparedStatement.setString(7, e.getAddress());
        System.out.println(INSERT_QUERY);
        result = preparedStatement.execute();
        return result;
    }

    public Employee authorize(String username, String password) throws SQLException, ClassNotFoundException {
        boolean result = false;
        Employee e = null;
        Connection con = getConnection();
        PreparedStatement preparedStatement = con.prepareStatement(AUTHORIZE, ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        preparedStatement.setString(1, username);
        ResultSet rs = preparedStatement.executeQuery();
        if (rs.first()) {

            String FIRST_NAME=rs.getString("first_name");
            String LAST_NAME=rs.getString("last_name");
            String USERNAME = rs.getString("username");
            String PASSWORD = rs.getString("password");
            String ADDRESS=rs.getString("address");
            String CONTACT=rs.getString("contact");
            if (username.equals(USERNAME) && password.equals(PASSWORD)) {
                e = new Employee(FIRST_NAME,LAST_NAME,USERNAME,PASSWORD,CONTACT,ADDRESS);

            } else {
                e = null;
            }
        }
        return e;
    }
}
