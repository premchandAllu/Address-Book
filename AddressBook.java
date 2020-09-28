package com.Bridgelabz.AddressBook;
import java.util.*;

public class AddressBook 
{
    String firstName;
    String lastName;
    String address;
    String city;
    String state;
    int zip;
	long phoneNumber;
	String emailId; 
	  
	
public void Address(String firstName, String lastName, String address, String city, String state,int zip,long phoneNumber, String emailId)
    {
     	this.firstName=firstName;
		this.lastName=lastName;
		this.address=address;
		this.city=city;
		this.state=state;
		this.zip=zip;
		this.phoneNumber=phoneNumber;
		this.emailId=emailId;
		
		System.out.println("Address Book Details of the person are");
		System.out.println( firstName+" "+lastName+" "+address+" "+city+" "+state+" "+zip+" "+phoneNumber+" "+emailId+" ");
		
		}

  public static void main(String args[])
    { 
	  char choice;
    
	  do
	  {
		  Scanner sc = new Scanner(System.in);
	  System.out.println("Add details in Address Book");
	
	  //taking input from user
	  System.out.println("Enter the first name");
	  String firstName = sc.nextLine( );
	  System.out.println("Enter the last name");
	  String lastName = sc.nextLine( );
	  System.out.println("Enter the address");
	  String address  = sc.nextLine( );
	  System.out.println("Enter the city");
	  String city     = sc.nextLine( );
	  System.out.println("Enter the state");
	  String state    = sc.nextLine( );
	  System.out.println("Enter the zip number");
	  int zip         = sc.nextInt( );
	  System.out.println("Enter the phone number");
	  long phoneNumber= sc.nextLong( );
	  System.out.println("Enter the email id");
	  sc.nextLine();
	  String emailId  = sc.nextLine( );
	  
	  AddressBook obj = new AddressBook();
	  
	  obj.Address(firstName,lastName,address,city,state,zip,phoneNumber,emailId);
	  
	  System.out.println("do you want to enter detials for another person, if yes type y  else type n ");
	  choice= sc.next().charAt(0);
	  
	    
    }while( choice == 'y'|| choice =='Y');
    	
  }
}