package cn.fyl.domain;

/**
 * 日志类型
 */
enum message {
    // 警告
    WARNING,
    // 错误
    ERROR,
    // 信息
    INFO
}

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

    public Log(int id, int userId, String date, String time, String type, String message) {
        this.id = id;
        this.userId = userId;
        this.date = date;
        this.time = time;
        this.type = type;
        this.message = message;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

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
