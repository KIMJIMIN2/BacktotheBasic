package ch13.domain.userinfo.dao.mysql;

import ch13.domain.userinfo.UserInfo;
import ch13.domain.userinfo.dao.UserInfoDao;

public class UserInfoMySqlDao implements UserInfoDao {

	@Override
	public void insertUserInfo(UserInfo userInfo) {
		System.out.println("Insert into MySQL DB UserID = " + userInfo.getUserId());
	}

	@Override
	public void UpdateUserInfo(UserInfo userInfo) {
		System.out.println("Update into MySQL DB UserID = " + userInfo.getUserId());
	}

	@Override
	public void DeleteUserInfo(UserInfo userInfo) {
		System.out.println("Delete from MySQL DB UserID = " + userInfo.getUserId());
	}

}
