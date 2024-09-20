package net.portswigger;

import java.util.concurrent.ExecutorService;

public class Zz4 {
  private final ExecutorService Z_;
  
  private final int ZR;
  
  public Zz4() {
    this(null);
  }
  
  public Zz4(ExecutorService paramExecutorService) {
    this(paramExecutorService, 500000);
  }
  
  Zz4(ExecutorService paramExecutorService, int paramInt) {
    this.Z_ = paramExecutorService;
    this.ZR = paramInt;
  }
  
  public Zl4 ZA(byte[] paramArrayOfbyte, boolean paramBoolean) {
    if (paramArrayOfbyte == null)
      return Zz4::lambda$create$0; 
    if (paramArrayOfbyte.length == 0)
      return Zz4::lambda$create$1; 
    Z_7 z_7 = new Z_7(paramArrayOfbyte, paramBoolean);
    return (this.Z_ == null) ? Zu(z_7) : Zu(new Zdv(this.Z_, this.ZR, z_7, paramArrayOfbyte.length));
  }
  
  private static Zl4 Zu(Zl4 paramZl4) {
    Zl4 zl4 = ZC(paramZl4);
    return zl4::lambda$createNullHaystackCheckingSearch$2;
  }
  
  private static Zl4 ZC(Zl4 paramZl4) {
    return paramZl4::lambda$createSanitisingSearch$3;
  }
  
  private static int Zd(Zq paramZq, int paramInt) {
    return (paramInt < 0) ? 0 : Math.min(paramZq.Zp(), paramInt);
  }
  
  private static int lambda$createSanitisingSearch$3(Zl4 paramZl4, Zq paramZq, int paramInt1, int paramInt2) {
    int i = Zd(paramZq, paramInt1);
    int j = Zd(paramZq, paramInt2);
    return (i > j) ? -1 : paramZl4.Zh(paramZq, i, j);
  }
  
  private static int lambda$createNullHaystackCheckingSearch$2(Zl4 paramZl4, Zq paramZq, int paramInt1, int paramInt2) {
    return (paramZq == null || paramZq.Zc()) ? -1 : paramZl4.Zh(paramZq, paramInt1, paramInt2);
  }
  
  private static int lambda$create$1(Zq paramZq, int paramInt1, int paramInt2) {
    return paramInt1;
  }
  
  private static int lambda$create$0(Zq paramZq, int paramInt1, int paramInt2) {
    return -1;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Zz4.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */