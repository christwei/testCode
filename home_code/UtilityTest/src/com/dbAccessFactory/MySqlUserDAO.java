package com.dbAccessFactory;

public class MySqlUserDAO implements IUser {

	@Override
	public void insert(User user) {
		// TODO Auto-generated method stub
		System.out.println("User of mysql inserted");
		
	}

	@Override
	public User getUser(int id) {
		// TODO Auto-generated method stub
		System.out.println("User of mysql selected");
		return null;
	}

}
