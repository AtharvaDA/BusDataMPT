package com.capgemini.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capgemini.dao.BusDao;
import com.capgemini.model.Bus;

@Service
public class BusServiceImpl implements BusService {
	//This annotation is used to autowire the specific beans
	@Autowired
	private BusDao dao = null;

	public BusDao getDao() {
		return dao;
	}

	public void setDao(BusDao dao) {
		this.dao = dao;
	}

	@Override
	public List<Bus> showBusDetails() {
		return dao.readBusDetails();
	}

}
