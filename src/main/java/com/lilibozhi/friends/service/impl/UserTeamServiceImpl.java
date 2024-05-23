package com.lilibozhi.friends.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.lilibozhi.friends.mapper.UserTeamMapper;
import com.lilibozhi.friends.model.domain.UserTeam;
import com.lilibozhi.friends.service.UserTeamService;
import org.springframework.stereotype.Service;

/**
* @author lilibozhi
* @description 针对表【user_team(用户队伍关系)】的数据库操作Service实现
* @createDate 2024-05-23 14:42:17
*/
@Service
public class UserTeamServiceImpl extends ServiceImpl<UserTeamMapper, UserTeam>
    implements UserTeamService {

}




