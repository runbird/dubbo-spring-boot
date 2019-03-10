package com.scy.mall.service.impl;

import com.scy.bean.UserDTO;
import com.scy.service.UserService;

import java.util.Arrays;
import java.util.List;

/**
 * 类名： UserServiceImpl <br>
 * 描述：用户信息实现类 <br>
 * 创建日期： 2019/3/10 <br>
 *
 * @author suocaiyuan
 * @version V1.0
 */
public class UserServiceImpl implements UserService {

    @Override
    public List<UserDTO> getAllUserList(String userId) {
        UserDTO u1 = new UserDTO(1, "半人马座", "0001", "阿尔法星系", "1001", "True");
        UserDTO u2 = new UserDTO(2, "巨熊座", "0002", "贝塔星系", "2001", "False");
        return Arrays.asList(u1,u2);
    }
}
