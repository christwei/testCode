/**
 * 
 */
package com.dbAccessFactory;

/**
 * @author Administrator
 *
 */
public class DAOTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        IUser  userDao = DaoFactory.createUser();
        
        User user = new User();
        userDao.insert(user);
	}
}
