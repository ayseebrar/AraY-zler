package AraYüzler;

public interface Plygon {
void getArea();
default void getSides() {
	System.out.println("Plygon kenar sayısı");
}
default void getPerimeter(int...sides){
	//3 nokta sınırsız sayıda parametre alacağımızı söylüyor.
	int perimeter=0;
	for(int side:sides) {
		perimeter+=side;
	}
	System.out.println("cokgenin cevresi:"+perimeter);
}


}
