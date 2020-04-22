package test;

import bean.SysRoleEntity;
import bean.SysUserEntity;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.junit.Test;

/**
 * @author Lstar
 * @version 1.0
 * @date 2020/4/22 17:10
 */
public class testMany2Many {
    /**
     * 保存操作
     *      创建两个用户和三个角色
     *      1号用户具备1号和2号角色
     *      2号用户具备2号和3号角色
     *      保存用户角色
     */
    @Test
    public void test(){
        SysUserEntity u1 = new SysUserEntity();
        u1.setUserName("用户1");
        SysUserEntity u2 = new SysUserEntity();
        u2.setUserName("用户2");

        SysRoleEntity r1 = new SysRoleEntity();
        r1.setRoleName("角色1");
        SysRoleEntity r2 = new SysRoleEntity();
        r2.setRoleName("角色2");
        SysRoleEntity r3 = new SysRoleEntity();
        r3.setRoleName("角色3");

        //建立双向关联关系
        //建立用户的
        u1.getRoles().add(r1);
        u1.getRoles().add(r2);
        u2.getRoles().add(r2);
        u2.getRoles().add(r3);
        //建立角色的
        r1.getUsers().add(u1);
        r2.getUsers().add(u1);
        r2.getUsers().add(u2);
        r3.getUsers().add(u2);

        Session s = hibernateUtil.getCurrentSession();
        Transaction tx = s.beginTransaction();
        s.save(u1);
        s.save(u2);
        s.save(r1);
        s.save(r2);
        s.save(r3);

        tx.commit();

    }

    /**
     * 删除操作
     * 多对多的双向级联删除禁止使用
     */
    @Test
    public void test2(){
        Session s = hibernateUtil.getCurrentSession();
        Transaction tx = s.beginTransaction();
        //查询id为3的用户
        SysUserEntity u3 = s.get(SysUserEntity.class,3L);
        //删除
        s.delete(u3);
        tx.commit();
    }

}
