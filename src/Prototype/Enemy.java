package Prototype;

public class Enemy {

    private String image;
    private int posX;
    private int posY;
    private int numberOfLives;

    public Enemy(String image, int posX, int posY, int numberOfLives) {
        this.image = image;
        this.posX = posX;
        this.posY = posY;
        this.numberOfLives = numberOfLives;
    }

    // Option 1. Add another constructor that return an object of the same class
    public Enemy(Enemy enemy) {
        this.setImage(enemy.getImage());
        this.setPosX(enemy.getPosX());
        this.setPosY(enemy.getPosY());
        this.setNumberOfLives(enemy.getNumberOfLives());
    }

    //Option 2. Add a method of instance
    public Enemy clone() {
//        return new Enemy(this); // Option 2a
        return new Enemy(this.image, this.posX, this.posY, this.numberOfLives); // Option 2b
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public int getNumberOfLives() {
        return numberOfLives;
    }

    public void setNumberOfLives(int numberOfLives) {
        this.numberOfLives = numberOfLives;
    }
}
