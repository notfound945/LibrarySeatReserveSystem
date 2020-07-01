package cn.fyl.dao.impl;

import cn.fyl.dao.SeatDAO;
import cn.fyl.domain.Seat;
import cn.fyl.utils.JDBCUtils;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * @author phl
 */
public class SeatDaoImpl implements SeatDAO {
    private static Connection connection;
    private PreparedStatement preparedStatement;
    private HashMap<Integer, ArrayList<Integer>> seatMap = new HashMap<>();
    private ResultSet resultSet;
    private String sql;
    static {
        connection = JDBCUtils.getConnection();
    }

    @Override
    public HashMap<Integer, ArrayList<Integer>> getSeat(int floor) {
        sql = "select * from seat where floor = ?";
        try {
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, String.valueOf(floor));
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                ArrayList<Integer> seatArrayList = new ArrayList<>(14);
                floor = resultSet.getInt("floor");
                int no = resultSet.getInt("no");
                int a = resultSet.getInt("a");
                seatArrayList.add(a);
                int b = resultSet.getInt("b");
                seatArrayList.add(b);
                int c = resultSet.getInt("c");
                seatArrayList.add(c);
                int d = resultSet.getInt("d");
                seatArrayList.add(d);
                int e = resultSet.getInt("e");
                seatArrayList.add(e);
                int f = resultSet.getInt("f");
                seatArrayList.add(f);
                int g = resultSet.getInt("g");
                seatArrayList.add(g);
                int h = resultSet.getInt("h");
                seatArrayList.add(h);
                int i = resultSet.getInt("i");
                seatArrayList.add(i);
                int j = resultSet.getInt("j");
                seatArrayList.add(j);
                int k = resultSet.getInt("k");
                seatArrayList.add(k);
                int l = resultSet.getInt("l");
                seatArrayList.add(l);
                int m = resultSet.getInt("m");
                seatArrayList.add(m);
                int n = resultSet.getInt("n");
                seatArrayList.add(n);
                seatMap.put(no, seatArrayList);
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
        return seatMap;
    }
}
