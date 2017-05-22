package com.dbAccessFactory;

public class OracleUserDAO implements IUser {

	@Override
	public void insert(User user) {
		// TODO Auto-generated method stub
		System.out.println("User of Oracle inserted");
		
	}

	@Override
	public User getUser(int id) {
		// TODO Auto-generated method stub
		System.out.println("User of Oracle selected");
		return null;
	}

}
