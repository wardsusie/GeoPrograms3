

public class A3_changeMyColor extends World {

    //This is the method that your program looks for and executes when you 'run' it
    public void go() {

        System.out.println("This message will be printed to the window below.");
        System.out.println("That window is called the dos window");
        plane.startingAngle(-45);
        plane.isTrail = true;
        plane.trailWidth = 32;
        plane.setColor(0, 100, 130);
        plane.move(100);

    }


}
