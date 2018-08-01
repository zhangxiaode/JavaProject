package javaWeb;

public class Duotai {
	public static void main (String[] args){
//		Cat cat=new Cat();
//		Dog dog=new Dog();
//		cat.cry();
//		dog.cry();
//		Animal animal=new Cat();
//		animal.cry();
//		animal.eat();
		Master master=new Master();
		Animal cat=new Cat();
		Animal dog=new Dog();
		Food food=new Fish();
		Food dogFood=new Bone();
		master.feed(cat, food);
		master.feed(dog, dogFood);
	}
}
class Animal {
	String name="animal";
	public String showName() {
		return "Ά―Ξο";
	}
	public void cry() {
		System.out.println("²»»α½Π");
	}
	public void eat() {
		System.out.println("blank");
	}
}
class Dog extends Animal {
	public String showName() {
		return "Νϊ²Ζ";
	}
	public void cry() {
		System.out.println("ΝϊΝϊ");
	}
	public void eat() {
		System.out.println("eat bone");
	}
}
class Cat extends Animal {
	public String showName() {
		return "ίδίδ";
	}
	public void cry() {
		System.out.println("ίχίχ");
	}
	public void eat() {
		System.out.println("eat fish");
	}
}
class Food {
	public String showName() {
		return "Blank";
	}
}
class Bone extends Food {
	public String showName() {
		return "bone";
	}
}
class Fish extends Food {
	public String showName() {
		return "fish";
	}
}
class Master {
	public void feed(Animal animal,Food food) {
		System.out.println("feed " + animal.showName() + " many " + food.showName());
	}
}
