package br.pro.delfino.drogaria.util;

import org.hibernate.Session;
import org.junit.Test;

public class HiberneteUtilTest {
	@Test
		public void conectar() {
		Session sessao =  HibernateUtil.getfabricaDeSessoes().openSession();
		sessao.close();
		HibernateUtil.getfabricaDeSessoes().close();

		}
	
}
