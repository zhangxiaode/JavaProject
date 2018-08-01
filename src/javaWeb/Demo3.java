/*
 * 
 */
package javaWeb;

import javax.swing.JFrame;

public class Demo3 extends JFrame {
	public static void main(String[] args){
		Pupil pup=new Pupil();
		pup.say(123);
		Demo3 exa = new Demo3();
		System.out.println(pup);
	}
	public Demo3(){
		this.setVisible(true);
		this.setSize(800,600);
	}
}
class Common extends Com{
	protected int a;
	protected String b;
	public void say(int a){
		System.out.println(111%2);
	}
}
class Pupil extends Common{
	public void say(int a){
		this.a = a;
		this.b = "abc";
		this.x = 123;
		System.out.println(this.a);
		System.out.println(this.b);
		System.out.println(this.x);
		System.out.println(111/2);
	}
}
class Com {
	protected int x;
}
