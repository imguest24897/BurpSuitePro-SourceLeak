package burp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import net.portswigger.Zen;
import net.portswigger.Zkb;
import net.portswigger.Zqf;
import net.portswigger.Zuh;
import net.portswigger.Zz_;

public class Zxeu implements Zebl {
  private final Ztpx Zz;
  
  private final Zz4_ ZU;
  
  private final Ze3n Zj;
  
  private final Zsoh Zg;
  
  private final Zbjl Zx;
  
  private final Zr_4 Zm;
  
  private final Zg75 ZN;
  
  private final Zkl6 Zt;
  
  public Zxeu(Ztpx paramZtpx, Zz4_ paramZz4_, Ze3n paramZe3n, Zsoh paramZsoh, Zbjl paramZbjl, Zr_4 paramZr_4, Zg75 paramZg75, Zkl6 paramZkl6) {
    this.Zz = paramZtpx;
    this.ZU = paramZz4_;
    this.Zj = paramZe3n;
    this.Zg = paramZsoh;
    this.Zx = paramZbjl;
    this.Zm = paramZr_4;
    this.ZN = paramZg75;
    this.Zt = paramZkl6;
  }
  
  public void Zc(Zx_5 paramZx_5, Zxs7 paramZxs7) {
    this.ZU.Zz(paramZx_5);
    this.ZN.Zt(paramZxs7, paramZx_5);
  }
  
  public List<Zr3k> Zt(Zxs7 paramZxs7, Zlez paramZlez, Zzwz paramZzwz) {
    Zbqc[] arrayOfZbqc = Ztxo.Z_();
    Zewx zewx = paramZzwz.Zt(paramZlez.Zu);
    try {
      if (zewx == null)
        return null; 
    } catch (Zsc2 zsc2) {
      throw a(null);
    } 
    ArrayList<Zer0> arrayList = new ArrayList();
    byte[] arrayOfByte = Zu(paramZxs7, zewx, arrayList);
    ArrayList<Zr3k> arrayList1 = new ArrayList();
    Iterator<Zxov> iterator = Zgk3.Zj(arrayList, paramZlez.ZQ).iterator();
    Zxov zxov = iterator.next();
    if (arrayList.isEmpty()) {
      List<Zen> list = (new Zz_(Zkb.Zy(zxov.ZR.ZO.Zx()))).Z_();
      try {
        if (list.size() != 1) {
          Zuh.Zv(false, Zqf.Zr, list.size());
          return arrayList1;
        } 
      } catch (Zsc2 zsc2) {
        throw a(null);
      } 
      zewx = paramZzwz.ZK(zewx.ZG(), Zen.Zh(list.get(0)));
      arrayOfByte = null;
    } 
    arrayList1.add(Zl(zxov, zewx, paramZxs7, arrayOfByte));
    while (iterator.hasNext()) {
      arrayList1.add(Zo(iterator.next(), zewx, null));
      if (arrayOfZbqc != null)
        break; 
    } 
    return arrayList1;
  }
  
  private byte[] Zu(Zxs7 paramZxs7, Zewx paramZewx, List<Zer0> paramList) {
    // Byte code:
    //   0: new burp/Zrh3
    //   3: dup
    //   4: aload_2
    //   5: invokevirtual ZF : ()Lnet/portswigger/Zen;
    //   8: getfield ZO : Ljava/lang/String;
    //   11: invokespecial <init> : (Ljava/lang/String;)V
    //   14: invokevirtual Zd : ()Lburp/Ztt6;
    //   17: astore #4
    //   19: iconst_0
    //   20: istore #5
    //   22: iconst_0
    //   23: newarray byte
    //   25: astore #6
    //   27: aload_0
    //   28: getfield Zj : Lburp/Ze3n;
    //   31: invokevirtual Za : ()Lburp/Zmzk;
    //   34: astore #7
    //   36: aload_2
    //   37: aload_1
    //   38: invokevirtual Zu : (Lburp/Zxs7;)Lburp/Zs2i;
    //   41: invokeinterface ZE : ()[B
    //   46: astore #8
    //   48: aload_0
    //   49: getfield Zt : Lburp/Zkl6;
    //   52: invokeinterface ZH : ()Lburp/Zey9;
    //   57: astore #9
    //   59: aload #9
    //   61: aload #7
    //   63: aload #8
    //   65: invokevirtual ZY : (Lburp/Zmzk;[B)Lburp/Zefx;
    //   68: astore #10
    //   70: aload_0
    //   71: getfield Zg : Lburp/Zsoh;
    //   74: aload_0
    //   75: getfield Zz : Lburp/Ztpx;
    //   78: aload_0
    //   79: getfield Zj : Lburp/Ze3n;
    //   82: invokevirtual ZM : ()Lburp/Zbza;
    //   85: aload #10
    //   87: invokeinterface ZD : ()[B
    //   92: invokestatic Zc : (Lburp/Ztpx;Lburp/Zbza;[B)Lburp/Zzhi;
    //   95: <illegal opcode> Zv : ()Lburp/Zrec;
    //   100: invokestatic Zu : (Lburp/Zrec;)Lburp/Zxgd;
    //   103: aload_1
    //   104: aload #10
    //   106: <illegal opcode> apply : (Lburp/Zxs7;Lburp/Zefx;)Ljava/util/function/UnaryOperator;
    //   111: invokevirtual Zp : (Ljava/util/function/UnaryOperator;)Lburp/Zxgd;
    //   114: invokevirtual Zx : (Lburp/Zxgd;)Lburp/Zzhi;
    //   117: iconst_1
    //   118: invokevirtual Zz : (Z)Lburp/Zzhi;
    //   121: invokevirtual ZA : ()Lburp/Ztao;
    //   124: invokevirtual ZD : (Lburp/Ztao;)Lburp/Zsxd;
    //   127: astore #11
    //   129: aload #11
    //   131: invokestatic ZA : (Lburp/Zsxd;)Lburp/Zstu;
    //   134: astore #12
    //   136: aload #12
    //   138: ifnull -> 151
    //   141: aload #12
    //   143: invokeinterface ZiD : ()[B
    //   148: goto -> 153
    //   151: aload #6
    //   153: astore #6
    //   155: goto -> 168
    //   158: astore #7
    //   160: aload #7
    //   162: getstatic net/portswigger/Zk_.IGNORED : Lnet/portswigger/Zk_;
    //   165: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   168: aload #4
    //   170: ifnonnull -> 187
    //   173: iconst_0
    //   174: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   177: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   180: aload #6
    //   182: areturn
    //   183: invokestatic a : (Lburp/Zsc2;)Lburp/Zsc2;
    //   186: athrow
    //   187: aload_3
    //   188: invokeinterface clear : ()V
    //   193: aload_3
    //   194: aload_0
    //   195: getfield Zx : Lburp/Zbjl;
    //   198: aload_2
    //   199: invokevirtual ZF : ()Lnet/portswigger/Zen;
    //   202: invokeinterface Zb : (Lnet/portswigger/Zen;)Ljava/util/List;
    //   207: invokeinterface addAll : (Ljava/util/Collection;)Z
    //   212: pop
    //   213: aload_3
    //   214: invokeinterface isEmpty : ()Z
    //   219: ifeq -> 238
    //   222: iinc #5, 1
    //   225: iload #5
    //   227: iconst_3
    //   228: if_icmplt -> 27
    //   231: goto -> 238
    //   234: invokestatic a : (Lburp/Zsc2;)Lburp/Zsc2;
    //   237: athrow
    //   238: aload #6
    //   240: areturn
    // Exception table:
    //   from	to	target	type
    //   27	155	158	burp/Zsc2
    //   168	183	183	burp/Zsc2
    //   187	231	234	burp/Zsc2
  }
  
  private Zr3k Zl(Zxov paramZxov, Zewx paramZewx, Zxs7 paramZxs7, byte[] paramArrayOfbyte) {
    Zs2i zs2i = paramZewx.Zu(paramZxs7);
    Zvow zvow = this.Zj.Zt().Zp(zs2i.ZE()).ZK(paramArrayOfbyte).ZK(zs2i.ZO());
    return Zo(paramZxov, paramZewx, zvow);
  }
  
  private Zr3k Zo(Zxov paramZxov, Zewx paramZewx, Zvow paramZvow) {
    Zer0 zer0 = paramZxov.ZR.ZO;
    Zrcp zrcp = new Zrcp(this.Zt.ZB(), this.Zm);
    return new Zr3k(new Zt69(new Zz25(paramZewx.Zh(), 0), paramZvow, zrcp.Zb(paramZewx, zer0, Collections.singletonList(zer0))), paramZxov.Zi(zer0), paramZewx.ZG().Zz());
  }
  
  private static Ztcd lambda$gatherEvidence$1(Zxs7 paramZxs7, Zefx paramZefx, Ztcd paramZtcd) {
    // Byte code:
    //   0: aload_2
    //   1: aload_0
    //   2: aload_1
    //   3: <illegal opcode> Zh : (Lburp/Zxs7;Lburp/Zefx;)Lburp/Zlgm;
    //   8: invokevirtual ZM : (Lburp/Zlgm;)Lburp/Ztcd;
    //   11: areturn
  }
  
  private static boolean lambda$gatherEvidence$0(Zxs7 paramZxs7, Zefx paramZefx, Zrdu paramZrdu, String paramString) {
    return paramZxs7.Zm(paramZrdu, paramString, paramZefx);
  }
  
  private static Zsc2 a(Zsc2 paramZsc2) {
    return paramZsc2;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxeu.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */