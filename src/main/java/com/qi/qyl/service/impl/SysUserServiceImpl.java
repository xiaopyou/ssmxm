package com.qi.qyl.service.impl;

import com.qi.qyl.entity.SysUser;
import com.qi.qyl.mapper.SysUserDao;
import com.qi.qyl.service.SysUserService;
import com.qi.util.RespEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import javax.annotation.Resource;
import java.util.List;

/**
 * (SysUser)表服务实现类
 *
 * @author makejava
 * @since 2023-02-14 23:33:56
 */
@Service("sysUserService")
public class SysUserServiceImpl implements SysUserService {
    @Autowired
    private SysUserDao sysUserDao;


    @Override
    public RespEntity cx() {
        List<SysUser> list= sysUserDao.cx();
        return new RespEntity(list);
    }
}
