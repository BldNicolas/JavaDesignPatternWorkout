package dp.decorator;

import dp.decorator.structure.Coffee;
import dp.decorator.structure.CoffeeDecorator;

public class SugarDecorator extends CoffeeDecorator {
	
	 public SugarDecorator(Coffee coffee) {
	     super(coffee);
	 }

	 @Override
	 public double getCost() {
	     return super.getCost() + 0.30; // Adding cost of sugar
	 }

	 @Override
	 public String getDescription() {
	     return super.getDescription() + ", With Sugar";
	 }
}
