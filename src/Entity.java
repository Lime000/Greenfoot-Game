import greenfoot.*;
abstract public class Entity extends Actor {
    private int hearts;
    abstract protected GreenfootImage getDirectionImage(Directions dir); 
    //Das passende Bild zu einer Richtung finden. (Jedes Entity gibt das selber an.)
    public void move(Directions dir) {
        int x = getX(); //Position auf dem Feld.
        int y = getY();
        int dx = 0; //Neue Position.
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
        setImage(getDirectionImage(dir)); //Das passende Bild zu der Richtung anzeigen.
        if(getOneObjectAtOffset(dx, dy, Solid.class) == null) { //überprüfen, ob der Spieler vor einer Wand steht.
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
    public boolean canAct() { //Überprüfen, ob der Spieler sich bewegt (w, a, s oder d eingibt)
        return Greenfoot.isKeyDown("w") || Greenfoot.isKeyDown("a") || Greenfoot.isKeyDown("s") || Greenfoot.isKeyDown("d");
    }
}
