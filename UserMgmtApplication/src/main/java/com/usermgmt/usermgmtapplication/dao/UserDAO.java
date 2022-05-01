package com.usermgmt.usermgmtapplication.dao;

import com.usermgmt.usermgmtapplication.model.User;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDAO {
    private final String INSERT_QUERY = "INSERT INTO USERS(ID, NAME, EMAIL, COUNTRY) VALUES(? ,?,?,?)";
    private final String DELETE_QUERY = "DELETE FROM USERS WHERE ID=?";
    private final String UPDATE_QUERY = "UPDATE USERS SET NAME=?,EMAIL=?,COUNTRY=? WHERE ID=?";
    private final String SELECT_ALL_QUERY = "SELECT * FROM USERS;";
    private final String SELECT_PARTICULAR_QUERY = "SELECT NAME,EMAIL,COUNTRY FROM USERS WHERE ID=?";

    public Connection getConnection() throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.jdbc.Driver");
        Connection con =
                DriverManager.getConnection("jdbc:mysql://localhost:3306/study", "root", "root");
        return con;
    }

    public boolean registerUser(User u)  {
        boolean result = false;
        try {
        Connection con = getConnection();
        PreparedStatement preparedStatement = con.prepareStatement(INSERT_QUERY);
        preparedStatement.setString(1, null);
        preparedStatement.setString(2, u.getName());
        preparedStatement.setString(3, u.getEmail());
        preparedStatement.setString(4, u.getCountry());
        System.out.println(INSERT_QUERY);

            result = preparedStatement.execute();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }

    public int deleteUser(int id) throws SQLException, ClassNotFoundException {
        int result = 0;
        Connection con = getConnection();
        PreparedStatement preparedStatement = con.prepareStatement(DELETE_QUERY);
        result = preparedStatement.executeUpdate();
        return result;
    }

    public List<User> getAll() throws SQLException, ClassNotFoundException {
        List<User> allUsers = new ArrayList<>();
        User u = null;
        Connection con = getConnection();
        PreparedStatement preparedStatement = con.prepareStatement(SELECT_ALL_QUERY);
        ResultSet resultSet = preparedStatement.executeQuery();
        while (resultSet.next()) {
            u = new User(resultSet.getString(2), resultSet.getString(3), resultSet.getString(4));
            allUsers.add(u);
        }
        return allUsers;
    }

    public int updateUser(User u) throws SQLException, ClassNotFoundException {
        int result = 0;
        Connection con = getConnection();
        PreparedStatement preparedStatement = con.prepareStatement(UPDATE_QUERY);
        preparedStatement.setInt(4, u.getId());
        preparedStatement.setString(1, u.getName());
        preparedStatement.setString(2, u.getEmail());
        preparedStatement.setString(3, u.getCountry());
        System.out.println(UPDATE_QUERY);
        result = preparedStatement.executeUpdate();
        return result;
    }
}

