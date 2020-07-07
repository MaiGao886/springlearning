package com.xiagao.model.pojo.mybatis;

import java.io.Serializable;

public class RolePermissionEntity implements Serializable {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_role_permission.id
     *
     * @mbggenerated Thu Jul 02 16:31:03 CST 2020
     */
    private Integer id;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_role_permission.role_id
     *
     * @mbggenerated Thu Jul 02 16:31:03 CST 2020
     */
    private Integer roleId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_role_permission.permission_id
     *
     * @mbggenerated Thu Jul 02 16:31:03 CST 2020
     */
    private Integer permissionId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column t_role_permission.permission_type
     *
     * @mbggenerated Thu Jul 02 16:31:03 CST 2020
     */
    private Integer permissionType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database table t_role_permission
     *
     * @mbggenerated Thu Jul 02 16:31:03 CST 2020
     */
    private static final long serialVersionUID = 1L;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_role_permission.id
     *
     * @return the value of t_role_permission.id
     *
     * @mbggenerated Thu Jul 02 16:31:03 CST 2020
     */
    public Integer getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_role_permission.id
     *
     * @param id the value for t_role_permission.id
     *
     * @mbggenerated Thu Jul 02 16:31:03 CST 2020
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_role_permission.role_id
     *
     * @return the value of t_role_permission.role_id
     *
     * @mbggenerated Thu Jul 02 16:31:03 CST 2020
     */
    public Integer getRoleId() {
        return roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_role_permission.role_id
     *
     * @param roleId the value for t_role_permission.role_id
     *
     * @mbggenerated Thu Jul 02 16:31:03 CST 2020
     */
    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_role_permission.permission_id
     *
     * @return the value of t_role_permission.permission_id
     *
     * @mbggenerated Thu Jul 02 16:31:03 CST 2020
     */
    public Integer getPermissionId() {
        return permissionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_role_permission.permission_id
     *
     * @param permissionId the value for t_role_permission.permission_id
     *
     * @mbggenerated Thu Jul 02 16:31:03 CST 2020
     */
    public void setPermissionId(Integer permissionId) {
        this.permissionId = permissionId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column t_role_permission.permission_type
     *
     * @return the value of t_role_permission.permission_type
     *
     * @mbggenerated Thu Jul 02 16:31:03 CST 2020
     */
    public Integer getPermissionType() {
        return permissionType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column t_role_permission.permission_type
     *
     * @param permissionType the value for t_role_permission.permission_type
     *
     * @mbggenerated Thu Jul 02 16:31:03 CST 2020
     */
    public void setPermissionType(Integer permissionType) {
        this.permissionType = permissionType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table t_role_permission
     *
     * @mbggenerated Thu Jul 02 16:31:03 CST 2020
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", roleId=").append(roleId);
        sb.append(", permissionId=").append(permissionId);
        sb.append(", permissionType=").append(permissionType);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}