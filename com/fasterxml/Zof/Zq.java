package com.fasterxml.Zof;

final class Zq {
  public final String ZD;
  
  public final Zq Zv;
  
  public final int Zn;
  
  public Zq(String paramString, Zq paramZq) {
    this.ZD = paramString;
    this.Zv = paramZq;
    this.Zn = (paramZq == null) ? 1 : (paramZq.Zn + 1);
  }
  
  public String Zw(char[] paramArrayOfchar, int paramInt1, int paramInt2) {
    if (this.ZD.length() != paramInt2)
      return null; 
    byte b = 0;
    while (true) {
      if (this.ZD.charAt(b) != paramArrayOfchar[paramInt1 + b])
        return null; 
      if (++b >= paramInt2)
        return this.ZD; 
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zof\Zq.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */