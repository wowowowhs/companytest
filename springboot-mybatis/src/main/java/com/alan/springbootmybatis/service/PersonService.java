package com.alan.springbootmybatis.service;

import java.util.List;

import com.alan.springbootmybatis.common.CommonResult;
import com.alan.springbootmybatis.entity.Person;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author alan
 * @since 2021-07-21
 */
public interface PersonService extends IService<Person> {

    /**
     * 返回所有用户的信息
     * @return
     */
    CommonResult getAllPerson();

    /**
     * 根据id查询person
     * @param id
     * @return
     */
    CommonResult getPersonByIdS(Integer id);
}
