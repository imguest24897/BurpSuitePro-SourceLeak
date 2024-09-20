package burp;

import java.util.Collections;

public class Zkhv implements Zm9n {
  private final Ze3n ZS;
  
  private final Zxs7 Zd;
  
  private final Zgfe Zi;
  
  public Zkhv(Ze3n paramZe3n, Zxs7 paramZxs7, Zgfe paramZgfe) {
    this.ZS = paramZe3n;
    this.Zd = paramZxs7;
    this.Zi = paramZgfe;
  }
  
  public void ZU(Zrj paramZrj, Ztpx paramZtpx, Zz4_ paramZz4_) {
    Zbqc[] arrayOfZbqc = Zbww.ZW();
    for (Zsjk zsjk : Zsjk.PLAIN_REFLECTION_TYPES) {
      Zku6 zku6 = this.Zi.Zq(zsjk);
      if (!zku6.Zh())
        continue; 
      Zs2i zs2i = zku6.ZV().ZY();
      Zvow zvow = this.ZS.ZI().Zp(zs2i.ZE()).ZK(zs2i.ZO()).Zo(zku6.ZI((byte)2));
      for (Zkv8 zkv8 : zku6.ZP((byte)2)) {
        zvow.Zf(Zrlp.ZJ(zkv8));
        if (arrayOfZbqc == null)
          break; 
      } 
      paramZz4_.Zz(new Zx_5(Zzu2.INPUT_RETRIEVAL_REFLECTED, (byte)0, 0, Collections.emptyMap(), Collections.singletonList(new Zt2w(new Zz25(zku6.ZY(), 0), zvow)), (byte)3, (byte)1, this.ZS.Za(), this.ZS.ZA().ZF().Zd4(), this.Zd));
      return;
    } 
  }
  
  public Zbsl Zp() {
    return Zbsl.APIP_InputRetrievalReflected;
  }
  
  public String toString() {
    return Zp().name();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkhv.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */