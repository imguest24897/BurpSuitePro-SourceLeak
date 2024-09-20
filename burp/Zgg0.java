package burp;

import java.time.Duration;

public interface Zgg0 {
  public static final Zgg0 ZC = new Zm_d();
  
  void ZM(long paramLong1, long paramLong2, long paramLong3, Zefx paramZefx);
  
  default void Zc(long paramLong1, long paramLong2, long paramLong3, Zefx paramZefx, Zb6q paramZb6q, Duration paramDuration1, Duration paramDuration2, String paramString, byte paramByte) {
    Za(paramLong1, paramLong2, paramLong3, paramZefx, paramZb6q, paramDuration1, paramDuration2, false, paramString, paramByte);
  }
  
  void Za(long paramLong1, long paramLong2, long paramLong3, Zefx paramZefx, Zb6q paramZb6q, Duration paramDuration1, Duration paramDuration2, boolean paramBoolean, String paramString, byte paramByte);
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgg0.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */