package net.portswigger;

public final class Zqf {
  public static final Zqf Zk = new Zqf(4096);
  
  public static final Zqf Zx = new Zqf(8192);
  
  public static final Zqf Zq = new Zqf(12288);
  
  public static final Zqf Zv = new Zqf(16384);
  
  public static final Zqf ZH = new Zqf(20480);
  
  public static final Zqf Zr = new Zqf(24576);
  
  public static final Zqf Zs = new Zqf(28672);
  
  public static final Zqf ZC = new Zqf(32768);
  
  public static final Zqf ZF = new Zqf(36864);
  
  private final int ZJ;
  
  private static int Zi;
  
  private Zqf(int paramInt) {
    this.ZJ = paramInt;
  }
  
  int Zm() {
    return this.ZJ;
  }
  
  public String toString() {
    return Za7.ZU(this.ZJ);
  }
  
  public static void ZA(int paramInt) {
    Zi = paramInt;
  }
  
  public static int ZP() {
    return Zi;
  }
  
  public static int ZK() {
    int i = ZP();
    return (i == 0) ? 116 : 0;
  }
  
  static {
    ZA(0);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zqf.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */