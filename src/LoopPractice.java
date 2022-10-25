public class LoopPractice extends World{

    public void go() {
        plane.pausetime = 0;

        for(int x=0;x<10;x=x+1) {
            System.out.print(x);
            plane.setColor(plane.random(0,255), plane.random(0,255), plane.random(0,255));
            drawShape();

        }


    }


      public void drawShape() {


          //if/else statement
          int random = plane.random(0, 3); //0,1,2 at random
          System.out.println(random);
          if (random == 0) {
          }
              plane.teleport(plane.random(0,600), plane.random(0,600));
            square5();


          if (random == 1) {
              plane.teleport(plane.random(0,600), plane.random(0,600));
              plane.house(100);

          }
          if (random == 2) {
              plane.teleport(plane.random(0,600), plane.random(0,600));
              plane.fillCircle(100);

          }

          }



    public void square5 () {
        plane.square(100);
        plane.setColor(plane.random(1, 255), plane.random(1, 255), plane.random(1, 255));
        plane.square(100);
        plane.setColor(plane.random(1, 255), plane.random(1, 255), plane.random(1, 255));
        plane.square(100);
        plane.setColor(plane.random(1, 255), plane.random(1, 255), plane.random(1, 255));
        plane.square(100);
        plane.setColor(plane.random(1, 255), plane.random(1, 255), plane.random(1, 255));
        plane.square(100);
        plane.setColor(plane.random(1, 255), plane.random(1, 255), plane.random(1, 255));
        plane.square(100);
        plane.setColor(plane.random(1, 255), plane.random(1, 255), plane.random(1, 255));
    }
    }
