## 1.複習倒數計時 0~9
second()秒鐘,textSize()字型大小,test()畫出字,setup()做一次,draw()每秒做60次
## 2.倒數9~0
利用餘數及減法,來做出9到0的倒數計時
## 3.Sound播出聲音
先用Sketch-Library-Add Library加入Sound,接下來把mp3檔放進PDE寫程式的地方
## 4.把第01,02,03合併
以step02為主,插入step03的宣告、初始化、play播放,但每秒播60次,很吵
## 5.播放bell
if( player.isPlaying() )時,要stop(), 否則 play(), 記得bell拉進去,程式打bell.mp3