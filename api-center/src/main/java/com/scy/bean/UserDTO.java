package com.scy.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * 类名： UserDTO <br>
 * 描述：用户信息 <br>
 * 创建日期： 2019/3/10 <br>
 *
 * @author suocaiyuan
 * @version V1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserDTO implements Serializable {
    private Integer id;
    private String userAddress;
    private String userId;
    private String consignee;
    private String phoneNumber;
    private String isDefault;
}
