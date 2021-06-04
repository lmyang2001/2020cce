import processing.sound.*;
SoundFile player;
void setup(){
  size(400,200);
  player = new SoundFile(this,"bell.mp3");
}
void draw(){
  background(175,205,225); 
  int s = second();
  text(9-s%10, 100, 100);
  if(9-s%10==0 && !player.isPlaying() ){
    player.play();
  }
}
