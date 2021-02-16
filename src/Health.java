import greenfoot.*; 
public class Health extends Actor
{
    private static int healthindex = 3;
    public void act(){
        Player player = new Player();
        getWorld().addObject(player,2,2);
    } 
    
    public static void removeHeart(int t){
        if(healthindex>1){
            healthindex = healthindex -1;  
        }
    
    }
}