package com.xiagao.mapper;

import com.xiagao.model.pojo.mybatis.RoleEntity;
import java.util.List;

public interface RoleEntityMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role
     *
     * @mbggenerated Thu Jul 02 16:31:03 CST 2020
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role
     *
     * @mbggenerated Thu Jul 02 16:31:03 CST 2020
     */
    int insert(RoleEntity record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role
     *
     * @mbggenerated Thu Jul 02 16:31:03 CST 2020
     */
    RoleEntity selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role
     *
     * @mbggenerated Thu Jul 02 16:31:03 CST 2020
     */
    List<RoleEntity> selectAll();

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role
     *
     * @mbggenerated Thu Jul 02 16:31:03 CST 2020
     */
    int updateByPrimaryKey(RoleEntity record);
}