//// Nbrooks PROJECT #1


float sunX, sunY; //variables for sun
float sunDX;

float x,y;        // Position of man
float horizon;

float xGold=400, yGold=525;

String title="Project #1 -- Hero chases the gold";
String author="Narada Brooks";

void setup() 
{
  
  size( 800, 800 );     //// screen size
  horizon= height/4
  
  x=100;
  y=100;
  
  sunX=  width/10;   // Reset the sun position.
  sunY=  100;
  sunDX=  4;  
}

// NEXT FRAME ////

//// background sky and grass colors

void draw() 
{
  ///  BACKGROUND SCENE  ///
  
  background( 0, 175, 255);             //// background sky color
  fill(0, 200, 0);                     //green grass rectangle color
  ////rect(0, 600, 2000, 600);            //rectangle grass
  rect(0,horizon,width,height-horizon);
  
  sun();
  
  
  house();
  man();
  move();
  action();
  gold();
 
 //// SCREEN TEXT MESSAGES ////
 
  fill( 255, 0, 0 );                     ////  text color 
  textSize(26);
  text( "waah gwaan,  peeps", x+50, y-50 );
  
  
  fill( 250, 0,0 );                                   //// red text color tittle
 
  textSize(20);                                     //// tittle text size tittle
  
  text ("Project#1: Sunny Day", 0, width/30);       //// title Sunny Day 
  
  fill( 100, 0, 200 );                                  //// purple text color author's name
  
  textSize(22);                                     //// text size fr author's name
  
  text("Narada, 61CST112 broon84", 30, width);          //// Author's name and class
}


void sun()

{
  
  /// YELLOW SUN AND COLOR ///
  
  fill( 255, 255, 0 );                     //// yellow sun color
  ellipse (sunX,sunY,75,80);    //// yellow ellipse sun
  ////ellipse (x-100,y=65,75,80);     ////makes sun and man moves together
}


//// MOVE THE SUN  (by changing x,y)  ///

void move()

{
  if (sunX>width) {
    sunX=  50;
    sunY=  random( 20, height/4 );
  }
  sunX=  sunX + sunDX;
}



void house()
{
  
 //// FULL HOUSE AND COLOR  ///
 
  rectMode(CENTER);
  fill( 255, 0, 0 );       //// red house color 
  rect( 200, 225, 175, 150 );  //// rectangular red house body
  
  fill( 255, 0, 0 );         //// red roof color
  triangle( 100, 150, 200, 50, 300, 150 );   //// red house roof
  
  
  //// BROWN AND GREEN TREE ////
  
  rectMode(CORNERS);
  fill( 204,102 ,0 );       ////bown tree bark color
  rect( 560, 190, 600, 300 );    //// tree body
  
  fill( 0, 250, 0 );            //// green leaf tree  color
  ellipse( 580, 110, 150, 200 );    //// tree top gree leaves
}



//// DRAW GOLD ////

{
  ellipse(400,525,320,380);    //// dimension for gold 
  
  
  
  
}

void man()
{
  /// DRAW MAN ///
  
  fill( 0, 0, 100 );
  rectMode(CENTER);
  
  // MAN BODY & HEAD
  
  rect( x,y, 20, 100 );         
  ellipse( x, y-30, 60, 60 );
  
  // MAN EYES
  
  fill( 0, 255, 0 );
  ellipse( x-19, y-30, 16, 32 ); 
 
  //--  ellipse(119, 70, 16, 32);   //// ORIGINAL MEASUREMENTS 
  ellipse( x+19, y-30, 16, 32 ); 
  
  // MAN LEGS
  
  line( x-10, y+50, x-20, y+90 );
  line( x+10, y+50, x+20, y+90 );
}


//// MOVE MAN  (by changing x,y)  ////

void action()
{
  if (x>width) {
    x=100;
    y=100;
  }
  x=  x + 3;
  y=  y + 2;
}

void mousePressed()
{
  x=  mouseX;
  y=  mouseY;
}

//// GOLD FUNCTION //
{
  
  xGold=mouseX;
  ygold=mouseY;
  
  
}
