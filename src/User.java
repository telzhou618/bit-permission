/**
 * 用户
 *
 * @author zhougaojun
 * @create 2018-06-08 下午8:07
 **/

public class User {

    /**
     * 用户ID
     */
    private int id;
    /**
     * 用户名
     */
    private String userName;
    /**
     * 权限掩码
     */
    private Long permissonMask;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Long getPermissonMask() {
        return permissonMask;
    }

    public void setPermissonMask(Long permissonMask) {
        this.permissonMask = permissonMask;
    }

    public User(int id, String userName, Long permissonMask) {
        this.id = id;
        this.userName = userName;
        this.permissonMask = permissonMask;
    }

    public User() {
    }
}

 