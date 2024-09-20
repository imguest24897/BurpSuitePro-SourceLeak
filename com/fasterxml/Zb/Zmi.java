package com.fasterxml.Zb;

import burp.Zbqc;
import com.fasterxml.Zc.Zd;
import com.fasterxml.Zc.Ze;
import com.fasterxml.Zc.Zo;
import com.fasterxml.Zc.Zp;
import com.fasterxml.Zg2;
import com.fasterxml.Zof.Za;
import com.fasterxml.Zof.Zn;
import com.fasterxml.Zq.Zb;
import com.fasterxml.Zq.Zc;
import com.fasterxml.Zq.Zk;
import com.fasterxml.Zq.Zr;
import com.fasterxml.Zq.Zy;
import com.fasterxml.Zq6;
import com.fasterxml.Zr.Za;
import com.fasterxml.Zr.Zm;
import com.fasterxml.Zv9;
import com.fasterxml.Zya;
import com.fasterxml.Zyh;
import com.fasterxml.Zyw;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Reader;
import java.io.Serializable;
import java.io.StringReader;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Zmi extends Zm3 implements Serializable {
  private static final long serialVersionUID = 2L;
  
  protected static final int ZJ;
  
  protected static final int Zk;
  
  protected static final int ZG;
  
  public static final Zj Zh;
  
  protected transient Zn ZI;
  
  protected final transient Za Zg = Za.Zt();
  
  protected int ZC = ZJ;
  
  protected int ZT = Zk;
  
  protected int Zo = ZG;
  
  protected Ze<Zo> ZD = Zp.Zr();
  
  protected Zmd Ze;
  
  protected Zyh Zs;
  
  protected Z_ Zq;
  
  protected Zv ZZ;
  
  protected Zr ZU;
  
  protected Zyw Zy;
  
  protected Zya ZY;
  
  protected final List<Zd> ZE;
  
  protected Zj Zp = Zh;
  
  protected int ZN;
  
  protected final char Zn;
  
  private static final String c;
  
  public Zmi() {
    this((Zmd)null);
  }
  
  public Zmi(Zmd paramZmd) {
    this.Ze = paramZmd;
    this.Zn = '"';
    this.Zq = Z_.Zo();
    this.ZU = Zr.ZW();
    this.ZZ = Zv.ZU();
    this.ZE = null;
    this.ZI = Zn.Zx(this);
  }
  
  protected Zmi(Zmi paramZmi, Zmd paramZmd) {
    this.Ze = paramZmd;
    this.ZC = paramZmi.ZC;
    this.ZT = paramZmi.ZT;
    this.Zo = paramZmi.Zo;
    this.Zy = paramZmi.Zy;
    boolean bool = Zd.Zm();
    try {
      this.ZY = paramZmi.ZY;
      this.ZE = ZQ(paramZmi.ZE);
      this.Zq = Objects.<Z_>requireNonNull(paramZmi.Zq);
      this.ZU = Objects.<Zr>requireNonNull(paramZmi.ZU);
      this.ZZ = Objects.<Zv>requireNonNull(paramZmi.ZZ);
      this.Zs = paramZmi.Zs;
      this.Zp = paramZmi.Zp;
      this.ZN = paramZmi.ZN;
      this.Zn = paramZmi.Zn;
      this.ZI = Zn.Zx(this);
      if (!bool)
        Zbqc.Zr(new Zbqc[1]); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
  }
  
  public Zmi(Zn paramZn) {
    this.Ze = null;
    this.ZC = paramZn.Ze;
    this.ZT = paramZn.ZE;
    this.Zo = paramZn.ZX;
    this.Zy = paramZn.Zj;
    this.ZY = paramZn.ZH;
    this.ZE = ZQ(paramZn.Z_);
    this.Zq = Objects.<Z_>requireNonNull(paramZn.ZZ);
    this.ZU = Objects.<Zr>requireNonNull(paramZn.Zg);
    this.ZZ = Objects.<Zv>requireNonNull(paramZn.ZT);
    this.Zs = paramZn.ZF;
    this.Zp = paramZn.ZP;
    this.ZN = paramZn.ZM;
    this.Zn = paramZn.Zu;
    this.ZI = Zn.Zx(this);
  }
  
  protected Zmi(Zz<?, ?> paramZz, boolean paramBoolean) {
    this.Ze = null;
    this.ZC = paramZz.Ze;
    this.ZT = paramZz.ZE;
    this.Zo = paramZz.ZX;
    this.Zy = paramZz.Zj;
    this.ZY = paramZz.ZH;
    this.ZE = ZQ(paramZz.Z_);
    this.Zq = Objects.<Z_>requireNonNull(paramZz.ZZ);
    this.ZU = Objects.<Zr>requireNonNull(paramZz.Zg);
    this.ZZ = Objects.<Zv>requireNonNull(paramZz.ZT);
    this.Zs = null;
    this.Zp = null;
    this.ZN = 0;
    this.Zn = '"';
    this.ZI = Zn.Zx(this);
  }
  
  protected static <T> List<T> ZQ(List<T> paramList) {
    try {
      if (paramList == null)
        return paramList; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return new ArrayList<>(paramList);
  }
  
  protected Object readResolve() {
    return new Zmi(this, this.Ze);
  }
  
  public boolean ZE() {
    return false;
  }
  
  public boolean ZM() {
    return false;
  }
  
  public boolean ZK() {
    return true;
  }
  
  public String Zp() {
    try {
      if (getClass() == Zmi.class)
        return c; 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return null;
  }
  
  public Zm ZT(Za paramZa) throws IOException {
    try {
      if (getClass() == Zmi.class)
        return ZS(paramZa); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return null;
  }
  
  protected Zm ZS(Za paramZa) throws IOException {
    return Zr.Zx(paramZa);
  }
  
  public Zmk version() {
    return Zb.Zk;
  }
  
  public final int Zr() {
    return this.ZC;
  }
  
  public Z_ ZU() {
    return this.Zq;
  }
  
  public Zmi Zs(Zm paramZm) {
    this.ZT |= paramZm.Zi();
    return this;
  }
  
  public final boolean ZN(Zm paramZm) {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return ((this.ZT & paramZm.Zi()) != 0);
  }
  
  public Zmi ZL(Zmd paramZmd) {
    this.Ze = paramZmd;
    return this;
  }
  
  public Zmd Zo() {
    return this.Ze;
  }
  
  public Zg Zn(InputStream paramInputStream) throws IOException, Zm0 {
    Zv9 zv9 = Zc(ZA(paramInputStream), false);
    return ZK(Zk(paramInputStream, zv9), zv9);
  }
  
  public Zg ZT(Reader paramReader) throws IOException, Zm0 {
    Zv9 zv9 = Zc(ZA(paramReader), false);
    return Zp(Zy(paramReader, zv9), zv9);
  }
  
  public Zg ZG(byte[] paramArrayOfbyte) throws IOException, Zm0 {
    Zv9 zv9 = Zc(ZA(paramArrayOfbyte), true);
    if (this.Zy != null) {
      InputStream inputStream = this.Zy.Z_(zv9, paramArrayOfbyte, 0, paramArrayOfbyte.length);
      try {
        if (inputStream != null)
          return ZK(inputStream, zv9); 
      } catch (IOException iOException) {
        throw a(null);
      } 
    } 
    return Zk(paramArrayOfbyte, 0, paramArrayOfbyte.length, zv9);
  }
  
  public Zg Zr(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) throws IOException, Zm0 {
    Zo(paramArrayOfbyte, paramInt1, paramInt2);
    Zv9 zv9 = Zc(Zf(paramArrayOfbyte, paramInt1, paramInt2), true);
    if (this.Zy != null) {
      InputStream inputStream = this.Zy.Z_(zv9, paramArrayOfbyte, paramInt1, paramInt2);
      try {
        if (inputStream != null)
          return ZK(inputStream, zv9); 
      } catch (IOException iOException) {
        throw a(null);
      } 
    } 
    return Zk(paramArrayOfbyte, paramInt1, paramInt2, zv9);
  }
  
  public Zg ZH(String paramString) throws IOException, Zm0 {
    int i = paramString.length();
    try {
      if (this.Zy == null)
        try {
          if (i <= 32768)
            try {
              if (ZK()) {
                Zv9 zv9 = Zc(ZA(paramString), true);
                char[] arrayOfChar = zv9.ZH(i);
                paramString.getChars(0, i, arrayOfChar, 0);
                return Zr(arrayOfChar, 0, i, zv9, true);
              } 
              return ZT(new StringReader(paramString));
            } catch (IOException iOException) {
              throw a(null);
            }  
        } catch (IOException iOException) {
          throw a(null);
        }  
    } catch (IOException iOException) {
      throw a(null);
    } 
    return ZT(new StringReader(paramString));
  }
  
  public Zf ZJ(OutputStream paramOutputStream, Zma paramZma) throws IOException {
    Zv9 zv9 = Zc(ZA(paramOutputStream), false);
    try {
      zv9.Zs(paramZma);
      if (paramZma == Zma.UTF8)
        return Zn(Zq(paramOutputStream, zv9), zv9); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    Writer writer = Zz(paramOutputStream, paramZma, zv9);
    return Zm(ZL(writer, zv9), zv9);
  }
  
  public Zf ZC(Writer paramWriter) throws IOException {
    Zv9 zv9 = Zc(ZA(paramWriter), false);
    return Zm(ZL(paramWriter, zv9), zv9);
  }
  
  protected Zg ZK(InputStream paramInputStream, Zv9 paramZv9) throws IOException {
    try {
      return (new Zr(paramZv9, paramInputStream)).Zj(this.ZT, this.Ze, this.Zg, this.ZI, this.ZC);
    } catch (IOException|RuntimeException iOException) {
      if (paramZv9.Z_())
        try {
          paramInputStream.close();
        } catch (Exception exception) {
          iOException.addSuppressed(exception);
        }  
      paramZv9.close();
      throw iOException;
    } 
  }
  
  protected Zg Zp(Reader paramReader, Zv9 paramZv9) throws IOException {
    return (Zg)new Zk(paramZv9, this.ZT, paramReader, this.Ze, this.ZI.Zt());
  }
  
  protected Zg Zr(char[] paramArrayOfchar, int paramInt1, int paramInt2, Zv9 paramZv9, boolean paramBoolean) throws IOException {
    return (Zg)new Zk(paramZv9, this.ZT, null, this.Ze, this.ZI.Zt(), paramArrayOfchar, paramInt1, paramInt1 + paramInt2, paramBoolean);
  }
  
  protected Zg Zk(byte[] paramArrayOfbyte, int paramInt1, int paramInt2, Zv9 paramZv9) throws IOException {
    return (new Zr(paramZv9, paramArrayOfbyte, paramInt1, paramInt2)).Zj(this.ZT, this.Ze, this.Zg, this.ZI, this.ZC);
  }
  
  protected Zf Zm(Writer paramWriter, Zv9 paramZv9) throws IOException {
    Zc zc = new Zc(paramZv9, this.Zo, this.Ze, paramWriter, this.Zn);
    try {
      if (this.ZN > 0)
        zc.ZP(this.ZN); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (this.Zs != null)
        zc.ZH(this.Zs); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    Zj zj = this.Zp;
    try {
      if (zj != Zh)
        zc.Zf(zj); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return ZZ((Zf)zc);
  }
  
  protected Zf Zn(OutputStream paramOutputStream, Zv9 paramZv9) throws IOException {
    Zy zy = new Zy(paramZv9, this.Zo, this.Ze, paramOutputStream, this.Zn);
    try {
      if (this.ZN > 0)
        zy.ZP(this.ZN); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    try {
      if (this.Zs != null)
        zy.ZH(this.Zs); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    Zj zj = this.Zp;
    try {
      if (zj != Zh)
        zy.Zf(zj); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return ZZ((Zf)zy);
  }
  
  protected Writer Zz(OutputStream paramOutputStream, Zma paramZma, Zv9 paramZv9) throws IOException {
    try {
      if (paramZma == Zma.UTF8)
        return (Writer)new Zg2(paramZv9, paramOutputStream); 
    } catch (IOException iOException) {
      throw a(null);
    } 
    return new OutputStreamWriter(paramOutputStream, paramZma.Zz());
  }
  
  protected final InputStream Zk(InputStream paramInputStream, Zv9 paramZv9) throws IOException {
    if (this.Zy != null) {
      InputStream inputStream = this.Zy.ZZ(paramZv9, paramInputStream);
      try {
        if (inputStream != null)
          return inputStream; 
      } catch (IOException iOException) {
        throw a(null);
      } 
    } 
    return paramInputStream;
  }
  
  protected final Reader Zy(Reader paramReader, Zv9 paramZv9) throws IOException {
    if (this.Zy != null) {
      Reader reader = this.Zy.ZU(paramZv9, paramReader);
      try {
        if (reader != null)
          return reader; 
      } catch (IOException iOException) {
        throw a(null);
      } 
    } 
    return paramReader;
  }
  
  protected final OutputStream Zq(OutputStream paramOutputStream, Zv9 paramZv9) throws IOException {
    if (this.ZY != null) {
      OutputStream outputStream = this.ZY.Zx(paramZv9, paramOutputStream);
      try {
        if (outputStream != null)
          return outputStream; 
      } catch (IOException iOException) {
        throw a(null);
      } 
    } 
    return paramOutputStream;
  }
  
  protected final Writer ZL(Writer paramWriter, Zv9 paramZv9) throws IOException {
    if (this.ZY != null) {
      Writer writer = this.ZY.Zb(paramZv9, paramWriter);
      try {
        if (writer != null)
          return writer; 
      } catch (IOException iOException) {
        throw a(null);
      } 
    } 
    return paramWriter;
  }
  
  protected Zf ZZ(Zf paramZf) {
    boolean bool = Zd.Zm();
    if (this.ZE != null)
      for (Zd zd : this.ZE) {
        paramZf = zd.ZQ(this, paramZf);
        if (!bool)
          break; 
      }  
    return paramZf;
  }
  
  public Zo ZG() {
    return (Zo)Zu().Zn();
  }
  
  public Ze<Zo> Zu() {
    try {
      if (!Zmr.USE_THREAD_LOCAL_FOR_BUFFER_RECYCLING.ZR(this.ZC))
        return Zp.ZR(); 
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return this.ZD;
  }
  
  protected Zv9 Zc(Zq6 paramZq6, boolean paramBoolean) {
    // Byte code:
    //   0: aconst_null
    //   1: astore #4
    //   3: invokestatic Zm : ()Z
    //   6: iconst_0
    //   7: istore #5
    //   9: istore_3
    //   10: aload_1
    //   11: ifnonnull -> 22
    //   14: invokestatic Zf : ()Lcom/fasterxml/Zq6;
    //   17: astore_1
    //   18: iload_3
    //   19: ifne -> 64
    //   22: aload_1
    //   23: invokevirtual ZP : ()Ljava/lang/Object;
    //   26: astore #6
    //   28: aload #6
    //   30: instanceof com/fasterxml/Zc/Zl
    //   33: ifeq -> 64
    //   36: aload #6
    //   38: checkcast com/fasterxml/Zc/Zl
    //   41: invokeinterface ZT : ()Lcom/fasterxml/Zc/Zo;
    //   46: astore #4
    //   48: aload #4
    //   50: ifnull -> 61
    //   53: iconst_1
    //   54: goto -> 62
    //   57: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   60: athrow
    //   61: iconst_0
    //   62: istore #5
    //   64: aload #4
    //   66: ifnonnull -> 75
    //   69: aload_0
    //   70: invokevirtual ZG : ()Lcom/fasterxml/Zc/Zo;
    //   73: astore #4
    //   75: new com/fasterxml/Zv9
    //   78: dup
    //   79: aload_0
    //   80: getfield Zq : Lcom/fasterxml/Zb/Z_;
    //   83: aload_0
    //   84: getfield ZU : Lcom/fasterxml/Zb/Zr;
    //   87: aload_0
    //   88: getfield ZZ : Lcom/fasterxml/Zb/Zv;
    //   91: aload #4
    //   93: aload_1
    //   94: iload_2
    //   95: invokespecial <init> : (Lcom/fasterxml/Zb/Z_;Lcom/fasterxml/Zb/Zr;Lcom/fasterxml/Zb/Zv;Lcom/fasterxml/Zc/Zo;Lcom/fasterxml/Zq6;Z)V
    //   98: astore #6
    //   100: iload #5
    //   102: ifeq -> 118
    //   105: aload #6
    //   107: invokevirtual ZT : ()Lcom/fasterxml/Zv9;
    //   110: pop
    //   111: goto -> 118
    //   114: invokestatic a : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   117: athrow
    //   118: aload #6
    //   120: areturn
    // Exception table:
    //   from	to	target	type
    //   48	57	57	java/lang/RuntimeException
    //   100	111	114	java/lang/RuntimeException
  }
  
  protected Zq6 ZA(Object paramObject) {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return Zq6.Zy(!ZM(), paramObject, this.ZZ);
  }
  
  protected Zq6 Zf(Object paramObject, int paramInt1, int paramInt2) {
    try {
    
    } catch (RuntimeException runtimeException) {
      throw a(null);
    } 
    return Zq6.ZX(!ZM(), paramObject, paramInt1, paramInt2, this.ZZ);
  }
  
  static {
    // Byte code:
    //   0: bipush #51
    //   2: ldc 'Oc3'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic com/fasterxml/Zb/Zmi.c : Ljava/lang/String;
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
    //   42: tableswitch default -> 109, 0 -> 80, 1 -> 85, 2 -> 89, 3 -> 94, 4 -> 99, 5 -> 104
    //   80: bipush #54
    //   82: goto -> 111
    //   85: iconst_3
    //   86: goto -> 111
    //   89: bipush #79
    //   91: goto -> 111
    //   94: bipush #101
    //   96: goto -> 111
    //   99: bipush #45
    //   101: goto -> 111
    //   104: bipush #14
    //   106: goto -> 111
    //   109: bipush #42
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
    //   153: invokestatic ZO : ()I
    //   156: putstatic com/fasterxml/Zb/Zmi.ZJ : I
    //   159: invokestatic Zb : ()I
    //   162: putstatic com/fasterxml/Zb/Zmi.Zk : I
    //   165: invokestatic ZN : ()I
    //   168: putstatic com/fasterxml/Zb/Zmi.ZG : I
    //   171: new com/fasterxml/Zgk
    //   174: dup
    //   175: ldc ' '
    //   177: invokespecial <init> : (Ljava/lang/String;)V
    //   180: putstatic com/fasterxml/Zb/Zmi.Zh : Lcom/fasterxml/Zb/Zj;
    //   183: return
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zb\Zmi.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */