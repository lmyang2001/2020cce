//這裡叫PDE:Processing Developing Environment
import processing.sound.*;
SoundFile player;
void setup(){
  size(400,200);
  player = new SoundFile(this,"BLACK.mp3"); ///音樂要拉進去Processing
}
void draw(){
  background(184,156,225);
}
void mousePressed(){
  player.play();
}
