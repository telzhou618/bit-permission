/**
 * 用户权限测试类
 *
 * @author zhougaojun
 * @create 2018-06-08 下午8:03
 **/

public class TestPermission {

    public static void main(String[] args) {

        /**
         * 定义一个用户,权限为ADMIN,即超级管理员
         */
        User user = new User(1,"张三",PermissionEnum.ADMIN.getCode());
        print(user);

        //取消删除权限
        UserPermissionHelper.removePermission(user,PermissionEnum.DELETE);
        print(user);

        //删除普通管理员权限,
        UserPermissionHelper.removePermission(user,PermissionEnum.KEEPER);
        print(user);

        //增加新增权限和查询权限
        UserPermissionHelper.addPermission(user,PermissionEnum.ADD,PermissionEnum.GET);
        print(user);

    }

    /**
     * 打印用户权限
     * @param user
     */
    public static void print(User user){

        System.out.println("-----------------------------");
        System.out.println("是否有新增权限："+ UserPermissionHelper.hasPermission(user,PermissionEnum.ADD));
        System.out.println("是否有删除权限："+UserPermissionHelper.hasPermission(user,PermissionEnum.DELETE));
        System.out.println("是否有更新权限："+UserPermissionHelper.hasPermission(user,PermissionEnum.UPDATE));
        System.out.println("是否有查询权限："+UserPermissionHelper.hasPermission(user,PermissionEnum.GET));
        System.out.println("是否是普通管理员："+UserPermissionHelper.hasPermission(user,PermissionEnum.KEEPER));
        System.out.println("是否是超级管理员："+UserPermissionHelper.hasPermission(user,PermissionEnum.ADMIN));

    }

}

 