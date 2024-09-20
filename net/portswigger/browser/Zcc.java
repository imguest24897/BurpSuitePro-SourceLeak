package net.portswigger.browser;

import java.time.Duration;

public class Zcc implements Zq {
  private final int[] ZA;
  
  private int Zv;
  
  private Duration ZV;
  
  public Zcc(Duration paramDuration, int... paramVarArgs) {
    this.ZV = paramDuration;
    this.ZA = paramVarArgs;
  }
  
  public Duration Zj() {
    int i = this.Zv++;
    if (i < this.ZA.length)
      this.ZV = this.ZV.dividedBy(this.ZA[i]); 
    return this.ZV;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\browser\Zcc.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */