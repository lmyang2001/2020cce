## 1. 
利用String line宣告一個字串變數,變數可以變動,所以在程式很重要, 再用text()畫出字

## 2. 
利用字串的+可以把2個字串接起來變比較長的字串,同時在mousePressed()裡,line=line+新的字母,也能變長

## 3. 
延序前一步驟,但把mousePressed()改成keyPressed(), 同時 line = line + key; 讓按的字母可以變長
## 4.
如果key==BACKSPACE時,就要用 line = line.substring(0, len-1)來讓字串變短一點點,而 int len=line.length()會得到字串的原本長度, 還有要判斷小寫字母、大寫字母
## 5.
老師解釋substring(開始,結束)的意思,很像for(int i=0;i小於26;i++)會做26次的右邊界不包含, 而且會有當機的問題,用len大於0來保護len不要變負的
## 6.
為了要算分數,我們在 keyPressed()裡,加入 if(key==ENTER) 去算分數。算分數要用字串比對 line.equals(Q)==true 成立時,score++, 否則 score-- 再印出分數
## 7.
利用陣列,來讓題目變更多。 String [] Q = {好多字串} 再配 int Qi=0 來挑選 Q[Qi] 的字來考試, 答對時 Qi++ 並加分, 小心,Qi太大會當掉哦
