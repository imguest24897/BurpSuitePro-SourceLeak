package burp;

import java.util.Collection;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;

public class Zxf2 implements Zeb5 {
  private final Zz1m<Zt35> ZC;
  
  private final Zr_4 ZX;
  
  private final Zl7h ZZ;
  
  private final Zr69 ZN;
  
  private final Zt1i ZQ;
  
  private final Zsiv Zm;
  
  private final Ztk0 ZH;
  
  private final Zed9 Zl;
  
  private final Zz6b ZR;
  
  private final Zeb5 ZT;
  
  private static Zbqc[] Zt;
  
  public Zxf2(Zl7h paramZl7h, Zr69 paramZr69, Zz1m<Zt35> paramZz1m, Zed9 paramZed9, Zr_4 paramZr_4, Zz6b paramZz6b, Zeb5 paramZeb5) {
    this.ZZ = paramZl7h;
    this.ZN = paramZr69;
    this.ZQ = paramZl7h.ZVP();
    this.ZC = paramZz1m;
    this.Zl = paramZed9;
    this.ZX = paramZr_4;
    this.Zm = paramZl7h.ZVv();
    this.ZH = paramZl7h.ZVa();
    this.ZR = paramZz6b;
    this.ZT = paramZeb5;
  }
  
  public boolean ZH(Zeu9 paramZeu9, Zbj5 paramZbj5) {
    if (paramZeu9 instanceof Zgd4)
      return false; 
    if (ZH(paramZeu9.ZHN(), paramZbj5))
      return false; 
    Zbj5 zbj5 = this.ZX.<Zbj5>Zo(paramZbj5);
    this.ZN.ZD().Zy(Zrp6.DEBUG, Zlq7.ADJUST_ROOM_MATCHING_CRITERIA, new Object[] { paramZeu9, zbj5 });
    this.ZR.ZI(paramZeu9, zbj5, (Set<Zgyy>)paramZeu9.ZHR().stream().filter(Zxf2::lambda$adjustRoomForChangesToMatchingCriteria$0).collect(Collectors.toSet()));
    return true;
  }
  
  private static boolean ZH(Zbj5 paramZbj51, Zbj5 paramZbj52) {
    return (paramZbj51.ZF(paramZbj52) || (paramZbj51.equals(paramZbj52) && Zxzu.Zp(paramZbj51.Zfx(), paramZbj52.Zfx())));
  }
  
  public Zeu9 ZM(Zzcs paramZzcs, Collection<Zt8i> paramCollection) {
    Zsww zsww = this.Zl.ZP(paramZzcs, paramCollection);
    Zeu9 zeu9 = zsww.Zl();
    ZH(zeu9, zsww.Zs());
    return zeu9;
  }
  
  public void Zy(Zzcs paramZzcs, Zszw paramZszw1, Zszw paramZszw2, Zrp0 paramZrp0, Zlru paramZlru, Zeu9 paramZeu9) {
    this.ZN.ZD().Zy(Zrp6.DEBUG, Zlq7.ADD_STEP_TO_ROOM, new Object[] { paramZrp0, paramZeu9, paramZszw1 });
    Zlat zlat = paramZzcs.ZJ().Zl();
    Zbqc[] arrayOfZbqc = ZM();
    Objects.requireNonNull(paramZeu9);
    boolean bool = (!paramZrp0.Znq().equals(paramZeu9) && paramZrp0.Zng().stream().map(Zt8i::Zsu).noneMatch(paramZeu9::equals)) ? true : false;
    Zt8i zt8i = paramZrp0.Z_(paramZeu9, paramZszw1, paramZszw2, paramZlru, zlat.Zg(), this.ZQ, this.ZH, this.ZX, this.ZC, this.ZZ, this.ZN, zlat.ZE().ZJ().ZA());
    this.Zm.ZA(paramZrp0, paramZszw1, bool, this.ZC, this.ZN.ZD());
    this.ZC.ZD(new Zxr8(Zt35.ZW, new Ztas(zt8i, zlat)));
    if (arrayOfZbqc != null)
      Zbqc.Zr(new Zbqc[2]); 
  }
  
  public Zgd4 Zm() {
    return this.ZT.Zm();
  }
  
  public Zgd4 ZZ() {
    return this.ZT.ZZ();
  }
  
  public Zgd4 ZA() {
    return this.ZT.ZA();
  }
  
  public Zgd4 Zx() {
    return this.ZT.Zx();
  }
  
  public Zgd4 Zo() {
    return this.ZT.Zo();
  }
  
  public Zeu9 Zk(Zzcs paramZzcs) {
    return this.ZT.Zk(paramZzcs);
  }
  
  private static boolean lambda$adjustRoomForChangesToMatchingCriteria$0(Zgyy paramZgyy) {
    return paramZgyy instanceof Zm5e;
  }
  
  public static void ZH(Zbqc[] paramArrayOfZbqc) {
    Zt = paramArrayOfZbqc;
  }
  
  public static Zbqc[] ZM() {
    return Zt;
  }
  
  static {
    if (ZM() != null)
      ZH(new Zbqc[4]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxf2.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */