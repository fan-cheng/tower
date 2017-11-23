package cn.tower.user.service;

import cn.tower.base.mapper.BaseCrudMapper;
import cn.tower.base.service.BaseServiceImpl;
import cn.tower.user.mapper.UserMapper;
import cn.tower.user.model.UserModel;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl extends BaseServiceImpl<UserModel> implements UserService {

    @Resource
    private UserMapper mapper;

    @Override
    public BaseCrudMapper<UserModel> init() {
        return mapper;
    }

}
