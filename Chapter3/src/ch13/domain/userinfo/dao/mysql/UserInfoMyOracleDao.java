package ch13.domain.userinfo.dao.mysql;

import ch13.domain.userinfo.UserInfo;
import ch13.domain.userinfo.dao.UserInfoDao;

public class UserInfoMyOracleDao implements UserInfoDao {

	@Override
	public void insertUserInfo(UserInfo userInfo) {
		System.out.println("Insert into Oracle DB UserID = " + userInfo.getUserId());
	}

	@Override
	public void UpdateUserInfo(UserInfo userInfo) {
		System.out.println("Update into Oracle DB UserID = " + userInfo.getUserId());
	}

	@Override
	public void DeleteUserInfo(UserInfo userInfo) {
		System.out.println("Delete from Oracle DB UserID = " + userInfo.getUserId());
	}

}
