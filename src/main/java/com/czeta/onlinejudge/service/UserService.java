package com.czeta.onlinejudge.service;

import com.czeta.onlinejudge.dao.entity.Message;
import com.czeta.onlinejudge.dao.entity.User;
import com.czeta.onlinejudge.model.param.UserRegisterModel;
import com.czeta.onlinejudge.model.param.UserInfoModel;

import java.util.List;

/**
 * @ClassName UserService
 * @Description 用户服务
 * @Author chenlongjie
 * @Date 2020/3/1 14:50
 * @Version 1.0
 */
public interface UserService {

    /**
     * 注册
     * @param userRegisterModel
     */
    void saveNewUser(UserRegisterModel userRegisterModel);

    /**
     * 获取用户详细信息
     * @param id
     * @return
     */
    User getUserInfoById(Long id);

    /**
     * 获取用户解决的问题
     * @param userId
     * @return
     */
    List<Long> getSolvedProblemsByUserId(Long userId);

    /**
     * 获取用户尝试且尚未解决的问题
     * @param userId
     * @return
     */
    List<Long> getNotSolvedProblemsByUserId(Long userId);

    /**
     * 获取用户接受的消息（目前是通过比赛报名审核的通知）
     * @param userId
     * @return
     */
    List<Message> getMessagesByUserId(Long userId);

    /**
     * 更新用户信息
     * @param userInfoModel
     * @return
     */
    boolean updateUserInfoByUserId(UserInfoModel userInfoModel);

    /**
     * 更新用户email
     * @param oldEmail
     * @param newEmail
     * @param userId
     * @return
     */
    boolean updateUserEmailByUserId(String oldEmail, String newEmail, Long userId);

    /**
     * 更新用户密码
     * @param oldPassword
     * @param newPassword
     * @param userId
     * @return
     */
    boolean updateUserPasswordByUserId(String oldPassword, String newPassword, Long userId);

    /**
     * 获取所有用户信息列表
     * @return
     */
    List<User> getUserInfoList();

    /**
     * 通过用户名关键字获取有关的用户信息
     * @param usernameKey
     * @return
     */
    List<User> getUserInfosByUsernameKey(String usernameKey);

    /**
     * 重置用户密码，与用户名一致
     * @param username
     * @return
     */
    boolean resetUserPasswordByUsername(String username);

    /**
     * 禁用用户账户
     * @param username
     * @return
     */
    boolean disableUserAccountByUsername(String username);
}
