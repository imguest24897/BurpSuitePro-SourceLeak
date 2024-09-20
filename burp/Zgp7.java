package burp;

import java.io.IOException;
import java.net.Socket;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zgp7 extends Zgph {
  private final Zb43 ZF;
  
  private final Socket ZD;
  
  private final Zkbo ZE;
  
  private final Zgzx Z_;
  
  private final Zm5u ZG;
  
  private final Zr50 Zt;
  
  private final boolean Zh;
  
  private final Zseo Zv;
  
  private boolean ZH;
  
  private static final String a;
  
  public Zgp7(Zb43 paramZb43, Zln paramZln, Zkm paramZkm, Zgzx paramZgzx, Zrps paramZrps, Zst5 paramZst5, Zsil paramZsil, Zzen paramZzen, Zlhd paramZlhd, Zto5 paramZto5, Zefx paramZefx, Zmzk paramZmzk, Zsxe paramZsxe, Zrgd paramZrgd, Zxy1 paramZxy1, Zm5u paramZm5u, Zr50 paramZr50, Zl7q paramZl7q) {
    super(paramZln, paramZkm, paramZrps, paramZst5, paramZsil, paramZzen, paramZlhd, paramZto5, paramZefx);
    this.ZF = paramZb43;
    this.Z_ = paramZgzx;
    this.ZG = paramZm5u;
    this.Zt = paramZr50;
    this.ZD = paramZb43.ZY();
    this.ZE = new Zz5v(this.ZD, paramZrps, paramZsxe, paramZrgd);
    this.Zh = paramZl7q.Za();
    this.ZH = true;
    this.Zv = new Ze6g(this, paramZxy1, paramZmzk);
    paramZxy1.Zn(Zzxk.CONNECTION_ESTABLISHED, paramZmzk);
  }
  
  public void ZA(Zefx paramZefx) throws IOException {
    this.Zt.ZS(paramZefx);
  }
  
  Zefx Zn(Zefx paramZefx) throws IOException, Zryo, Zxt3, Zryj {
    try {
      return super.Zn(paramZefx);
    } catch (IOException iOException) {
      Zah.Zl(iOException, Zk_.RETHROWN);
      this.ZF.Zq();
      throw iOException;
    } 
  }
  
  public Zm7u Zb(int paramInt, Zefx paramZefx, Zlhj paramZlhj) throws IOException {
    try {
      Zlom zlom = this.Zz.Zr(paramInt, paramZefx, paramZlhj, this.ZD, this.Zv);
      try {
        if (zlom.ZU())
          this.ZF.Zq(); 
      } catch (IOException iOException) {
        throw a(null);
      } 
      zlom.ZO(this.ZO.Zd());
      zlom.ZV(this.ZO.Zu());
      zlom.Zi(this.ZO.ZB());
      return zlom;
    } catch (IOException iOException) {
      Zah.Zl(iOException, Zk_.RETHROWN);
      this.ZS.ZS(paramZefx, iOException);
      this.ZF.Zq();
      throw iOException;
    } 
  }
  
  public Zg4n ZR(Zm7u paramZm7u, Zefx paramZefx, Zsil paramZsil) throws IOException, Zgsm {
    // Byte code:
    //   0: invokestatic Zo : ()I
    //   3: istore #4
    //   5: aload_1
    //   6: instanceof burp/Zlom
    //   9: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   12: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   15: aload_1
    //   16: checkcast burp/Zlom
    //   19: astore #5
    //   21: aload #5
    //   23: aload_3
    //   24: invokevirtual Zm : (Lburp/Zsil;)Lburp/Zg4n;
    //   27: astore #6
    //   29: aload_0
    //   30: getfield ZS : Lburp/Zto5;
    //   33: aload #5
    //   35: invokevirtual ZA : ()Lburp/Zlhj;
    //   38: invokeinterface Zf : (Lburp/Zlhj;)V
    //   43: aload #6
    //   45: getstatic burp/Zg4n.CONTINUE : Lburp/Zg4n;
    //   48: if_acmpne -> 176
    //   51: aload #5
    //   53: invokevirtual Zf : ()Z
    //   56: ifeq -> 115
    //   59: goto -> 66
    //   62: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   65: athrow
    //   66: aload #5
    //   68: invokevirtual Zx : ()Z
    //   71: ifne -> 115
    //   74: goto -> 81
    //   77: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   80: athrow
    //   81: aload_0
    //   82: getfield Z_ : Lburp/Zgzx;
    //   85: invokeinterface ZT : ()Z
    //   90: ifeq -> 129
    //   93: goto -> 100
    //   96: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   99: athrow
    //   100: aload #5
    //   102: invokevirtual ZK : ()Z
    //   105: ifne -> 129
    //   108: goto -> 115
    //   111: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   114: athrow
    //   115: aload_0
    //   116: getfield ZF : Lburp/Zb43;
    //   119: invokevirtual Zq : ()V
    //   122: goto -> 129
    //   125: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   128: athrow
    //   129: aload #5
    //   131: invokevirtual Zr : ()Z
    //   134: ifeq -> 194
    //   137: aload_0
    //   138: getfield Zf : Lburp/Zzen;
    //   141: aload_2
    //   142: invokeinterface ZF : ()Lburp/Zlit;
    //   147: invokeinterface toString : ()Ljava/lang/String;
    //   152: invokeinterface ZU : (Ljava/lang/String;)V
    //   157: aload_0
    //   158: getfield ZF : Lburp/Zb43;
    //   161: invokevirtual Zq : ()V
    //   164: iload #4
    //   166: ifne -> 194
    //   169: goto -> 176
    //   172: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   175: athrow
    //   176: aload_0
    //   177: getfield ZF : Lburp/Zb43;
    //   180: invokevirtual Zq : ()V
    //   183: aload_0
    //   184: invokevirtual ZW : ()V
    //   187: goto -> 194
    //   190: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   193: athrow
    //   194: aload #5
    //   196: invokevirtual ZT : ()Z
    //   199: ifeq -> 217
    //   202: new java/io/IOException
    //   205: dup
    //   206: getstatic burp/Zgp7.a : Ljava/lang/String;
    //   209: invokespecial <init> : (Ljava/lang/String;)V
    //   212: athrow
    //   213: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   216: athrow
    //   217: aload #6
    //   219: areturn
    //   220: astore #5
    //   222: aload #5
    //   224: getstatic net/portswigger/Zk_.RETHROWN : Lnet/portswigger/Zk_;
    //   227: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   230: aload_0
    //   231: getfield ZS : Lburp/Zto5;
    //   234: aload_2
    //   235: aload_1
    //   236: aload #5
    //   238: invokeinterface ZC : (Lburp/Zefx;Lburp/Zm7u;Ljava/lang/Exception;)V
    //   243: aload #5
    //   245: athrow
    // Exception table:
    //   from	to	target	type
    //   15	219	220	java/io/IOException
    //   29	59	62	java/io/IOException
    //   51	74	77	java/io/IOException
    //   66	93	96	java/io/IOException
    //   81	108	111	java/io/IOException
    //   100	122	125	java/io/IOException
    //   129	169	172	java/io/IOException
    //   137	187	190	java/io/IOException
    //   194	213	213	java/io/IOException
  }
  
  void Zl(Zefx paramZefx, Zm7u paramZm7u) throws IOException {
    int i = Zloq.Zo();
    try {
      Zuh.Zb(paramZm7u instanceof Zlom, Zqf.Zk);
    } catch (IOException iOException) {
      throw a(null);
    } 
    Zuh.Zv((paramZm7u.Ze() == 101), Zqf.Zr, paramZm7u.Ze());
    Zlom zlom = (Zlom)paramZm7u;
    try {
      this.ZH = false;
      if (zlom.Zq() != null && (zlom.Zq()).length > 0) {
        Zkdu zkdu = new Zkdu(this.ZD.getInputStream(), zlom.Zq());
        Zl72 zl72 = new Zl72(this.ZD, zkdu);
        try {
          this.ZG.Zy(zl72, paramZm7u);
          if (i == 0) {
            this.ZG.Zy(this.ZD, paramZm7u);
            return;
          } 
        } catch (IOException iOException) {
          throw a(null);
        } 
        return;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    this.ZG.Zy(this.ZD, paramZm7u);
  }
  
  void ZW() {
    if (this.ZH && this.Zy.compareAndSet(false, true))
      this.ZF.Zo(); 
  }
  
  public boolean Zm(Zefx paramZefx) throws IOException {
    try {
      if (this.Zd.ZT(paramZefx))
        try {
          if (!this.Zh) {
            Zloe zloe;
            try {
              zloe = this.Zz.Zc(this.ZD);
            } catch (IOException iOException) {
              Zah.Zl(iOException, Zk_.RETHROWN);
              this.ZS.ZS(paramZefx, iOException);
              throw iOException;
            } 
            this.ZS.Zr(paramZefx);
            this.Zf.Zl();
            this.Zw.Zd().ZQ(this.ZD, zloe.ZF());
            return true;
          } 
          return false;
        } catch (IOException iOException) {
          throw a(null);
        }  
    } catch (IOException iOException) {
      throw a(null);
    } 
    return false;
  }
  
  public Zm7u ZJ(Zefx paramZefx) throws IOException {
    return this.ZE.ZJ(paramZefx);
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
  
  static {
    // Byte code:
    //   0: bipush #56
    //   2: ldc '%>U_bL;qIY[w"^RXN{8MN'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zgp7.a : Ljava/lang/String;
    //   11: goto -> 153
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
    //   29: if_icmpgt -> 127
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 109, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 94, 4 -> 99, 5 -> 104
    //   80: bipush #83
    //   82: goto -> 111
    //   85: bipush #105
    //   87: goto -> 111
    //   90: iconst_3
    //   91: goto -> 111
    //   94: bipush #74
    //   96: goto -> 111
    //   99: bipush #18
    //   101: goto -> 111
    //   104: bipush #19
    //   106: goto -> 111
    //   109: bipush #32
    //   111: ixor
    //   112: ixor
    //   113: i2c
    //   114: castore
    //   115: iinc #0, 1
    //   118: dup
    //   119: ifne -> 127
    //   122: dup2
    //   123: dup_x1
    //   124: goto -> 35
    //   127: dup2_x1
    //   128: pop2
    //   129: dup_x2
    //   130: iload_0
    //   131: if_icmpgt -> 32
    //   134: pop
    //   135: new java/lang/String
    //   138: dup_x1
    //   139: swap
    //   140: invokespecial <init> : ([C)V
    //   143: invokevirtual intern : ()Ljava/lang/String;
    //   146: swap
    //   147: pop
    //   148: swap
    //   149: pop
    //   150: goto -> 8
    //   153: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgp7.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */