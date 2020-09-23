package com.huang.aimybatisplus.generator.service.impl;

import com.huang.aimybatisplus.generator.entity.User;
import com.huang.aimybatisplus.generator.mapper.UserMapper;
import com.huang.aimybatisplus.generator.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author huang
 * @since 2020-09-23
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
