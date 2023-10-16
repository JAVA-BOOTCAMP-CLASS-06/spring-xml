package bo.impl;

import beans.MessageBean;
import bo.SampleBO;
import dao.SampleDAO;

public class SampleBOImpl implements SampleBO {

	private SampleDAO dao;
	
	public MessageBean processData() {
		System.out.println("[BO] - Solicitando datos al DAO");
		MessageBean bean = dao.loadData();
		System.out.println("[BO] - Data procesada");
		return bean;
	}

	public void setDao(SampleDAO dao) {
		this.dao = dao;
	}

}
