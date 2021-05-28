void setup(){
   size(300,200);
   textSize(30);
}
int ans=0;
void draw(){
   background(#A684D6);
   //int ans = (int)random(60);//強制轉型casting
   text(ans,30,30);
}
void mousePressed(){  //滑鼠壓下去才做亂數
  ans = (int)random(60);
}
