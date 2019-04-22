package com.wg.www.mapper;

import com.wg.www.domain.User;
import io.swagger.models.auth.In;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface UserMapper {

    User selectById(Integer id);

    User selectByUsername(String username);

    List<User> selectList(User user);

    int deleteByPrimaryKey(Integer id);

    int insert(User user);

    int insertSelective(User user);

    int updateByPrimaryKeySelective(User user);

    int updateByPrimaryKey(User user);
}
