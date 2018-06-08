# bit-permission
位运算实现权限管理

#### 测试代码
```java

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

 

```

#### 测试输出结果

```
/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/bin/java "-javaagent:/Applications/IntelliJ IDEA.app/Contents/lib/idea_rt.jar=52234:/Applications/IntelliJ IDEA.app/Contents/bin" -Dfile.encoding=UTF-8 -classpath /Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/charsets.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/deploy.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/ext/cldrdata.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/ext/dnsns.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/ext/jaccess.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/ext/jfxrt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/ext/localedata.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/ext/nashorn.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/ext/sunec.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/ext/sunjce_provider.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/ext/sunpkcs11.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/ext/zipfs.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/javaws.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/jce.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/jfr.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/jfxswt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/jsse.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/management-agent.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/plugin.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/resources.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/jre/lib/rt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/lib/ant-javafx.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/lib/dt.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/lib/javafx-mx.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/lib/jconsole.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/lib/packager.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/lib/sa-jdi.jar:/Library/Java/JavaVirtualMachines/jdk1.8.0_171.jdk/Contents/Home/lib/tools.jar:/Users/zhougaojun/dxy/github/bit-permission/out/production/bit-permission TestPermission
-----------------------------
是否有新增权限：true
是否有删除权限：true
是否有更新权限：true
是否有查询权限：true
是否是普通管理员：true
是否是超级管理员：true
-----------------------------
是否有新增权限：true
是否有删除权限：false
是否有更新权限：true
是否有查询权限：true
是否是普通管理员：true
是否是超级管理员：false
-----------------------------
是否有新增权限：false
是否有删除权限：false
是否有更新权限：false
是否有查询权限：false
是否是普通管理员：false
是否是超级管理员：false
-----------------------------
是否有新增权限：true
是否有删除权限：false
是否有更新权限：false
是否有查询权限：true
是否是普通管理员：false
是否是超级管理员：false

Process finished with exit code 0


```