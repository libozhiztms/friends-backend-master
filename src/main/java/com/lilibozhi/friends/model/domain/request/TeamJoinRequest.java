package com.lilibozhi.friends.model.domain.request;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户加入队伍请求体
 *
 * @author lilibozhi
 */
@Data
public class TeamJoinRequest implements Serializable {

    private static final long serialVersionUID = 1561951492170322411L;
    /**
     * id
     */
    private Long teamId;

    /**
     * 密码
     */
    private String password;
}