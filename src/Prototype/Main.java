package Prototype;

public class Main {

    public static void main(String[] args) {

        Enemy enemyBase = new Enemy("Image1.png", 0, 100, 2);

        Enemy enemy1 = new Enemy(enemyBase);
        Enemy enemy2 = new Enemy(enemyBase);
        Enemy enemy3 = new Enemy(enemyBase);

        enemy1.setPosX(100);
        enemy2.setPosX(150);
        enemy3.setPosX(200);

        // Draw second line of enemies
        Enemy enemyBase2 = new Enemy("Image1.png", 0, 200, 2);

        Enemy enemy4 = enemyBase2.clone();
        Enemy enemy5 = enemyBase2.clone();
        Enemy enemy6 = enemyBase2.clone();

        enemy4.setPosX(100);
        enemy5.setPosX(150);
        enemy6.setPosX(200);




    }
}
