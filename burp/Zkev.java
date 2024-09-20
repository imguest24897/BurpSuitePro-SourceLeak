package burp;

import burp.api.montoya.core.ByteArray;
import burp.api.montoya.http.message.HttpRequestResponse;
import burp.api.montoya.http.message.requests.HttpRequest;
import burp.api.montoya.http.message.responses.HttpResponse;
import burp.api.montoya.persistence.PersistedList;
import burp.api.montoya.persistence.PersistedObject;
import java.util.Set;

public class Zkev implements PersistedObject, Proxyable {
  private final Zsy_ Ze;
  
  private final Zbnt ZG;
  
  private final Zr_4 ZP;
  
  private final Zr_4 Zo;
  
  private final Zey9 ZI;
  
  private final Zslu Zl;
  
  private static final String[] a;
  
  private static final String[] b;
  
  public Zkev(Zsy_ paramZsy_, Zbnt paramZbnt, Zr_4 paramZr_41, Zr_4 paramZr_42, Zey9 paramZey9, Zslu paramZslu) {
    this.Ze = paramZsy_;
    this.ZG = paramZbnt;
    this.ZP = paramZr_41;
    this.Zo = paramZr_42;
    this.ZI = paramZey9;
    this.Zl = paramZslu;
  }
  
  public Boolean getBoolean(String paramString) {
    return this.Ze.ZG(paramString);
  }
  
  public void setBoolean(String paramString, boolean paramBoolean) {
    this.Ze.Zf(paramString, paramBoolean);
  }
  
  public void deleteBoolean(String paramString) {
    this.Ze.Zv(paramString);
  }
  
  public Set<String> booleanKeys() {
    return this.Ze.ZoH();
  }
  
  public PersistedList<Boolean> getBooleanList(String paramString) {
    Zmfv zmfv = this.Ze.Zm(paramString);
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (zmfv == null) ? null : new Zeho(zmfv);
  }
  
  public void setBooleanList(String paramString, PersistedList<Boolean> paramPersistedList) {
    // Byte code:
    //   0: invokestatic Z_ : ()Z
    //   3: istore_3
    //   4: aload_2
    //   5: ifnonnull -> 30
    //   8: aload_0
    //   9: getfield Ze : Lburp/Zsy_;
    //   12: aload_1
    //   13: aconst_null
    //   14: invokeinterface Za : (Ljava/lang/String;Lburp/Zmfv;)V
    //   19: iload_3
    //   20: ifeq -> 114
    //   23: goto -> 30
    //   26: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   29: athrow
    //   30: aload_2
    //   31: instanceof burp/Proxyable
    //   34: ifeq -> 93
    //   37: goto -> 44
    //   40: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   43: athrow
    //   44: aload_2
    //   45: checkcast burp/Proxyable
    //   48: astore #4
    //   50: aload #4
    //   52: invokeinterface proxiedObject : ()Ljava/lang/Object;
    //   57: astore #6
    //   59: aload #6
    //   61: instanceof burp/Zeho
    //   64: ifeq -> 93
    //   67: aload #6
    //   69: checkcast burp/Zeho
    //   72: astore #5
    //   74: aload_0
    //   75: getfield Ze : Lburp/Zsy_;
    //   78: aload_1
    //   79: aload #5
    //   81: invokevirtual Za : ()Lburp/Zmfv;
    //   84: invokeinterface Za : (Ljava/lang/String;Lburp/Zmfv;)V
    //   89: iload_3
    //   90: ifeq -> 114
    //   93: new java/lang/IllegalArgumentException
    //   96: dup
    //   97: sipush #23921
    //   100: sipush #4367
    //   103: invokestatic a : (II)Ljava/lang/String;
    //   106: invokespecial <init> : (Ljava/lang/String;)V
    //   109: athrow
    //   110: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   113: athrow
    //   114: return
    // Exception table:
    //   from	to	target	type
    //   4	23	26	java/lang/IllegalArgumentException
    //   8	37	40	java/lang/IllegalArgumentException
    //   74	110	110	java/lang/IllegalArgumentException
  }
  
  public void deleteBooleanList(String paramString) {
    this.Ze.ZY(paramString);
  }
  
  public Set<String> booleanListKeys() {
    return this.Ze.Zoj();
  }
  
  public Byte getByte(String paramString) {
    return this.Ze.ZPT(paramString);
  }
  
  public void setByte(String paramString, byte paramByte) {
    this.Ze.ZO(paramString, paramByte);
  }
  
  public void deleteByte(String paramString) {
    this.Ze.Zx(paramString);
  }
  
  public Set<String> byteKeys() {
    return this.Ze.ZoC();
  }
  
  public ByteArray getByteArray(String paramString) {
    Zstu zstu = this.Ze.ZJ(paramString);
    return Zsyg.ZJ(zstu, this.Zo);
  }
  
  public void setByteArray(String paramString, ByteArray paramByteArray) {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    this.Ze.Zb(paramString, (paramByteArray != null) ? this.ZP.ZZ(paramByteArray.getBytes()) : null);
  }
  
  public void deleteByteArray(String paramString) {
    this.Ze.Zs(paramString);
  }
  
  public Set<String> byteArrayKeys() {
    return this.Ze.Zot();
  }
  
  public PersistedList<ByteArray> getByteArrayList(String paramString) {
    Zefg<Zstu> zefg = this.Ze.ZH(paramString);
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (zefg == null) ? null : new Zbor(zefg, this.ZP, this.Zo);
  }
  
  public void setByteArrayList(String paramString, PersistedList<ByteArray> paramPersistedList) {
    // Byte code:
    //   0: invokestatic Zv : ()Z
    //   3: istore_3
    //   4: aload_2
    //   5: ifnonnull -> 30
    //   8: aload_0
    //   9: getfield Ze : Lburp/Zsy_;
    //   12: aload_1
    //   13: aconst_null
    //   14: invokeinterface ZW : (Ljava/lang/String;Lburp/Zefg;)V
    //   19: iload_3
    //   20: ifne -> 114
    //   23: goto -> 30
    //   26: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   29: athrow
    //   30: aload_2
    //   31: instanceof burp/Proxyable
    //   34: ifeq -> 93
    //   37: goto -> 44
    //   40: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   43: athrow
    //   44: aload_2
    //   45: checkcast burp/Proxyable
    //   48: astore #4
    //   50: aload #4
    //   52: invokeinterface proxiedObject : ()Ljava/lang/Object;
    //   57: astore #6
    //   59: aload #6
    //   61: instanceof burp/Zbor
    //   64: ifeq -> 93
    //   67: aload #6
    //   69: checkcast burp/Zbor
    //   72: astore #5
    //   74: aload_0
    //   75: getfield Ze : Lburp/Zsy_;
    //   78: aload_1
    //   79: aload #5
    //   81: invokevirtual ZX : ()Lburp/Zefg;
    //   84: invokeinterface ZW : (Ljava/lang/String;Lburp/Zefg;)V
    //   89: iload_3
    //   90: ifne -> 114
    //   93: new java/lang/IllegalArgumentException
    //   96: dup
    //   97: sipush #23921
    //   100: sipush #4367
    //   103: invokestatic a : (II)Ljava/lang/String;
    //   106: invokespecial <init> : (Ljava/lang/String;)V
    //   109: athrow
    //   110: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   113: athrow
    //   114: return
    // Exception table:
    //   from	to	target	type
    //   4	23	26	java/lang/IllegalArgumentException
    //   8	37	40	java/lang/IllegalArgumentException
    //   74	110	110	java/lang/IllegalArgumentException
  }
  
  public void deleteByteArrayList(String paramString) {
    this.Ze.Zp(paramString);
  }
  
  public Set<String> byteArrayListKeys() {
    return this.Ze.Zoz();
  }
  
  public Short getShort(String paramString) {
    return this.Ze.ZX(paramString);
  }
  
  public void setShort(String paramString, short paramShort) {
    this.Ze.ZS(paramString, paramShort);
  }
  
  public void deleteShort(String paramString) {
    this.Ze.ZW(paramString);
  }
  
  public Set<String> shortKeys() {
    return this.Ze.ZoX();
  }
  
  public PersistedList<Short> getShortList(String paramString) {
    Zg06 zg06 = this.Ze.ZU(paramString);
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (zg06 == null) ? null : new Zkbg(zg06);
  }
  
  public void setShortList(String paramString, PersistedList<Short> paramPersistedList) {
    // Byte code:
    //   0: invokestatic Zv : ()Z
    //   3: istore_3
    //   4: aload_2
    //   5: ifnonnull -> 30
    //   8: aload_0
    //   9: getfield Ze : Lburp/Zsy_;
    //   12: aload_1
    //   13: aconst_null
    //   14: invokeinterface Zf : (Ljava/lang/String;Lburp/Zg06;)V
    //   19: iload_3
    //   20: ifne -> 114
    //   23: goto -> 30
    //   26: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   29: athrow
    //   30: aload_2
    //   31: instanceof burp/Proxyable
    //   34: ifeq -> 93
    //   37: goto -> 44
    //   40: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   43: athrow
    //   44: aload_2
    //   45: checkcast burp/Proxyable
    //   48: astore #4
    //   50: aload #4
    //   52: invokeinterface proxiedObject : ()Ljava/lang/Object;
    //   57: astore #6
    //   59: aload #6
    //   61: instanceof burp/Zkbg
    //   64: ifeq -> 93
    //   67: aload #6
    //   69: checkcast burp/Zkbg
    //   72: astore #5
    //   74: aload_0
    //   75: getfield Ze : Lburp/Zsy_;
    //   78: aload_1
    //   79: aload #5
    //   81: invokevirtual ZU : ()Lburp/Zg06;
    //   84: invokeinterface Zf : (Ljava/lang/String;Lburp/Zg06;)V
    //   89: iload_3
    //   90: ifne -> 114
    //   93: new java/lang/IllegalArgumentException
    //   96: dup
    //   97: sipush #23921
    //   100: sipush #4367
    //   103: invokestatic a : (II)Ljava/lang/String;
    //   106: invokespecial <init> : (Ljava/lang/String;)V
    //   109: athrow
    //   110: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   113: athrow
    //   114: return
    // Exception table:
    //   from	to	target	type
    //   4	23	26	java/lang/IllegalArgumentException
    //   8	37	40	java/lang/IllegalArgumentException
    //   74	110	110	java/lang/IllegalArgumentException
  }
  
  public void deleteShortList(String paramString) {
    this.Ze.ZV(paramString);
  }
  
  public Set<String> shortListKeys() {
    return this.Ze.ZoM();
  }
  
  public Integer getInteger(String paramString) {
    return this.Ze.Zk(paramString);
  }
  
  public void setInteger(String paramString, int paramInt) {
    this.Ze.Zj(paramString, paramInt);
  }
  
  public void deleteInteger(String paramString) {
    this.Ze.Zj(paramString);
  }
  
  public Set<String> integerKeys() {
    return this.Ze.ZoQ();
  }
  
  public PersistedList<Integer> getIntegerList(String paramString) {
    Zmg zmg = this.Ze.ZZ(paramString);
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (zmg == null) ? null : new Zluo(zmg);
  }
  
  public void setIntegerList(String paramString, PersistedList<Integer> paramPersistedList) {
    // Byte code:
    //   0: invokestatic Z_ : ()Z
    //   3: istore_3
    //   4: aload_2
    //   5: ifnonnull -> 30
    //   8: aload_0
    //   9: getfield Ze : Lburp/Zsy_;
    //   12: aload_1
    //   13: aconst_null
    //   14: invokeinterface Zq : (Ljava/lang/String;Lburp/Zmg;)V
    //   19: iload_3
    //   20: ifeq -> 114
    //   23: goto -> 30
    //   26: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   29: athrow
    //   30: aload_2
    //   31: instanceof burp/Proxyable
    //   34: ifeq -> 93
    //   37: goto -> 44
    //   40: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   43: athrow
    //   44: aload_2
    //   45: checkcast burp/Proxyable
    //   48: astore #4
    //   50: aload #4
    //   52: invokeinterface proxiedObject : ()Ljava/lang/Object;
    //   57: astore #6
    //   59: aload #6
    //   61: instanceof burp/Zluo
    //   64: ifeq -> 93
    //   67: aload #6
    //   69: checkcast burp/Zluo
    //   72: astore #5
    //   74: aload_0
    //   75: getfield Ze : Lburp/Zsy_;
    //   78: aload_1
    //   79: aload #5
    //   81: invokevirtual ZZ : ()Lburp/Zmg;
    //   84: invokeinterface Zq : (Ljava/lang/String;Lburp/Zmg;)V
    //   89: iload_3
    //   90: ifeq -> 114
    //   93: new java/lang/IllegalArgumentException
    //   96: dup
    //   97: sipush #23921
    //   100: sipush #4367
    //   103: invokestatic a : (II)Ljava/lang/String;
    //   106: invokespecial <init> : (Ljava/lang/String;)V
    //   109: athrow
    //   110: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   113: athrow
    //   114: return
    // Exception table:
    //   from	to	target	type
    //   4	23	26	java/lang/IllegalArgumentException
    //   8	37	40	java/lang/IllegalArgumentException
    //   74	110	110	java/lang/IllegalArgumentException
  }
  
  public void deleteIntegerList(String paramString) {
    this.Ze.Zh(paramString);
  }
  
  public Set<String> integerListKeys() {
    return this.Ze.ZoU();
  }
  
  public Long getLong(String paramString) {
    return this.Ze.ZT(paramString);
  }
  
  public void setLong(String paramString, long paramLong) {
    this.Ze.Z_(paramString, paramLong);
  }
  
  public void deleteLong(String paramString) {
    this.Ze.Zw(paramString);
  }
  
  public Set<String> longKeys() {
    return this.Ze.Zo2();
  }
  
  public PersistedList<Long> getLongList(String paramString) {
    Zxsn zxsn = this.Ze.ZM(paramString);
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (zxsn == null) ? null : new Zex1(zxsn);
  }
  
  public void setLongList(String paramString, PersistedList<Long> paramPersistedList) {
    // Byte code:
    //   0: invokestatic Z_ : ()Z
    //   3: istore_3
    //   4: aload_2
    //   5: ifnonnull -> 30
    //   8: aload_0
    //   9: getfield Ze : Lburp/Zsy_;
    //   12: aload_1
    //   13: aconst_null
    //   14: invokeinterface Zx : (Ljava/lang/String;Lburp/Zxsn;)V
    //   19: iload_3
    //   20: ifeq -> 114
    //   23: goto -> 30
    //   26: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   29: athrow
    //   30: aload_2
    //   31: instanceof burp/Proxyable
    //   34: ifeq -> 93
    //   37: goto -> 44
    //   40: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   43: athrow
    //   44: aload_2
    //   45: checkcast burp/Proxyable
    //   48: astore #4
    //   50: aload #4
    //   52: invokeinterface proxiedObject : ()Ljava/lang/Object;
    //   57: astore #6
    //   59: aload #6
    //   61: instanceof burp/Zex1
    //   64: ifeq -> 93
    //   67: aload #6
    //   69: checkcast burp/Zex1
    //   72: astore #5
    //   74: aload_0
    //   75: getfield Ze : Lburp/Zsy_;
    //   78: aload_1
    //   79: aload #5
    //   81: invokevirtual ZT : ()Lburp/Zxsn;
    //   84: invokeinterface Zx : (Ljava/lang/String;Lburp/Zxsn;)V
    //   89: iload_3
    //   90: ifeq -> 114
    //   93: new java/lang/IllegalArgumentException
    //   96: dup
    //   97: sipush #23921
    //   100: sipush #4367
    //   103: invokestatic a : (II)Ljava/lang/String;
    //   106: invokespecial <init> : (Ljava/lang/String;)V
    //   109: athrow
    //   110: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   113: athrow
    //   114: return
    // Exception table:
    //   from	to	target	type
    //   4	23	26	java/lang/IllegalArgumentException
    //   8	37	40	java/lang/IllegalArgumentException
    //   74	110	110	java/lang/IllegalArgumentException
  }
  
  public void deleteLongList(String paramString) {
    this.Ze.ZQ(paramString);
  }
  
  public Set<String> longListKeys() {
    return this.Ze.ZoW();
  }
  
  public String getString(String paramString) {
    Zsdr zsdr = this.Ze.Zb(paramString);
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (zsdr == null) ? null : zsdr.toString();
  }
  
  public void setString(String paramString1, String paramString2) {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    this.Ze.Zd(paramString1, (paramString2 != null) ? this.ZP.Zz(paramString2) : null);
  }
  
  public void deleteString(String paramString) {
    this.Ze.Zn(paramString);
  }
  
  public Set<String> stringKeys() {
    return this.Ze.Zo9();
  }
  
  public PersistedList<String> getStringList(String paramString) {
    Zefg<Zsdr> zefg = this.Ze.Zy(paramString);
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (zefg == null) ? null : new Zxgu(zefg, this.ZP);
  }
  
  public void setStringList(String paramString, PersistedList<String> paramPersistedList) {
    // Byte code:
    //   0: invokestatic Z_ : ()Z
    //   3: istore_3
    //   4: aload_2
    //   5: ifnonnull -> 30
    //   8: aload_0
    //   9: getfield Ze : Lburp/Zsy_;
    //   12: aload_1
    //   13: aconst_null
    //   14: invokeinterface Zz : (Ljava/lang/String;Lburp/Zefg;)V
    //   19: iload_3
    //   20: ifeq -> 114
    //   23: goto -> 30
    //   26: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   29: athrow
    //   30: aload_2
    //   31: instanceof burp/Proxyable
    //   34: ifeq -> 93
    //   37: goto -> 44
    //   40: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   43: athrow
    //   44: aload_2
    //   45: checkcast burp/Proxyable
    //   48: astore #4
    //   50: aload #4
    //   52: invokeinterface proxiedObject : ()Ljava/lang/Object;
    //   57: astore #6
    //   59: aload #6
    //   61: instanceof burp/Zxgu
    //   64: ifeq -> 93
    //   67: aload #6
    //   69: checkcast burp/Zxgu
    //   72: astore #5
    //   74: aload_0
    //   75: getfield Ze : Lburp/Zsy_;
    //   78: aload_1
    //   79: aload #5
    //   81: invokevirtual ZO : ()Lburp/Zefg;
    //   84: invokeinterface Zz : (Ljava/lang/String;Lburp/Zefg;)V
    //   89: iload_3
    //   90: ifeq -> 114
    //   93: new java/lang/IllegalArgumentException
    //   96: dup
    //   97: sipush #23922
    //   100: sipush #-1780
    //   103: invokestatic a : (II)Ljava/lang/String;
    //   106: invokespecial <init> : (Ljava/lang/String;)V
    //   109: athrow
    //   110: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   113: athrow
    //   114: return
    // Exception table:
    //   from	to	target	type
    //   4	23	26	java/lang/IllegalArgumentException
    //   8	37	40	java/lang/IllegalArgumentException
    //   74	110	110	java/lang/IllegalArgumentException
  }
  
  public void deleteStringList(String paramString) {
    this.Ze.ZC(paramString);
  }
  
  public Set<String> stringListKeys() {
    return this.Ze.Zoq();
  }
  
  public HttpRequest getHttpRequest(String paramString) {
    Zelu zelu = this.Ze.ZPY(paramString);
    return Zsie.Zg(zelu, this.ZG, this.Zo, this.ZI, this.Zl);
  }
  
  public void setHttpRequest(String paramString, HttpRequest paramHttpRequest) {
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    Zelu zelu = (paramHttpRequest == null) ? null : Zr2b.ZP(paramHttpRequest).ZG(this.ZP).Zx();
    this.Ze.ZD(paramString, zelu);
  }
  
  public void deleteHttpRequest(String paramString) {
    this.Ze.ZPy(paramString);
  }
  
  public Set<String> httpRequestKeys() {
    return this.Ze.Zok();
  }
  
  public PersistedList<HttpRequest> getHttpRequestList(String paramString) {
    Zefg<Zelu> zefg = this.Ze.ZS(paramString);
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (zefg == null) ? null : new Zz4w(zefg, this.ZG, this.ZP, this.Zo, this.ZI, this.Zl);
  }
  
  public void setHttpRequestList(String paramString, PersistedList<HttpRequest> paramPersistedList) {
    // Byte code:
    //   0: invokestatic Zv : ()Z
    //   3: istore_3
    //   4: aload_2
    //   5: ifnonnull -> 30
    //   8: aload_0
    //   9: getfield Ze : Lburp/Zsy_;
    //   12: aload_1
    //   13: aconst_null
    //   14: invokeinterface ZB : (Ljava/lang/String;Lburp/Zefg;)V
    //   19: iload_3
    //   20: ifne -> 114
    //   23: goto -> 30
    //   26: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   29: athrow
    //   30: aload_2
    //   31: instanceof burp/Proxyable
    //   34: ifeq -> 93
    //   37: goto -> 44
    //   40: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   43: athrow
    //   44: aload_2
    //   45: checkcast burp/Proxyable
    //   48: astore #4
    //   50: aload #4
    //   52: invokeinterface proxiedObject : ()Ljava/lang/Object;
    //   57: astore #6
    //   59: aload #6
    //   61: instanceof burp/Zz4w
    //   64: ifeq -> 93
    //   67: aload #6
    //   69: checkcast burp/Zz4w
    //   72: astore #5
    //   74: aload_0
    //   75: getfield Ze : Lburp/Zsy_;
    //   78: aload_1
    //   79: aload #5
    //   81: invokevirtual Zz : ()Lburp/Zefg;
    //   84: invokeinterface ZB : (Ljava/lang/String;Lburp/Zefg;)V
    //   89: iload_3
    //   90: ifne -> 114
    //   93: new java/lang/IllegalArgumentException
    //   96: dup
    //   97: sipush #23921
    //   100: sipush #4367
    //   103: invokestatic a : (II)Ljava/lang/String;
    //   106: invokespecial <init> : (Ljava/lang/String;)V
    //   109: athrow
    //   110: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   113: athrow
    //   114: return
    // Exception table:
    //   from	to	target	type
    //   4	23	26	java/lang/IllegalArgumentException
    //   8	37	40	java/lang/IllegalArgumentException
    //   74	110	110	java/lang/IllegalArgumentException
  }
  
  public void deleteHttpRequestList(String paramString) {
    this.Ze.Za(paramString);
  }
  
  public Set<String> httpRequestListKeys() {
    return this.Ze.Zoa();
  }
  
  public HttpResponse getHttpResponse(String paramString) {
    Zg0d zg0d = this.Ze.ZR(paramString);
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (zg0d == null) ? null : Zgtr.Zr(zg0d, this.ZG, this.Zo);
  }
  
  public void setHttpResponse(String paramString, HttpResponse paramHttpResponse) {
    this.Ze.ZK(paramString, Zm5l.Zo(paramHttpResponse, this.ZP));
  }
  
  public void deleteHttpResponse(String paramString) {
    this.Ze.Zl(paramString);
  }
  
  public Set<String> httpResponseKeys() {
    return this.Ze.Zor();
  }
  
  public PersistedList<HttpResponse> getHttpResponseList(String paramString) {
    Zefg<Zg0d> zefg = this.Ze.Zz(paramString);
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (zefg == null) ? null : new Zgmy(zefg, this.ZG, this.ZP, this.Zo);
  }
  
  public void setHttpResponseList(String paramString, PersistedList<HttpResponse> paramPersistedList) {
    // Byte code:
    //   0: invokestatic Zv : ()Z
    //   3: istore_3
    //   4: aload_2
    //   5: ifnonnull -> 30
    //   8: aload_0
    //   9: getfield Ze : Lburp/Zsy_;
    //   12: aload_1
    //   13: aconst_null
    //   14: invokeinterface Za : (Ljava/lang/String;Lburp/Zefg;)V
    //   19: iload_3
    //   20: ifne -> 114
    //   23: goto -> 30
    //   26: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   29: athrow
    //   30: aload_2
    //   31: instanceof burp/Proxyable
    //   34: ifeq -> 93
    //   37: goto -> 44
    //   40: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   43: athrow
    //   44: aload_2
    //   45: checkcast burp/Proxyable
    //   48: astore #4
    //   50: aload #4
    //   52: invokeinterface proxiedObject : ()Ljava/lang/Object;
    //   57: astore #6
    //   59: aload #6
    //   61: instanceof burp/Zgmy
    //   64: ifeq -> 93
    //   67: aload #6
    //   69: checkcast burp/Zgmy
    //   72: astore #5
    //   74: aload_0
    //   75: getfield Ze : Lburp/Zsy_;
    //   78: aload_1
    //   79: aload #5
    //   81: invokevirtual Zr : ()Lburp/Zefg;
    //   84: invokeinterface Za : (Ljava/lang/String;Lburp/Zefg;)V
    //   89: iload_3
    //   90: ifne -> 114
    //   93: new java/lang/IllegalArgumentException
    //   96: dup
    //   97: sipush #23921
    //   100: sipush #4367
    //   103: invokestatic a : (II)Ljava/lang/String;
    //   106: invokespecial <init> : (Ljava/lang/String;)V
    //   109: athrow
    //   110: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   113: athrow
    //   114: return
    // Exception table:
    //   from	to	target	type
    //   4	23	26	java/lang/IllegalArgumentException
    //   8	37	40	java/lang/IllegalArgumentException
    //   74	110	110	java/lang/IllegalArgumentException
  }
  
  public void deleteHttpResponseList(String paramString) {
    this.Ze.ZD(paramString);
  }
  
  public Set<String> httpResponseListKeys() {
    return this.Ze.Zow();
  }
  
  public HttpRequestResponse getHttpRequestResponse(String paramString) {
    Zb4i zb4i = this.Ze.Zi(paramString);
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (zb4i == null) ? null : Zx8k.ZS(zb4i, this.ZG, this.Zo, this.ZI, this.Zl);
  }
  
  public void setHttpRequestResponse(String paramString, HttpRequestResponse paramHttpRequestResponse) {
    this.Ze.ZU(paramString, Zx8k.ZQ(paramHttpRequestResponse, this.ZP));
  }
  
  public void deleteHttpRequestResponse(String paramString) {
    this.Ze.ZL(paramString);
  }
  
  public Set<String> httpRequestResponseKeys() {
    return this.Ze.ZoL();
  }
  
  public PersistedList<HttpRequestResponse> getHttpRequestResponseList(String paramString) {
    Zefg<Zb4i> zefg = this.Ze.Zo(paramString);
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (zefg == null) ? null : new Zxlt(zefg, this.ZG, this.ZP, this.Zo, this.ZI, this.Zl);
  }
  
  public void setHttpRequestResponseList(String paramString, PersistedList<HttpRequestResponse> paramPersistedList) {
    // Byte code:
    //   0: invokestatic Z_ : ()Z
    //   3: istore_3
    //   4: aload_2
    //   5: ifnonnull -> 30
    //   8: aload_0
    //   9: getfield Ze : Lburp/Zsy_;
    //   12: aload_1
    //   13: aconst_null
    //   14: invokeinterface Zh : (Ljava/lang/String;Lburp/Zefg;)V
    //   19: iload_3
    //   20: ifeq -> 114
    //   23: goto -> 30
    //   26: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   29: athrow
    //   30: aload_2
    //   31: instanceof burp/Proxyable
    //   34: ifeq -> 93
    //   37: goto -> 44
    //   40: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   43: athrow
    //   44: aload_2
    //   45: checkcast burp/Proxyable
    //   48: astore #4
    //   50: aload #4
    //   52: invokeinterface proxiedObject : ()Ljava/lang/Object;
    //   57: astore #6
    //   59: aload #6
    //   61: instanceof burp/Zxlt
    //   64: ifeq -> 93
    //   67: aload #6
    //   69: checkcast burp/Zxlt
    //   72: astore #5
    //   74: aload_0
    //   75: getfield Ze : Lburp/Zsy_;
    //   78: aload_1
    //   79: aload #5
    //   81: invokevirtual ZF : ()Lburp/Zefg;
    //   84: invokeinterface Zh : (Ljava/lang/String;Lburp/Zefg;)V
    //   89: iload_3
    //   90: ifeq -> 114
    //   93: new java/lang/IllegalArgumentException
    //   96: dup
    //   97: sipush #23921
    //   100: sipush #4367
    //   103: invokestatic a : (II)Ljava/lang/String;
    //   106: invokespecial <init> : (Ljava/lang/String;)V
    //   109: athrow
    //   110: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   113: athrow
    //   114: return
    // Exception table:
    //   from	to	target	type
    //   4	23	26	java/lang/IllegalArgumentException
    //   8	37	40	java/lang/IllegalArgumentException
    //   74	110	110	java/lang/IllegalArgumentException
  }
  
  public void deleteHttpRequestResponseList(String paramString) {
    this.Ze.ZF(paramString);
  }
  
  public Set<String> httpRequestResponseListKeys() {
    return this.Ze.ZoP();
  }
  
  public PersistedObject getChildObject(String paramString) {
    Zsy_ zsy_ = this.Ze.ZA(paramString);
    try {
    
    } catch (IllegalArgumentException illegalArgumentException) {
      throw a(null);
    } 
    return (zsy_ == null) ? null : new Zkev(zsy_, this.ZG, this.ZP, this.Zo, this.ZI, this.Zl);
  }
  
  public void setChildObject(String paramString, PersistedObject paramPersistedObject) {
    // Byte code:
    //   0: invokestatic Z_ : ()Z
    //   3: istore_3
    //   4: aload_2
    //   5: ifnonnull -> 30
    //   8: aload_0
    //   9: getfield Ze : Lburp/Zsy_;
    //   12: aload_1
    //   13: aconst_null
    //   14: invokeinterface ZJ : (Ljava/lang/String;Lburp/Zsy_;)V
    //   19: iload_3
    //   20: ifeq -> 114
    //   23: goto -> 30
    //   26: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   29: athrow
    //   30: aload_2
    //   31: instanceof burp/Proxyable
    //   34: ifeq -> 93
    //   37: goto -> 44
    //   40: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   43: athrow
    //   44: aload_2
    //   45: checkcast burp/Proxyable
    //   48: astore #4
    //   50: aload #4
    //   52: invokeinterface proxiedObject : ()Ljava/lang/Object;
    //   57: astore #6
    //   59: aload #6
    //   61: instanceof burp/Zkev
    //   64: ifeq -> 93
    //   67: aload #6
    //   69: checkcast burp/Zkev
    //   72: astore #5
    //   74: aload_0
    //   75: getfield Ze : Lburp/Zsy_;
    //   78: aload_1
    //   79: aload #5
    //   81: getfield Ze : Lburp/Zsy_;
    //   84: invokeinterface ZJ : (Ljava/lang/String;Lburp/Zsy_;)V
    //   89: iload_3
    //   90: ifeq -> 114
    //   93: new java/lang/IllegalArgumentException
    //   96: dup
    //   97: sipush #23923
    //   100: sipush #-3080
    //   103: invokestatic a : (II)Ljava/lang/String;
    //   106: invokespecial <init> : (Ljava/lang/String;)V
    //   109: athrow
    //   110: invokestatic a : (Ljava/lang/IllegalArgumentException;)Ljava/lang/IllegalArgumentException;
    //   113: athrow
    //   114: return
    // Exception table:
    //   from	to	target	type
    //   4	23	26	java/lang/IllegalArgumentException
    //   8	37	40	java/lang/IllegalArgumentException
    //   74	110	110	java/lang/IllegalArgumentException
  }
  
  public void deleteChildObject(String paramString) {
    this.Ze.ZI(paramString);
  }
  
  public Set<String> childObjectKeys() {
    return this.Ze.ZoD();
  }
  
  private static IllegalArgumentException a(IllegalArgumentException paramIllegalArgumentException) {
    return paramIllegalArgumentException;
  }
  
  static {
    // Byte code:
    //   0: iconst_3
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'zl¿wÚéG(½·î4£íôÒyJÝÓtéÎÿ Í þý¼ÊëÆôEá{Ó\\f'esænx£C¸Öz¸÷>Åf5}Á[ÍgKþ¼¹ÏÌãïº¨-ë¬ 'V[k´Ú¬¥TRtý§UÄmþ_Í>ß évû©ì½'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #50
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #24
    //   24: iinc #0, 1
    //   27: aload_2
    //   28: iload_0
    //   29: dup
    //   30: iload_1
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 82
    //   39: aload #5
    //   41: swap
    //   42: iload_3
    //   43: iinc #3, 1
    //   46: swap
    //   47: aastore
    //   48: iload_0
    //   49: iload_1
    //   50: iadd
    //   51: dup
    //   52: istore_0
    //   53: iload #4
    //   55: if_icmpge -> 67
    //   58: aload_2
    //   59: iload_0
    //   60: invokevirtual charAt : (I)C
    //   63: istore_1
    //   64: goto -> 22
    //   67: aload #5
    //   69: putstatic burp/Zkev.a : [Ljava/lang/String;
    //   72: iconst_3
    //   73: anewarray java/lang/String
    //   76: putstatic burp/Zkev.b : [Ljava/lang/String;
    //   79: goto -> 226
    //   82: dup_x2
    //   83: pop
    //   84: invokevirtual toCharArray : ()[C
    //   87: dup_x1
    //   88: arraylength
    //   89: dup_x2
    //   90: pop
    //   91: iconst_0
    //   92: istore #6
    //   94: dup2_x1
    //   95: pop2
    //   96: dup_x2
    //   97: iconst_1
    //   98: if_icmpgt -> 199
    //   101: dup2
    //   102: swap
    //   103: iload #6
    //   105: dup2_x1
    //   106: caload
    //   107: swap
    //   108: iload #6
    //   110: bipush #7
    //   112: irem
    //   113: tableswitch default -> 181, 0 -> 152, 1 -> 156, 2 -> 161, 3 -> 166, 4 -> 171, 5 -> 176
    //   152: iconst_5
    //   153: goto -> 183
    //   156: bipush #35
    //   158: goto -> 183
    //   161: bipush #71
    //   163: goto -> 183
    //   166: bipush #79
    //   168: goto -> 183
    //   171: bipush #106
    //   173: goto -> 183
    //   176: bipush #11
    //   178: goto -> 183
    //   181: bipush #75
    //   183: ixor
    //   184: ixor
    //   185: i2c
    //   186: castore
    //   187: iinc #6, 1
    //   190: dup
    //   191: ifne -> 199
    //   194: dup2
    //   195: dup_x1
    //   196: goto -> 105
    //   199: dup2_x1
    //   200: pop2
    //   201: dup_x2
    //   202: iload #6
    //   204: if_icmpgt -> 101
    //   207: pop
    //   208: new java/lang/String
    //   211: dup_x1
    //   212: swap
    //   213: invokespecial <init> : ([C)V
    //   216: invokevirtual intern : ()Ljava/lang/String;
    //   219: swap
    //   220: pop
    //   221: swap
    //   222: pop
    //   223: goto -> 39
    //   226: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x5D73) & 0xFFFF;
    if (b[i] == null) {
      char[] arrayOfChar = a[i].toCharArray();
      switch (arrayOfChar[0] & 0xFF) {
        case 0:
        
        case 1:
        
        case 2:
        
        case 3:
        
        case 4:
        
        case 5:
        
        case 6:
        
        case 7:
        
        case 8:
        
        case 9:
        
        case 10:
        
        case 11:
        
        case 12:
        
        case 13:
        
        case 14:
        
        case 15:
        
        case 16:
        
        case 17:
        
        case 18:
        
        case 19:
        
        case 20:
        
        case 21:
        
        case 22:
        
        case 23:
        
        case 24:
        
        case 25:
        
        case 26:
        
        case 27:
        
        case 28:
        
        case 29:
        
        case 30:
        
        case 31:
        
        case 32:
        
        case 33:
        
        case 34:
        
        case 35:
        
        case 36:
        
        case 37:
        
        case 38:
        
        case 39:
        
        case 40:
        
        case 41:
        
        case 42:
        
        case 43:
        
        case 44:
        
        case 45:
        
        case 46:
        
        case 47:
        
        case 48:
        
        case 49:
        
        case 50:
        
        case 51:
        
        case 52:
        
        case 53:
        
        case 54:
        
        case 55:
        
        case 56:
        
        case 57:
        
        case 58:
        
        case 59:
        
        case 60:
        
        case 61:
        
        case 62:
        
        case 63:
        
        case 64:
        
        case 65:
        
        case 66:
        
        case 67:
        
        case 68:
        
        case 69:
        
        case 70:
        
        case 71:
        
        case 72:
        
        case 73:
        
        case 74:
        
        case 75:
        
        case 76:
        
        case 77:
        
        case 78:
        
        case 79:
        
        case 80:
        
        case 81:
        
        case 82:
        
        case 83:
        
        case 84:
        
        case 85:
        
        case 86:
        
        case 87:
        
        case 88:
        
        case 89:
        
        case 90:
        
        case 91:
        
        case 92:
        
        case 93:
        
        case 94:
        
        case 95:
        
        case 96:
        
        case 97:
        
        case 98:
        
        case 99:
        
        case 100:
        
        case 101:
        
        case 102:
        
        case 103:
        
        case 104:
        
        case 105:
        
        case 106:
        
        case 107:
        
        case 108:
        
        case 109:
        
        case 110:
        
        case 111:
        
        case 112:
        
        case 113:
        
        case 114:
        
        case 115:
        
        case 116:
        
        case 117:
        
        case 118:
        
        case 119:
        
        case 120:
        
        case 121:
        
        case 122:
        
        case 123:
        
        case 124:
        
        case 125:
        
        case 126:
        
        case 127:
        
        case 128:
        
        case 129:
        
        case 130:
        
        case 131:
        
        case 132:
        
        case 133:
        
        case 134:
        
        case 135:
        
        case 136:
        
        case 137:
        
        case 138:
        
        case 139:
        
        case 140:
        
        case 141:
        
        case 142:
        
        case 143:
        
        case 144:
        
        case 145:
        
        case 146:
        
        case 147:
        
        case 148:
        
        case 149:
        
        case 150:
        
        case 151:
        
        case 152:
        
        case 153:
        
        case 154:
        
        case 155:
        
        case 156:
        
        case 157:
        
        case 158:
        
        case 159:
        
        case 160:
        
        case 161:
        
        case 162:
        
        case 163:
        
        case 164:
        
        case 165:
        
        case 166:
        
        case 167:
        
        case 168:
        
        case 169:
        
        case 170:
        
        case 171:
        
        case 172:
        
        case 173:
        
        case 174:
        
        case 175:
        
        case 176:
        
        case 177:
        
        case 178:
        
        case 179:
        
        case 180:
        
        case 181:
        
        case 182:
        
        case 183:
        
        case 184:
        
        case 185:
        
        case 186:
        
        case 187:
        
        case 188:
        
        case 189:
        
        case 190:
        
        case 191:
        
        case 192:
        
        case 193:
        
        case 194:
        
        case 195:
        
        case 196:
        
        case 197:
        
        case 198:
        
        case 199:
        
        case 200:
        
        case 201:
        
        case 202:
        
        case 203:
        
        case 204:
        
        case 205:
        
        case 206:
        
        case 207:
        
        case 208:
        
        case 209:
        
        case 210:
        
        case 211:
        
        case 212:
        
        case 213:
        
        case 214:
        
        case 215:
        
        case 216:
        
        case 217:
        
        case 218:
        
        case 219:
        
        case 220:
        
        case 221:
        
        case 222:
        
        case 223:
        
        case 224:
        
        case 225:
        
        case 226:
        
        case 227:
        
        case 228:
        
        case 229:
        
        case 230:
        
        case 231:
        
        case 232:
        
        case 233:
        
        case 234:
        
        case 235:
        
        case 236:
        
        case 237:
        
        case 238:
        
        case 239:
        
        case 240:
        
        case 241:
        
        case 242:
        
        case 243:
        
        case 244:
        
        case 245:
        
        case 246:
        
        case 247:
        
        case 248:
        
        case 249:
        
        case 250:
        
        case 251:
        
        case 252:
        
        case 253:
        
        case 254:
        
        default:
          break;
      } 
      char c = 'ê';
      int j = (paramInt2 & 0xFF) - c;
      if (j < 0)
        j += 256; 
      int k = ((paramInt2 & 0xFFFF) >>> 8) - c;
      if (k < 0)
        k += 256; 
      for (byte b = 0; b < arrayOfChar.length; b++) {
        int m = b % 2;
        if (m == 0) {
          arrayOfChar[b] = (char)(arrayOfChar[b] ^ j);
          j = ((j >>> 3 | j << 5) ^ arrayOfChar[b]) & 0xFF;
        } else {
          arrayOfChar[b] = (char)(arrayOfChar[b] ^ k);
          k = ((k >>> 3 | k << 5) ^ arrayOfChar[b]) & 0xFF;
        } 
      } 
      b[i] = (new String(arrayOfChar)).intern();
    } 
    return b[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zkev.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */