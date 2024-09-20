package burp;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Zbn implements Zecv {
  private final List<String> ZC;
  
  private final Zgb6 Zf;
  
  private final Set<String> Zq;
  
  private final Ztyx ZI;
  
  private static boolean Zp;
  
  private static final String a;
  
  public Zbn(List<String> paramList, Zgb6 paramZgb6, Zb_j paramZb_j) {
    this.ZC = paramList;
    this.Zf = paramZgb6;
    this.Zq = new HashSet<>();
    boolean bool = ZI();
    this.ZI = new Ztyx(a, paramZb_j);
    ZE();
    if (bool)
      Zbqc.Zr(new Zbqc[2]); 
  }
  
  private void ZE() {
    List<String> list = this.ZI.Zb();
    this.Zq.clear();
    this.Zq.addAll(list);
  }
  
  private void Zg() {
    this.ZI.ZS(new ArrayList<>(this.Zq));
  }
  
  public boolean ZZ(String paramString) {
    if (paramString == null || paramString.isEmpty())
      return this.Zf.Zfr(); 
    boolean bool1 = this.ZC.contains(paramString);
    boolean bool2 = this.Zq.contains(paramString);
    return (!bool2 && (bool1 || this.Zf.Zfr()));
  }
  
  public void ZF(String paramString) {
    this.Zq.add(paramString);
    Zg();
  }
  
  public void ZW(String paramString) {
    this.Zq.remove(paramString);
    Zg();
  }
  
  public static void Zw(boolean paramBoolean) {
    Zp = paramBoolean;
  }
  
  public static boolean ZI() {
    return Zp;
  }
  
  public static boolean Zc() {
    boolean bool = ZI();
    return !bool;
  }
  
  static {
    // Byte code:
    //   0: invokestatic Zc : ()Z
    //   3: ifne -> 10
    //   6: iconst_1
    //   7: invokestatic Zw : (Z)V
    //   10: bipush #49
    //   12: ldc 'gz"q"[|y-z B;g-g4Bqt=`.Bap,` \f/'
    //   14: iconst_m1
    //   15: goto -> 24
    //   18: putstatic burp/Zbn.a : Ljava/lang/String;
    //   21: goto -> 166
    //   24: dup_x2
    //   25: pop
    //   26: invokevirtual toCharArray : ()[C
    //   29: dup_x1
    //   30: arraylength
    //   31: dup_x2
    //   32: pop
    //   33: iconst_0
    //   34: istore_0
    //   35: dup2_x1
    //   36: pop2
    //   37: dup_x2
    //   38: iconst_1
    //   39: if_icmpgt -> 140
    //   42: dup2
    //   43: swap
    //   44: iload_0
    //   45: dup2_x1
    //   46: caload
    //   47: swap
    //   48: iload_0
    //   49: bipush #7
    //   51: irem
    //   52: tableswitch default -> 122, 0 -> 92, 1 -> 97, 2 -> 102, 3 -> 107, 4 -> 112, 5 -> 117
    //   92: bipush #78
    //   94: goto -> 124
    //   97: bipush #36
    //   99: goto -> 124
    //   102: bipush #36
    //   104: goto -> 124
    //   107: bipush #121
    //   109: goto -> 124
    //   112: bipush #37
    //   114: goto -> 124
    //   117: bipush #112
    //   119: goto -> 124
    //   122: bipush #30
    //   124: ixor
    //   125: ixor
    //   126: i2c
    //   127: castore
    //   128: iinc #0, 1
    //   131: dup
    //   132: ifne -> 140
    //   135: dup2
    //   136: dup_x1
    //   137: goto -> 45
    //   140: dup2_x1
    //   141: pop2
    //   142: dup_x2
    //   143: iload_0
    //   144: if_icmpgt -> 42
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
    //   163: goto -> 18
    //   166: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbn.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */