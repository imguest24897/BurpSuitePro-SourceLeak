package burp;

import java.util.List;

public class Zrlt {
  private final List<Zer0> ZQ;
  
  public Zrlt(List<Zer0> paramList) {
    this.ZQ = paramList;
  }
  
  public Zer0 Zh(Zewx paramZewx, Zb25... paramVarArgs) {
    // Byte code:
    //   0: aload_2
    //   1: invokestatic Zn : ([Ljava/lang/Object;)Ljava/util/Set;
    //   4: astore #4
    //   6: invokestatic ZQ : ()Ljava/lang/String;
    //   9: aload_0
    //   10: getfield ZQ : Ljava/util/List;
    //   13: invokeinterface iterator : ()Ljava/util/Iterator;
    //   18: astore #5
    //   20: astore_3
    //   21: aload #5
    //   23: invokeinterface hasNext : ()Z
    //   28: ifeq -> 132
    //   31: aload #5
    //   33: invokeinterface next : ()Ljava/lang/Object;
    //   38: checkcast burp/Zer0
    //   41: astore #6
    //   43: aload #6
    //   45: invokeinterface ZO : ()I
    //   50: iconst_1
    //   51: if_icmpne -> 128
    //   54: new burp/Zrh3
    //   57: dup
    //   58: aload #6
    //   60: invokeinterface Zi : ()Ljava/lang/String;
    //   65: invokespecial <init> : (Ljava/lang/String;)V
    //   68: invokevirtual Zd : ()Lburp/Ztt6;
    //   71: astore #7
    //   73: aload #7
    //   75: ifnonnull -> 96
    //   78: iconst_0
    //   79: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   82: aload #6
    //   84: invokeinterface Zi : ()Ljava/lang/String;
    //   89: invokestatic ZT : (ZLnet/portswigger/Zqf;Ljava/lang/String;)V
    //   92: aload_3
    //   93: ifnonnull -> 21
    //   96: aload #7
    //   98: invokevirtual ZN : ()Lburp/Zlp9;
    //   101: aload_1
    //   102: invokevirtual ZG : ()Lburp/Zlp9;
    //   105: if_acmpne -> 128
    //   108: aload #4
    //   110: aload #6
    //   112: invokeinterface ZA : ()Lburp/Zb25;
    //   117: invokeinterface contains : (Ljava/lang/Object;)Z
    //   122: ifeq -> 128
    //   125: aload #6
    //   127: areturn
    //   128: aload_3
    //   129: ifnonnull -> 21
    //   132: aconst_null
    //   133: invokestatic Zwu : ()[Lburp/Zbqc;
    //   136: ifnonnull -> 144
    //   139: ldc 'LXAFnb'
    //   141: invokestatic ZE : (Ljava/lang/String;)V
    //   144: areturn
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrlt.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */