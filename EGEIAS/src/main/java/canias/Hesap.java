package canias;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Hesap {
  public static void main(String[] args) throws ClassNotFoundException, SQLException, NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, InvocationTargetException { 
	
	System.out.println(genisHesap("1","1"));
	
  }
  
	public static double REFBEL(double bolen) throws ClassNotFoundException, SQLException {
				
				return Math.sqrt(Math.pow(56,2)+Math.pow(0.4*1000,2))/1000/bolen;
	
	}
	
	public static double OLCHATA(double bolen) throws ClassNotFoundException, SQLException {
	
		return 2.977/bolen;
}

	public static double BIRLESHATA( double bolen) throws ClassNotFoundException, SQLException {
		
		return 0/bolen;
}

	public static double REFKAYMA(double bolen) throws ClassNotFoundException, SQLException {
	
		return ((0.02+0.25*1000/1000)*3*2)/bolen;
}

	public static double TEKRAR(double bolen) throws ClassNotFoundException, SQLException {
		
		return 0/bolen;
}

	public static double SICFARKI(double bolen) throws ClassNotFoundException, SQLException {
		Connection con = null;
		
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		String sqlConnStr = "jdbc:sqlserver://CANIAS;databaseName=EGEMET604;user=IAS;password=IAS;";
		con = DriverManager.getConnection(sqlConnStr);
		con.setAutoCommit(false);
		Statement st = con.createStatement();
		ResultSet rs = null;
		String query = "";

		
		double calismaraligi = 0;
		double isilkatsayi = 0;
		
		query = "SELECT * FROM EGMOBHT006 WHERE RCODE ='Çalýþma Aralýðý' ";
		rs = st.executeQuery(query);
		while(rs.next()) {
				
			calismaraligi = rs.getDouble("DEGER");
		
		}
		
		query = "SELECT * FROM EGMOBHT006 WHERE RCODE ='Isýl Genleþme' ";
		rs = st.executeQuery(query);
		while(rs.next()) {
				
			isilkatsayi = rs.getDouble("DEGER");
		
		}
		
		return 1*isilkatsayi*calismaraligi*1000/bolen;
}
	
	public static double SICFARKITESTREF(double bolen) throws ClassNotFoundException, SQLException {
		Connection con = null;
		
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		String sqlConnStr = "jdbc:sqlserver://CANIAS;databaseName=EGEMET604;user=IAS;password=IAS;";
		con = DriverManager.getConnection(sqlConnStr);
		con.setAutoCommit(false);
		Statement st = con.createStatement();
		ResultSet rs = null;
		String query = "";

		
		double calismaraligi = 0;
		double isilkatsayi = 0;
		
		
		query = "SELECT * FROM EGMOBHT006 WHERE RCODE ='Çalýþma Aralýðý' ";
		rs = st.executeQuery(query);
		while(rs.next()) {
				
			calismaraligi = rs.getDouble("DEGER");
		
		}

		query = "SELECT * FROM EGMOBHT006 WHERE RCODE ='Isýl Genleþme' ";
		rs = st.executeQuery(query);
		while(rs.next()) {
				
			isilkatsayi = rs.getDouble("DEGER");
		
		}
		isilkatsayi = isilkatsayi * 0.2;
		
		return 1*isilkatsayi*calismaraligi*1000/bolen;
}

	public static double TESTSIFIR(double bolen) throws ClassNotFoundException, SQLException {
		
		Connection con = null;
		
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		String sqlConnStr = "jdbc:sqlserver://CANIAS;databaseName=EGEMET604;user=IAS;password=IAS;";
		con = DriverManager.getConnection(sqlConnStr);
		con.setAutoCommit(false);
		Statement st = con.createStatement();
		ResultSet rs = null;
		String query = "";

		
		double cozunurluk = 0;
		
		query = "SELECT * FROM EGMOBHT006 WHERE RCODE ='Çözünürlük' ";
		rs = st.executeQuery(query);
		while(rs.next()) {
				
			cozunurluk = rs.getDouble("DEGER");
		
		}
		
		
		return cozunurluk*1000/2/bolen;
}

	public static double TESTOKUHATA(double bolen) throws ClassNotFoundException, SQLException {
		Connection con = null;
		
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		String sqlConnStr = "jdbc:sqlserver://CANIAS;databaseName=EGEMET604;user=IAS;password=IAS;";
		con = DriverManager.getConnection(sqlConnStr);
		con.setAutoCommit(false);
		Statement st = con.createStatement();
		ResultSet rs = null;
		String query = "";

		
		double cozunurluk = 0;
		
		query = "SELECT * FROM EGMOBHT006 WHERE RCODE ='Çözünürlük' ";
		rs = st.executeQuery(query);
		while(rs.next()) {
				
			cozunurluk = rs.getDouble("DEGER");
		
		}
		
		return cozunurluk*1000/2/bolen;
		
}
	  
		public static double TVARYANS(String degerler) throws ClassNotFoundException, SQLException {
		
		double toplam=0;
		String[] arr_varyans=degerler.split("#");
		for(int i=0; i<arr_varyans.length; i++) {
		toplam +=Math.pow(Double.parseDouble(arr_varyans[i]),2);			
		}
			return toplam;
		
		}
		
	public static GenisHesap genisHesap(String obhtype,String obhno) throws ClassNotFoundException, SQLException, NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException, InvocationTargetException {
		
		Connection con = null;
		
		Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
		String sqlConnStr = "jdbc:sqlserver://CANIAS;databaseName=EGEMET604;user=IAS;password=IAS;";
		con = DriverManager.getConnection(sqlConnStr);
		con.setAutoCommit(false);
		Statement st = con.createStatement();
		ResultSet rs = null;
		String query = "";
		GenisHesap nesne = new GenisHesap();
		
		double toplam = 0;
		
		query = "select E4.*,E2.DAGILIMNAME,E2.BOLEN from EGMOBHT004 E4 JOIN EGMOBHT002 E2 ON E4.DAGILIM = E2.DAGILIMNO  where E4.OBHTYPE="+obhtype+" and E4.OBHNO = "+obhno+" and E4.RCODE not in ('TVARYANS','STDUNCER','EXPUNCER') ";
		rs = st.executeQuery(query);
		while(rs.next()) {
				
		Hesap hnesne = new Hesap();
		
		Method[] arr_method = hnesne.getClass().getDeclaredMethods();
			
			for(int m=0;m<arr_method.length;m++) {
				System.out.println("Method : "+arr_method[m].getName());
				if(arr_method[m].getName().equals(rs.getString("RCODE"))) {
				
					double func = (double) arr_method[m].invoke(hnesne, rs.getDouble("BOLEN"));
					System.out.println("Func:"+func);
					
					nesne.getClass().getField(rs.getString("RCODE")).setDouble(nesne, func);
					System.out.println(rs.getString("RCODE")+" nesne degeri:"+nesne.getClass().getField(rs.getString("RCODE")).getDouble(nesne));
					toplam += Math.pow(nesne.getClass().getField(rs.getString("RCODE")).getDouble(nesne),2);
				}
			}
			
		}
		
		System.out.println(	nesne.REFBEL);
		
		nesne.TVARYANS = toplam;
		nesne.STDUNCER = Math.sqrt(toplam);
		nesne.EXPUNCER=nesne.STDUNCER * 2;
		
		System.out.println(	nesne.TVARYANS+"\n"+nesne.STDUNCER+"\n"+nesne.EXPUNCER);
		
		con.close();
		return nesne;
	}
			
	public static double dagilim(String dagilimname) throws ClassNotFoundException, SQLException {

			Connection con = null;
			
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			String sqlConnStr = "jdbc:sqlserver://CANIAS;databaseName=EGEMET604;user=IAS;password=IAS;";
			con = DriverManager.getConnection(sqlConnStr);
			con.setAutoCommit(false);
			Statement st = con.createStatement();
			ResultSet rs = null;
			String query = "";
			double bolen = 0;
			
			query = " SELECT * FROM  EGMOBHT002 WHERE DAGILIMNAME = '"+dagilimname+"'  " ;
			
			rs = st.executeQuery(query);
			while(rs.next()) {


					bolen =  rs.getDouble("BOLEN");
	
			}
			con.close();
			
		
return bolen;
}
	
	
	
}

