package com.fasterxml;

import java.util.Arrays;

class Zyq {
  public static final Zyq ZH = new Zyq();
  
  private int[][] Zh = new int[128][];
  
  private int[][] ZZ = new int[128][];
  
  public int[] Ze(int paramInt) {
    int[] arrayOfInt = this.Zh[paramInt];
    if (arrayOfInt == null) {
      arrayOfInt = Arrays.copyOf(Zv1.Zu, 128);
      if (arrayOfInt[paramInt] == 0)
        arrayOfInt[paramInt] = -1; 
      this.Zh[paramInt] = arrayOfInt;
    } 
    return arrayOfInt;
  }
  
  public int[] Zh(int paramInt, boolean paramBoolean) {
    if (!paramBoolean)
      return Ze(paramInt); 
    int[] arrayOfInt = this.ZZ[paramInt];
    if (arrayOfInt == null) {
      arrayOfInt = Ze(paramInt);
      arrayOfInt[47] = 47;
      this.ZZ[paramInt] = arrayOfInt;
    } 
    return arrayOfInt;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zyq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */