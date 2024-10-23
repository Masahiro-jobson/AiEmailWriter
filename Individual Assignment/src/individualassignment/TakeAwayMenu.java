package individualassignment;

import java.util.ArrayList;
import java.util.Scanner;

public class TakeAwayMenu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int option, category, dishes, quantity, orderContinue;
		
		ArrayList<String> dishList = new ArrayList<String>();
		ArrayList<Double> priceList = new ArrayList<Double>();
		ArrayList<Integer> quantityList = new ArrayList<Integer>();
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("1) Option 1 - Show Menu"+"\n"+"2) Option 2 - Show Exit");
		do {
			option = Integer.parseInt(input.nextLine());
			if(option == 1) {
				System.out.println("Choose the categories from the below");
				System.out.println("1) Appetisers \n2) Main Dishes \n3) Fried Rice");
			} else if (option == 2) {
				System.out.println("See you next time.");
				System.exit(0);
			} else {
				System.out.println("Invalid Number. Please choose the right option again");
				System.out.println("1) Option 1 - Show Menu"+"\n"+"2) Option 2 - Show Exit");
			}

		} while(option != 1 && option != 2);
		
			do {
				do {
					category = Integer.parseInt(input.nextLine());
				  if(category == 1) {
						do{
							System.out.println("1) Spring Rolls \n Crispy rolls filled with vegetables and sweet chili sauce. \n $6.00");
							System.out.println("2) Thai Dumplings  \n Steamed dumplings with chicken and vegetable filling. \n $7.50");
							dishes = Integer.parseInt(input.nextLine());
							if(dishes == 1) {
								dishList.add("Spring Rolls");
								priceList.add(6.00);
							} else if (dishes == 2) {
								dishList.add("Thai Dumplings");					
								priceList.add(7.50);
							} else {System.out.println("Invalid number");}
						} while(dishes != 1 && dishes != 2);
						
					} else if (category == 2) {
						do{
							System.out.println("1) Pad Thai \n Stir-fried rice noodles with shrimp, tofu, peanuts, and bean sprouts. \n $12.00");
							System.out.println("2) Basil Chicken  \n Stir-fried chicken with Thai basil, chili, and vegetables, served with jasmine rice. \n $12.00");
							dishes = Integer.parseInt(input.nextLine());
							if(dishes == 1) {
								dishList.add("Pad Thai");
								priceList.add(12.00);
							} else if (dishes == 2) {
								dishList.add("Basil Chicken");					
								priceList.add(12.00);
							} else {System.out.println("Invalid number");}
						} while(dishes != 1 && dishes != 2);
						
					} else if (category == 3) {
						do{
							System.out.println("1) Thai Fried Rice \n Fried rice with chicken, shrimp, or vegetables, seasoned with Thai spices. \n $11.00");
							System.out.println("2) Pineapple Fried Rice \n Fried rice with pineapple, cashews, and choice of meat or tofu. \n $12.50");
							dishes = Integer.parseInt(input.nextLine());
							if(dishes == 1) {
								dishList.add("Thai Fried Rice");
								priceList.add(11.00);
							} else if (dishes == 2) {
								dishList.add("Pineapple Fried Rice");					
								priceList.add(12.50);
							} else {System.out.println("Invalid number");}						
						} while(dishes != 1 && dishes != 2);
						
					} else  {
						System.out.println("Invalid number, please choose category again");
						System.out.println("1) Appetisers \n2) Main Dishes \n3) Fried Rice");
					}
						
				} while (category < 1 || category > 3);

				do {
					System.out.println("Please enter how many pcs you want");
					quantity = Integer.parseInt(input.nextLine());
					if(quantity <= 0) {
						System.out.println("Invalid number. Enter how many pcs you want");
					} else {quantityList.add(quantity);}
					
				} while(quantity <= 0);
				
				
				System.out.println("Would you like to continue ordering \n 1) Yes, please \n 2) No, thanks ");
				orderContinue = Integer.parseInt(input.nextLine());
				
				if (orderContinue == 1) {
					System.out.println("Choose the categories from the below again");
					System.out.println("1) Appetisers \n2) Main Dishes \n3) Fried Rice");
					
				} 
				
			} while(orderContinue == 1);
			
			int sizeSame = dishList.size();
			
			String[] dishStr = new String[sizeSame];
			Double[] priceDou = new Double[sizeSame]; 
			Integer[] quantityInt = new Integer[sizeSame];
	
			for(int i = 0; i < sizeSame;i++) {
				dishStr[i] = dishList.get(i);
				quantityInt[i] = quantityList.get(i);
				priceDou[i] = priceList.get(i);
			}
			
			System.out.println( "Dish" + "             " + "Quantity" + "   " + "Subtotal");
			double sum = 0;
			 for (int i = 0; i < sizeSame; i++) {
				 String chosenDish = dishStr[i];
				 int chosenQuantity = quantityInt[i];
				 double chosenPrice = priceDou[i] * chosenQuantity;
				 
				 sum += chosenPrice;
				 System.out.printf("%-15s %8d    $ %.2f\n", chosenDish, chosenQuantity, chosenPrice);
			 }

			 System.out.println("Total                       $ " + String.format("%.2f", sum));
			 
		}
			 
		
	}
