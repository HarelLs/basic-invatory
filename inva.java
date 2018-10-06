import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;

public class inva {

	public static Scanner in = new Scanner (System.in);
	public static void main(String[] args) {

		System.out.println("type 10 to start the program.");
		System.out.println("type 6 to exit.");

		int exit = in.nextInt();
		while(exit !=6){
			System.out.println("press 1 to enter new items to the folder");
			System.out.println("press 2 to make the item out of stock");
			System.out.println("press 3 to check if the item is in stock or not");
			System.out.println("press 4 to make the item in stock again");
			System.out.println("press 5 to change the number of times you have an item");
			System.out.println("press 6 to Exit The program.");

			int menu = in.nextInt();

			if(menu == 1){
				System.out.println("write items name's with no spaces, only this symbol - ");
				System.out.println("");
				System.out.println("Enter the Item name To wirte it To the folder:");

				String item = in.next();

				System.out.println("type in the number of times you have this item:");

				int many = in.nextInt();


				if(many == 1){
					String fileName = item;
					try {

						FileWriter Userenter =
								new FileWriter(fileName+".inva");


						BufferedWriter bufferedWriter =
								new BufferedWriter(Userenter);

						bufferedWriter.newLine();
						bufferedWriter.write("The item " + item + " Is In Stock ");
						bufferedWriter.newLine();
						bufferedWriter.write("you have this item in stock " + many + " time ");
						bufferedWriter.close();

						System.out.println("this Item " + item +" has been Wirten to the folder");
						System.out.println("");
						System.out.println("press 1 to go to the Main Menu.");
					}
					catch(IOException ex) {
						System.out.println(
								"Error writing to file '"
										+ fileName + "'");

					}
				}
				if(many != 1){
					String fileName = item;
					try {

						FileWriter Userenter =
								new FileWriter(fileName+".inva");

						BufferedWriter bufferedWriter =
								new BufferedWriter(Userenter);

						bufferedWriter.newLine();
						bufferedWriter.write("The item " + item + " Is In Stock ");
						bufferedWriter.newLine();
						bufferedWriter.write("you have this item in stock " + many + " times ");
						bufferedWriter.close();

						System.out.println("this Item " + item +" has been Wirten to the folder");
						System.out.println("");
						System.out.println("press 1 to go to the Main Menu.");
					}
					catch(IOException ex) {
						System.out.println(
								"Error writing to file '"
										+ fileName + "'");

					}
				}
				int Exit = in.nextInt();
				if(Exit == 2);
			}


			if(menu == 2){
				System.out.println("Enter the Item name To make it out of stock:");

				String item = in.next();


				System.out.println("type in the number of times you have this item (if it is not changed type the old number):");

				int many = in.nextInt();

				if(many == 1){
					String fileName = item;
					try {

						FileWriter Userenter =
								new FileWriter(fileName+".inva");

						BufferedWriter bufferedWriter =
								new BufferedWriter(Userenter);

						bufferedWriter.newLine();
						bufferedWriter.write("The item " + item + " Is out of Stock ");
						bufferedWriter.newLine();
						bufferedWriter.write("you had this item in stock " + many + " time ");
						bufferedWriter.close();

						System.out.println("this Item " + item +" has been Wirten to the folder");
						System.out.println("");
						System.out.println("press 1 to go to the Main Menu.");
					}
					catch(IOException ex) {
						System.out.println(
								"Error writing to folder '"
										+ fileName + "'");

					}
				}

				if(many != 1){
					String fileName = item;
					try {

						FileWriter Userenter =
								new FileWriter(fileName+".txt");

						BufferedWriter bufferedWriter =
								new BufferedWriter(Userenter);

						bufferedWriter.newLine();
						bufferedWriter.write("The item " + item + " Is out of Stock ");
						bufferedWriter.newLine();
						bufferedWriter.write("you had this item in stock " + many + " times ");
						bufferedWriter.close();

						System.out.println("this Item " + item +" has been Wirten to the folder");
						System.out.println("");
						System.out.println("press 1 to go to the Main Menu.");
					}
					catch(IOException ex) {
						System.out.println("The Item " +  item + " was not found." + " " + "if you want to put your item restart the Program.");
						System.out.println("");
						System.out.println("press 1 to go to the Main Menu.");



					}
				}
				int Exit = in.nextInt();
				if(Exit == 2);
			}

			if(menu == 3){
				System.out.println("Enter the Item name To check if he is in stock or not");

				String item = in.next();
				String fileName = item + ".inva";

				try {

					byte[] buffer = new byte[1000];

					FileInputStream inputStream = 
							new FileInputStream(fileName);

					int total = 0;
					int nRead = 0;
					while((nRead = inputStream.read(buffer)) != -1) {

						System.out.println(new String(buffer));
						total += nRead;
					}   


					inputStream.close();        


					System.out.println("");
					System.out.println("press 1 to go to the Main Menu.");
				}


				catch(IOException ex) {
					System.out.println(
							"The Item " +  item + " was not found." + " " + "if you want to put your item in press 1.");                  
					System.out.println("");
					System.out.println("press 1 to go to the Main Menu.");
				}
				int Exit = in.nextInt();
				if(Exit == 2);

			}

			if(menu == 4){
				System.out.println("Enter the Item name To wirte it To the file:");

				String item = in.next();
				System.out.println("if you want to change the number of times you have in stock of the Item " + item + " type it:");
				int many = in.nextInt();


				if(many == 1){
					String fileName = item;
					try {

						FileWriter Userenter =
								new FileWriter(fileName+".inva");


						BufferedWriter bufferedWriter =
								new BufferedWriter(Userenter);


						bufferedWriter.newLine();
						bufferedWriter.write("The item " + item + " Is In Stock ");
						bufferedWriter.newLine();
						bufferedWriter.write("you have this item in stock " + many + " time ");
						bufferedWriter.close();

						System.out.println("this Item " + item +" has been Wirten to the folder");
						System.out.println("");
						System.out.println("press 1 to go to the Main Menu.");
					}
					catch(IOException ex) {
						System.out.println("The Item " +  item + " was not found." + " " + "if you want to put your item restart the Program.");

					}
				}

				if(many != 1){
					String fileName = item;
					try {
						FileWriter Userenter =
								new FileWriter(fileName+".inva");


						BufferedWriter bufferedWriter =
								new BufferedWriter(Userenter);


						bufferedWriter.newLine();
						bufferedWriter.write("The item " + item + " Is In Stock ");
						bufferedWriter.newLine();
						bufferedWriter.write("you have this item in stock " + many + " times ");
						bufferedWriter.close();

						System.out.println("this Item " + item +" has been Wirten to the folder");
						System.out.println("");
						System.out.println("press 1 to go to the Main Menu.");
					}
					catch(IOException ex) {
						System.out.println("The Item " +  item + " was not found." + " " + "if you want to put your item press 1.");

					}
				}
				int Exit = in.nextInt();
				if(Exit == 2);
			}
			if(menu  > 6){
				System.out.println("please restart the program.");

			}
			if(menu < 1){
				System.out.println("please restart the program.");
			}

			if(menu == 5){
				System.out.println("Type the name of the Item:");

				String item = in.next();

				System.out.println("if you want to change the number of times you have in stock of the Item " + item + " type it:");


				int many = in.nextInt();


				if(many == 1){
					String fileName = item;
					try {
						FileWriter Userenter =
								new FileWriter(fileName+".inva");

						BufferedWriter bufferedWriter =
								new BufferedWriter(Userenter);

						bufferedWriter.newLine();
						bufferedWriter.write("The item " + item + " Is In Stock ");
						bufferedWriter.newLine();
						bufferedWriter.write("you have this item in stock " + many + " time ");
						bufferedWriter.close();

						System.out.println("this Item " + item +" has been Wirten to the folder");
						System.out.println("");
						System.out.println("press 1 to go to the Main Menu.");
					}
					catch(IOException ex) {
						System.out.println(
								"Error writing to folder '"
										+ fileName + "'");

					}
				}

				if(many != 1){
					String fileName = item;
					try {

						FileWriter Userenter =
								new FileWriter(fileName+"inva");

						BufferedWriter bufferedWriter =
								new BufferedWriter(Userenter);

						bufferedWriter.newLine();
						bufferedWriter.write("The item " + item + " Is In Stock ");
						bufferedWriter.newLine();
						bufferedWriter.write("you have this item in stock " + many + " times ");
						bufferedWriter.close();

						System.out.println("this Item " + item +" has been Wirten to the folder");
						System.out.println("");
						System.out.println("press 1 to go to the Main Menu.");
					}
					catch(IOException ex) {
						System.out.println(
								"Error writing to folder '"
										+ fileName + "'");

					}
				}
				int Exit = in.nextInt();
				if(Exit == 2);

			}

			if(menu == 6 ){
				System.out.println("Will Exit Now.");
				break;
			}


		}


	}
}
//Written by H.L in 2018.
//Ver 1.0.




