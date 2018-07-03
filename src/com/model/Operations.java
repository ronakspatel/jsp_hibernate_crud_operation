package com.model;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.Util.UtilityHelper;
import com.bean.User;

public class Operations {
	public static int save(User u) {
		int status = 0;
		Session session =UtilityHelper.getSession();
		Transaction t = session.beginTransaction();
		status = (int) session.save(u);
		t.commit();
		session.close();

		return status;
	}

	public static void update(User u) {
		Session session =UtilityHelper. getSession();
		Transaction ts = session.beginTransaction();
		session.update(u);
		ts.commit();
		session.close();

	}

	public static int delete(User u) {
		int status = 0;
		Session session =UtilityHelper. getSession();
		Transaction ts = session.beginTransaction();
		session.delete(u);
		ts.commit();
		session.close();
		return status;
	}

	public static List<User> getAllRecords() {
		List<User> list = new ArrayList<User>();
		Session session =UtilityHelper. getSession();
		Transaction ts = session.beginTransaction();
		list = session.createQuery("FROM User").list();

		return list;
	}

	public static User getRecordById(int id) {
		User u = null;
		Session session =UtilityHelper. getSession();
		Transaction ts = session.beginTransaction();
		u = session.get(User.class, id);
		return u;
	}
}
