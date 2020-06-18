
void setup() {
 
  // set the size of your sketch
  size (800, 800);
}

void draw() {
  int a = 8;
  int b = 800;
  //Starting with the largest ellipse, use a for loop to draw a bullseye with ellipses.
  for (int i = 0; i < 8; i++) {
    
   if (a % 2 == 0) {
     fill (255, 0, 0);
    
  }
  else {
   fill (0);
  }
  //Use an if statement and modulo to alternate the color of your rings.
   ellipse (400,400,b,b);
  b -= 100;
    a -= 1;
  }
}
