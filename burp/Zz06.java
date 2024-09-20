package burp;

import java.util.List;
import java.util.Map;

public class Zz06 implements Zlz5 {
  private final Ze3n ZK;
  
  private final Zbjl ZY;
  
  private final Zb9e Zt;
  
  private final Zesv ZV;
  
  private final Zr_4 ZQ;
  
  private final Zbnt Zu;
  
  public Zz06(Ze3n paramZe3n, Zbjl paramZbjl, Zb9e paramZb9e, Zesv paramZesv, Zr_4 paramZr_4, Zbnt paramZbnt) {
    this.ZK = paramZe3n;
    this.ZY = paramZbjl;
    this.Zt = paramZb9e;
    boolean bool = Zt4j.Zk();
    this.ZV = paramZesv;
    this.ZQ = paramZr_4;
    this.Zu = paramZbnt;
    if (Zbqc.Zwu() == null)
      Zt4j.Zr(!bool); 
  }
  
  public void Zg(Zz4_ paramZz4_, Zmdl paramZmdl) {
    Ze(new Zkcs(this.ZK, this.ZV, this.ZY, paramZz4_), paramZmdl, Zxpi.Zb);
  }
  
  public void ZQ(Zmz6 paramZmz6, Zly1 paramZly1, long paramLong, Zmdl paramZmdl) {
    Ze(new Zom(this.ZK, paramZmz6), paramZmdl, new Zxpi(paramLong));
  }
  
  private void Ze(Zsh_ paramZsh_, Zmdl paramZmdl, Zxpi paramZxpi) {
    boolean bool = Zt4j.Zk();
    for (Map.Entry entry : paramZmdl) {
      Zxs7 zxs7 = this.ZK.ZS().Zt((Zro0)entry.getKey());
      if (zxs7 == null)
        continue; 
      Zmaj zmaj = ((List<Zmaj>)entry.getValue()).get(0);
      Zer0 zer0 = zmaj.ZO;
      Zzwz zzwz = this.Zt.Zl(zxs7, zmaj.Zy.ZN());
      long l = paramZxpi.ZX(this.ZK.ZM().Zg5(), zer0.Zn());
      Zmyo zmyo = new Zmyo(this.ZQ, this.Zu, l);
      paramZsh_.Zk(zmyo, zer0, Zmaj.Zf((List<Zmaj>)entry.getValue()), zxs7, zzwz, zmaj.Zy.ZN());
      if (bool)
        break; 
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz06.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */