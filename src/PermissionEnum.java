/**
 * 权限资源枚举定义, 此处是使用Long类型定义权限字典，
 * Long的最大长度是64为，因此权限字典不能超过64。
 *
 * @author zhougaojun
 * @create 2018-06-08 下午7:51
 **/

public enum  PermissionEnum {

    /**
     * 权限
     */
    ADD("新增权限",1L << 0),
    UPDATE("更新权限",1L << 1),
    DELETE("删除权限",1L << 2),
    GET("查询权限",1L << 3),

    /**
     * 权限组，方便验证权限
     */
    /**
     * 超级管理员身份，拥有全部权限
     */
    ADMIN("所有权限", ADD.getCode() + UPDATE.getCode() + DELETE.getCode() + GET.getCode()),
    /**
     *  普通管理员，没有删除权限
     */
    KEEPER("所有权限", ADD.getCode() + UPDATE.getCode() + GET.getCode());


     PermissionEnum(String name, Long code) {
        this.name = name;
        this.code = code;
    }

    private String name;
    private Long code;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getCode() {
        return code;
    }

    public void setCode(Long code) {
        this.code = code;
    }



}

 