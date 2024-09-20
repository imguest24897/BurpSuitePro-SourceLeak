package burp;

import java.util.LinkedList;
import java.util.List;
import net.portswigger.Zah;
import net.portswigger.Zb6;
import net.portswigger.Zdz;
import net.portswigger.Zk_;
import net.portswigger.Zlz;
import net.portswigger.Zm2;
import net.portswigger.Zrzy;
import net.portswigger.Zzi;

public class Zk77 {
  private static int[] ZR;
  
  private static final String a;
  
  public Zzxc ZH(String paramString) {
    Zsvm zsvm = null;
    LinkedList<IllegalArgumentException> linkedList = new LinkedList();
    Zb6 zb6 = null;
    int[] arrayOfInt = ZT();
    try {
      if (Zlz.Zu(paramString)) {
        zb6 = (new Zdz(paramString)).Zz();
        linkedList.addAll(zb6.ZL());
        if (zb6.Zz()) {
          Zm2.ZB(Zec3.SCANNER_BCHECK_AST_HASH, Zm_k.Zh(zb6));
          zsvm = Zl27.Z_(zb6.Zy());
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
    Zzi zzi = (zb6 == null) ? Zzi.Zo() : zb6.ZN();
    try {
    
    } catch (Zrzy zrzy) {
      throw a(null);
    } 
    String str = (zb6 == null) ? null : zb6.Zf();
    if (arrayOfInt == null)
      Zbqc.Zr(new Zbqc[1]); 
    return new Zzxc(zsvm, (List)linkedList, zzi, str);
  }
  
  public static void ZM(int[] paramArrayOfint) {
    ZR = paramArrayOfint;
  }
  
  public static int[] ZT() {
    return ZR;
  }
  
  private static Zrzy a(Zrzy paramZrzy) {
    return paramZrzy;
  }
  
  static {
    // Byte code:
    //   0: invokestatic ZT : ()[I
    //   3: ifnonnull -> 12
    //   6: iconst_1
    //   7: newarray int
    //   9: invokestatic ZM : ([I)V
    //   12: bipush #110
    //   14: ldc 'd}3%"eTe<"giLF|6'
    //   16: iconst_m1
    //   17: goto -> 26
    //   20: putstatic burp/Zk77.a : Ljava/lang/String;
    //   23: goto -> 166
    //   26: dup_x2
    //   27: pop
    //   28: invokevirtual toCharArray : ()[C
    //   31: dup_x1
    //   32: arraylength
    //   33: dup_x2
    //   34: pop
    //   35: iconst_0
    //   36: istore_0
    //   37: dup2_x1
    //   38: pop2
    //   39: dup_x2
    //   40: iconst_1
    //   41: if_icmpgt -> 140
    //   44: dup2
    //   45: swap
    //   46: iload_0
    //   47: dup2_x1
    //   48: caload
    //   49: swap
    //   50: iload_0
    //   51: bipush #7
    //   53: irem
    //   54: tableswitch default -> 122, 0 -> 92, 1 -> 97, 2 -> 102, 3 -> 107, 4 -> 112, 5 -> 117
    //   92: bipush #73
    //   94: goto -> 124
    //   97: bipush #124
    //   99: goto -> 124
    //   102: bipush #51
    //   104: goto -> 124
    //   107: bipush #63
    //   109: goto -> 124
    //   112: bipush #41
    //   114: goto -> 124
    //   117: bipush #101
    //   119: goto -> 124
    //   122: bipush #78
    //   124: ixor
    //   125: ixor
    //   126: i2c
    //   127: castore
    //   128: iinc #0, 1
    //   131: dup
    //   132: ifne -> 140
    //   135: dup2
    //   136: dup_x1
    //   137: goto -> 47
    //   140: dup2_x1
    //   141: pop2
    //   142: dup_x2
    //   143: iload_0
    //   144: if_icmpgt -> 44
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
    //   163: goto -> 20
    //   166: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zk77.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */