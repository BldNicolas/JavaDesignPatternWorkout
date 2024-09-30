package dp.decorator;

import dp.decorator.structure.Coffee;
import dp.decorator.structure.CoffeeDecorator;


public class MilkDecorator extends CoffeeDecorator {
	
 public MilkDecorator(Coffee coffee) {
	 super(coffee);
 }

 @Override
 public double getCost() {
     return super.getCost() + 0.50; // Adding cost of milk
 }

 @Override
 public String getDescription() {
     return super.getDescription() + ", With Milk";
 }
 
}