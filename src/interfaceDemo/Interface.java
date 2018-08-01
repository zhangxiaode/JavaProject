package interfaceDemo;

public class Interface{
	public void useUse(Usb usb){
		usb.start();
	}
	public static void main(String[] args){
		Camera camera=new Camera();
		Phone phone = new Phone();
		Computer computer = new Computer();
		computer.useUsb(camera);
		computer.useUsb(phone);
		System.out.println(Usb.a);
	}
}
class Computer{
	public void useUsb(Usb usb) {
		usb.start();
		usb.end();
	}
}
interface Usb{
	int a=0;
	public void start();
	public void end();
}
interface Kkk extends Usb{
	public void kk();
}
class Camera implements Usb,Kkk{
	public void start() {
		System.out.println(a);
		System.out.println("相机开始");
	}
	public void end() {
		System.out.println("相机结束");
	}
	public void kk() {
		System.out.println("kk结束");
	}
}
class Phone implements Usb,Kkk{
	public void start() {
		System.out.println("手机开始");
	}
	public void end() {
		System.out.println("手机结束");
	}
	public void kk() {
		System.out.println("kk结束");
	}
}