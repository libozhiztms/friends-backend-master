package com.lilibozhi.friends.model.domain.request;

import lombok.Data;

import java.io.Serializable;
/**
 * 用户退出队伍请求体
 *
 * @author lilibozhi
 */
@Data
    public class TeamQuitRequest implements Serializable {

    private static final long serialVersionUID = -3732601473982654723L;
    /**
     * id
     */
    private Long teamId;

    }