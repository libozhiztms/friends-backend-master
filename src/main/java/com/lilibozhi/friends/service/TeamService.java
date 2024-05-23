package com.lilibozhi.friends.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lilibozhi.friends.model.domain.Team;
import com.lilibozhi.friends.model.domain.User;

/**
* @author lilibozhi
* @description 针对表【team(队伍)】的数据库操作Service
* @createDate 2024-05-23 14:47:15
*/
public interface TeamService extends IService<Team> {

    /**
     * 创建队伍
     *
     * @param team
     * @param loginUser
     * @return
     */
    long addTeam(Team team, User loginUser);
}
