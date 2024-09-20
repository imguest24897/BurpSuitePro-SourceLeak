package burp;

import java.time.Duration;

public class Zhn extends Zni implements Zl1g {
  @Zzvo(1)
  private final byte ZE;
  
  @Zzvo(2)
  private final long ZD;
  
  @Zzvo(3)
  private final long Zc;
  
  @Zzvo(4)
  private final long ZL;
  
  Zhn(byte paramByte, long paramLong1, long paramLong2, long paramLong3) {
    this.ZE = paramByte;
    this.ZD = paramLong1;
    this.Zc = paramLong2;
    this.ZL = paramLong3;
  }
  
  public Zsze Zar() {
    return Zsze.ZA(Byte.valueOf(this.ZE));
  }
  
  public Duration ZaK() {
    return Duration.ofMillis(this.ZD);
  }
  
  public Duration Za5() {
    return Duration.ofMillis(this.Zc);
  }
  
  public Duration ZaA() {
    return Duration.ofMillis(this.ZL);
  }
  
  public Zeu4<? extends Zl1g> ZF() {
    return Zx;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zhn.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */