package com.fasterxml.Zof;

final class Zk {
  final int ZQ;
  
  final int Zn;
  
  final String[] ZO;
  
  final Zq[] Zb;
  
  public Zk(int paramInt1, int paramInt2, String[] paramArrayOfString, Zq[] paramArrayOfZq) {
    this.ZQ = paramInt1;
    this.Zn = paramInt2;
    this.ZO = paramArrayOfString;
    this.Zb = paramArrayOfZq;
  }
  
  public Zk(Zn paramZn) {
    this.ZQ = paramZn.ZY;
    this.Zn = paramZn.Zm;
    this.ZO = paramZn.Zc;
    this.Zb = paramZn.Zd;
  }
  
  public static Zk Zt(int paramInt) {
    return new Zk(0, 0, new String[paramInt], new Zq[paramInt >> 1]);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zof\Zk.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */