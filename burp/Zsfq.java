package burp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Zsfq {
  private final List<Zer0> ZI;
  
  public Zsfq(List<Zer0> paramList) {
    this.ZI = paramList;
  }
  
  public List<Zmaj> ZN() {
    // Byte code:
    //   0: new java/util/ArrayList
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_2
    //   8: invokestatic ZC : ()Z
    //   11: aload_0
    //   12: getfield ZI : Ljava/util/List;
    //   15: invokeinterface iterator : ()Ljava/util/Iterator;
    //   20: astore_3
    //   21: istore_1
    //   22: aload_3
    //   23: invokeinterface hasNext : ()Z
    //   28: ifeq -> 120
    //   31: aload_3
    //   32: invokeinterface next : ()Ljava/lang/Object;
    //   37: checkcast burp/Zer0
    //   40: astore #4
    //   42: aload #4
    //   44: invokeinterface ZO : ()I
    //   49: iconst_1
    //   50: if_icmpeq -> 56
    //   53: goto -> 22
    //   56: new burp/Zrh3
    //   59: dup
    //   60: aload #4
    //   62: invokeinterface Zi : ()Ljava/lang/String;
    //   67: invokespecial <init> : (Ljava/lang/String;)V
    //   70: invokevirtual Zd : ()Lburp/Ztt6;
    //   73: astore #5
    //   75: aload #5
    //   77: ifnonnull -> 98
    //   80: iconst_0
    //   81: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   84: aload #4
    //   86: invokeinterface Zi : ()Ljava/lang/String;
    //   91: invokestatic ZT : (ZLnet/portswigger/Zqf;Ljava/lang/String;)V
    //   94: iload_1
    //   95: ifne -> 22
    //   98: aload_2
    //   99: new burp/Zmaj
    //   102: dup
    //   103: aload #4
    //   105: aload #5
    //   107: invokespecial <init> : (Lburp/Zer0;Lburp/Ztt6;)V
    //   110: invokeinterface add : (Ljava/lang/Object;)Z
    //   115: pop
    //   116: iload_1
    //   117: ifne -> 22
    //   120: aload_2
    //   121: areturn
  }
  
  public List<Zxov> ZT() {
    ArrayList<Zxov> arrayList = new ArrayList();
    Iterator<Zer0> iterator = this.ZI.iterator();
    boolean bool = Ztx1.Zj();
    while (iterator.hasNext()) {
      Zer0 zer0 = iterator.next();
      if (zer0.ZO() != 2)
        continue; 
      Zxov zxov = (new Zrh3(zer0.Zi())).ZS(zer0);
      if (zxov == null)
        continue; 
      arrayList.add(zxov);
      if (bool)
        break; 
    } 
    return arrayList;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsfq.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */