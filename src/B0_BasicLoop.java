public class B0_BasicLoop extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {
        plane.isTrail=true;
        plane.trailWidth=plane.random(1,10);
        plane.pausetime=0;
        house();
        plane.setColor(plane.random(1,255), plane.random(1,255), plane.random(1,255));
        plane.teleport(210,320);
        plane.circle(100);
        plane.teleport(plane.random(1,200),plane.random(1,200));
        plane.square(50);





    }

    public void house() {
        plane.setColor(plane.random(1,250), plane.random(1,250), plane.random(1,250));
        plane.move(100);
        plane.turn(90);
        plane.move(100);
        plane.turn(90);
        plane.move(100);
        plane.turn(90);
        plane.move(100);
        plane.turn(-130);
        plane.move(80);
        plane.turn(-100);
        plane.move(75);
    }
 public void grid(){
        for(int y=0;y<50;y=y+1){
            prettysquares(y, plane.random(1,150));
        }
    }
 public void prettysquares(int y, int z){
        for(int x=0;x<50;x=x+1){
            plane.teleport(x*z,y*z);
            plane.square(z);
            plane.setColor(plane.random(0,255), plane.random(0,255), plane.random(0,255));
            System.out.println("my x location is " + x);}


    }
}
