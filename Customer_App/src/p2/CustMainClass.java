package p2;
public class CustMainClass {

	public static void main(String[] args) {
		java.util.Scanner s = new java.util.Scanner(System.in);
		p1.CustomerContact cc = new p1.CustomerContact();
		p1.CustomerDetails cd =new p1.CustomerDetails();
		System.out.println("Enter the custId:");
		cd.setcustId(s.nextLine());
		System.out.println("Enter the custName:");
		cd.setCustName(s.nextLine());
		System.out.println("Enter the custCity:");
		cd.setcustCity(s.nextLine());
		System.out.println("Enter the CustMailId:");
		cc.setcustmailId(s.nextLine());
		System.out.println("Enter The PhoneNO:");
		cc.setphoneNO(s.nextLong());
		System.out.println("=====CustDetails====");
		System.out.println("custId: "+cd.getCustId());
		System.out.println("custName: "+cd.getcustName());
		System.out.println("custCity:"+cd.getcustCity());
		System.out.println("custmailId:"+cc.getcustmailId());
		System.out.println("custphoneNo: "+cc.getphoneNo());
		s.close();

	}

}
