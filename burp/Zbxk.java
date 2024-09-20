package burp;

import net.portswigger.Zli;

public class Zbxk {
  private static boolean Zw;
  
  private static final String a;
  
  static String Zn(Zg6u paramZg6u) {
    return paramZg6u.getClass().getName() + paramZg6u.getClass().getName() + a;
  }
  
  static boolean ZG(Zg6u paramZg6u, Zlit paramZlit) {
    return (paramZlit.Zdz().equals(paramZg6u.ZlL().Zdz()) && Zli.ZQ(paramZlit.ZdH(), paramZg6u.ZlL().ZdH()));
  }
  
  static int Zv(Zg6u paramZg6u) {
    return 89 * paramZg6u.ZlL().hashCode() + paramZg6u.ZxU();
  }
  
  static boolean Zm(Zg6u paramZg6u, Object paramObject) {
    if (paramObject == null || !(paramObject instanceof Zg6u))
      return false; 
    Zg6u zg6u = (Zg6u)paramObject;
    return (zg6u.ZlL().equals(paramZg6u.ZlL()) && zg6u.ZxU() == paramZg6u.ZxU() && paramZg6u.Zkb().equals(zg6u.Zkb()));
  }
  
  static int ZE(Zg6u paramZg6u, Zez3 paramZez3) {
    int i = paramZg6u.ZlL().compareTo(paramZez3.ZlL());
    if (i != 0)
      return i; 
    i = paramZg6u.Zkb().compareTo(paramZez3.Zkb());
    if (i != 0)
      return i; 
    if (!(paramZez3 instanceof Zg6u))
      return 1; 
    Zg6u zg6u = (Zg6u)paramZez3;
    return (paramZg6u.ZxU() < zg6u.ZxU()) ? -1 : ((paramZg6u.ZxU() == zg6u.ZxU()) ? 0 : 1);
  }
  
  public static void ZH(boolean paramBoolean) {
    Zw = paramBoolean;
  }
  
  public static boolean Zv() {
    return Zw;
  }
  
  public static boolean Zg() {
    boolean bool = Zv();
    return !bool;
  }
  
  static {
    // Byte code:
    //   0: invokestatic Zv : ()Z
    //   3: ifeq -> 10
    //   6: iconst_1
    //   7: invokestatic ZH : (Z)V
    //   10: bipush #84
    //   12: ldc '_r'
    //   14: iconst_m1
    //   15: goto -> 24
    //   18: putstatic burp/Zbxk.a : Ljava/lang/String;
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
    //   92: bipush #49
    //   94: goto -> 124
    //   97: bipush #6
    //   99: goto -> 124
    //   102: bipush #40
    //   104: goto -> 124
    //   107: bipush #97
    //   109: goto -> 124
    //   112: bipush #10
    //   114: goto -> 124
    //   117: bipush #105
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbxk.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */