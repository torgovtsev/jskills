package com.google.code.jskills.dal.entities;

// Generated 25.06.2013 17:52:09 by Hibernate Tools 3.6.0

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * UserRoleEntityId generated by hbm2java
 */
@Embeddable
public class UserRoleEntityId implements java.io.Serializable {

	private int userId;
	private int roleId;

	public UserRoleEntityId() {
	}

	public UserRoleEntityId(int userId, int roleId) {
		this.userId = userId;
		this.roleId = roleId;
	}

	@Column(name = "USER_ID", nullable = false)
	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	@Column(name = "ROLE_ID", nullable = false)
	public int getRoleId() {
		return this.roleId;
	}

	public void setRoleId(int roleId) {
		this.roleId = roleId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof UserRoleEntityId))
			return false;
		UserRoleEntityId castOther = (UserRoleEntityId) other;

		return (this.getUserId() == castOther.getUserId())
				&& (this.getRoleId() == castOther.getRoleId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getUserId();
		result = 37 * result + this.getRoleId();
		return result;
	}

}
