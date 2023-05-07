package springioc;


public class Car {
	
String brand;
String color;
int topSpeed;
MusicSystem musicSystem;

public MusicSystem getMusicSystem() {
	return musicSystem;
}

public void setMusicSystem(MusicSystem musicSystem) {
	this.musicSystem = musicSystem;
}

public String getBrand() {
	return brand;
}

public void setBrand(String brand) {
	this.brand = brand;
}
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public int getTopSpeed() {
	return topSpeed;
}

public void setTopSpeed(int topSpeed) {
	this.topSpeed = topSpeed;
}

@Override
public String toString() {
	return "Car [brand=" + brand + ", color=" + color + ", topSpeed=" + topSpeed + ", musicSystem=" + musicSystem + "]";
}

}
