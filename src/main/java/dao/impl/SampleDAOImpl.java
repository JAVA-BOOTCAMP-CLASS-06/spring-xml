package dao.impl;

import beans.MessageBean;
import dao.SampleDAO;

public class SampleDAOImpl implements SampleDAO {

	private MessageBean data;
	
	public MessageBean loadData() {
		System.out.println("[DAO] - Obteniendo datos de BD");
		return data;
	}

	public void setData(MessageBean data) {
		this.data = data;
	}

}
