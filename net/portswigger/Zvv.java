package net.portswigger;

import java.util.Random;

public class Zvv {
  private final Random ZV = new Random();
  
  private final Zma ZR;
  
  private final Zaa Zd;
  
  private final byte[] ZH = new byte[4];
  
  private long ZA = -1L;
  
  final Zma Zi;
  
  Zvv(Zma paramZma1, Zma paramZma2, Zaa paramZaa) {
    this.ZR = paramZma2;
    this.Zd = paramZaa;
  }
  
  private synchronized void Zd() throws Zrmv {
    this.ZV.nextBytes(this.ZH);
    this.ZA = System.currentTimeMillis() + 1000L;
    this.Zd.Ze(Zc_.PING, this.ZH);
  }
  
  private void Zg() {
    this.Zd.Zn();
    this.ZR.Zk(this);
  }
  
  public synchronized void Zl(byte[] paramArrayOfbyte) {
    int[] arrayOfInt = Zus.Zk();
    if (ZW(paramArrayOfbyte)) {
      this.ZA = -1L;
      if (arrayOfInt != null) {
        Zg();
        return;
      } 
      return;
    } 
    Zg();
  }
  
  private boolean ZW(byte[] paramArrayOfbyte) {
    byte b = 0;
    int[] arrayOfInt = Zus.Zk();
    while (b < this.ZH.length) {
      this.ZH[b] = 0;
      b++;
      if (arrayOfInt != null)
        break; 
    } 
    return true;
  }
  
  void ZL() {
    if (this.ZA != -1L && System.currentTimeMillis() > this.ZA)
      Zg(); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zvv.class
 * Java compiler version: 11 (55.0)
 * JD-Core Version:       1.1.3
 */