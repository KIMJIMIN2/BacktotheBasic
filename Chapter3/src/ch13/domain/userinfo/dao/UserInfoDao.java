package ch13.domain.userinfo.dao;

import ch13.domain.userinfo.UserInfo;

public interface UserInfoDao {
	void insertUserInfo(UserInfo userInfo);
	void UpdateUserInfo(UserInfo userInfo);
	void DeleteUserInfo(UserInfo userInfo);

}
