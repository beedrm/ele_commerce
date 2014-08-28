package com.team.eb.entity;

// default package
// Generated 2014-8-27 21:26:02 by Hibernate Tools 4.0.0

import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 * Role generated by hbm2java
 */
@Entity
@Table(name = "role", catalog = "ebussiness")
public class Role implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer roleId;
	private int parentId;
	private String roleName;
	private Date createTime;
	private String description;
	private Set<Permission> rolePermissions = new HashSet<Permission>(0);
	private Set<UserInfo> userRoles = new HashSet<UserInfo>(0);

	public Role() {
	}

	public Role(int parentId, String roleName, Date createTime) {
		this.parentId = parentId;
		this.roleName = roleName;
		this.createTime = createTime;
	}

	public Role(int parentId, String roleName, Date createTime,
			String description, Set<Permission> rolePermissions, Set<UserInfo> userRoles) {
		this.parentId = parentId;
		this.roleName = roleName;
		this.createTime = createTime;
		this.description = description;
		this.rolePermissions = rolePermissions;
		this.userRoles = userRoles;
	}

	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "role_id", unique = true, nullable = false)
	public Integer getRoleId() {
		return this.roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	@Column(name = "parent_id", nullable = false)
	public int getParentId() {
		return this.parentId;
	}

	public void setParentId(int parentId) {
		this.parentId = parentId;
	}

	@Column(name = "role_name", nullable = false, length = 50)
	public String getRoleName() {
		return this.roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "create_time", nullable = false, length = 19)
	public Date getCreateTime() {
		return this.createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}

	@Column(name = "description", length = 200)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "role")
	public Set<Permission> getRolePermissions() {
		return this.rolePermissions;
	}

	public void setRolePermissions(Set<Permission> rolePermissions) {
		this.rolePermissions = rolePermissions;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "role")
	public Set<UserInfo> getUserRoles() {
		return this.userRoles;
	}

	public void setUserRoles(Set<UserInfo> userRoles) {
		this.userRoles = userRoles;
	}

}
