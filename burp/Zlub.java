package burp;

import java.time.Duration;
import java.time.Instant;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zoq;

public class Zlub implements Zlg4 {
  private final Zlg4 ZR;
  
  private final Ztv0 Zn;
  
  private final Zbnt Zb;
  
  private final Zrgd ZY;
  
  private final Zeu9 ZE;
  
  private Instant Zu;
  
  private Zefx Zq;
  
  private List<Duration> ZM;
  
  private List<Zb6q> ZB;
  
  private Zoq<Zs68> Zf;
  
  public Zlub(Zlg4 paramZlg4, Ztv0 paramZtv0, Zbnt paramZbnt, Zrgd paramZrgd, Instant paramInstant, Zefx paramZefx, List<Duration> paramList, List<Zb6q> paramList1, Zeu9 paramZeu9) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: aload_1
    //   6: putfield ZR : Lburp/Zlg4;
    //   9: aload_0
    //   10: aload_2
    //   11: putfield Zn : Lburp/Ztv0;
    //   14: aload_0
    //   15: aload_3
    //   16: putfield Zb : Lburp/Zbnt;
    //   19: aload_0
    //   20: aload #4
    //   22: putfield ZY : Lburp/Zrgd;
    //   25: aload_0
    //   26: aload #5
    //   28: putfield Zu : Ljava/time/Instant;
    //   31: aload_0
    //   32: aload #6
    //   34: putfield Zq : Lburp/Zefx;
    //   37: aload_0
    //   38: aload #7
    //   40: putfield ZM : Ljava/util/List;
    //   43: aload_0
    //   44: aload #8
    //   46: putfield ZB : Ljava/util/List;
    //   49: aload_0
    //   50: aload_0
    //   51: aload_3
    //   52: <illegal opcode> get : (Lburp/Zlub;Lburp/Zbnt;)Ljava/util/function/Supplier;
    //   57: invokestatic ZZ : (Ljava/util/function/Supplier;)Lnet/portswigger/Zoq;
    //   60: putfield Zf : Lnet/portswigger/Zoq;
    //   63: aload_0
    //   64: aload #9
    //   66: putfield ZE : Lburp/Zeu9;
    //   69: return
  }
  
  public Instant Zr() {
    return this.Zu;
  }
  
  public Zefx ZH() {
    Optional<Zefx> optional = this.Zn.Zb();
    if (optional.isPresent()) {
      Zefx zefx = optional.get();
      try {
        this.Zu = this.ZY.Zn();
        if (!zefx.equals(this.Zq))
          this.Zq = zefx; 
      } catch (Zg57 zg57) {
        throw a(null);
      } 
    } 
    return this.Zq;
  }
  
  public List<Duration> Zx() {
    return this.ZM;
  }
  
  public Zb6q ZD() throws Zsc2 {
    return Zp().getFirst();
  }
  
  public List<Zb6q> Zp() throws Zsc2 {
    Optional<List<Zg3d>> optional = this.Zn.ZE();
    if (optional.isPresent()) {
      List list = optional.get();
      List<Zb6q> list1 = (List)list.stream().map(Zg3d::Ze).filter(Objects::nonNull).collect(Collectors.toList());
      try {
        this.ZM = (List<Duration>)list.stream().map(Zg3d::ZS).collect(Collectors.toList());
        if (!list1.equals(this.ZB)) {
          this.ZB = list1;
          this.Zf = Zoq.ZZ(this::lambda$getLatestBaseResponseWithRedirects$3);
        } 
      } catch (Zsc2 zsc2) {
        throw a(null);
      } 
    } 
    return this.ZB;
  }
  
  public Zs68 ZJ() throws Zsc2 {
    Zp();
    return (Zs68)this.Zf.Zz();
  }
  
  public Zvow ZB(Zmzk paramZmzk) {
    return (new Zvow(paramZmzk, this.Zb)).Zn(Zt());
  }
  
  public Zvow ZS() {
    return (new Zvow(ZH().ZT(), this.Zb)).Zn(Zt()).ZF(Zr().toEpochMilli()).ZC(ZH()).Zo(ZD());
  }
  
  private List<Zkjz> Zt() {
    Zz3y zz3y = this.Zn.ZJ();
    ArrayList<Zkjz> arrayList = new ArrayList(zz3y.ZD());
    byte b = 0;
    String str = Ze3n.Zy();
    while (b < zz3y.ZD() - 1) {
      Zxlk zxlk = zz3y.ZY(b);
      arrayList.add(new Zkjz(zxlk.ZN(), zxlk.Zr()));
      b++;
      if (str == null)
        break; 
    } 
    arrayList.add(new Zkjz(zz3y.ZY(b).ZN(), this.ZE));
    return arrayList;
  }
  
  public Zlyj ZF(Zbza paramZbza, Zlv5 paramZlv5) {
    // Byte code:
    //   0: aload_2
    //   1: invokevirtual Zo : ()Z
    //   4: ifeq -> 23
    //   7: aload_0
    //   8: getfield ZR : Lburp/Zlg4;
    //   11: aload_1
    //   12: aload_2
    //   13: invokeinterface ZF : (Lburp/Zbza;Lburp/Zlv5;)Lburp/Zlyj;
    //   18: areturn
    //   19: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   22: athrow
    //   23: aload_2
    //   24: invokevirtual ZR : ()[B
    //   27: getstatic burp/Zsoh.ZG : [B
    //   30: if_acmpne -> 41
    //   33: iconst_1
    //   34: goto -> 42
    //   37: invokestatic a : (Ljava/lang/RuntimeException;)Ljava/lang/RuntimeException;
    //   40: athrow
    //   41: iconst_0
    //   42: getstatic net/portswigger/Zqf.Zs : Lnet/portswigger/Zqf;
    //   45: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   48: aload_0
    //   49: aload_2
    //   50: <illegal opcode> Zh : (Lburp/Zlub;Lburp/Zlv5;)Lburp/Zmwn;
    //   55: invokestatic ZD : (Lburp/Zmwn;)Ljava/lang/Object;
    //   58: checkcast burp/Zlyj
    //   61: areturn
    // Exception table:
    //   from	to	target	type
    //   0	19	19	burp/Zg57
    //   23	37	37	burp/Zg57
  }
  
  public boolean ZI() {
    return this.Zn.ZN();
  }
  
  public boolean ZK() {
    try {
      return ((Boolean)ZD(this::lambda$verifySession$5)).booleanValue();
    } catch (Zg57 zg57) {
      Zah.Zl(zg57, Zk_.COMMON_RUNTIME_FAILURE);
      return false;
    } 
  }
  
  public void ZN() {
    this.Zn.ZK();
  }
  
  public void Zs() {
    this.Zn.Zi();
  }
  
  private static <T> T ZD(Zmwn<T> paramZmwn) {
    try {
      return paramZmwn.Zh();
    } catch (Zmna zmna) {
      Zah.Zl(zmna, Zk_.RETHROWN);
      throw zmna.Zg();
    } 
  }
  
  private Boolean lambda$verifySession$5() throws Zmna {
    this.Zn.ZU(false);
    return Boolean.valueOf(true);
  }
  
  private Zlyj lambda$sendPayload$4(Zlv5 paramZlv5) throws Zmna {
    return this.Zn.Z_(paramZlv5);
  }
  
  private Zs68 lambda$getLatestBaseResponseWithRedirects$3() {
    return Zbwc.Zr(ZH().ZF(), ((Zb6q)this.ZB.getFirst()).Za(), Zt0k.HTML_AND_VIEWSTATE_ANALYSIS, true, false, this.Zb, Zlub::lambda$new$0);
  }
  
  private Zs68 lambda$new$1(Zbnt paramZbnt) {
    return Zbwc.Zr(ZH().ZF(), ((Zb6q)this.ZB.getFirst()).Za(), Zt0k.HTML_AND_VIEWSTATE_ANALYSIS, true, false, paramZbnt, Zlub::lambda$new$0);
  }
  
  private static Boolean lambda$new$0() {
    return Boolean.valueOf(false);
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zlub.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */