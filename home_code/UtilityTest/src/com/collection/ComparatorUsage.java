package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class User implements Comparable<User>{
    
	int age;
    String name;
    public User(int age,String name) {
          this.age=age;
          this.name=name;
    }
	@Override
	public int compareTo(User param) {
		
		if (this.age == param.age) {
			return 0;
		} else if (this.age > param.age) {
			return 1;
		} else {
			return -1;
		}

		
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.age+":"+this.name;
	}
}

class UserComparator implements Comparator<User> {

	@Override
	public int compare(User param1, User param2) {
		// TODO Auto-generated method stub
		return param1.age - param2.age;
	}
	
}


public class ComparatorUsage {

	public static void main(String[] args) {
		ArrayList<User> arr=new ArrayList();
		arr.add(new User(21,"John"));
		arr.add(new User(12,"Peter"));
		arr.add(new User(3,"Rick"));
		arr.add(new User(14,"Paul"));
		arr.add(new User(5,"Jack"));
		arr.add(new User(26,"Frank"));
		Collections.sort(arr);
		System.out.println(arr.toString());
		
		String str1 = "2";
		String str2 = "10";
		
		
		UserComparator uc = new UserComparator();
		ArrayList<User> arr2=new ArrayList();
		arr2.add(new User(20,"nancy"));
		arr2.add(new User(12,"judy"));
		arr2.add(new User(13,"babala"));
		Collections.sort(arr2, uc);
		System.out.println(arr2.toString());

	}

}
