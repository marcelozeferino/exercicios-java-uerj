package br.com.uerj.classes_utilitarias;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;


public class TestesComDatas {


	public static  void main (String [] args){
		
		Date d = new Date();
		System.out.println(d);
		
		Calendar cal = Calendar.getInstance();
		System.out.println(cal.getTime());
	
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		System.out.println(sdf.format(cal));
	}
}
