package com.source.mybatisx.mapper;
import org.apache.ibatis.annotations.Param;

import com.source.mybatisx.pojo.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * @Entity com.source.mybatisx.pojo.User
 */
public interface UserMapper extends BaseMapper<User> {
    int insertSelective(User user);

    int deleteByUidAndAge(@Param("uid") Long uid, @Param("age") Integer age);

    int updateAgeAndSex(@Param("age") Integer age, @Param("sex") Integer sex);

    List<User> selectAgeAndSex();

    int deleteByUidAndSex(@Param("uid") Long uid, @Param("sex") Integer sex);
}




