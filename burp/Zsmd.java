package burp;

import java.time.Duration;

public class Zsmd implements Zgg0 {
  private final Zr97 ZQ;
  
  private final Zeew ZK;
  
  private final int Zv;
  
  public Zsmd(Zr97 paramZr97, Zeew paramZeew, int paramInt) {
    this.ZQ = paramZr97;
    this.ZK = paramZeew;
    this.Zv = paramInt;
  }
  
  public void ZM(long paramLong1, long paramLong2, long paramLong3, Zefx paramZefx) {
    this.ZQ.ZZ(new Zesy(paramLong1, paramLong2, paramLong3, this.ZK, this.Zv, paramZefx, null, Zsxd.ZG, Zsxd.ZG, false, null, (byte)0));
  }
  
  public void Za(long paramLong1, long paramLong2, long paramLong3, Zefx paramZefx, Zb6q paramZb6q, Duration paramDuration1, Duration paramDuration2, boolean paramBoolean, String paramString, byte paramByte) {
    int i = Zesy.ZP();
    this.ZQ.ZZ(new Zesy(paramLong1, paramLong2, paramLong3, this.ZK, this.Zv, paramZefx, paramZb6q, paramDuration1, paramDuration2, paramBoolean, paramString, paramByte));
    if (Zbqc.Zwu() == null)
      Zesy.Zv(++i); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsmd.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */