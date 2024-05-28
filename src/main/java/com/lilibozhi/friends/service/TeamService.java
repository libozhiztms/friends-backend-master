package com.lilibozhi.friends.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.lilibozhi.friends.model.domain.Team;
import com.lilibozhi.friends.model.domain.User;
import com.lilibozhi.friends.model.domain.request.TeamJoinRequest;
import com.lilibozhi.friends.model.domain.request.TeamQuitRequest;
import com.lilibozhi.friends.model.domain.request.TeamUpdateRequest;
import com.lilibozhi.friends.model.dto.TeamQuery;
import com.lilibozhi.friends.model.vo.TeamUserVO;

import java.util.List;

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

    /**
     * 查询队伍
     * @param teamQuery
     * @param isAdmin
     * @return
     */
    List<TeamUserVO> listTeams(TeamQuery teamQuery,boolean isAdmin);

    /**
     * 修改队伍
     * @param teamUpdateRequest
     * @param loginUser
     * @return
     */
    boolean updateTeam(TeamUpdateRequest teamUpdateRequest,User loginUser);

    /**
     * 加入队伍
     * @param teamJoinRequest
     * @param loginUser
     * @return
     */
    boolean joinTeam(TeamJoinRequest teamJoinRequest,User loginUser);

    /**
     * 退出队伍
     * @param teamQuitRequest
     * @param loginUser
     * @return
     */
    boolean quitTeam(TeamQuitRequest teamQuitRequest, User loginUser);

    /**
     * 删除队伍
     * @param id
     * @param loginUser
     * @return
     */
    boolean deleteTeam(long id, User loginUser);
}
