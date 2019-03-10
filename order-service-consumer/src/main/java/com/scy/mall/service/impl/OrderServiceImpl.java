package com.scy.mall.service.impl;

import com.scy.bean.UserDTO;
import com.scy.service.OrderService;
import com.scy.service.UserService;

import java.util.List;

/**
 * 类名： OrderServiceImpl <br>
 * 描述：订单service <br>
 * 创建日期： 2019/3/10 <br>
 *
 * @author suocaiyuan
 * @version V1.0
 */
public class OrderServiceImpl implements OrderService {

    UserService userService;

    @Override
    public void initOrder(String userId) {
        List<UserDTO> users = userService.getAllUserList(userId);
    }
}
