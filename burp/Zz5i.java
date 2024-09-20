package burp;

import java.util.List;
import net.portswigger.Zen;
import net.portswigger.Zkb;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zz5i implements Zzwz {
  public static final List<Zlp9> Zs = Zb99.Zh(new Zlp9[] { Zlp9.COLLABORATOR_EVERYWHERE_X_FORWARDED_FOR_PAYLOAD, Zlp9.COLLABORATOR_EVERYWHERE_X_FORWARDED_FOR_PAYLOAD_FOLLOWUP, Zlp9.COLLABORATOR_EVERYWHERE_TRUE_CLIENT_IP_PAYLOAD, Zlp9.COLLABORATOR_EVERYWHERE_X_REAL_IP_PAYLOAD, Zlp9.COLLABORATOR_EVERYWHERE_REFERER_PAYLOAD, Zlp9.COLLABORATOR_EVERYWHERE_X_WAP_PROFILE_PAYLOAD, Zlp9.COLLABORATOR_EVERYWHERE_X_SCRAPED_PAYLOAD });
  
  private final Zkl6 Zz;
  
  private final Zmzk ZJ;
  
  private final Zbjl Zc;
  
  private final Zk7g ZL;
  
  private final Zkf7 ZU;
  
  private final Zgrd ZP;
  
  private final int ZX;
  
  private Zen Zq;
  
  private static int[] ZB;
  
  public Zz5i(Zkl6 paramZkl6, int paramInt, Zbjl paramZbjl, Zk7g paramZk7g, Ze3n paramZe3n) {
    this.Zz = paramZkl6;
    int[] arrayOfInt = Zw();
    this.Zc = paramZbjl;
    this.ZL = paramZk7g;
    this.ZX = paramInt;
    this.ZJ = paramZe3n.Za();
    this.ZU = new Zkf7(paramZkl6.Zs(), this.ZJ, paramZbjl.ZB(), paramZkl6.ZH());
    this.ZP = new Zgrd(paramZbjl, paramInt, paramZe3n.ZM().Zgv());
    if (arrayOfInt != null)
      Zbqc.Zr(new Zbqc[1]); 
  }
  
  public List<Zewx> ZK() {
    int[] arrayOfInt = Zw();
    List<Zewx> list = Zb99.Zh(new Zewx[] { Zt(Zlp9.COLLABORATOR_EVERYWHERE_HOST_PAYLOAD), Zt(Zlp9.COLLABORATOR_EVERYWHERE_X_FORWARDED_HOST_PAYLOAD), Zt(Zlp9.COLLABORATOR_EVERYWHERE_HOST_WITH_AUTHENTICATION_FRAGMENT_PAYLOAD) });
    if (this.Zz.Zt().ZG(this.ZJ.ZJ1()) == null) {
      list.add(Zt(Zlp9.COLLABORATOR_EVERYWHERE_URL_WITH_AUTHENTICATION_FRAGMENT_ON_REQUEST_LINE_PAYLOAD));
      list.add(Zt(Zlp9.COLLABORATOR_EVERYWHERE_ABSOLUTE_URL_ON_REQUEST_LINE_PAYLOAD));
    } 
    if (!this.Zc.ZB().Zi()) {
      if (this.ZJ.ZJZ())
        list.add(Zt(Zlp9.COLLABORATOR_EVERYWHERE_SSL_SNI_PAYLOAD)); 
      list.add(Zf(Zlp9.NONE));
      if (this.Zz.Zt().ZG(this.ZJ.ZJ1()) == null)
        list.add(Zt(Zlp9.COLLABORATOR_EVERYWHERE_CONNECT_PAYLOAD)); 
    } 
    if (Zbqc.Zwu() == null)
      ZP(new int[4]); 
    return list;
  }
  
  public Zewx ZK(Zlp9 paramZlp9, Zen paramZen) {
    this.Zq = paramZen;
    return Zt(paramZlp9);
  }
  
  public Zewx Zt(Zlp9 paramZlp9) {
    return Za(paramZlp9) ? Zf(paramZlp9) : Zk(paramZlp9);
  }
  
  private Zewx Zk(Zlp9 paramZlp9) {
    Zen zen = ZQ(paramZlp9);
    return new Zew_(zen, Zo(paramZlp9, zen), this.ZU.Zh(paramZlp9, zen), this.Zc.ZB().Zi(), paramZlp9, Zk());
  }
  
  private byte[] Zo(Zlp9 paramZlp9, Zen paramZen) {
    switch (Zsco.Zk[paramZlp9.ordinal()]) {
      case 1:
      
      case 2:
      
      case 3:
      
    } 
    return Zkb.Zy(this.Zc.ZB().Zq(paramZen));
  }
  
  public Zewn ZT() {
    Zen zen = ZQ(Zlp9.COLLABORATOR_EVERYWHERE_X_FORWARDED_FOR_PAYLOAD_FOLLOWUP);
    return new Zewn(zen, Zkb.Zy(this.Zc.ZB().Zq(zen)), this.ZU.Zh(Zlp9.COLLABORATOR_EVERYWHERE_X_FORWARDED_FOR_PAYLOAD_FOLLOWUP, zen), this.Zc.ZB().Zi(), Zlp9.COLLABORATOR_EVERYWHERE_X_FORWARDED_FOR_PAYLOAD_FOLLOWUP, Zk());
  }
  
  public Zewn Zo() {
    Zzow zzow = this.ZP.ZR();
    Zen zen = zzow.ZP(Zlp9.COLLABORATOR_EVERYWHERE_X_FORWARDED_FOR_PAYLOAD_FOLLOWUP);
    return new Zewn(zen, Zkb.Zy(this.Zc.ZB().Zq(zen)), this.ZU.Zv(zzow), this.Zc.ZB().Zi(), Zlp9.COLLABORATOR_EVERYWHERE_X_FORWARDED_FOR_PAYLOAD_FOLLOWUP, Zk());
  }
  
  private Zewx Zf(Zlp9 paramZlp9) {
    Zzow zzow = (this.Zq == null) ? this.ZP.ZR() : this.ZP.ZO(paramZlp9, this.Zq);
    byte[] arrayOfByte = (paramZlp9 == Zlp9.NONE) ? new byte[0] : Zo(paramZlp9, zzow.ZP(paramZlp9));
    return new Zew0(this.ZL, this.ZX, zzow, arrayOfByte, this.ZU.ZF(zzow), this.Zc.ZB().Zi(), paramZlp9, Zk(), this.Zz);
  }
  
  public Zkfj ZZ(Zewx paramZewx) {
    switch (Zsco.Za[this.ZL.ordinal()]) {
      case 1:
      
      case 2:
      
      case 3:
      
    } 
    Zuh.ZT(false, Zqf.Zr, this.ZL.toString());
    return new Zmit(paramZewx);
  }
  
  public Zewn Zp(Zlp9 paramZlp9) {
    Zewx zewx = Zk(paramZlp9);
    return (Zewn)zewx;
  }
  
  public boolean Za(Zlp9 paramZlp9) {
    return Zs.contains(paramZlp9);
  }
  
  private Zmhr Zk() {
    boolean bool = this.ZJ.ZJZ() ? true : true;
    return new Zmhr(this.Zc.ZB().ZU(ZQ(Zlp9.COLLABORATOR_EVERYWHERE_X_REAL_IP_PAYLOAD)), bool, this.ZJ.ZJZ());
  }
  
  private Zen ZQ(Zlp9 paramZlp9) {
    return (this.Zq != null) ? this.Zq : this.ZP.Zq(paramZlp9);
  }
  
  public static void ZP(int[] paramArrayOfint) {
    ZB = paramArrayOfint;
  }
  
  public static int[] Zw() {
    return ZB;
  }
  
  static {
    if (Zw() != null)
      ZP(new int[3]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz5i.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */