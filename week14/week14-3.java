int []a={1,2,3,4,5,6,7,8,9,10};
void setup(){
   size(400,200);
   textSize(30);
}
int ans=0;
void draw(){
   background(#A2E3F0);
   for(int i=0;i<10;i++){
   text(a[i],i*40,100);
  }
}
void mousePressed(){  //滑鼠壓下去才做亂數
  int i1 = (int)random(10);
  int i2 = (int)random(10);
  int temp=a[i1]; 
      a[i1]=a[i2]; 
      a[i2]=temp;
}
