## 1.利用ellipse()畫出圓形
設定圓心,寬,高,再利用void setup()設定size()大小,在draw()有background(RGB三色)
## 2.使用arc()來畫圓弧
參數和ellipse很像,圓心,寬,高,後面start,stop利mouseX除50.0 來輔助了解PI 3.14 就是半圓,換了色彩才看得清楚
## 3.老師解釋度degrees 及 弧度radians 的差別,
改用 radians()函式,來幫助你理解 start 和 stop 代表開始角度、結束
## 4.了解arc()裡的start,stop要用radians單位後
利用 shift移動量的變數,讓它每秒轉動60度,利用radians()換算角度
## 5.利用變數v讓轉動的速度可調整,
慢慢 v乘0.99變慢, 最後很慢時停下來
## 6.利用mousePressed()觸發 random()
讓v可以是亂數,每按一次mouse就會有新的轉動速度,也把停止速度改一下。+5是為了讓v介於5-15之間
