package burp;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Map;

public class Zkov {
  private final Zes1 Zs;
  
  private final Ze3n Zr;
  
  private final Zzuq ZW;
  
  Zkov(Zes1 paramZes1, Zzuq paramZzuq, Ze3n paramZe3n) {
    this.Zs = paramZes1;
    this.Zr = paramZe3n;
    this.ZW = paramZzuq;
  }
  
  Ztk8 ZO(int paramInt) {
    // Byte code:
    //   0: aload_0
    //   1: invokevirtual Ze : ()V
    //   4: invokestatic Ze : ()I
    //   7: new burp/Zgq
    //   10: dup
    //   11: invokespecial <init> : ()V
    //   14: astore_3
    //   15: aload_0
    //   16: getfield Zr : Lburp/Ze3n;
    //   19: invokevirtual ZL : ()Lburp/Zb6q;
    //   22: invokeinterface Za : ()Lburp/Zstu;
    //   27: iconst_0
    //   28: iload_1
    //   29: invokeinterface Zb : (II)Lburp/Zstu;
    //   34: invokestatic Zw : (Lburp/Zstu;)Ljava/util/Set;
    //   37: astore #4
    //   39: istore_2
    //   40: new java/util/HashMap
    //   43: dup
    //   44: invokespecial <init> : ()V
    //   47: astore #5
    //   49: aload #4
    //   51: invokeinterface iterator : ()Ljava/util/Iterator;
    //   56: astore #6
    //   58: aload #6
    //   60: invokeinterface hasNext : ()Z
    //   65: ifeq -> 159
    //   68: aload #6
    //   70: invokeinterface next : ()Ljava/lang/Object;
    //   75: checkcast burp/Zq3
    //   78: astore #7
    //   80: aload_0
    //   81: getfield ZW : Lburp/Zzuq;
    //   84: getfield ZC : Ljava/util/Set;
    //   87: aload #7
    //   89: invokevirtual ZFO : ()Ljava/lang/String;
    //   92: invokeinterface contains : (Ljava/lang/Object;)Z
    //   97: ifne -> 155
    //   100: aload_0
    //   101: aload #7
    //   103: invokevirtual ZFO : ()Ljava/lang/String;
    //   106: invokevirtual ZM : (Ljava/lang/String;)Z
    //   109: ifne -> 155
    //   112: aload #5
    //   114: aload #7
    //   116: invokevirtual ZFO : ()Ljava/lang/String;
    //   119: <illegal opcode> apply : ()Ljava/util/function/Function;
    //   124: invokeinterface computeIfAbsent : (Ljava/lang/Object;Ljava/util/function/Function;)Ljava/lang/Object;
    //   129: checkcast java/util/Collection
    //   132: astore #8
    //   134: aload #8
    //   136: aload #7
    //   138: invokevirtual ZFG : ()I
    //   141: aload #7
    //   143: invokevirtual ZFS : ()I
    //   146: invokestatic Zj : (II)Lburp/Zl1r;
    //   149: invokeinterface add : (Ljava/lang/Object;)Z
    //   154: pop
    //   155: iload_2
    //   156: ifne -> 58
    //   159: aload #5
    //   161: invokeinterface keySet : ()Ljava/util/Set;
    //   166: aload_0
    //   167: aload #5
    //   169: aload_3
    //   170: <illegal opcode> accept : (Lburp/Zkov;Ljava/util/Map;Lburp/Zgq;)Ljava/util/function/Consumer;
    //   175: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   180: aload_3
    //   181: invokestatic Zy : (Lburp/Zgq;)Lburp/Ztk8;
    //   184: areturn
  }
  
  private void Ze() {
    this.ZW.ZC.addAll(Zzvi.Zw(Zyf.Zy(this.Zr.ZA().ZD())).stream().map(Zq3::ZFO).toList());
  }
  
  private boolean ZM(String paramString) {
    return this.Zs.ZM(paramString.substring(paramString.indexOf("@") + 1));
  }
  
  private void lambda$checkForEmailAddresses$1(Map paramMap, Zgq paramZgq, String paramString) {
    Zvow zvow = this.Zr.Zt().Z_((Collection<Zl1r>)paramMap.get(paramString));
    paramZgq.Zu(Zesx.ZM(this.Zr.Za(), this.Zr.ZN(), zvow, paramString));
  }
  
  private static Collection lambda$checkForEmailAddresses$0(String paramString) {
    return new ArrayList();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkov.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */