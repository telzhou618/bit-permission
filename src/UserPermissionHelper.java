/**
 * 权限分配工具类
 *
 * @author zhougaojun
 * @create 2018-06-08 下午8:12
 **/

public class UserPermissionHelper {

    /**
     * 验证用户是否拥有某项权限
     * @param user
     * @param permissionEnum
     * @return
     */
    public static  boolean hasPermission(User user,PermissionEnum permissionEnum){

        if(user != null && permissionEnum != null){
            return ( user.getPermissonMask() & permissionEnum.getCode()) == permissionEnum.getCode();
        }
        return false;
    }


    /**
     * 增加权限
     * @param user
     * @param permissionEnums
     */
    public static  void addPermission(User user,PermissionEnum...permissionEnums){

        if (user != null && permissionEnums != null && permissionEnums.length != 0){
            for (PermissionEnum permissionEnum : permissionEnums){
                user.setPermissonMask(user.getPermissonMask() + permissionEnum.getCode());
            }
        }
    }


    /**
     * 删除权限
     * @param user
     * @param permissionEnum
     */
    public static  void  removePermission(User user,PermissionEnum permissionEnum){
        if (user != null && permissionEnum != null){

            user.setPermissonMask(user.getPermissonMask() & ~permissionEnum.getCode());
        }
    }

}

 