package OOPs_abstructClass;

public class pageTest {

	public static void main(String[] args) {
		
		loginPage lp = new loginPage(5);
		lp.title();
		lp.url();
		lp.displayLogo();
		lp.pageloadingRime();
		lp.resetpwd();
		lp.privacyPolicy();
		
		//top-casting : child class object can be referred by abstract parent class reference variable
		
		Page pg =new loginPage(10);
		pg.title();
		pg.url();
		pg.displayLogo();
		pg.pageloadingRime();
		pg.privacyPolicy();
		//pg.resetpwd(); NA because can't access individual method of loginPage class
		
		//down casting : NA
	}

}
