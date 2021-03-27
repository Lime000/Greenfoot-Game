import greenfoot.*;
public abstract class Solid extends Actor {
    private String connections = "";
    public void setLocation(int x, int y) {
        super.setLocation(x, y);
        update(this);
        Solid up = (Solid) getOneObjectAtOffset(0, -1, Solid.class);
        update(up);
        Solid right = (Solid) getOneObjectAtOffset(1, 0, Solid.class);
        update(right);
        Solid down = (Solid) getOneObjectAtOffset(0, 1, Solid.class);
        update(down);
        Solid left = (Solid) getOneObjectAtOffset(-1, 0, Solid.class);
        update(left);
    }
    public void addedToWorld(World world) {
        super.addedToWorld(world);
        update(this);
        Solid up = (Solid) getOneObjectAtOffset(0, -1, Solid.class);
        update(up);
        Solid right = (Solid) getOneObjectAtOffset(1, 0, Solid.class);
        update(right);
        Solid down = (Solid) getOneObjectAtOffset(0, 1, Solid.class);
        update(down);
        Solid left = (Solid) getOneObjectAtOffset(-1, 0, Solid.class);
        update(left);
    }
    abstract public void update(Solid solid);
    abstract public void setImage();
    public void setConnections() {
        connections = "";
        if(solidUp() != null) {
            connections += "U";
        }
        if(solidRight() != null) {
            connections += "R";
        }
        if(solidDown() != null) {
            connections += "D";
        }
        if(solidLeft() != null) {
            connections += "L";
        }
        if(connections == "") {
            connections = "Default";
        }
    }
    public Solid solidUp() {
        return (Solid) getOneObjectAtOffset(0, -1, Solid.class);
    }
    public Solid solidRight() {
        return (Solid) getOneObjectAtOffset(1, 0, Solid.class);
    }
    public Solid solidDown() {
        return (Solid) getOneObjectAtOffset(0, 1, Solid.class);
    }
    public Solid solidLeft() {
        return (Solid) getOneObjectAtOffset(-1, 0, Solid.class);
    }
    public String getConnections() {
        return connections;
    }
}
