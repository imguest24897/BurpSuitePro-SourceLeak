package net.portswigger;

public abstract class Zmy {
  protected String Zu;
  
  protected int ZT;
  
  protected int Zm;
  
  protected long ZI;
  
  protected byte[] Zg;
  
  private static int ZJ;
  
  protected Zmy(String paramString, int paramInt1, int paramInt2) {
    this.Zu = paramString;
    this.ZT = paramInt1;
    this.Zm = paramInt2;
    this.Zg = new byte[paramInt2];
    ZV();
  }
  
  public void Za(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    int j = (int)(this.ZI % this.Zm);
    this.ZI += paramInt2;
    int k = this.Zm - j;
    int i = Zx();
    int m = 0;
    if (paramInt2 >= k) {
      System.arraycopy(paramArrayOfbyte, paramInt1, this.Zg, j, k);
      Zk(this.Zg, 0);
      m = k;
      while (m + this.Zm - 1 < paramInt2) {
        Zk(paramArrayOfbyte, paramInt1 + m);
        m += this.Zm;
        if (i == 0)
          break; 
      } 
      j = 0;
    } 
    if (m < paramInt2)
      System.arraycopy(paramArrayOfbyte, paramInt1 + m, this.Zg, j, paramInt2 - m); 
  }
  
  public byte[] ZE() {
    byte[] arrayOfByte1 = Zp();
    Za(arrayOfByte1, 0, arrayOfByte1.length);
    byte[] arrayOfByte2 = ZM();
    ZZ();
    return arrayOfByte2;
  }
  
  public void ZZ() {
    this.ZI = 0L;
    byte b = 0;
    int i = ZN();
    while (b < this.Zm) {
      this.Zg[b++] = 0;
      if (i != 0)
        break; 
    } 
    ZV();
  }
  
  public abstract Object clone();
  
  protected abstract byte[] Zp();
  
  protected abstract byte[] ZM();
  
  protected abstract void ZV();
  
  protected abstract void Zk(byte[] paramArrayOfbyte, int paramInt);
  
  public static void ZJ(int paramInt) {
    ZJ = paramInt;
  }
  
  public static int Zx() {
    return ZJ;
  }
  
  public static int ZN() {
    int i = Zx();
    return (i == 0) ? 73 : 0;
  }
  
  static {
    if (ZN() != 0)
      ZJ(120); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zmy.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */