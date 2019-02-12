package br.pro.delfino.main;

import org.hibernate.Session;

import br.pro.delfino.drogaria.util.HibernateUtil;

public class HibernateUtilTest {

	public static void main(String[] args) {
		
		Session sessao =  HibernateUtil.getfabricaDeSessoes().openSession();
		
		sessao.close();
		HibernateUtil.getfabricaDeSessoes().close();

	}

}
