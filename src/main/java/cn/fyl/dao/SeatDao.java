package cn.fyl.dao;

import cn.fyl.domain.Seat;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * 座位DAO
 * @author fyl
 */
public interface SeatDao {
    /**
     * 根据楼层获取座位信息
     * @param floor
     * @return
     */
    public HashMap<Integer, ArrayList<Integer>> getSeat(int floor);

    /**
     * 预定座位
     * @param floor
     * @param seatNo
     * @param id
     * @return
     */
    public boolean selectSeat(int floor, String seatNo, int id);
}
