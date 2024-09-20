package net.portswigger.browser;

import burp.Zbqc;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.stream.Collectors;
import net.portswigger.Zi7;

public class Zex {
  public static final Zex ZP;
  
  private final Set<Zcm> ZF;
  
  private static final String a;
  
  private Zex(Set<Zcm> paramSet) {
    this.ZF = paramSet;
  }
  
  public static Zex ZC(Zcm... paramVarArgs) {
    return ZS(Arrays.asList(paramVarArgs));
  }
  
  public static Zex ZW(Zi7 paramZi7) {
    LinkedList<Zcm> linkedList = new LinkedList();
    Zbqc[] arrayOfZbqc = Zjp.Za();
    Zcm[] arrayOfZcm = Zcm.values();
    int i = arrayOfZcm.length;
    byte b = 0;
    while (b < i) {
      Zcm zcm = arrayOfZcm[b];
      String str = zcm.jsonValue;
      if (str != null && paramZi7.Zm(str) && paramZi7.Zo(str).Zm())
        linkedList.add(zcm); 
      b++;
      if (arrayOfZbqc != null)
        break; 
    } 
    return ZS(linkedList);
  }
  
  public Zdi ZB(Zj5 paramZj5) {
    Objects.requireNonNull(paramZj5);
    return new Zdi((Set<Zz2>)this.ZF.stream().map(Zex::lambda$normaliseForPlatform$0).map(paramZj5::Zz).collect(Collectors.toSet()));
  }
  
  public boolean ZK(Zcm paramZcm) {
    return this.ZF.contains(paramZcm);
  }
  
  private static Zex ZS(List<Zcm> paramList) {
    return new Zex(new LinkedHashSet<>(paramList));
  }
  
  public Zi7 ZG(Zi7 paramZi7) {
    Zcm[] arrayOfZcm = Zcm.values();
    Zbqc[] arrayOfZbqc = Zjp.Za();
    int i = arrayOfZcm.length;
    byte b = 0;
    while (b < i) {
      Zcm zcm = arrayOfZcm[b];
      if (zcm.jsonValue != null)
        paramZi7.ZI(zcm.jsonValue, this.ZF.contains(zcm)); 
      b++;
      if (arrayOfZbqc != null)
        break; 
    } 
    return paramZi7;
  }
  
  public String toString() {
    return this.ZF.stream().map(Zex::lambda$toString$1).collect(Collectors.joining(a));
  }
  
  private static String lambda$toString$1(Zcm paramZcm) {
    return paramZcm.jsonValue;
  }
  
  private static Zz2 lambda$normaliseForPlatform$0(Zcm paramZcm) {
    return paramZcm.modifier;
  }
  
  static {
    // Byte code:
    //   0: bipush #14
    //   2: ldc 'P'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic net/portswigger/browser/Zex.a : Ljava/lang/String;
    //   11: goto -> 154
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
    //   29: if_icmpgt -> 128
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #58
    //   82: goto -> 112
    //   85: bipush #117
    //   87: goto -> 112
    //   90: bipush #52
    //   92: goto -> 112
    //   95: bipush #61
    //   97: goto -> 112
    //   100: bipush #91
    //   102: goto -> 112
    //   105: bipush #60
    //   107: goto -> 112
    //   110: bipush #111
    //   112: ixor
    //   113: ixor
    //   114: i2c
    //   115: castore
    //   116: iinc #0, 1
    //   119: dup
    //   120: ifne -> 128
    //   123: dup2
    //   124: dup_x1
    //   125: goto -> 35
    //   128: dup2_x1
    //   129: pop2
    //   130: dup_x2
    //   131: iload_0
    //   132: if_icmpgt -> 32
    //   135: pop
    //   136: new java/lang/String
    //   139: dup_x1
    //   140: swap
    //   141: invokespecial <init> : ([C)V
    //   144: invokevirtual intern : ()Ljava/lang/String;
    //   147: swap
    //   148: pop
    //   149: swap
    //   150: pop
    //   151: goto -> 8
    //   154: iconst_0
    //   155: anewarray net/portswigger/browser/Zcm
    //   158: invokestatic ZC : ([Lnet/portswigger/browser/Zcm;)Lnet/portswigger/browser/Zex;
    //   161: putstatic net/portswigger/browser/Zex.ZP : Lnet/portswigger/browser/Zex;
    //   164: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\browser\Zex.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */