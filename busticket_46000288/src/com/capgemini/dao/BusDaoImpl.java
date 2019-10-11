package com.capgemini.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import com.capgemini.model.Bus;

@Repository
public class BusDaoImpl implements BusDao {
	//This annotation will allow you to specify the persistence unit that we want to use
	@PersistenceContext
	private EntityManager entityManager;

	public BusDaoImpl() {

	}

	@Override
	public List<Bus> readBusDetails() {
		TypedQuery<Bus> tquery = entityManager.createQuery("From Bus", Bus.class);
		List<Bus> list = tquery.getResultList();
		return list;
	}

}
