package InnerClasses;

import java.util.Scanner;

public class Main {
	private static Scanner scanner = new Scanner(System.in);
	private static Button btnPrint = new Button("Print");

	public static void main(String[] args) {
//		// new class ClickListener use the interface inside the Button class
//		// local class, only applicable to this main block only.
//		// the class is not used in other places, so make it local class;
//		
//		class ClickListener implements Button.OnClickListener {
//			// ClickListener constructor
//			public ClickListener() {
//				System.out.println("I've been attached");
//			}
//
//			// override the method in the Button inner interface OnClickListener
//			@Override
//			public void onClick(String title) {
//				System.out.println(title + " was clicked");
//			}
//		}
//		btnPrint.setOnClickListener(new ClickListener());
		
		//anonymous local inner class;  it create the class and the inner interface method at one statement.
		// you dont really need to give it a real class name.
		
		btnPrint.setOnClickListener(new Button.OnClickListener() {
			
			@Override
			public void onClick(String title) {
				// TODO Auto-generated method stub
				System.out.println(title + " was clicked");
			}
		});
		
		listen();

	}

	private static void listen() {
		boolean quit = false;
		while (!quit) {
			int choices = scanner.nextInt();
			scanner.nextLine();
			switch (choices) {
			case 0:
				quit = true;
				break;
			case 1:
				btnPrint.onClick();
				break;
			}
		}
	}

}

//Gearbox mcLaren = new Gearbox(6);
//mcLaren.operateClutch(true);
//mcLaren.changeGear(1);
//mcLaren.operateClutch(false);
//System.out.println(mcLaren.wheelSpeed(1000));
//mcLaren.changeGear(2);
//System.out.println(mcLaren.wheelSpeed(1000));
//mcLaren.operateClutch(true);
//mcLaren.changeGear(3);
//mcLaren.operateClutch(false);
//System.out.println(mcLaren.wheelSpeed(6000));
//
//
