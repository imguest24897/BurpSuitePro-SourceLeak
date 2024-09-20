package burp;

import java.awt.BorderLayout;
import java.util.function.BooleanSupplier;

public class Zbcm extends Zbqc {
  private final Zgmj ZU;
  
  private final BooleanSupplier ZS;
  
  private final Runnable ZQ;
  
  private final boolean ZW;
  
  private boolean ZB;
  
  private boolean Zb;
  
  private boolean ZI = true;
  
  private static final String a;
  
  public Zbcm(Zgmj paramZgmj, String paramString, boolean paramBoolean) {
    this(paramZgmj, Zbcm::lambda$new$0, Zbcm::lambda$new$1, paramString, paramBoolean);
  }
  
  public Zbcm(Zgmj paramZgmj, BooleanSupplier paramBooleanSupplier, Runnable paramRunnable, String paramString, boolean paramBoolean) {
    this.ZU = paramZgmj;
    this.ZS = paramBooleanSupplier;
    this.ZW = paramBoolean;
    this.ZQ = paramRunnable;
    setLayout(new BorderLayout());
    setFocusable(false);
    setOpaque(true);
    setToolTipText(paramString);
    add(paramZgmj.Zn(), a);
    Zw();
    addMouseListener(new Zz2(this));
  }
  
  public void updateUI() {
    super.updateUI();
    if (this.ZU != null)
      Zw(); 
  }
  
  public boolean isEnabled() {
    return (this.ZQ != null && super.isEnabled());
  }
  
  public void setEnabled(boolean paramBoolean) {
    super.setEnabled(paramBoolean);
    Zw();
  }
  
  public void ZL() {
    if (this.ZQ != null)
      this.ZQ.run(); 
  }
  
  public void ZH() {
    this.Zb = true;
    Zw();
  }
  
  public void ZV() {
    this.Zb = false;
    Zw();
  }
  
  public void ZZ(boolean paramBoolean) {
    this.ZI = paramBoolean;
    Zw();
  }
  
  public void Zm(Runnable paramRunnable) {
    addMouseListener(new Zz8r(this, paramRunnable));
  }
  
  private void Zw() {
    Zlt5 zlt5 = ZK();
    Zl(zlt5.ZH());
    this.ZU.ZZ(zlt5);
  }
  
  private Zlt5 ZK() {
    return isEnabled() ? (this.Zb ? (this.ZW ? (ZM() ? Zlt5.ACTIVE_PRIMARY_HOVER : Zlt5.ACTIVE_PRIMARY) : Zlt5.ACTIVE) : (ZM() ? Zlt5.INACTIVE_HOVER : Zlt5.INACTIVE)) : Zlt5.DISABLED;
  }
  
  private boolean ZM() {
    return (this.ZB && this.ZI);
  }
  
  private static void lambda$new$1() {}
  
  private static boolean lambda$new$0() {
    return true;
  }
  
  static {
    // Byte code:
    //   0: bipush #99
    //   2: ldc '"UDaL'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zbcm.a : Ljava/lang/String;
    //   11: goto -> 153
    //   14: dup_x2
    //   15: pop
    //   16: invokevirtual toCharArray : ()[C
    //   19: dup_x1
    //   20: arraylength
    //   21: dup_x2
    //   22: pop
    //   23: iconst_0
    //   24: istore_0
    //   25: dup2_x1
    //   26: pop2
    //   27: dup_x2
    //   28: iconst_1
    //   29: if_icmpgt -> 127
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 109, 0 -> 80, 1 -> 84, 2 -> 89, 3 -> 94, 4 -> 99, 5 -> 104
    //   80: iconst_2
    //   81: goto -> 111
    //   84: bipush #8
    //   86: goto -> 111
    //   89: bipush #88
    //   91: goto -> 111
    //   94: bipush #83
    //   96: goto -> 111
    //   99: bipush #103
    //   101: goto -> 111
    //   104: bipush #93
    //   106: goto -> 111
    //   109: bipush #19
    //   111: ixor
    //   112: ixor
    //   113: i2c
    //   114: castore
    //   115: iinc #0, 1
    //   118: dup
    //   119: ifne -> 127
    //   122: dup2
    //   123: dup_x1
    //   124: goto -> 35
    //   127: dup2_x1
    //   128: pop2
    //   129: dup_x2
    //   130: iload_0
    //   131: if_icmpgt -> 32
    //   134: pop
    //   135: new java/lang/String
    //   138: dup_x1
    //   139: swap
    //   140: invokespecial <init> : ([C)V
    //   143: invokevirtual intern : ()Ljava/lang/String;
    //   146: swap
    //   147: pop
    //   148: swap
    //   149: pop
    //   150: goto -> 8
    //   153: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbcm.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */