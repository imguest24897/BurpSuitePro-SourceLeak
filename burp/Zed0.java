package burp;

import java.awt.Component;
import java.awt.Window;
import javax.swing.SwingUtilities;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zed0 {
  private final Zgb6 ZX;
  
  private final Zkc0 ZS;
  
  private final Ztq1 Zo;
  
  private final Zemk Zv;
  
  private final Zzjc ZK;
  
  private final Zgf2 Zl;
  
  private final Zxf5 ZB;
  
  private final Ztyg Zc;
  
  private final Zgq7 Zx;
  
  private final Zedy ZP;
  
  private Zl02 ZW;
  
  private int Ze;
  
  private volatile boolean Zi;
  
  private static String Zs;
  
  public Zed0(Zgb6 paramZgb6, Zkc0 paramZkc0, Ztq1 paramZtq1, Zemk paramZemk, Zzjc paramZzjc, Zgf2 paramZgf2, Zxf5 paramZxf5, Ztyg paramZtyg, Zgq7 paramZgq7, Zedy paramZedy) {
    this.ZX = paramZgb6;
    this.ZS = paramZkc0;
    this.Zo = paramZtq1;
    this.Zv = paramZemk;
    this.ZK = paramZzjc;
    this.Zl = paramZgf2;
    this.ZB = paramZxf5;
    this.Zc = paramZtyg;
    this.Zx = paramZgq7;
    this.ZP = paramZedy;
  }
  
  public void Zk(Window paramWindow) {
    Zuh.Zb(SwingUtilities.isEventDispatchThread(), Zqf.ZF);
    Zryx zryx = (new Zr1o()).Zf("").Za("").ZP(Zsvm.ZZ()).Zr();
    Zq(paramWindow, zryx);
  }
  
  public void ZC(Window paramWindow, String paramString) {
    Zuh.Zb(SwingUtilities.isEventDispatchThread(), Zqf.ZF);
    Zq(paramWindow, this.Zo.ZJ(paramString, new Zkk7[0]));
  }
  
  public void Zn(Window paramWindow, Zmo3 paramZmo3) {
    Zuh.Zb(SwingUtilities.isEventDispatchThread(), Zqf.ZF);
    Zq(paramWindow, paramZmo3);
  }
  
  private void Zq(Window paramWindow, Zmo3 paramZmo3) {
    Zl02 zl02 = Zy(paramWindow, paramZmo3);
    if (!zl02.isVisible())
      zl02.setVisible(true); 
    zl02.toFront();
  }
  
  public boolean Zc(Component paramComponent) {
    Zuh.Zb(SwingUtilities.isEventDispatchThread(), Zqf.ZF);
    if (this.ZW == null)
      return true; 
    if (this.ZW.ZJ(paramComponent)) {
      this.ZW.dispose();
      return true;
    } 
    return false;
  }
  
  private Zl02 Zy(Window paramWindow, Zmo3 paramZmo3) {
    // Byte code:
    //   0: invokestatic Zm : ()Ljava/lang/String;
    //   3: astore_3
    //   4: aload_0
    //   5: getfield ZW : Lburp/Zl02;
    //   8: ifnonnull -> 101
    //   11: aload_0
    //   12: aload_2
    //   13: invokeinterface ZA : ()I
    //   18: putfield Ze : I
    //   21: aload_0
    //   22: new burp/Zl02
    //   25: dup
    //   26: aload_1
    //   27: aload_0
    //   28: getfield ZX : Lburp/Zgb6;
    //   31: aload_0
    //   32: getfield ZS : Lburp/Zkc0;
    //   35: aload_0
    //   36: getfield Zo : Lburp/Ztq1;
    //   39: aload_0
    //   40: getfield Zv : Lburp/Zemk;
    //   43: aload_0
    //   44: getfield ZK : Lburp/Zzjc;
    //   47: aload_0
    //   48: getfield Zl : Lburp/Zgf2;
    //   51: aload_0
    //   52: getfield ZB : Lburp/Zxf5;
    //   55: aload_0
    //   56: getfield Zc : Lburp/Ztyg;
    //   59: aload_0
    //   60: getfield Zx : Lburp/Zgq7;
    //   63: aload_0
    //   64: getfield ZP : Lburp/Zedy;
    //   67: aload_2
    //   68: aload_0
    //   69: <illegal opcode> run : (Lburp/Zed0;)Ljava/lang/Runnable;
    //   74: aload_0
    //   75: <illegal opcode> accept : (Lburp/Zed0;)Ljava/util/function/Consumer;
    //   80: invokespecial <init> : (Ljava/awt/Window;Lburp/Zgb6;Lburp/Zkc0;Lburp/Ztq1;Lburp/Zemk;Lburp/Zzjc;Lburp/Zgf2;Lburp/Zxf5;Lburp/Ztyg;Lburp/Zgq7;Lburp/Zedy;Lburp/Zmo3;Ljava/lang/Runnable;Ljava/util/function/Consumer;)V
    //   83: putfield ZW : Lburp/Zl02;
    //   86: aload_0
    //   87: iconst_1
    //   88: putfield Zi : Z
    //   91: getstatic burp/Zrrh.BS_CODE_LAUNCHED : Lburp/Zrrh;
    //   94: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   97: aload_3
    //   98: ifnonnull -> 135
    //   101: aload_2
    //   102: invokeinterface ZA : ()I
    //   107: aload_0
    //   108: getfield Ze : I
    //   111: if_icmpeq -> 135
    //   114: aload_0
    //   115: getfield ZW : Lburp/Zl02;
    //   118: aload_2
    //   119: invokevirtual ZI : (Lburp/Zmo3;)Z
    //   122: ifeq -> 135
    //   125: aload_0
    //   126: aload_2
    //   127: invokeinterface ZA : ()I
    //   132: putfield Ze : I
    //   135: aload_0
    //   136: getfield ZW : Lburp/Zl02;
    //   139: areturn
  }
  
  public boolean ZY() {
    return this.Zi;
  }
  
  private void Zy() {
    Zuh.Zb(SwingUtilities.isEventDispatchThread(), Zqf.ZF);
    this.ZW = null;
  }
  
  private void Zq(Zmo3 paramZmo3) {
    Zuh.Zb(SwingUtilities.isEventDispatchThread(), Zqf.ZF);
    this.Ze = paramZmo3.ZA();
  }
  
  public static void Zv(String paramString) {
    Zs = paramString;
  }
  
  public static String Zm() {
    return Zs;
  }
  
  static {
    if (Zm() == null)
      Zv("s8g24b"); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zed0.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */