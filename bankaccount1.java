
	

	public class bankAccount {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
	RegularCustomer regCustomer1=new RegularCustomer("bngdcf","ammu","business",20000);
	RegularCustomer regCustomer2=new RegularCustomer("yu786","chinni","business",50000);

	EnterpriseCustomer entCustomer1=new EnterpriseCustomer("uy67","huygf","business",90000);
	EnterpriseCustomer entCustomer2=new EnterpriseCustomer("bhyg","jikhgfg","business",70000);

	regCustomer1.showCustomerDetails();
	System.out.println("final amount:"+regCustomer1.get_final_amount(5,8));
	regCustomer2.showCustomerDetails();
	System.out.println("final amount:"+regCustomer2.get_final_amount(5,8));
	entCustomer1.showCustomerDetails();
	System.out.println("final amount:"+entCustomer1.get_final_amount(5,8));
	entCustomer2.showCustomerDetails();
	System.out.println("final amount:"+regCustomer2.get_final_amount(5,8));

		}

	}
