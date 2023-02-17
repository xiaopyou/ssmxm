package com.qi.qyl.controller;

import com.qi.qyl.entity.SysUser;
import com.qi.qyl.service.SysUserService;

import com.qi.util.RespEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;

/**
 * (SysUser)表控制层
 *
 * @author makejava
 * @since 2023-02-14 23:33:55
 */
@RestController
@RequestMapping("souye")
public class SysUserController {

    @Autowired
    private SysUserService sysUserService;
    @GetMapping()
    public RespEntity cx(){


        return sysUserService.cx();
    }
}

