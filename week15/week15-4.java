//這裡叫PDE:Processing Developing Environment
import processing.sound.*;
SoundFile player;
void setup(){
  size(400,200);
  textSize(40);
  player = new SoundFile(this,"BLACK.mp3");
}
void draw(){
  background(184,156,225);
  int s = second();
  text(9-s%10, 100, 100);
  if(9-s%10==0) player.play();
} //0秒的時候,if()會進去60次,很吵
