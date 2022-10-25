public class FinalGeoProject extends World {
    public int red;
    public int blue;
    public int green;

    public void go() {
        plane.pausetime=0;
        plane.teleport(0,0);
        plane.showBackGround();
        plane.isTrail=true;
        plane.trailWidth=40;
        towel();
        umbrella();
        plane.teleport(343,474);
        plane.trailWidth=40;
        plane.square(20);
        towel2();
        umbrella2();



        for( int col=0; col<800; col=col+1 ) {
            for (int row=0; row<295; row=row+1){
                plane.teleport(col,row);

                red=plane.howMuchRed();
                blue=plane.howMuchBlue();
                green=plane.howMuchGreen();

                if(blue>200&& green>200){
                    plane.setPixelColor(0,50,250);
                }
                if(red>100 && blue<10){
                    plane.setPixelColor(255,0,0);
                }



        }
       }

    }

    public void towel(){
        plane.teleport(400,400);
        plane.setColor(plane.random(0,255),plane.random(0,255),plane.random(0,255));
        rectangle();
        plane.setColor(plane.random(0,255),plane.random(0,255),plane.random(0,255));
        plane.teleport(400,452);
        rectangle();
        plane.setColor(plane.random(0,255),plane.random(0,255),plane.random(0,255));
        plane.teleport(400,500);
        rectangle();


    }

    public void towel2(){
        plane.teleport(230,400);
        plane.setColor(plane.random(0,255),plane.random(0,255),plane.random(0,255));
        rectangle();
        plane.setColor(plane.random(0,255),plane.random(0,255),plane.random(0,255));
        plane.teleport(230,452);
        rectangle();
        plane.setColor(plane.random(0,255),plane.random(0,255),plane.random(0,255));
        plane.teleport(230,500);
        rectangle();


    }
    public void umbrella (){
        plane.teleport(545,450);
        plane.setColor(plane.random(0,255),plane.random(0,255),plane.random(0,255));
        plane.trailWidth=10;
        plane.fillCircle(7);

    }
    public void umbrella2 (){
        plane.teleport(150,450);
        plane.setColor(plane.random(0,255),plane.random(0,255),plane.random(0,255));
        plane.trailWidth=10;
        plane.fillCircle(7);

    }

public void rectangle () {
        plane.startingAngle(90);
    plane.turn(0);
    plane.move(10);
    plane.turn(90);
    plane.move(35);
    plane.turn(90);
    plane.move(10);
    plane.turn(90);
    plane.move(35);
}

}
