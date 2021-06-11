void setup(){
  size(400,200);
  fill(255,0,0);
  textSize(40);
}
float shift=0,v=10;//一開始速度10
void mousePressed(){//0...10.0
  v = random(10)+5;//5...15.0
}
void draw(){
  background(98,222,122);
  float start = radians(90+shift);
  float stop = radians(180+shift);
  arc(100,100, 180,180, start,stop);
  if(v>0.0001){
    shift+=v;//轉動速度
    v = v * 0.99;//速度慢慢減速
  }
  text(shift, 200, 100);
  text(v, 200, 150);//印出轉動速度
}
