import greenfoot.*;
abstract public class Entity extends Actor {
    private int hearts;
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
    public void removeHeart(int t){
        hearts -= t;
    }
    public void addHeart(int t){
        hearts += t;
    }
    public int getHearts(){
        return hearts;
    }
    public void setHearts(int newHearts){
        hearts = newHearts;
    }
    public boolean canAct() {
        return Greenfoot.isKeyDown("w") || Greenfoot.isKeyDown("a") || Greenfoot.isKeyDown("s") || Greenfoot.isKeyDown("d");
    }
}
