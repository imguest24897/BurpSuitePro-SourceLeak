package burp;

import java.util.LinkedList;
import java.util.List;
import net.portswigger.Zah;
import net.portswigger.Zb1;
import net.portswigger.Zf_;
import net.portswigger.Zk_;
import net.portswigger.Zlz;
import net.portswigger.Zm2;
import net.portswigger.Zrzy;
import net.portswigger.Zzi;

public class Zego {
  private static int ZJ;
  
  private static final String a;
  
  public Zzxc ZJ(String paramString) {
    Zsvm zsvm = null;
    LinkedList<IllegalArgumentException> linkedList = new LinkedList();
    int i = Zy();
    Zf_ zf_ = null;
    try {
      if (Zlz.Zu(paramString)) {
        zf_ = (new Zb1(paramString)).ZpH();
        linkedList.addAll(zf_.ZE());
        if (zf_.Z_()) {
          Zm2.ZB(Zec3.SCANNER_BCHECK_AST_HASH, Zz3s.ZE(zf_));
          zsvm = Zl2a.ZZ(zf_.Zn());
          Zm2.ZB(Zec3.SCANNER_BCHECK_SCAN_CHECK_TYPE, zsvm.ZS().toString());
        } 
      } else {
        linkedList.add(new IllegalArgumentException(a));
      } 
    } catch (Zrzy zrzy) {
      Zah.Zl((Throwable)zrzy, Zk_.COMMON_RUNTIME_FAILURE);
      linkedList.add(zrzy);
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
      linkedList.add(exception);
    } 
    try {
    
    } catch (Zrzy zrzy) {
      throw a(null);
    } 
    Zzi zzi = (zf_ == null) ? Zzi.Zo() : zf_.ZO();
    try {
    
    } catch (Zrzy zrzy) {
      throw a(null);
    } 
    String str = (zf_ == null) ? null : zf_.ZX();
    if (i != 0)
      Zbqc.Zr(new Zbqc[4]); 
    return new Zzxc(zsvm, (List)linkedList, zzi, str);
  }
  
  public static void Zc(int paramInt) {
    ZJ = paramInt;
  }
  
  public static int Za() {
    return ZJ;
  }
  
  public static int Zy() {
    int i = Za();
    try {
      if (i == 0)
        return 112; 
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return 0;
  }
  
  private static RuntimeException a(RuntimeException paramRuntimeException) {
    return paramRuntimeException;
  }
  
  static {
    // Byte code:
    //   0: invokestatic Za : ()I
    //   3: ifne -> 11
    //   6: bipush #12
    //   8: invokestatic Zc : (I)V
    //   11: bipush #32
    //   13: ldc '=5F6^;^-I174Cl'
    //   15: iconst_m1
    //   16: goto -> 25
    //   19: putstatic burp/Zego.a : Ljava/lang/String;
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
    //   92: bipush #94
    //   94: goto -> 124
    //   97: bipush #122
    //   99: goto -> 124
    //   102: bipush #8
    //   104: goto -> 124
    //   107: bipush #98
    //   109: goto -> 124
    //   112: bipush #27
    //   114: goto -> 124
    //   117: bipush #117
    //   119: goto -> 124
    //   122: bipush #95
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zego.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */