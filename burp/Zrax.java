package burp;

import java.util.List;
import java.util.Optional;

public class Zrax implements Zsf8 {
  private final Zbnt Zb;
  
  private final Ztai ZP;
  
  private final Ze3n ZV;
  
  private final Zmhe ZC;
  
  private final Zxs7 Zs;
  
  private final Zbjl Za;
  
  private final Zzwz Zo;
  
  private static String ZQ;
  
  public Zrax(Zbnt paramZbnt, Ztai paramZtai, Ze3n paramZe3n, Zmhe paramZmhe, Zxs7 paramZxs7, Zbjl paramZbjl, Zzwz paramZzwz) {
    this.Zb = paramZbnt;
    String str = ZQ();
    this.ZP = paramZtai;
    this.ZV = paramZe3n;
    this.ZC = paramZmhe;
    this.Zs = paramZxs7;
    this.Za = paramZbjl;
    this.Zo = paramZzwz;
    if (str == null)
      Zbqc.Zr(new Zbqc[2]); 
  }
  
  public void Zs(Zz4_ paramZz4_) {
    String str = ZQ();
    for (Zewx zewx : this.Zo.ZK()) {
      if (zewx.ZA(this.Za)) {
        Optional<Zlvf> optional = zewx.Zs(this.ZC);
        if (this.ZP.Zr(Zzu2.OUT_OF_BAND_RESOURCE_LOAD_HTTP) && optional.isPresent())
          Zo(paramZz4_, zewx, optional.get()); 
      } 
      if (str == null)
        break; 
    } 
  }
  
  private void Zo(Zz4_ paramZz4_, Zewx paramZewx, Zlvf paramZlvf) {
    byte[] arrayOfByte = paramZewx.ZE(paramZlvf.ZM());
    if (arrayOfByte != null) {
      List<Zer0> list = this.Za.Ze(paramZewx.ZF());
      Zer0 zer0 = (new Zrlt(list)).Zh(paramZewx, new Zb25[] { Zb25.HTTP, Zb25.HTTPS });
      Zz1_ zz1_ = paramZewx.Ze(this.Zb, this.ZV, this.ZC, this.Za, this.Zo, zer0, arrayOfByte);
      Zbll zbll = zz1_.Z_();
      Zkfj zkfj = this.Zo.ZZ(zbll.Zk);
      paramZz4_.Zz(zkfj.Zt(this.ZV, this.Zs, zer0, zbll, list));
    } 
  }
  
  public static void ZE(String paramString) {
    ZQ = paramString;
  }
  
  public static String ZQ() {
    return ZQ;
  }
  
  static {
    if (ZQ() == null)
      ZE("FPHMFb"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrax.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */