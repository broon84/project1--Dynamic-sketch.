//// This is a new file.


//// exercise
//// Nbrooks
  
float x,y;        // Position of man

void setup() {
  size( 800, 1000 );
  x=100;
  y=100;
}

// NEXT FRAME ////
void draw() 
{
  background( 0, 175, 255);    //// background sky color
  fill(0, 200, 0); //green grass rectangle color
  rect(0, 600, 2000, 600); //rectangle grass
  
  
  
  fill( 155, 0, 0 );
 
  house();
  man();
  action();

  textSize(26);
  text( "waah gwaan, peeps", x+200, y+100 );
}

void house()
{
  rectMode(CENTER);
  fill( 255, 0, 0 );       //// red house color 
  rect( 200, 225, 175, 150 );  //// rectangular red house 
  
  fill( 255, 0, 0 );         //// red roof color
  triangle( 100, 150, 200, 50, 300, 150 );   //// red roof
}


void man()
{
  /// Man
  fill( 0, 0, 100 );
  rectMode(CENTER);
  // body & head
  rect(x,y, 20, 100);
  ellipse(x, y-30, 60, 60);
  // eyes
  fill( 0, 255, 0 );
  ellipse(x-19, y-30, 16, 32); 
  //--  ellipse(119, 70, 16, 32); 
  ellipse(x+19, y-30, 16, 32); 
  line(90, 150, 80, 160);
  line(110, 150, 120, 160);
}

//// Move the man (by changing x,y)
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
