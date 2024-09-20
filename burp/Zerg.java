package burp;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.Consumer;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zerg implements Zm3g {
  private final Zra1 ZA;
  
  private final boolean Zn;
  
  private final Zskh Zd;
  
  private final Map<Zeew, Zx8n> ZE;
  
  private Zs0x ZB = Zs0x.ZZ;
  
  private static String ZV;
  
  private static final String b;
  
  public Zerg(Zra1 paramZra1, boolean paramBoolean, Zskh paramZskh) {
    this.ZA = paramZra1;
    this.Zn = paramBoolean;
    this.Zd = paramZskh;
    this.ZE = new LinkedHashMap<>();
  }
  
  void Zj(Zr6a paramZr6a) {
    Zeew[] arrayOfZeew = Zeew.values();
    int j = arrayOfZeew.length;
    byte b = 0;
    int i = Zeew.ZL();
    while (b < j) {
      Zeew zeew = arrayOfZeew[b];
      try {
        Zx8n zx8n = paramZr6a.Zy(zeew, this.ZA);
        try {
          if (zx8n != null)
            try {
              this.ZE.put(zeew, zx8n);
              if (zeew == Zeew.EXTENDER)
                try {
                  if (this.Zn)
                    zx8n.ZYI(); 
                } catch (Throwable throwable) {
                  throw a(null);
                }  
            } catch (Throwable throwable) {
              throw a(null);
            }  
        } catch (Throwable throwable) {
          throw a(null);
        } 
      } catch (Throwable throwable) {
        Zah.Zl(throwable, Zk_.UNEXPECTED);
      } 
      b++;
      if (i != 0)
        break; 
    } 
  }
  
  void ZT() {
    int i = Zeew.Zz();
    try {
      ZS(Zx8n::ZYE);
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
    this.ZB = new Zs0x((ZI(Zeew.PROXY) == null) ? null : (Zt80)ZI(Zeew.PROXY).ZYS(), (ZI(Zeew.INTRUDER) == null) ? null : (Zr00)ZI(Zeew.INTRUDER).ZYS(), (ZI(Zeew.REPEATER) == null) ? null : (Zx_a)ZI(Zeew.REPEATER).ZYS(), (ZI(Zeew.XCODER) == null) ? null : (Ztw)ZI(Zeew.XCODER).ZYS(), (ZI(Zeew.COMPARER) == null) ? null : (Zg_j)ZI(Zeew.COMPARER).ZYS(), (ZI(Zeew.COLLABORATOR) == null) ? null : (Zs_f)ZI(Zeew.COLLABORATOR).ZYS(), (ZI(Zeew.SEQUENCER) == null) ? null : (Zbui)ZI(Zeew.SEQUENCER).ZYS(), (ZI(Zeew.TARGET) == null) ? null : (Zeot)ZI(Zeew.TARGET).ZYS(), (ZI(Zeew.ORGANISER) == null) ? null : (Zeu0)ZI(Zeew.ORGANISER).ZYS(), (ZI(Zeew.EXTENDER) == null) ? Zgvn.Zv : (Zgvn)ZI(Zeew.EXTENDER).ZYS());
    if (Zbqc.Zwu() == null)
      Zeew.ZA(++i); 
  }
  
  void ZI() {
    Zbsv.Zb(this::lambda$initialiseToolsUi$0);
  }
  
  public void ZD() {
    Zbsv.Zb(this::lambda$updateToolsUi$1);
  }
  
  public boolean ZU(Zeew paramZeew) {
    try {
    
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
    return (ZI(paramZeew) != null);
  }
  
  public Zx8n ZI(Zeew paramZeew) {
    try {
      if (paramZeew == Zeew.SCANNER || paramZeew == Zeew.REPLAYER)
        paramZeew = Zeew.DASHBOARD; 
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
    return this.ZE.get(paramZeew);
  }
  
  public void Zh() {
    ZS(Zx8n::ZYA);
  }
  
  public void Zf() {
    ZV(Zx8n::ZYT);
  }
  
  public Zeot ZA() {
    return this.ZB.Zta();
  }
  
  public Zt80 ZJ() {
    return this.ZB.Ztf();
  }
  
  public Zr00 Zg() {
    return this.ZB.Zto();
  }
  
  public Zx_a Zm() {
    return this.ZB.Ztx();
  }
  
  public Zs_f ZC() {
    return this.ZB.Ztw();
  }
  
  public Zbui ZK() {
    return this.ZB.Ztt();
  }
  
  public Ztw Za() {
    return this.ZB.Zt7();
  }
  
  public Zg_j ZH() {
    return this.ZB.Zt0();
  }
  
  public Zgvn ZM() {
    return this.ZB.Zt5();
  }
  
  public Zeu0 Ze() {
    return this.ZB.ZtI();
  }
  
  public Zkrj Zk() {
    return (Zkrj)ZI(Zeew.DASHBOARD);
  }
  
  public Zkr0 Zj() {
    return (Zkr0)ZI(Zeew.TARGET);
  }
  
  public Zkrw Zl() {
    return (Zkrw)ZI(Zeew.PROXY);
  }
  
  public Zkrn ZS() {
    return (Zkrn)ZI(Zeew.REPEATER);
  }
  
  public Zz97 ZQ() {
    return (Zz97)ZI(Zeew.COLLABORATOR);
  }
  
  public Zkrx Zo() {
    return (Zkrx)ZI(Zeew.ORGANISER);
  }
  
  public Zkrl ZW() {
    return (Zkrl)ZI(Zeew.EXTENDER);
  }
  
  void ZU(Zb_j paramZb_j) {
    Zkr6 zkr6 = (Zkr6)ZI(Zeew.INTRUDER);
    try {
      if (zkr6 != null)
        zkr6.Zs(paramZb_j); 
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
  }
  
  public void ZM(Zb_j paramZb_j) {
    Zkr6 zkr6 = (Zkr6)ZI(Zeew.INTRUDER);
    try {
      if (zkr6 != null)
        zkr6.ZP(paramZb_j); 
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
  }
  
  public void ZG() {
    Zkr6 zkr6 = (Zkr6)ZI(Zeew.INTRUDER);
    try {
      if (zkr6 != null)
        zkr6.ZNH(); 
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
  }
  
  public void Zd(Zmf_ paramZmf_) {
    ZV(paramZmf_::lambda$loadBurpConfiguration$2);
  }
  
  public void Zl(Zg4j paramZg4j) {
    ZV(paramZg4j::lambda$saveBurpConfiguration$3);
  }
  
  public void ZB() {
    Zgvn zgvn = ZM();
    try {
      if (zgvn != null)
        zgvn.Zr(); 
    } catch (Zkfw zkfw) {
      throw a(null);
    } 
  }
  
  private void ZV(Consumer<Zx8n> paramConsumer) {
    int i = Zeew.ZL();
    for (Zx8n zx8n : this.ZE.values()) {
      try {
        paramConsumer.accept(zx8n);
      } catch (Throwable throwable) {
        Zah.Zl(throwable, Zk_.UNEXPECTED);
      } 
      if (i != 0)
        break; 
    } 
  }
  
  private void ZS(Consumer<Zx8n> paramConsumer) {
    int i = Zeew.Zz();
    for (Zx8n zx8n : this.ZE.values()) {
      try {
        paramConsumer.accept(zx8n);
      } catch (Zkfw zkfw) {
        Zah.Zl(zkfw, Zk_.RETHROWN);
        throw zkfw;
      } catch (Throwable throwable) {
        Zah.Zl(throwable, Zk_.UNEXPECTED);
        this.Zd.Zl(Zkqn.ERROR, b.formatted(new Object[] { (zx8n.ZYi()).toolName }));
      } 
      if (i == 0)
        break; 
    } 
  }
  
  private static void lambda$saveBurpConfiguration$3(Zg4j paramZg4j, Zx8n paramZx8n) {
    paramZx8n.Zl(paramZg4j);
  }
  
  private static void lambda$loadBurpConfiguration$2(Zmf_ paramZmf_, Zx8n paramZx8n) {
    paramZx8n.Zd(paramZmf_);
  }
  
  private void lambda$updateToolsUi$1() {
    ZS(Zx8n::ZYO);
  }
  
  private void lambda$initialiseToolsUi$0() {
    ZS(Zx8n::ZYq);
  }
  
  public static void ZM(String paramString) {
    ZV = paramString;
  }
  
  public static String Zr() {
    return ZV;
  }
  
  private static Throwable a(Throwable paramThrowable) {
    return paramThrowable;
  }
  
  static {
    // Byte code:
    //   0: invokestatic Zr : ()Ljava/lang/String;
    //   3: ifnonnull -> 11
    //   6: ldc 'Sj7OBb'
    //   8: invokestatic ZM : (Ljava/lang/String;)V
    //   11: bipush #56
    //   13: ldc '$~9?KV=?x?,V)?b1mNLs"c9!E'
    //   15: iconst_m1
    //   16: goto -> 25
    //   19: putstatic burp/Zerg.b : Ljava/lang/String;
    //   22: goto -> 166
    //   25: dup_x2
    //   26: pop
    //   27: invokevirtual toCharArray : ()[C
    //   30: dup_x1
    //   31: arraylength
    //   32: dup_x2
    //   33: pop
    //   34: iconst_0
    //   35: istore_0
    //   36: dup2_x1
    //   37: pop2
    //   38: dup_x2
    //   39: iconst_1
    //   40: if_icmpgt -> 140
    //   43: dup2
    //   44: swap
    //   45: iload_0
    //   46: dup2_x1
    //   47: caload
    //   48: swap
    //   49: iload_0
    //   50: bipush #7
    //   52: irem
    //   53: tableswitch default -> 122, 0 -> 92, 1 -> 97, 2 -> 102, 3 -> 107, 4 -> 112, 5 -> 117
    //   92: bipush #107
    //   94: goto -> 124
    //   97: bipush #110
    //   99: goto -> 124
    //   102: bipush #52
    //   104: goto -> 124
    //   107: bipush #110
    //   109: goto -> 124
    //   112: bipush #117
    //   114: goto -> 124
    //   117: bipush #83
    //   119: goto -> 124
    //   122: bipush #7
    //   124: ixor
    //   125: ixor
    //   126: i2c
    //   127: castore
    //   128: iinc #0, 1
    //   131: dup
    //   132: ifne -> 140
    //   135: dup2
    //   136: dup_x1
    //   137: goto -> 46
    //   140: dup2_x1
    //   141: pop2
    //   142: dup_x2
    //   143: iload_0
    //   144: if_icmpgt -> 43
    //   147: pop
    //   148: new java/lang/String
    //   151: dup_x1
    //   152: swap
    //   153: invokespecial <init> : ([C)V
    //   156: invokevirtual intern : ()Ljava/lang/String;
    //   159: swap
    //   160: pop
    //   161: swap
    //   162: pop
    //   163: goto -> 19
    //   166: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zerg.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */