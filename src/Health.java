import greenfoot.*; 
public class Health extends Actor {
    private static int health = 3;
    private Worlds resetWorld;
    public Health(Worlds newWorld) {
        resetWorld = newWorld;
    }
    public void act(){
        if(health <= 0) {
            resetWorld.reset();
        }
    } 
    public static void addHeart(int amount){
        health += amount;
        System.out.println(health);
    }
    public static void removeHeart(int amount){
        health -= amount;
        System.out.println(health);
    }
}