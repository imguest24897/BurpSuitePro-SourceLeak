package burp;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.event.MouseEvent;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;
import net.portswigger.Zkb;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

class Zth5 extends Zthr implements Zzmn {
  private static final Zsmh ZX;
  
  private final Zbdf Zj;
  
  private final Ztu1 ZS;
  
  private final Zlqe Zw;
  
  private final Zbkv Zk;
  
  private final Zbc5 ZT;
  
  private Zsmh ZU;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zth5(Zgb6 paramZgb6, Zb0h paramZb0h, Ztwv paramZtwv, Zbdf paramZbdf, Zgty paramZgty, Zgtp paramZgtp, Zlul paramZlul, boolean paramBoolean, Zey9 paramZey9, Zt22 paramZt22, Zghz paramZghz) {
    super(paramZey9);
    this.Zj = paramZbdf;
    this.ZU = null;
    this.ZS = new Ztu1(paramZgty);
    this.Z_ = true;
    this.Zn = paramBoolean;
    Objects.requireNonNull(paramZbdf);
    this.Zk = new Zbkv(paramBoolean, paramZgb6, paramZb0h, paramZtwv, paramZt22, paramZghz, paramZbdf::Zh);
    this.Zk.Zl(!paramBoolean);
    this.Zk.addMouseListener(paramZbdf);
    this.Zk.Zv(new Zxl(this.ZS));
    this.Zw = new Zlqe(this.Zk, paramZgtp);
    this.Zk.Z_(this.Zw);
    this.ZT = paramZlul.Za();
    Zbqc zbqc = new Zbqc(new BorderLayout());
    zbqc.add(this.ZT, a(11795, -15354));
    zbqc.add(this.Zk, a(11792, 16233));
    this.ZM = zbqc;
  }
  
  public Zsmh Zb() {
    Zsmh zsmh = this.ZU;
    try {
      if (zsmh != null)
        return zsmh; 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    try {
      if (this.Zk.Ze())
        Ze(this.Zk.ZF()); 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    return this.Zg;
  }
  
  public void Zs(Zefx paramZefx, boolean paramBoolean) {
    Zt(paramZefx, paramBoolean, true);
  }
  
  public void ZC(Zefx paramZefx, boolean paramBoolean1, boolean paramBoolean2) {
    Zt(paramZefx, paramBoolean2, paramBoolean1);
  }
  
  private void Zt(Zefx paramZefx, boolean paramBoolean1, boolean paramBoolean2) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: getstatic burp/Zgu3.HTTP_REQUEST : Lburp/Zgu3;
    //   5: aload_0
    //   6: aload_1
    //   7: iload_2
    //   8: <illegal opcode> accept : (Lburp/Zth5;Lburp/Zefx;Z)Ljava/util/function/Consumer;
    //   13: invokevirtual Zp : (Lburp/Zsmh;Lburp/Zgu3;Ljava/util/function/Consumer;)V
    //   16: iload_3
    //   17: ifeq -> 37
    //   20: aload_0
    //   21: getfield ZS : Lburp/Ztu1;
    //   24: getstatic burp/Zgu3.HTTP_REQUEST : Lburp/Zgu3;
    //   27: invokevirtual Zj : (Lburp/Zgu3;)V
    //   30: goto -> 37
    //   33: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   36: athrow
    //   37: aload_1
    //   38: aload_0
    //   39: getfield ZT : Lburp/Zbc5;
    //   42: invokeinterface Zi : (Lburp/Zg5o;)V
    //   47: new burp/Zm1b
    //   50: dup
    //   51: invokespecial <init> : ()V
    //   54: astore #4
    //   56: aload_1
    //   57: aload #4
    //   59: invokeinterface Zi : (Lburp/Zg5o;)V
    //   64: aload_0
    //   65: getfield Zj : Lburp/Zbdf;
    //   68: aload #4
    //   70: getfield Zz : Z
    //   73: ifne -> 84
    //   76: iconst_1
    //   77: goto -> 85
    //   80: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   83: athrow
    //   84: iconst_0
    //   85: invokevirtual Zt : (Z)V
    //   88: return
    // Exception table:
    //   from	to	target	type
    //   0	30	33	java/lang/UnsupportedOperationException
    //   56	80	80	java/lang/UnsupportedOperationException
  }
  
  public void Zy(Zsmh paramZsmh, Zs68 paramZs68, boolean paramBoolean) {
    ZW(paramZsmh, paramZs68, true);
  }
  
  public void Za(Zsmh paramZsmh, Zs68 paramZs68, boolean paramBoolean) {
    ZW(paramZsmh, paramZs68, paramBoolean);
  }
  
  private void ZW(Zsmh paramZsmh, Zs68 paramZs68, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZT : Lburp/Zbc5;
    //   4: iconst_0
    //   5: invokevirtual setVisible : (Z)V
    //   8: aload_0
    //   9: aload_1
    //   10: getstatic burp/Zgu3.HTTP_RESPONSE : Lburp/Zgu3;
    //   13: aload_0
    //   14: aload_2
    //   15: <illegal opcode> accept : (Lburp/Zth5;Lburp/Zs68;)Ljava/util/function/Consumer;
    //   20: invokevirtual Zp : (Lburp/Zsmh;Lburp/Zgu3;Ljava/util/function/Consumer;)V
    //   23: iload_3
    //   24: ifeq -> 44
    //   27: aload_0
    //   28: getfield ZS : Lburp/Ztu1;
    //   31: getstatic burp/Zgu3.HTTP_RESPONSE : Lburp/Zgu3;
    //   34: invokevirtual Zj : (Lburp/Zgu3;)V
    //   37: goto -> 44
    //   40: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   43: athrow
    //   44: return
    // Exception table:
    //   from	to	target	type
    //   0	37	40	java/lang/UnsupportedOperationException
  }
  
  public void Za(Zsmh paramZsmh, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: getstatic burp/Zgu3.WS_MESSAGE : Lburp/Zgu3;
    //   5: aload_0
    //   6: aload_1
    //   7: <illegal opcode> accept : (Lburp/Zth5;Lburp/Zsmh;)Ljava/util/function/Consumer;
    //   12: invokevirtual Zp : (Lburp/Zsmh;Lburp/Zgu3;Ljava/util/function/Consumer;)V
    //   15: aload_0
    //   16: getfield ZS : Lburp/Ztu1;
    //   19: getstatic burp/Zgu3.WS_MESSAGE : Lburp/Zgu3;
    //   22: invokevirtual Zj : (Lburp/Zgu3;)V
    //   25: return
  }
  
  private void Zp(Zsmh paramZsmh, Zgu3 paramZgu3, Consumer<Zsmh> paramConsumer) {
    // Byte code:
    //   0: invokestatic ZM : ()[I
    //   3: astore #4
    //   5: aload_0
    //   6: getfield ZU : Lburp/Zsmh;
    //   9: astore #5
    //   11: aload #5
    //   13: ifnull -> 34
    //   16: aload #5
    //   18: aload_1
    //   19: if_acmpne -> 34
    //   22: goto -> 29
    //   25: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   28: athrow
    //   29: return
    //   30: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   33: athrow
    //   34: aload_1
    //   35: invokestatic ZT : (Lburp/Zsmh;)Z
    //   38: ifeq -> 74
    //   41: aload_0
    //   42: getfield Zk : Lburp/Zbkv;
    //   45: iconst_0
    //   46: invokevirtual Zc : (Z)V
    //   49: aload_0
    //   50: aload_1
    //   51: putfield ZU : Lburp/Zsmh;
    //   54: aload_0
    //   55: aload_0
    //   56: invokevirtual ZC : ()Lburp/Zsmh;
    //   59: putfield Zg : Lburp/Zsmh;
    //   62: aload #4
    //   64: ifnull -> 102
    //   67: goto -> 74
    //   70: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   73: athrow
    //   74: aload_0
    //   75: getfield Zk : Lburp/Zbkv;
    //   78: aload_0
    //   79: getfield Zn : Z
    //   82: invokevirtual Zc : (Z)V
    //   85: aload_0
    //   86: aconst_null
    //   87: putfield ZU : Lburp/Zsmh;
    //   90: aload_0
    //   91: aload_1
    //   92: putfield Zg : Lburp/Zsmh;
    //   95: goto -> 102
    //   98: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   101: athrow
    //   102: aload_0
    //   103: getfield Zk : Lburp/Zbkv;
    //   106: iconst_1
    //   107: invokevirtual setEnabled : (Z)V
    //   110: aload_0
    //   111: getfield ZS : Lburp/Ztu1;
    //   114: invokevirtual Zs : ()V
    //   117: aload_1
    //   118: ifnull -> 146
    //   121: aload_0
    //   122: getfield Zw : Lburp/Zlqe;
    //   125: aload_2
    //   126: invokevirtual Zp : (Lburp/Zgu3;)V
    //   129: aload_3
    //   130: aload_0
    //   131: getfield Zg : Lburp/Zsmh;
    //   134: invokeinterface accept : (Ljava/lang/Object;)V
    //   139: goto -> 146
    //   142: invokestatic a : (Ljava/lang/UnsupportedOperationException;)Ljava/lang/UnsupportedOperationException;
    //   145: athrow
    //   146: aload_0
    //   147: getfield ZS : Lburp/Ztu1;
    //   150: invokevirtual ZY : ()V
    //   153: return
    // Exception table:
    //   from	to	target	type
    //   11	22	25	java/lang/UnsupportedOperationException
    //   16	30	30	java/lang/UnsupportedOperationException
    //   34	67	70	java/lang/UnsupportedOperationException
    //   41	95	98	java/lang/UnsupportedOperationException
    //   102	139	142	java/lang/UnsupportedOperationException
  }
  
  private Zsmh ZC() {
    try {
      if (this.Zg == null)
        return ZX; 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    Zlvq zlvq = new Zlvq(this.Zd);
    this.Zg.Zh(zlvq);
    return zlvq.Zb;
  }
  
  public void ZN(int paramInt1, int paramInt2, byte[] paramArrayOfbyte) {
    this.ZS.Zs();
    this.Zk.Zs(paramArrayOfbyte, paramInt1, paramInt2);
    this.ZS.ZY();
  }
  
  public void ZV(int paramInt1, int paramInt2, String paramString) {
    this.Zk.ZA(paramString, paramInt1, paramInt2);
  }
  
  public void Zx() {
    this.Zg = Zsmh.Zy;
    this.ZS.Zs();
    this.Zk.Zc(false);
    this.Zk.setEnabled(false);
    this.Zk.Zx(Zt6s.Zu(Zsmh.Zy));
    this.ZS.ZY();
    this.ZS.ZU();
  }
  
  public boolean ZR() {
    return this.Zk.Ze();
  }
  
  void Zc(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    this.Zk.setEnabled(true);
    this.Zk.ZX(paramArrayOfbyte, paramInt1, paramInt2);
  }
  
  public void ZY(List<Zkv5> paramList) {
    this.Zk.Zy(paramList);
  }
  
  public boolean ZQ() {
    return this.Zk.Zl();
  }
  
  public String Zk() {
    return this.Zk.Zy();
  }
  
  public void Zf(byte[] paramArrayOfbyte) {
    this.Zk.ZY(Zkb.ZG(paramArrayOfbyte));
  }
  
  public byte[] Zw() {
    return this.Zk.Z_();
  }
  
  public int[] Zg() {
    return this.Zk.ZB();
  }
  
  public void Zm(int paramInt1, int paramInt2) {
    this.Zk.Ze(paramInt1, paramInt2);
  }
  
  public void Za() {
    this.Zk.requestFocus();
  }
  
  public void Zb(Ztoy paramZtoy) {
    this.ZK = paramZtoy.ZZ();
  }
  
  public Zkcm Zx(boolean paramBoolean) {
    Zuh.Zb(false, Zqf.ZC);
    throw new UnsupportedOperationException();
  }
  
  public void Zd(String paramString, boolean paramBoolean1, boolean paramBoolean2) {
    this.Zk.ZG(paramString, paramBoolean1, paramBoolean2);
  }
  
  public List<Component> ZR(MouseEvent paramMouseEvent) {
    return this.Zk.ZR(paramMouseEvent);
  }
  
  public void Zo(boolean paramBoolean) {
    this.Zk.Zx(paramBoolean);
  }
  
  public void ZI(boolean paramBoolean) {
    this.Zk.ZF(paramBoolean);
  }
  
  public void Zy(boolean paramBoolean) {
    this.Zk.ZY(paramBoolean);
  }
  
  public Ztcw ZI() {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZU : Lburp/Zsmh;
    //   4: astore_1
    //   5: iconst_4
    //   6: anewarray burp/Ztcw
    //   9: dup
    //   10: iconst_0
    //   11: aload_0
    //   12: invokespecial ZI : ()Lburp/Ztcw;
    //   15: aastore
    //   16: dup
    //   17: iconst_1
    //   18: aload_0
    //   19: getfield Zk : Lburp/Zbkv;
    //   22: invokevirtual ZI : ()Lburp/Ztcw;
    //   25: aastore
    //   26: dup
    //   27: iconst_2
    //   28: aload_0
    //   29: getfield ZT : Lburp/Zbc5;
    //   32: invokevirtual ZI : ()Lburp/Ztcw;
    //   35: aastore
    //   36: dup
    //   37: iconst_3
    //   38: aload_0
    //   39: aload_1
    //   40: <illegal opcode> Zg : (Lburp/Zth5;Lburp/Zsmh;)Lburp/Ztcw;
    //   45: aastore
    //   46: invokestatic Zb : ([Lburp/Ztcw;)Lburp/Ztcw;
    //   49: areturn
  }
  
  public void ZU() {
    super.ZU();
    this.Zk.ZU();
    this.ZT.ZU();
    this.ZU = null;
  }
  
  public void Zm(boolean paramBoolean) {
    this.Zk.Zg(paramBoolean);
  }
  
  public void ZR(boolean paramBoolean) {
    this.Zk.ZB(paramBoolean);
  }
  
  private void lambda$checkpoint$3(Zsmh paramZsmh) {
    this.ZU = paramZsmh;
  }
  
  private void lambda$setMessageFromWebSocketMessage$2(Zsmh paramZsmh1, Zsmh paramZsmh2) {
    byte[] arrayOfByte = Zt6s.Zu(paramZsmh1);
    this.Zk.Zb(arrayOfByte);
  }
  
  private void lambda$setResponseMessage$1(Zs68 paramZs68, Zsmh paramZsmh) {
    int[] arrayOfInt = Zbdf.ZM();
    Zsmh zsmh = this.ZU;
    try {
      if (zsmh != null) {
        try {
          this.Zk.Zx(Zt6s.Zu(paramZsmh));
          if (arrayOfInt != null) {
            this.Zk.ZA(Zt6s.Zu(paramZsmh), paramZs68);
            return;
          } 
        } catch (UnsupportedOperationException unsupportedOperationException) {
          throw a(null);
        } 
        return;
      } 
    } catch (UnsupportedOperationException unsupportedOperationException) {
      throw a(null);
    } 
    this.Zk.ZA(Zt6s.Zu(paramZsmh), paramZs68);
  }
  
  private void lambda$setRequestMessage$0(Zefx paramZefx, boolean paramBoolean, Zsmh paramZsmh) {
    this.Zk.ZN(paramZefx, paramBoolean);
  }
  
  static {
    // Byte code:
    //   0: iconst_3
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: ldc 'ÞeBê¤÷jÃ¸r öêX¼\\ra4ïí+4DÕ\\f\_´£O ]}Ýìè/×ñ'
    //   10: dup
    //   11: astore_2
    //   12: invokevirtual length : ()I
    //   15: istore #4
    //   17: bipush #36
    //   19: istore_1
    //   20: iconst_m1
    //   21: istore_0
    //   22: bipush #15
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
    //   69: putstatic burp/Zth5.a : [Ljava/lang/String;
    //   72: iconst_3
    //   73: anewarray java/lang/String
    //   76: putstatic burp/Zth5.b : [Ljava/lang/String;
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
    //   113: tableswitch default -> 181, 0 -> 152, 1 -> 157, 2 -> 162, 3 -> 166, 4 -> 171, 5 -> 176
    //   152: bipush #93
    //   154: goto -> 183
    //   157: bipush #81
    //   159: goto -> 183
    //   162: iconst_4
    //   163: goto -> 183
    //   166: bipush #75
    //   168: goto -> 183
    //   171: bipush #76
    //   173: goto -> 183
    //   176: bipush #27
    //   178: goto -> 183
    //   181: bipush #127
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
    //   226: sipush #11794
    //   229: sipush #-16270
    //   232: invokestatic a : (II)Ljava/lang/String;
    //   235: invokestatic Zy : (Ljava/lang/String;)[B
    //   238: invokestatic Zh : ([B)Lburp/Zsmh;
    //   241: putstatic burp/Zth5.ZX : Lburp/Zsmh;
    //   244: return
  }
  
  private static UnsupportedOperationException a(UnsupportedOperationException paramUnsupportedOperationException) {
    return paramUnsupportedOperationException;
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x2E12) & 0xFFFF;
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
      byte b1 = 28;
      int j = (paramInt2 & 0xFF) - b1;
      if (j < 0)
        j += 256; 
      int k = ((paramInt2 & 0xFFFF) >>> 8) - b1;
      if (k < 0)
        k += 256; 
      for (byte b2 = 0; b2 < arrayOfChar.length; b2++) {
        int m = b2 % 2;
        if (m == 0) {
          arrayOfChar[b2] = (char)(arrayOfChar[b2] ^ j);
          j = ((j >>> 3 | j << 5) ^ arrayOfChar[b2]) & 0xFF;
        } else {
          arrayOfChar[b2] = (char)(arrayOfChar[b2] ^ k);
          k = ((k >>> 3 | k << 5) ^ arrayOfChar[b2]) & 0xFF;
        } 
      } 
      b[i] = (new String(arrayOfChar)).intern();
    } 
    return b[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zth5.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */