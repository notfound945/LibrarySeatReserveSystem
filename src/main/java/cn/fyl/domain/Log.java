package cn.fyl.domain;

/**
 * 日志实体类
 *
 * @author fyl
 */
public class Log {
    private int id;
    private int userId;
    private String date;
    private String time;
    private String type;
    private String message;

    /**
     * 日志实体构造器
     * @param id 日志id
     * @param userId 用户id
     * @param date 日期
     * @param time 时间
     * @param type 类型
     * @param message 消息内容
     */
    public Log(int id, int userId, String date, String time, String type, String message) {
        this.id = id;
        this.userId = userId;
        this.date = date;
        this.time = time;
        this.type = type;
        this.message = message;
    }

    /**
     * 取得日志的标识id
     * @return
     */
    public int getId() {
        return id;
    }

    /**
     * 设置日志的标识id
     * @param id 日志id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * 取得用户id
     * @return userId 用户id
     */
    public int getUserId() {
        return userId;
    }

    /**
     * 设置用户id
     *
     * @param userId 用户ID
     */
    public void setUserId(int userId) {
        this.userId = userId;
    }

    /**
     * 取得日志日期
     * @return date 日志日期
     */
    public String getDate() {
        return date;
    }

    /**
     * 设置日志日期
     * @param date 日期
     */
    public void setDate(String date) {
        this.date = date;
    }

    /**
     * 取得日志时间
     * @return time 日志记录时间
     */
    public String getTime() {
        return time;
    }

    /**
     * 设置日志时间
     * @param time 时间
     */
    public void setTime(String time) {
        this.time = time;
    }

    /**
     * 取得日志类型
     * @return 日志类型
     */
    public String getType() {
        return type;
    }

    /**
     * 设置日志类型
     * @param type 日志类型
     */
    public void setType(String type) {
        this.type = type;
    }

    /**
     * 取得日志消息
     * @return message 日志消息
     */
    public String getMessage() {
        return message;
    }

    /**
     * 设置日志消息
     * @param message 日志内容
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * 打印日志实体类
     * @return 实体类内容
     */
    @Override
    public String toString() {
        return "Log{" +
                "id=" + id +
                ", date='" + date + '\'' +
                ", time='" + time + '\'' +
                ", type='" + type + '\'' +
                ", message='" + message + '\'' +
                '}';
    }
}
