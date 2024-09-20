package com.fasterxml;

import java.io.Serializable;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Zve implements Zvs<Zvb>, Serializable {
  private static final long serialVersionUID = 1L;
  
  protected static final Zve ZH;
  
  protected final Set<String> Zu;
  
  protected final boolean Zk;
  
  protected final boolean Zn;
  
  protected final boolean ZA;
  
  protected final boolean Zd;
  
  private static final String a;
  
  protected Zve(Set<String> paramSet, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4) {
    if (paramSet == null) {
      this.Zu = Collections.emptySet();
    } else {
      this.Zu = paramSet;
    } 
    this.Zk = paramBoolean1;
    this.Zn = paramBoolean2;
    this.ZA = paramBoolean3;
    this.Zd = paramBoolean4;
  }
  
  public static Zve Zj(Zvb paramZvb) {
    return (paramZvb == null) ? ZH : Za(Zr(paramZvb.value()), paramZvb.ZM(), paramZvb.Zs(), paramZvb.Zj(), false);
  }
  
  public static Zve Za(Set<String> paramSet, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4) {
    return Zz(paramSet, paramBoolean1, paramBoolean2, paramBoolean3, paramBoolean4) ? ZH : new Zve(paramSet, paramBoolean1, paramBoolean2, paramBoolean3, paramBoolean4);
  }
  
  public static Zve ZE() {
    return ZH;
  }
  
  public static Zve Zg(Zve paramZve1, Zve paramZve2) {
    return (paramZve1 == null) ? paramZve2 : paramZve1.ZD(paramZve2);
  }
  
  public Zve ZD(Zve paramZve) {
    if (paramZve == null || paramZve == ZH)
      return this; 
    if (!paramZve.Zd)
      return paramZve; 
    if (Zr(this, paramZve))
      return this; 
    Set<String> set = ZY(this.Zu, paramZve.Zu);
    boolean bool1 = (this.Zk || paramZve.Zk) ? true : false;
    boolean bool2 = (this.Zn || paramZve.Zn) ? true : false;
    boolean bool3 = (this.ZA || paramZve.ZA) ? true : false;
    return Za(set, bool1, bool2, bool3, true);
  }
  
  protected Object readResolve() {
    return Zz(this.Zu, this.Zk, this.Zn, this.ZA, this.Zd) ? ZH : this;
  }
  
  public Set<String> ZG() {
    return this.Zn ? Collections.emptySet() : this.Zu;
  }
  
  public Set<String> Zq() {
    return this.ZA ? Collections.emptySet() : this.Zu;
  }
  
  public boolean ZI() {
    return this.Zk;
  }
  
  public String toString() {
    return String.format(a, new Object[] { this.Zu, Boolean.valueOf(this.Zk), Boolean.valueOf(this.Zn), Boolean.valueOf(this.ZA), Boolean.valueOf(this.Zd) });
  }
  
  public int hashCode() {
    return this.Zu.size() + (this.Zk ? 1 : -3) + (this.Zn ? 3 : -7) + (this.ZA ? 7 : -11) + (this.Zd ? 11 : -13);
  }
  
  public boolean equals(Object paramObject) {
    return (paramObject == this) ? true : ((paramObject == null) ? false : ((paramObject.getClass() == getClass() && Zr(this, (Zve)paramObject))));
  }
  
  private static boolean Zr(Zve paramZve1, Zve paramZve2) {
    return (paramZve1.Zk == paramZve2.Zk && paramZve1.Zd == paramZve2.Zd && paramZve1.Zn == paramZve2.Zn && paramZve1.ZA == paramZve2.ZA && paramZve1.Zu.equals(paramZve2.Zu));
  }
  
  private static Set<String> Zr(String[] paramArrayOfString) {
    String[] arrayOfString1 = Zgy.ZF();
    if (paramArrayOfString == null || paramArrayOfString.length == 0)
      return Collections.emptySet(); 
    HashSet<String> hashSet = new HashSet(paramArrayOfString.length);
    String[] arrayOfString2 = paramArrayOfString;
    int i = arrayOfString2.length;
    byte b = 0;
    while (b < i) {
      String str = arrayOfString2[b];
      hashSet.add(str);
      b++;
      if (arrayOfString1 != null)
        break; 
    } 
    return hashSet;
  }
  
  private static Set<String> ZY(Set<String> paramSet1, Set<String> paramSet2) {
    if (paramSet1.isEmpty())
      return paramSet2; 
    if (paramSet2.isEmpty())
      return paramSet1; 
    HashSet<String> hashSet = new HashSet(paramSet1.size() + paramSet2.size());
    hashSet.addAll(paramSet1);
    hashSet.addAll(paramSet2);
    return hashSet;
  }
  
  private static boolean Zz(Set<String> paramSet, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, boolean paramBoolean4) {
    return (paramBoolean1 == ZH.Zk && paramBoolean2 == ZH.Zn && paramBoolean3 == ZH.ZA && paramBoolean4 == ZH.Zd) ? ((paramSet == null || paramSet.size() == 0)) : false;
  }
  
  static {
    // Byte code:
    //   0: bipush #18
    //   2: ldc ';x|YX9vyvgc1hyg^t-6'jBtvqe|Et:%Tx?^v0wnFYz0we.bryg|@V;lnaD,{k]j[~)KgRc-%Tx?Zt,66D8'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic com/fasterxml/Zve.a : Ljava/lang/String;
    //   11: goto -> 152
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
    //   29: if_icmpgt -> 126
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 108, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 94, 4 -> 99, 5 -> 103
    //   80: bipush #99
    //   82: goto -> 110
    //   85: bipush #25
    //   87: goto -> 110
    //   90: iconst_1
    //   91: goto -> 110
    //   94: bipush #37
    //   96: goto -> 110
    //   99: iconst_3
    //   100: goto -> 110
    //   103: bipush #76
    //   105: goto -> 110
    //   108: bipush #10
    //   110: ixor
    //   111: ixor
    //   112: i2c
    //   113: castore
    //   114: iinc #0, 1
    //   117: dup
    //   118: ifne -> 126
    //   121: dup2
    //   122: dup_x1
    //   123: goto -> 35
    //   126: dup2_x1
    //   127: pop2
    //   128: dup_x2
    //   129: iload_0
    //   130: if_icmpgt -> 32
    //   133: pop
    //   134: new java/lang/String
    //   137: dup_x1
    //   138: swap
    //   139: invokespecial <init> : ([C)V
    //   142: invokevirtual intern : ()Ljava/lang/String;
    //   145: swap
    //   146: pop
    //   147: swap
    //   148: pop
    //   149: goto -> 8
    //   152: new com/fasterxml/Zve
    //   155: dup
    //   156: invokestatic emptySet : ()Ljava/util/Set;
    //   159: iconst_0
    //   160: iconst_0
    //   161: iconst_0
    //   162: iconst_1
    //   163: invokespecial <init> : (Ljava/util/Set;ZZZZ)V
    //   166: putstatic com/fasterxml/Zve.ZH : Lcom/fasterxml/Zve;
    //   169: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zve.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       1.1.3
 */