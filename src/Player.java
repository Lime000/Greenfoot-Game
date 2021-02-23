import greenfoot.*;
public class Player extends Entity {
    private Worlds resetWorld;
    public Player(Worlds newWorld) {
        setHearts(5);
        resetWorld = newWorld;
    }
    public void act() {
        if(isTouching(Enemies.class)) {
            removeHeart(1);
        }
        if (getHearts() == 0){
            resetWorld.reset();
        }
        updateStatus(getHearts());
        World world = getWorld();
        world.showText(String.valueOf(getHearts()), 0, 0);
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
        for(int i = 0; i < 5 ; i++ ){
            World world = getWorld();
            world.removeObjects(world.getObjectsAt(i, 0, Heart.class));
        }
        for(int i = 0; i < hearts ; i++ ){
            getWorld().addObject(new Heart(), i, 0);
        }
        
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
