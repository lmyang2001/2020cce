int []a=new int[49];  //Java的陣列宣告好
void setup(){
   size(400,200);
   textSize(30);
   for(int i=0; i<49; i++)  a[i] = i+1; //丟入號碼
   for(int i=0;i<10000;i++){   //抽獎前先排好
     int i1 = (int)random(49), i2 = (int)random(49);
     int temp=a[i1]; 
          a[i1]=a[i2]; 
          a[i2]=temp;
   }
}
int N=0;
void draw(){
   background(#FF93D2);
   for(int i=0; i<N; i++){ //49只秀6個數
   fill(255); ellipse(50+i*50,100,40,40);
   textAlign(CENTER,CENTER);
   fill(0); //文字對齊 中,中 
   text(a[i],50+i*50,100);
  }
}
void mousePressed(){//滑鼠壓下去才做亂數
  N++;  //其實數字早就決定了只是慢慢印出來讓人以為是慢慢抽
}
