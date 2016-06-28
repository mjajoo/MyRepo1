package com.sapient.client;

import com.sapient.beans.*;

public class Product1 {

	public static void main(String[] args) {
		
		Product[] arr= new Product[4];
		arr[0]= new Computer(1001,"acer inspire",50000,"Intel Core i5");
		arr[1]= new Computer(1002,"acer inspire 1",30000,"Intel Pentium");
		arr[2]= new Computer(1003,"acer inspire 2",20000,"AMD Radeon");
		arr[3]= new Computer(1004,"acer inspire 3",100000,"Intel Core i7");
for(Product a:arr)
{
System.out.println(a.display());
System.out.println(a.isExpensive());
}
	}

}
