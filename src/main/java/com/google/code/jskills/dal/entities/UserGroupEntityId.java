package com.google.code.jskills.dal.entities;

// Generated 25.06.2013 17:52:09 by Hibernate Tools 3.6.0

import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * UserGroupEntityId generated by hbm2java
 */
@Embeddable
public class UserGroupEntityId implements java.io.Serializable {

	private int userId;
	private int groupId;

	public UserGroupEntityId() {
	}

	public UserGroupEntityId(int userId, int groupId) {
		this.userId = userId;
		this.groupId = groupId;
	}

	@Column(name = "USER_ID", nullable = false)
	public int getUserId() {
		return this.userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	@Column(name = "GROUP_ID", nullable = false)
	public int getGroupId() {
		return this.groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof UserGroupEntityId))
			return false;
		UserGroupEntityId castOther = (UserGroupEntityId) other;

		return (this.getUserId() == castOther.getUserId())
				&& (this.getGroupId() == castOther.getGroupId());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getUserId();
		result = 37 * result + this.getGroupId();
		return result;
	}

}