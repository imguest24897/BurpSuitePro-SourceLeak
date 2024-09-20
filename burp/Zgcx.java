package burp;

import java.util.ArrayList;
import java.util.List;

public abstract class Zgcx extends Zgc8 implements Zb3t {
  private Zb3t Zj;
  
  private final List<Zb3t> ZL;
  
  private static boolean Zz;
  
  private static final String a;
  
  Zgcx(List<Zb3t> paramList) {
    this.ZL = new ArrayList<>(paramList.size());
    boolean bool = Zj();
    for (Zb3t zb3t : paramList) {
      zb3t.ZN(this);
      if (bool)
        break; 
    } 
  }
  
  String ZR() {
    String str = Zg().substring(ZT(), Zz());
    return (str.contains("\n") || str.contains("\r")) ? getClass().getSimpleName() : String.format(a, new Object[] { getClass().getSimpleName(), str });
  }
  
  public String toString() {
    return getClass().getSimpleName();
  }
  
  public Zb3t ZI() {
    return this.Zj;
  }
  
  public boolean Zk() {
    return !this.ZL.isEmpty();
  }
  
  public void ZN(Zb3t paramZb3t) {
    this.Zj = paramZb3t;
    paramZb3t.ZC().add(this);
  }
  
  public List<Zb3t> ZC() {
    return this.ZL;
  }
  
  public Zgfi ZJ() {
    return this.ZL.isEmpty() ? null : ((Zb3t)this.ZL.get(0)).ZJ();
  }
  
  public String Zg() {
    return this.ZL.isEmpty() ? "" : ((Zb3t)this.ZL.get(0)).Zg();
  }
  
  public void Zg(Zzlt paramZzlt) {}
  
  public int ZT() {
    return this.ZL.isEmpty() ? 0 : ((Zb3t)this.ZL.get(0)).ZT();
  }
  
  public int Zz() {
    return this.ZL.isEmpty() ? 0 : ((Zb3t)this.ZL.get(this.ZL.size() - 1)).Zz();
  }
  
  public int compareTo(Object paramObject) {
    if (paramObject == null || !(paramObject instanceof Zb3t))
      return 1; 
    Zb3t zb3t = (Zb3t)paramObject;
    return (ZT() > zb3t.ZT()) ? 1 : ((ZT() < zb3t.ZT()) ? -1 : 0);
  }
  
  public static void Ze(boolean paramBoolean) {
    Zz = paramBoolean;
  }
  
  public static boolean Zj() {
    return Zz;
  }
  
  public static boolean Zw() {
    boolean bool = Zj();
    return !bool;
  }
  
  static {
    // Byte code:
    //   0: invokestatic Zw : ()Z
    //   3: ifne -> 10
    //   6: iconst_1
    //   7: invokestatic Ze : (Z)V
    //   10: bipush #62
    //   12: ldc 'TUhle'
    //   14: iconst_m1
    //   15: goto -> 24
    //   18: putstatic burp/Zgcx.a : Ljava/lang/String;
    //   21: goto -> 165
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
    //   39: if_icmpgt -> 139
    //   42: dup2
    //   43: swap
    //   44: iload_0
    //   45: dup2_x1
    //   46: caload
    //   47: swap
    //   48: iload_0
    //   49: bipush #7
    //   51: irem
    //   52: tableswitch default -> 121, 0 -> 92, 1 -> 97, 2 -> 102, 3 -> 106, 4 -> 111, 5 -> 116
    //   92: bipush #79
    //   94: goto -> 123
    //   97: bipush #24
    //   99: goto -> 123
    //   102: iconst_3
    //   103: goto -> 123
    //   106: bipush #13
    //   108: goto -> 123
    //   111: bipush #119
    //   113: goto -> 123
    //   116: bipush #40
    //   118: goto -> 123
    //   121: bipush #96
    //   123: ixor
    //   124: ixor
    //   125: i2c
    //   126: castore
    //   127: iinc #0, 1
    //   130: dup
    //   131: ifne -> 139
    //   134: dup2
    //   135: dup_x1
    //   136: goto -> 45
    //   139: dup2_x1
    //   140: pop2
    //   141: dup_x2
    //   142: iload_0
    //   143: if_icmpgt -> 42
    //   146: pop
    //   147: new java/lang/String
    //   150: dup_x1
    //   151: swap
    //   152: invokespecial <init> : ([C)V
    //   155: invokevirtual intern : ()Ljava/lang/String;
    //   158: swap
    //   159: pop
    //   160: swap
    //   161: pop
    //   162: goto -> 18
    //   165: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgcx.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */