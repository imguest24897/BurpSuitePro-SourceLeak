package net.portswigger;

import java.util.Arrays;

class Z_7 implements Zl4 {
  private final byte[] Zn;
  
  private final int[] ZV;
  
  private final int[] Zr;
  
  private final boolean Zu;
  
  public Z_7(byte[] paramArrayOfbyte, boolean paramBoolean) {
    this.Zu = paramBoolean;
    if (paramArrayOfbyte != null) {
      if (!paramBoolean) {
        this.Zn = (byte[])paramArrayOfbyte.clone();
        Zmw.Zq(this.Zn);
      } else {
        this.Zn = paramArrayOfbyte;
      } 
      this.ZV = Zy(this.Zn);
      this.Zr = ZU(this.Zn);
    } else {
      this.Zr = null;
      this.ZV = null;
      this.Zn = null;
    } 
  }
  
  public int Zh(Zq paramZq, int paramInt1, int paramInt2) {
    int i = this.Zn.length - 1 + paramInt1;
    int[] arrayOfInt = Zli.ZX();
    while (i < paramInt2) {
      int j = this.Zn.length - 1;
      while ((this.Zn[j] & 0xFF) == Zj(paramZq, i)) {
        if (j == 0)
          return i; 
        i--;
        j--;
        if (arrayOfInt == null)
          break; 
      } 
      i += Math.max(this.Zr[this.Zn.length - 1 - j], this.ZV[Zj(paramZq, i)]);
      if (arrayOfInt == null)
        break; 
    } 
    return -1;
  }
  
  private int Zj(Zq paramZq, int paramInt) {
    int i = paramZq.Zg(paramInt);
    return (!this.Zu && i > 64 && i < 91) ? (i | 0x20) : i;
  }
  
  private static int[] Zy(byte[] paramArrayOfbyte) {
    int[] arrayOfInt = new int[256];
    Arrays.fill(arrayOfInt, paramArrayOfbyte.length);
    for (byte b = 0; b < paramArrayOfbyte.length; b++)
      arrayOfInt[paramArrayOfbyte[b] & 0xFF] = paramArrayOfbyte.length - 1 - b; 
    return arrayOfInt;
  }
  
  private static int[] ZU(byte[] paramArrayOfbyte) {
    int[] arrayOfInt = new int[paramArrayOfbyte.length];
    int i = paramArrayOfbyte.length;
    int j;
    for (j = paramArrayOfbyte.length; j > 0; j--) {
      if (ZE(paramArrayOfbyte, j))
        i = j; 
      arrayOfInt[paramArrayOfbyte.length - j] = i - j + paramArrayOfbyte.length;
    } 
    for (j = 0; j < paramArrayOfbyte.length - 1; j++) {
      int k = ZK(paramArrayOfbyte, j);
      arrayOfInt[k] = paramArrayOfbyte.length - 1 - j + k;
    } 
    return arrayOfInt;
  }
  
  private static boolean ZE(byte[] paramArrayOfbyte, int paramInt) {
    int i = paramInt;
    for (byte b = 0; i < paramArrayOfbyte.length; b++) {
      if (paramArrayOfbyte[i] != paramArrayOfbyte[b])
        return false; 
      i++;
    } 
    return true;
  }
  
  private static int ZK(byte[] paramArrayOfbyte, int paramInt) {
    byte b = 0;
    int i = paramInt;
    for (int j = paramArrayOfbyte.length - 1; i >= 0 && paramArrayOfbyte[i] == paramArrayOfbyte[j]; j--) {
      b++;
      i--;
    } 
    return b;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Z_7.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */