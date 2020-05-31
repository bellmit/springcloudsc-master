package com.wangxin.provider.service.auth;

import java.util.List;

import com.wangxin.common.api.model.auth.Role;
import com.wangxin.common.api.model.auth.User;

public interface UserService {

    /**
     * 新增用户
     *
     * @param user 用户
     * @param role 角色
     */
    public void addUser(User user, Role role);


    /**
     * @param u 用户对象
     * @return
     * @Description 修改密码
     * @author 王鑫
     * @date 2018/6/14 14:15
     */
    public void updatePassword(User u);

    /**
     * 根据用户名查询用户
     *
     * @param username 用户名
     * @return user 用户
     */
    public User findUserByName(String username);


    /**
     * @param user 用户对照
     * @Description 更新用户登录时间
     * @author 王鑫
     * @Date 2018/6/14 14:48
     */
    public void updateUserLastLoginTime(User user);

    /**
     * 查询组织下所有客服员工
     *
     * @return
     */
    public List<User> findUsers();

    /**
     * 根据条件（店铺、名称）查询客服人员
     *
     * @param shopId  店铺ID
     * @param empName 客服人员名称
     * @return
     */
    public List<User> findEmp(String shopId, String empName);

}
