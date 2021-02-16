import greenfoot.*;
abstract public class Entity extends Actor {
    abstract protected GreenfootImage getDirectionImage(Directions dir);
    public void move(Directions dir) {
        int x = getX();
        int y = getY();
        int dx = 0;
        int dy = 0;
        if (dir == Directions.UP) {
            dy = -1;
        } else if (dir == Directions.RIGHT) {
            dx = 1;
        } else if (dir == Directions.DOWN) {
            dy = 1;
        } else if (dir == Directions.LEFT) {
            dx = -1;
        }
        setImage(getDirectionImage(dir));
        if(getOneObjectAtOffset(dx, dy, Solid.class) == null) {
            setLocation(x + dx, y + dy);
        }
    }
    public boolean canAct() {
        return Greenfoot.isKeyDown("w") || Greenfoot.isKeyDown("a") || Greenfoot.isKeyDown("s") || Greenfoot.isKeyDown("d");
    }
}