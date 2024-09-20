package burp;

import java.io.ByteArrayOutputStream;
import java.util.Comparator;
import java.util.List;
import java.util.Objects;
import javax.swing.text.BadLocationException;
import javax.swing.text.Segment;
import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zkb;

public class Zl57 extends Zl5i implements Zb65 {
  private final Zevi ZE;
  
  private final Zgb6 ZH;
  
  private final Zg7d Zf;
  
  private boolean Zs;
  
  private String Zh;
  
  private boolean Zz;
  
  private static final String[] c;
  
  private static final String[] d;
  
  public Zl57(Zvo6 paramZvo6, Zgb6 paramZgb6, Zzyl paramZzyl, Zejf paramZejf, Runnable paramRunnable) {
    super(paramZvo6, paramZgb6, paramZzyl, paramZejf);
    this.ZH = paramZgb6;
    this.ZE = new Zevi(ZtU());
    Zbqc[] arrayOfZbqc = Zl5i.ZtD();
    this.Zf = new Zg7d(paramRunnable);
    Zek6 zek6 = new Zek6();
    try {
      this.ZI.Zg(zek6);
      this.ZI.setName(b(-7203, 21593));
      this.ZI.ZM(new Zsg8(this.ZI));
      this.ZI.Zq(Zmsq.CRLF);
      Objects.requireNonNull(zek6);
      Objects.requireNonNull(this.Zf);
      ZtU().addDocumentListener(new Zmtu(zek6::Zy, this.Zf::Zp));
      if (Zbqc.Zwu() == null)
        Zl5i.Zr(new Zbqc[3]); 
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw b(null);
    } 
  }
  
  public void ZU(Zefx paramZefx, String paramString, boolean paramBoolean) {
    try {
      this.Zf.ZP();
      this.Zs = true;
      Zw(Zxch.Za(this.ZI, ZtU(), this.ZH, paramZefx.Zv(), paramZefx.ZG()));
      Zs_t zs_t = new Zs_t();
      paramZefx.Zi(zs_t);
      ZY(Zt6s.Zh(paramZefx), paramString, Zg12.Zr(paramZefx.Zw(), 0), zs_t.Zx, paramBoolean);
    } finally {
      this.Zf.ZI();
    } 
  }
  
  public void ZK(Zs68 paramZs68, String paramString, byte[] paramArrayOfbyte, int paramInt, boolean paramBoolean) {
    this.Zs = true;
    try {
      ZtU().ZH();
      Zw(Zxch.ZD(this.ZI, ZtU(), this.ZH, paramZs68));
    } finally {
      ZtU().ZD();
    } 
    ZY(paramArrayOfbyte, paramString, Zg12.Zr(paramArrayOfbyte, paramInt), paramInt, paramBoolean);
  }
  
  public void Za(byte[] paramArrayOfbyte, String paramString, boolean paramBoolean) {
    this.Zs = false;
    Zsba zsba = Zmyf.Zy(paramArrayOfbyte, 0, paramArrayOfbyte.length);
    Zw(Zxch.ZZ(this.ZI, ZtU(), this.ZH, zsba));
    ZY(paramArrayOfbyte, paramString, Zg12.Zr(paramArrayOfbyte, 0), 0, paramBoolean);
  }
  
  public void Z_(Ztof paramZtof, String paramString, byte[] paramArrayOfbyte) {
    // Byte code:
    //   0: invokestatic ZtD : ()[Lburp/Zbqc;
    //   3: astore #4
    //   5: getstatic burp/Zleq.Zl : [I
    //   8: aload_1
    //   9: invokevirtual ordinal : ()I
    //   12: iaload
    //   13: tableswitch default -> 143, 1 -> 44, 2 -> 56, 3 -> 91, 4 -> 117
    //   44: aload #4
    //   46: ifnonnull -> 161
    //   49: goto -> 56
    //   52: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   55: athrow
    //   56: aload_0
    //   57: invokevirtual ZtU : ()Lburp/Ze9f;
    //   60: new burp/Zeyf
    //   63: dup
    //   64: sipush #-7201
    //   67: sipush #22637
    //   70: invokestatic b : (II)Ljava/lang/String;
    //   73: invokespecial <init> : (Ljava/lang/String;)V
    //   76: invokevirtual ZF : (Lburp/Zmhz;)V
    //   79: aload #4
    //   81: ifnonnull -> 161
    //   84: goto -> 91
    //   87: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   90: athrow
    //   91: aload_0
    //   92: invokevirtual ZtU : ()Lburp/Ze9f;
    //   95: new burp/Zeyw
    //   98: dup
    //   99: invokespecial <init> : ()V
    //   102: invokevirtual ZF : (Lburp/Zmhz;)V
    //   105: aload #4
    //   107: ifnonnull -> 161
    //   110: goto -> 117
    //   113: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   116: athrow
    //   117: aload_0
    //   118: invokevirtual ZtU : ()Lburp/Ze9f;
    //   121: new burp/Zeyx
    //   124: dup
    //   125: invokespecial <init> : ()V
    //   128: invokevirtual ZF : (Lburp/Zmhz;)V
    //   131: aload #4
    //   133: ifnonnull -> 161
    //   136: goto -> 143
    //   139: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   142: athrow
    //   143: iconst_0
    //   144: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   147: aload_1
    //   148: invokevirtual name : ()Ljava/lang/String;
    //   151: invokestatic ZT : (ZLnet/portswigger/Zqf;Ljava/lang/String;)V
    //   154: goto -> 161
    //   157: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   160: athrow
    //   161: aload_0
    //   162: aload_3
    //   163: aload_2
    //   164: aload_3
    //   165: iconst_0
    //   166: invokestatic Zr : ([BI)Ljava/lang/String;
    //   169: iconst_0
    //   170: iconst_1
    //   171: invokevirtual ZY : ([BLjava/lang/String;Ljava/lang/String;IZ)V
    //   174: return
    // Exception table:
    //   from	to	target	type
    //   5	49	52	java/lang/IndexOutOfBoundsException
    //   44	84	87	java/lang/IndexOutOfBoundsException
    //   56	110	113	java/lang/IndexOutOfBoundsException
    //   91	136	139	java/lang/IndexOutOfBoundsException
    //   117	154	157	java/lang/IndexOutOfBoundsException
  }
  
  public void Zf(boolean paramBoolean) {
    try {
    
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw b(null);
    } 
    this.Zz = !paramBoolean;
    ZYP();
  }
  
  private void ZYP() {
    Zbqc[] arrayOfZbqc = Zl5i.ZtD();
    Zxam zxam = this.ZI.Zm();
    try {
      if (zxam != null) {
        try {
          if (this.Zz) {
            try {
              this.ZI.Zs();
              zxam.ZR();
              if (arrayOfZbqc == null) {
                zxam.ZK();
                return;
              } 
            } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
              throw b(null);
            } 
            return;
          } 
        } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
          throw b(null);
        } 
      } else {
        return;
      } 
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw b(null);
    } 
    zxam.ZK();
  }
  
  public boolean Zc(int paramInt1, int paramInt2) {
    Zbqc[] arrayOfZbqc = Zl5i.ZtD();
    try {
      Zxam zxam = this.ZI.Zm();
      if (zxam == null)
        return false; 
      int i = zxam.Zi();
      if (i == 0)
        return false; 
      int j = this.ZI.getLineOfOffset(paramInt1);
      int k = this.ZI.getLineOfOffset(paramInt2);
      byte b = 0;
      while (b < i) {
        Zxyv zxyv = zxam.Zt(b);
        if (zxyv.Zj(j, k))
          return true; 
        b++;
        if (arrayOfZbqc == null)
          break; 
      } 
    } catch (BadLocationException badLocationException) {
      Zah.Zl(badLocationException, Zk_.UNEXPECTED);
    } 
    return false;
  }
  
  private void ZY(byte[] paramArrayOfbyte, String paramString1, String paramString2, int paramInt, boolean paramBoolean) {
    this.Zh = paramString2;
    ZC(paramArrayOfbyte, paramString1, paramInt, paramBoolean);
  }
  
  private void ZC(byte[] paramArrayOfbyte, String paramString, int paramInt, boolean paramBoolean) {
    ZV(ZP(paramArrayOfbyte, paramString, this.Zh, paramInt), paramString, paramBoolean);
  }
  
  public void Zz(String paramString, boolean paramBoolean) {
    super.Zz(paramString, paramBoolean);
    ZYP();
  }
  
  public byte[] ZiD() {
    // Byte code:
    //   0: new javax/swing/text/Segment
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_1
    //   8: aload_0
    //   9: invokevirtual ZtU : ()Lburp/Ze9f;
    //   12: invokevirtual getLength : ()I
    //   15: istore_2
    //   16: new java/io/ByteArrayOutputStream
    //   19: dup
    //   20: iload_2
    //   21: invokespecial <init> : (I)V
    //   24: astore_3
    //   25: aload_0
    //   26: getfield Zs : Z
    //   29: ifeq -> 46
    //   32: aload_0
    //   33: getfield ZE : Lburp/Zevi;
    //   36: invokevirtual Zs : ()I
    //   39: goto -> 47
    //   42: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   45: athrow
    //   46: iconst_0
    //   47: istore #4
    //   49: iload #4
    //   51: iconst_m1
    //   52: if_icmpeq -> 67
    //   55: iload #4
    //   57: ifle -> 122
    //   60: goto -> 67
    //   63: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   66: athrow
    //   67: aload_0
    //   68: invokevirtual ZtU : ()Lburp/Ze9f;
    //   71: iconst_0
    //   72: iload #4
    //   74: iconst_m1
    //   75: if_icmpne -> 93
    //   78: goto -> 85
    //   81: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   84: athrow
    //   85: iload_2
    //   86: goto -> 99
    //   89: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   92: athrow
    //   93: iload #4
    //   95: iload_2
    //   96: invokestatic min : (II)I
    //   99: aload_1
    //   100: invokevirtual getText : (IILjavax/swing/text/Segment;)V
    //   103: aload_1
    //   104: invokevirtual toString : ()Ljava/lang/String;
    //   107: invokestatic Zy : (Ljava/lang/String;)[B
    //   110: astore #5
    //   112: aload_3
    //   113: aload #5
    //   115: iconst_0
    //   116: aload #5
    //   118: arraylength
    //   119: invokevirtual write : ([BII)V
    //   122: iload #4
    //   124: iconst_m1
    //   125: if_icmpeq -> 175
    //   128: iload #4
    //   130: iload_2
    //   131: if_icmpge -> 175
    //   134: goto -> 141
    //   137: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   140: athrow
    //   141: aload_0
    //   142: invokevirtual ZtU : ()Lburp/Ze9f;
    //   145: iload #4
    //   147: iload_2
    //   148: iload #4
    //   150: isub
    //   151: aload_1
    //   152: invokevirtual getText : (IILjavax/swing/text/Segment;)V
    //   155: aload_0
    //   156: aload_1
    //   157: invokevirtual toString : ()Ljava/lang/String;
    //   160: invokevirtual Zm : (Ljava/lang/String;)[B
    //   163: astore #5
    //   165: aload_3
    //   166: aload #5
    //   168: iconst_0
    //   169: aload #5
    //   171: arraylength
    //   172: invokevirtual write : ([BII)V
    //   175: aload_3
    //   176: invokevirtual toByteArray : ()[B
    //   179: areturn
    //   180: astore_3
    //   181: aload_3
    //   182: getstatic net/portswigger/Zk_.COMMON_RUNTIME_FAILURE : Lnet/portswigger/Zk_;
    //   185: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   188: iconst_0
    //   189: newarray byte
    //   191: areturn
    // Exception table:
    //   from	to	target	type
    //   16	179	180	javax/swing/text/BadLocationException
    //   25	42	42	javax/swing/text/BadLocationException
    //   49	60	63	javax/swing/text/BadLocationException
    //   55	78	81	javax/swing/text/BadLocationException
    //   67	89	89	javax/swing/text/BadLocationException
    //   122	134	137	javax/swing/text/BadLocationException
  }
  
  private byte[] Zm(String paramString) {
    byte[] arrayOfByte = Zg12.ZB(paramString, Ziz());
    try {
      if (b(-7204, 19596).equals(this.Zh))
        return Zg12.ZR(arrayOfByte); 
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw b(null);
    } 
    return arrayOfByte;
  }
  
  public int[] Zm() {
    int i = this.ZI.getSelectionStart();
    int j = this.ZI.getSelectionEnd();
    try {
    
    } catch (BadLocationException badLocationException) {
      throw b(null);
    } 
    boolean bool = this.Zs ? this.ZE.Zs() : false;
    try {
      int k = ZY(i, bool);
      int m = ZY(j, bool);
      return new int[] { k, m };
    } catch (BadLocationException badLocationException) {
      Zah.Zl(badLocationException, Zk_.UNEXPECTED);
      return new int[] { 0, 0 };
    } 
  }
  
  private int ZY(int paramInt1, int paramInt2) throws BadLocationException {
    try {
      if (paramInt2 != -1)
        try {
          if (paramInt1 > paramInt2) {
            String str = ZtU().getText(paramInt2, paramInt1 - paramInt2);
            return paramInt2 + (Zm(str)).length;
          } 
          return paramInt1;
        } catch (BadLocationException badLocationException) {
          throw b(null);
        }  
    } catch (BadLocationException badLocationException) {
      throw b(null);
    } 
    return paramInt1;
  }
  
  public byte[] ZiS() {
    try {
      if (!Zid())
        return null; 
    } catch (BadLocationException badLocationException) {
      throw b(null);
    } 
    int i = this.ZI.getSelectionStart();
    int j = this.ZI.getSelectionEnd();
    int k = j - i;
    try {
    
    } catch (BadLocationException badLocationException) {
      throw b(null);
    } 
    boolean bool = this.Zs ? this.ZE.Zs() : false;
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(k);
    try {
      ZS(i, j, bool, byteArrayOutputStream);
      ZW(i, j, bool, byteArrayOutputStream);
      return byteArrayOutputStream.toByteArray();
    } catch (BadLocationException badLocationException) {
      Zah.Zl(badLocationException, Zk_.UNEXPECTED);
      return new byte[0];
    } 
  }
  
  private void ZS(int paramInt1, int paramInt2, int paramInt3, ByteArrayOutputStream paramByteArrayOutputStream) throws BadLocationException {
    try {
      if (paramInt3 < 0 || paramInt1 < paramInt3) {
        Segment segment = new Segment();
        int i = paramInt2 - paramInt1;
        try {
        
        } catch (BadLocationException badLocationException) {
          throw b(null);
        } 
        int j = (paramInt3 == -1) ? i : Math.min(paramInt3 - paramInt1, i);
        ZtU().getText(paramInt1, j, segment);
        byte[] arrayOfByte = Zkb.Zy(segment.toString());
        paramByteArrayOutputStream.write(arrayOfByte, 0, arrayOfByte.length);
      } 
    } catch (BadLocationException badLocationException) {
      throw b(null);
    } 
  }
  
  private void ZW(int paramInt1, int paramInt2, int paramInt3, ByteArrayOutputStream paramByteArrayOutputStream) throws BadLocationException {
    try {
      if (paramInt3 != -1 && paramInt3 < paramInt2) {
        Segment segment = new Segment();
        int i = Math.max(paramInt1, paramInt3);
        ZtU().getText(i, paramInt2 - i, segment);
        byte[] arrayOfByte = Zm(segment.toString());
        if (paramInt1 > paramInt3)
          arrayOfByte = Zg12.ZT(arrayOfByte); 
        paramByteArrayOutputStream.write(arrayOfByte, 0, arrayOfByte.length);
      } 
    } catch (BadLocationException badLocationException) {
      throw b(null);
    } 
  }
  
  public void ZY(byte[] paramArrayOfbyte) {
    // Byte code:
    //   0: invokestatic ZtD : ()[Lburp/Zbqc;
    //   3: astore_2
    //   4: aload_1
    //   5: ifnonnull -> 14
    //   8: aconst_null
    //   9: astore_3
    //   10: aload_2
    //   11: ifnonnull -> 70
    //   14: aload_0
    //   15: getfield Zs : Z
    //   18: ifeq -> 61
    //   21: goto -> 28
    //   24: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   27: athrow
    //   28: aload_0
    //   29: getfield ZE : Lburp/Zevi;
    //   32: aload_0
    //   33: getfield ZI : Lburp/Zmgn;
    //   36: invokevirtual getSelectionStart : ()I
    //   39: invokevirtual ZH : (I)Z
    //   42: ifeq -> 61
    //   45: goto -> 52
    //   48: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   51: athrow
    //   52: aload_1
    //   53: invokestatic ZG : ([B)Ljava/lang/String;
    //   56: astore_3
    //   57: aload_2
    //   58: ifnonnull -> 70
    //   61: aload_1
    //   62: aload_0
    //   63: invokevirtual Ziz : ()Ljava/lang/String;
    //   66: invokestatic ZI : ([BLjava/lang/String;)Ljava/lang/String;
    //   69: astore_3
    //   70: aload_0
    //   71: aload_3
    //   72: invokevirtual ZC : (Ljava/lang/String;)V
    //   75: return
    // Exception table:
    //   from	to	target	type
    //   10	21	24	java/lang/IndexOutOfBoundsException
    //   14	45	48	java/lang/IndexOutOfBoundsException
  }
  
  private static String ZP(byte[] paramArrayOfbyte, String paramString1, String paramString2, int paramInt) {
    return Zo(paramArrayOfbyte, paramString1, paramString2, paramInt, 0, paramArrayOfbyte.length);
  }
  
  private static String Zo(byte[] paramArrayOfbyte, String paramString1, String paramString2, int paramInt1, int paramInt2, int paramInt3) {
    // Byte code:
    //   0: invokestatic ZtD : ()[Lburp/Zbqc;
    //   3: astore #6
    //   5: aload_0
    //   6: ifnull -> 21
    //   9: iload #5
    //   11: ifne -> 28
    //   14: goto -> 21
    //   17: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   20: athrow
    //   21: ldc ''
    //   23: areturn
    //   24: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   27: athrow
    //   28: iload #5
    //   30: aload_0
    //   31: arraylength
    //   32: invokestatic min : (II)I
    //   35: istore #5
    //   37: new java/lang/StringBuilder
    //   40: dup
    //   41: invokespecial <init> : ()V
    //   44: astore #7
    //   46: iload_3
    //   47: iconst_m1
    //   48: if_icmpeq -> 75
    //   51: iload_3
    //   52: ifle -> 116
    //   55: goto -> 62
    //   58: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   61: athrow
    //   62: iload #4
    //   64: iload_3
    //   65: if_icmpge -> 116
    //   68: goto -> 75
    //   71: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   74: athrow
    //   75: aload #7
    //   77: aload_0
    //   78: iload #4
    //   80: iload_3
    //   81: ifle -> 99
    //   84: goto -> 91
    //   87: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   90: athrow
    //   91: iload_3
    //   92: goto -> 101
    //   95: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   98: athrow
    //   99: iload #5
    //   101: iload #5
    //   103: invokestatic min : (II)I
    //   106: iload #4
    //   108: isub
    //   109: invokestatic Zo : ([BII)Ljava/lang/String;
    //   112: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   115: pop
    //   116: iload_3
    //   117: iconst_m1
    //   118: if_icmpeq -> 239
    //   121: iload_3
    //   122: iload #5
    //   124: if_icmpge -> 239
    //   127: goto -> 134
    //   130: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   133: athrow
    //   134: sipush #-7202
    //   137: sipush #-21222
    //   140: invokestatic b : (II)Ljava/lang/String;
    //   143: aload_2
    //   144: invokevirtual equals : (Ljava/lang/Object;)Z
    //   147: ifeq -> 167
    //   150: goto -> 157
    //   153: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   156: athrow
    //   157: iinc #3, 3
    //   160: goto -> 167
    //   163: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   166: athrow
    //   167: iload #5
    //   169: iload_3
    //   170: if_icmple -> 239
    //   173: iload_3
    //   174: iload #4
    //   176: if_icmplt -> 214
    //   179: goto -> 186
    //   182: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   185: athrow
    //   186: aload #7
    //   188: aload_0
    //   189: iload_3
    //   190: iload #5
    //   192: iload_3
    //   193: isub
    //   194: aload_1
    //   195: invokestatic Zh : ([BIILjava/lang/String;)Ljava/lang/String;
    //   198: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   201: pop
    //   202: aload #6
    //   204: ifnonnull -> 239
    //   207: goto -> 214
    //   210: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   213: athrow
    //   214: aload #7
    //   216: aload_0
    //   217: iload #4
    //   219: iload #5
    //   221: iload #4
    //   223: isub
    //   224: aload_1
    //   225: invokestatic Zh : ([BIILjava/lang/String;)Ljava/lang/String;
    //   228: invokevirtual append : (Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   231: pop
    //   232: goto -> 239
    //   235: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   238: athrow
    //   239: aload #7
    //   241: invokevirtual toString : ()Ljava/lang/String;
    //   244: areturn
    // Exception table:
    //   from	to	target	type
    //   5	14	17	java/lang/IndexOutOfBoundsException
    //   9	24	24	java/lang/IndexOutOfBoundsException
    //   46	55	58	java/lang/IndexOutOfBoundsException
    //   51	68	71	java/lang/IndexOutOfBoundsException
    //   62	84	87	java/lang/IndexOutOfBoundsException
    //   75	95	95	java/lang/IndexOutOfBoundsException
    //   116	127	130	java/lang/IndexOutOfBoundsException
    //   121	150	153	java/lang/IndexOutOfBoundsException
    //   134	160	163	java/lang/IndexOutOfBoundsException
    //   167	179	182	java/lang/IndexOutOfBoundsException
    //   173	207	210	java/lang/IndexOutOfBoundsException
    //   186	232	235	java/lang/IndexOutOfBoundsException
  }
  
  protected void Ztx() {
    // Byte code:
    //   0: new java/util/ArrayList
    //   3: dup
    //   4: aload_0
    //   5: getfield Zt : Lburp/Zejf;
    //   8: invokeinterface Zd : ()Ljava/util/List;
    //   13: invokespecial <init> : (Ljava/util/Collection;)V
    //   16: astore_2
    //   17: aload_2
    //   18: <illegal opcode> applyAsInt : ()Ljava/util/function/ToIntFunction;
    //   23: invokestatic comparingInt : (Ljava/util/function/ToIntFunction;)Ljava/util/Comparator;
    //   26: invokeinterface sort : (Ljava/util/Comparator;)V
    //   31: aload_0
    //   32: invokevirtual ZiD : ()[B
    //   35: astore_3
    //   36: aload_0
    //   37: getfield ZE : Lburp/Zevi;
    //   40: invokevirtual Zs : ()I
    //   43: istore #4
    //   45: aload_0
    //   46: invokevirtual Zi1 : ()I
    //   49: istore #5
    //   51: new java/util/ArrayList
    //   54: dup
    //   55: invokespecial <init> : ()V
    //   58: astore #6
    //   60: invokestatic ZtD : ()[Lburp/Zbqc;
    //   63: iconst_0
    //   64: istore #7
    //   66: astore_1
    //   67: iconst_0
    //   68: istore #8
    //   70: aload_2
    //   71: invokeinterface iterator : ()Ljava/util/Iterator;
    //   76: astore #9
    //   78: aload #9
    //   80: invokeinterface hasNext : ()Z
    //   85: ifeq -> 344
    //   88: aload #9
    //   90: invokeinterface next : ()Ljava/lang/Object;
    //   95: checkcast burp/Zkv5
    //   98: astore #10
    //   100: aload #10
    //   102: invokeinterface startOffset : ()I
    //   107: istore #11
    //   109: aload #10
    //   111: invokeinterface endOffset : ()I
    //   116: istore #12
    //   118: iload #11
    //   120: iflt -> 340
    //   123: iload #11
    //   125: iload #12
    //   127: if_icmpge -> 340
    //   130: goto -> 137
    //   133: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   136: athrow
    //   137: aload #10
    //   139: invokeinterface ZO7 : ()Z
    //   144: ifeq -> 201
    //   147: goto -> 154
    //   150: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   153: athrow
    //   154: aload #10
    //   156: invokeinterface endOffset : ()I
    //   161: iload #5
    //   163: if_icmpgt -> 201
    //   166: goto -> 173
    //   169: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   172: athrow
    //   173: aload #6
    //   175: new burp/Zgt5
    //   178: dup
    //   179: aload #10
    //   181: invokespecial <init> : (Lburp/Zkv5;)V
    //   184: invokeinterface add : (Ljava/lang/Object;)Z
    //   189: pop
    //   190: aload_1
    //   191: ifnonnull -> 340
    //   194: goto -> 201
    //   197: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   200: athrow
    //   201: aload #10
    //   203: invokeinterface ZO7 : ()Z
    //   208: ifne -> 340
    //   211: goto -> 218
    //   214: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   217: athrow
    //   218: iload #12
    //   220: aload_3
    //   221: arraylength
    //   222: if_icmpgt -> 340
    //   225: goto -> 232
    //   228: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   231: athrow
    //   232: aload_3
    //   233: aload_0
    //   234: invokevirtual Ziz : ()Ljava/lang/String;
    //   237: aload_0
    //   238: getfield Zh : Ljava/lang/String;
    //   241: iload #4
    //   243: iload #7
    //   245: iload #11
    //   247: invokestatic Zo : ([BLjava/lang/String;Ljava/lang/String;III)Ljava/lang/String;
    //   250: invokevirtual length : ()I
    //   253: istore #13
    //   255: iload #8
    //   257: iload #13
    //   259: iadd
    //   260: istore #8
    //   262: iload #11
    //   264: istore #7
    //   266: iload #8
    //   268: istore #11
    //   270: aload_3
    //   271: aload_0
    //   272: invokevirtual Ziz : ()Ljava/lang/String;
    //   275: aload_0
    //   276: getfield Zh : Ljava/lang/String;
    //   279: iload #4
    //   281: iload #7
    //   283: iload #12
    //   285: invokestatic Zo : ([BLjava/lang/String;Ljava/lang/String;III)Ljava/lang/String;
    //   288: invokevirtual length : ()I
    //   291: istore #14
    //   293: iload #8
    //   295: iload #14
    //   297: iadd
    //   298: istore #12
    //   300: iload #11
    //   302: iload #12
    //   304: if_icmpge -> 340
    //   307: aload #6
    //   309: new burp/Zgt5
    //   312: dup
    //   313: iload #11
    //   315: iload #12
    //   317: iload #5
    //   319: invokestatic min : (II)I
    //   322: aload #10
    //   324: invokespecial <init> : (IILburp/Zkv5;)V
    //   327: invokeinterface add : (Ljava/lang/Object;)Z
    //   332: pop
    //   333: goto -> 340
    //   336: invokestatic b : (Ljava/lang/Exception;)Ljava/lang/Exception;
    //   339: athrow
    //   340: aload_1
    //   341: ifnonnull -> 78
    //   344: aload_0
    //   345: aload #6
    //   347: invokevirtual Zx : (Ljava/util/List;)V
    //   350: return
    // Exception table:
    //   from	to	target	type
    //   118	130	133	java/lang/IndexOutOfBoundsException
    //   123	147	150	java/lang/IndexOutOfBoundsException
    //   137	166	169	java/lang/IndexOutOfBoundsException
    //   154	194	197	java/lang/IndexOutOfBoundsException
    //   173	211	214	java/lang/IndexOutOfBoundsException
    //   201	225	228	java/lang/IndexOutOfBoundsException
    //   300	333	336	java/lang/IndexOutOfBoundsException
  }
  
  private void Zx(List<Zgt5> paramList) {
    Zxrf zxrf = (Zxrf)this.ZI.getHighlighter();
    zxrf.Zl();
    paramList.sort(Comparator.<Zgt5>comparingInt(Zkv5::ZOl).reversed());
    zxrf.ZK((List)paramList);
  }
  
  public int ZC(int paramInt) {
    byte[] arrayOfByte = ZiD();
    try {
      if (paramInt >= 0)
        try {
          if (paramInt <= arrayOfByte.length) {
            int i = this.ZE.Zs();
            return Zo(arrayOfByte, Ziz(), this.Zh, i, 0, paramInt).length();
          } 
          throw new IndexOutOfBoundsException();
        } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
          throw b(null);
        }  
    } catch (IndexOutOfBoundsException indexOutOfBoundsException) {
      throw b(null);
    } 
    throw new IndexOutOfBoundsException();
  }
  
  public int Zl(int paramInt) {
    try {
      int i = this.ZE.Zs();
      return ZY(paramInt, i);
    } catch (BadLocationException badLocationException) {
      Zah.Zl(badLocationException, Zk_.RETHROWN);
      throw new IndexOutOfBoundsException(Integer.toString(paramInt));
    } 
  }
  
  private static Exception b(Exception paramException) {
    return paramException;
  }
  
  static {
    // Byte code:
    //   0: iconst_4
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'ÿ+ì¼i5ï0=¥×4'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: iconst_5
    //   18: istore_1
    //   19: iconst_m1
    //   20: istore_0
    //   21: bipush #35
    //   23: iinc #0, 1
    //   26: aload_2
    //   27: iload_0
    //   28: dup
    //   29: iload_1
    //   30: iadd
    //   31: invokevirtual substring : (II)Ljava/lang/String;
    //   34: iconst_m1
    //   35: goto -> 139
    //   38: aload #5
    //   40: swap
    //   41: iload_3
    //   42: iinc #3, 1
    //   45: swap
    //   46: aastore
    //   47: iload_0
    //   48: iload_1
    //   49: iadd
    //   50: dup
    //   51: istore_0
    //   52: iload #4
    //   54: if_icmpge -> 66
    //   57: aload_2
    //   58: iload_0
    //   59: invokevirtual charAt : (I)C
    //   62: istore_1
    //   63: goto -> 21
    //   66: ldc '(-­m\\tt^:èõ'
    //   68: dup
    //   69: astore_2
    //   70: invokevirtual length : ()I
    //   73: istore #4
    //   75: iconst_5
    //   76: istore_1
    //   77: iconst_m1
    //   78: istore_0
    //   79: bipush #107
    //   81: iinc #0, 1
    //   84: aload_2
    //   85: iload_0
    //   86: dup
    //   87: iload_1
    //   88: iadd
    //   89: invokevirtual substring : (II)Ljava/lang/String;
    //   92: iconst_0
    //   93: goto -> 139
    //   96: aload #5
    //   98: swap
    //   99: iload_3
    //   100: iinc #3, 1
    //   103: swap
    //   104: aastore
    //   105: iload_0
    //   106: iload_1
    //   107: iadd
    //   108: dup
    //   109: istore_0
    //   110: iload #4
    //   112: if_icmpge -> 124
    //   115: aload_2
    //   116: iload_0
    //   117: invokevirtual charAt : (I)C
    //   120: istore_1
    //   121: goto -> 79
    //   124: aload #5
    //   126: putstatic burp/Zl57.c : [Ljava/lang/String;
    //   129: iconst_4
    //   130: anewarray java/lang/String
    //   133: putstatic burp/Zl57.d : [Ljava/lang/String;
    //   136: goto -> 296
    //   139: dup_x2
    //   140: pop
    //   141: invokevirtual toCharArray : ()[C
    //   144: dup_x1
    //   145: arraylength
    //   146: dup_x2
    //   147: pop
    //   148: iconst_0
    //   149: istore #6
    //   151: dup2_x1
    //   152: pop2
    //   153: dup_x2
    //   154: iconst_1
    //   155: if_icmpgt -> 256
    //   158: dup2
    //   159: swap
    //   160: iload #6
    //   162: dup2_x1
    //   163: caload
    //   164: swap
    //   165: iload #6
    //   167: bipush #7
    //   169: irem
    //   170: tableswitch default -> 238, 0 -> 208, 1 -> 213, 2 -> 218, 3 -> 223, 4 -> 228, 5 -> 233
    //   208: bipush #117
    //   210: goto -> 240
    //   213: bipush #89
    //   215: goto -> 240
    //   218: bipush #57
    //   220: goto -> 240
    //   223: bipush #97
    //   225: goto -> 240
    //   228: bipush #95
    //   230: goto -> 240
    //   233: bipush #23
    //   235: goto -> 240
    //   238: bipush #113
    //   240: ixor
    //   241: ixor
    //   242: i2c
    //   243: castore
    //   244: iinc #6, 1
    //   247: dup
    //   248: ifne -> 256
    //   251: dup2
    //   252: dup_x1
    //   253: goto -> 162
    //   256: dup2_x1
    //   257: pop2
    //   258: dup_x2
    //   259: iload #6
    //   261: if_icmpgt -> 158
    //   264: pop
    //   265: new java/lang/String
    //   268: dup_x1
    //   269: swap
    //   270: invokespecial <init> : ([C)V
    //   273: invokevirtual intern : ()Ljava/lang/String;
    //   276: swap
    //   277: pop
    //   278: swap
    //   279: tableswitch default -> 38, 0 -> 96
    //   296: return
  }
  
  private static String b(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0xFFFFE3DC) & 0xFFFF;
    if (d[i] == null) {
      char[] arrayOfChar = c[i].toCharArray();
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
      char c = 'Ì';
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
      d[i] = (new String(arrayOfChar)).intern();
    } 
    return d[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl57.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */