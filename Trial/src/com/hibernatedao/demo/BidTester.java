package com.hibernatedao.demo;

import java.util.Scanner;

import com.hibernatedao.demo.*;;

public class BidTester {

	public static void main(String[] args) {
		Bidder bid = new Bidder();
		
		
		
Scanner sc= new Scanner(System.in);
		
		
		
		int choice=0;
		while(choice!=6)
		{
		System.out.println("Actions CRUD");
		System.out.println("1.Add Bid");
		System.out.println("2. Delete Bid");
		System.out.println("3. Update Bid");
		System.out.println("4. List All Bids");
		System.out.println("5. List Bid by ID");
		System.out.println("6. Exit");
		
		System.out.println("Choose CRUD to be performed:");
	}
		
		choice=sc.nextInt();
		switch(choice)
		{
		case 1: addBid(bid);
		System.out.println("Enter bid to be added");
		bid=sc.nextInt();
		
		
		break;
	
		case 2: delBid(bid);
		System.out.println("Enter bid to be deleted");
		que3="delete from bidders where b_id=bid";
		break;
		
		
		case 3: updateBid(bid);
		
		break;
		
		
		
		case 4: listofbids = listAllBidder();
		for(Bidder d:listofbids)
		{
			System.out.println(d);
		}
		break;
		
		case 5: bid= listBidderById(bid);
		System.out.println("Enter department to view");
		deptid=new Scanner(System.in).nextInt();
		
		bid = daoimpl.listDeptById(bid);
		System.out.println(bid);
		break;
		
		case 6: System.exit(0);
		break;
		
		
		
		}
		
}
}