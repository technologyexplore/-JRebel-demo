package cn.yxh.sys.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import cn.yxh.sys.entity.User;

@Mapper
public interface UserMapper {

    @Select("select * from student where name = #{name}")
    public List<User> selectUserByName(String name);

    @Insert("insert into student(id,age,name) values (#{id},#{age},#{name})")
    public void addUser(User user);

    @Update("update student set age=#{age},id=#{id},name=#{name} where id=#{id}")
    public void updateUser(User user);

    @Delete("delete from student where id=#{id}")
    public void deleteUser(int id);
}
