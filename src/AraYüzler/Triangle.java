package AraYüzler;

public class Triangle implements Plygon {
	protected int a,b,c;
	protected double s,area;
	Triangle(int a,int b,int c ){
		this.a=a;
		this.b=b;
		this.c=c;
		a=0;
	}
	public void getArea()
	{
		s=(double)(a+b+c)/2;
		area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
		System.out.println("Ücgenin Alani:"+area);
	}
}
