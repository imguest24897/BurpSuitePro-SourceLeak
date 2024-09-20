package com.fasterxml.Zof;

final class Zc {
  public final int ZV;
  
  public final int Zg;
  
  public final int Zd;
  
  public final int[] Zb;
  
  public final String[] ZL;
  
  public final int ZS;
  
  public final int ZY;
  
  public Zc(int paramInt1, int paramInt2, int paramInt3, int[] paramArrayOfint, String[] paramArrayOfString, int paramInt4, int paramInt5) {
    this.ZV = paramInt1;
    this.Zg = paramInt2;
    this.Zd = paramInt3;
    this.Zb = paramArrayOfint;
    this.ZL = paramArrayOfString;
    this.ZS = paramInt4;
    this.ZY = paramInt5;
  }
  
  public Zc(Za paramZa) {
    this.ZV = paramZa.ZU;
    this.Zg = paramZa.ZT;
    this.Zd = paramZa.ZJ;
    this.Zb = paramZa.Zv;
    this.ZL = paramZa.Zr;
    this.ZS = paramZa.ZB;
    this.ZY = paramZa.ZI;
  }
  
  public static Zc Za(int paramInt) {
    int i = paramInt << 3;
    int j = Za.Zm(paramInt);
    return new Zc(paramInt, 0, j, new int[i], new String[paramInt << 1], i - paramInt, i);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zof\Zc.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */