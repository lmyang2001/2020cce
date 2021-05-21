void setup(){
size(1024,400);
}
void draw(){
    if(mousePressed)background(176,176,255);
    else background(55,155,205);
    textSize(50);
    text(a,100,100);
}
int a=0;
void mousePressed(){
  a++;
}
