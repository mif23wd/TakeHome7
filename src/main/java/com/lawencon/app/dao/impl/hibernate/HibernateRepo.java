package com.lawencon.app.dao.impl.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

public class HibernateRepo {
	@PersistenceContext
	protected EntityManager em;
}
