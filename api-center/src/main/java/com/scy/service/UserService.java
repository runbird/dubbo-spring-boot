package com.scy.service;

import com.scy.bean.UserDTO;

import java.util.List;

/**
 * 类名： UserService <br>
 * 描述：用户信息接口 <br>
 * 创建日期： 2019/3/10 <br>
 *
 * @author suocaiyuan
 * @version V1.0
 */
public interface UserService {

    List<UserDTO> getAllUserList(String userId);
}
