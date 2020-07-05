package cn.fyl.dao.impl;

import cn.fyl.dao.LogDao;
import cn.fyl.domain.Log;
import cn.fyl.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author fyl
 */
public class LogDaoImpl implements LogDao {
    private static Connection connection;
    private PreparedStatement preparedStatement;
    private ArrayList<Log> logArrayList = new ArrayList<>();
    private ResultSet resultSet;
    private String sql;

    static {
        connection = JDBCUtils.getConnection();
    }

    @Override
    public ArrayList<Log> getUserLog(int userId) {
        sql = "select * from table_log where user_id = ?";
        System.out.println("userId " + userId);
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, String.valueOf(userId));
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                userId = resultSet.getInt("user_id");
                String date = resultSet.getString("date");
                String time = resultSet.getString("time");
                String type = resultSet.getString("type");
                String message = resultSet.getString("message");
                Log log = new Log(id, userId, date, time, type, message);
                this.logArrayList.add(log);
            }
        } catch (Exception e) {
            return null;
        }
        return logArrayList;
    }

    @Override
    public boolean setUserLog(Log log) {
        sql = "insert into table_log(user_id, date, time, type, message) values (?, ?, ?, ?, ?)";
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setInt(1, log.getUserId());
            preparedStatement.setString(2, log.getDate());
            preparedStatement.setString(3, log.getTime());
            preparedStatement.setString(4, log.getType());
            preparedStatement.setString(5, log.getMessage());
            System.out.println("插入数据 ");
            int changeNumber = preparedStatement.executeUpdate();
            if (changeNumber > 0) {
                return true;
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return false;
    }
}
