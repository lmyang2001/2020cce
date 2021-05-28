int []a=new int[49];  //Java的陣列宣告好
void setup(){
   size(400,200);
   textSize(30);
   for(int i=0; i<49; i++)  a[i] = i+1;
}
void draw(){
   background(#FF93D2);
   for(int i=0; i<6; i++){ //49只秀6個數
   text(a[i],i*50,100);
  }
}
void mousePressed(){//滑鼠壓下去才做亂數
  for(int i=0; i<10000; i++){
  int i1 = (int)random(49), i2 = (int)random(49);
  int temp=a[i1]; 
      a[i1]=a[i2]; 
      a[i2]=temp;
  }
}
