package Com.Oops.Third;

public class TestMain_Customer {

	public static void main(String[] args) {

		Customer_Account_Statement customerAccountStatement = new Customer_Account_Statement(101, 121020, "Ram",
				"1/1/21", "1/1/22", "branch_Obj", 10, 5000.01, 500.01, "23/08/2021");

		System.out.println(customerAccountStatement);

	}

}
