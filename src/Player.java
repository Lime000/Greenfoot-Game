import greenfoot.*;
import java.util.List;
public class Player extends Entity {
    private Worlds resetWorld;
    private Item item;
    private boolean actOnce = false;
    public Player(Worlds newWorld) {
        setHearts(5);
        resetWorld = newWorld;
    }
    public void act() {
        if(!actOnce) {
            updateStatus(getHearts());
            actOnce = true;
        }
        if(isTouching(Enemies.class)) {
            removeHeart(1);
            updateStatus(getHearts());
        }
        if(canTakeItem()) {
            takeItem();
        }
        if(Greenfoot.isKeyDown("space") && item != null) {
            item.useItem(this);
        }
        if (Greenfoot.isKeyDown("w")) {
            move(Directions.UP);
        }
        if (Greenfoot.isKeyDown("a")) {
            move(Directions.LEFT);
        }
        if (Greenfoot.isKeyDown("s")) {
            move(Directions.DOWN);
        }
        if (Greenfoot.isKeyDown("d")) {
            move(Directions.RIGHT);
        }
    }
    public void updateStatus(int hearts) {
        getWorld().showText(String.valueOf(hearts), 0, 0);
        World world = getWorld();
        for(int i = 0; i < 5; i++) {
            world.removeObjects(world.getObjectsAt(i, 0, Heart.class));
        }
        for(int i = 0; i < hearts; i++) {
            world.addObject(new Heart(), i, 0);
        }
        if (getHearts() == 0) {
            resetWorld.reset();
        }
    }
    public void takeItem() {
        if(item != null) {
            item.getWorld().removeObject(item);
        }
        item = (Item) getOneIntersectingObject(Item.class);
        item.setLocation(6, 0);
        System.out.println("Item");
    }
    public void attack(int damage, int range) {
        List enemies = getNeighbours(range, false, Enemies.class);
        for(int i = 0; i < enemies.size(); i++) {
            Enemies enemy = (Enemies) enemies.get(i);
            enemy.removeHeart(damage);
        }
    }
    public boolean canTakeItem() {
        return Greenfoot.isKeyDown("e") && isTouching(Item.class);
    }
    public void removeItem() {
        item = null;
    }
    protected GreenfootImage getDirectionImage(Directions dir) {
        switch (dir) {
            case UP:
                return new GreenfootImage("Player_UP.png");
            case RIGHT:
                return new GreenfootImage("Player_RIGHT.png");
            case DOWN:
                return new GreenfootImage("Player_DOWN.png");
            case LEFT:
                return new GreenfootImage("Player_LEFT.png");
            default:
                return new GreenfootImage("Player_DOWN.png");
        }
    }
}
