package burp;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.datatransfer.DataFlavor;
import java.awt.event.FocusListener;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JComponent;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentListener;
import net.portswigger.Zlh;

class Zloo implements Zb65, Zc {
  private final Zl5i ZZ;
  
  private final Zl5i Zn;
  
  private final Zvov Za;
  
  private final Zx8j ZA;
  
  private final Zb0h ZW;
  
  private final Zrfb Zv;
  
  private final Zvov Zr;
  
  private final Zvov ZH;
  
  private final JComponent Zz;
  
  private final Zkbz ZO;
  
  private final Ze7t Zu;
  
  private final Zmyz ZP;
  
  private boolean ZV;
  
  private Zl5i Zm;
  
  private String Zf;
  
  private Zefx ZR;
  
  private static final String[] a;
  
  private static final String[] b;
  
  Zloo(Zgb6 paramZgb6, Zvov paramZvov, boolean paramBoolean, Zx8j paramZx8j, Zb0h paramZb0h, Ztwv paramZtwv, Zghz paramZghz, Zt22 paramZt22) {
    this.Za = paramZvov;
    this.ZV = paramBoolean;
    this.ZA = paramZx8j;
    this.ZW = paramZb0h;
    this.Zr = new Zzh7();
    this.ZH = new Zzh7();
    this.ZO = new Zkbz();
    paramZvov.Zi(this);
    Zmgn zmgn1 = paramZt22.Zp(paramZghz, Zldw.GRAPHQL_QUERY, new Zz_8(this, paramZgb6));
    Zvo6 zvo61 = new Zvo6(zmgn1);
    Zmgn zmgn2 = paramZt22.Zp(paramZghz, Zldw.GRAPHQL_VARIABLES, new Zz_f(this, paramZgb6));
    Zvo6 zvo62 = new Zvo6(zmgn2);
    this.ZZ = new Zl5h(zvo61, paramZgb6, this, this.Zr);
    this.ZZ.ZF(paramBoolean);
    zmgn1.setName(a(25237, -232));
    this.Zn = new Zl5i(zvo62, paramZgb6, this, this.ZH);
    int[] arrayOfInt = Zg5d.Zn();
    try {
      this.Zn.ZF(paramBoolean);
      this.Zn.Zv(true);
      zmgn2.setName(a(25235, -19553));
      this.ZP = new Zmyz(0);
      this.ZP.Zw(Zlkk.TEXT_EDITOR_BACKGROUND);
      this.ZP.setName(a(25234, 23204));
      this.ZP.setLeftComponent(Zc(a(25233, 1418), this.ZZ.ZiB()));
      this.ZP.setRightComponent(Zc(a(25238, -17289), this.Zn.ZiB()));
      this.ZP.setResizeWeight(0.5D);
      this.Zz = this.ZP;
      this.Zu = new Ze7t(this::ZDs);
      this.ZZ.ZT(this.Zu);
      this.Zn.ZT(this.Zu);
      this.Zm = this.ZZ;
      this.Zv = new Zm0p(paramZgb6, paramZb0h, paramZtwv, zmgn1);
      if (arrayOfInt != null)
        Zbqc.Zr(new Zbqc[5]); 
    } catch (Zlh zlh) {
      throw a(null);
    } 
  }
  
  public boolean ZI(int paramInt, Object paramObject) {
    return (new Zgb5(this.Zm.ZtH(), this.ZW, this.Zv)).ZI(paramInt, paramObject);
  }
  
  public void ZC(String paramString) {
    this.Zm.ZC(paramString);
  }
  
  public String ZT() {
    return this.Zm.ZT();
  }
  
  public void Zl(String paramString) {
    ZC(paramString);
  }
  
  public void Ze() {}
  
  public void ZU(Zefx paramZefx, String paramString, boolean paramBoolean) {
    this.Zu.Zz();
    Zrtu zrtu = this.ZO.ZM(paramZefx);
    this.ZR = paramZefx;
    this.Zf = zrtu.Zq();
    this.Zn.Zz(zrtu.Zq(), paramBoolean);
    this.ZZ.Zz(zrtu.ZA(), paramBoolean);
    this.ZZ.Zg(0);
    this.Zu.ZD();
    this.Zm = this.ZZ;
  }
  
  public void ZK(Zs68 paramZs68, String paramString, byte[] paramArrayOfbyte, int paramInt, boolean paramBoolean) {}
  
  public void Za(byte[] paramArrayOfbyte, String paramString, boolean paramBoolean) {}
  
  public void Z_(Ztof paramZtof, String paramString, byte[] paramArrayOfbyte) {}
  
  public void Zf(boolean paramBoolean) {}
  
  public boolean Zc(int paramInt1, int paramInt2) {
    return false;
  }
  
  public int[] Zm() {
    return new int[0];
  }
  
  public int ZC(int paramInt) {
    return 0;
  }
  
  public int Zl(int paramInt) {
    return 0;
  }
  
  public void Zg(boolean paramBoolean) {
    this.ZZ.Zg(paramBoolean);
    this.Zn.Zg(paramBoolean);
  }
  
  public JComponent ZiB() {
    return this.Zz;
  }
  
  public void ZH(Zg90 paramZg90) {
    this.ZZ.ZH(new Zl98(paramZg90, this::lambda$addSelectionListener$0));
    this.Zn.ZH(new Zl98(paramZg90, this::lambda$addSelectionListener$1));
  }
  
  public boolean Zi3() {
    try {
      if (!this.ZZ.Zi3()) {
        try {
          if (this.Zn.Zi3());
        } catch (Zlh zlh) {
          throw a(null);
        } 
        return false;
      } 
    } catch (Zlh zlh) {
      throw a(null);
    } 
  }
  
  public void ZV(String paramString1, String paramString2, boolean paramBoolean) {}
  
  public void Zz(String paramString, boolean paramBoolean) {}
  
  public byte[] ZiD() {
    return new byte[0];
  }
  
  public int ZiO() {
    return 0;
  }
  
  public void Zg(int paramInt) {
    int[] arrayOfInt = Zg5d.Zn();
    try {
      if (paramInt < this.ZZ.Zi1()) {
        try {
          this.ZZ.Zg(paramInt);
          if (arrayOfInt != null) {
            this.Zn.Zg(paramInt - this.ZZ.Zi1());
            return;
          } 
        } catch (Zlh zlh) {
          throw a(null);
        } 
        return;
      } 
    } catch (Zlh zlh) {
      throw a(null);
    } 
    this.Zn.Zg(paramInt - this.ZZ.Zi1());
  }
  
  public void ZZ(int paramInt) {}
  
  public void Zu(int paramInt1, int paramInt2) {
    int[] arrayOfInt = Zg5d.Zn();
    try {
      if (paramInt1 < this.ZZ.Zi1()) {
        try {
          this.Zn.Zg(this.Zn.ZiO());
          this.ZZ.Zu(paramInt1, paramInt2);
          if (arrayOfInt != null) {
            this.ZZ.Zg(this.ZZ.ZiO());
            this.Zn.Zu(paramInt1 - this.ZZ.Zi1(), paramInt2 - this.ZZ.Zi1());
            return;
          } 
        } catch (Zlh zlh) {
          throw a(null);
        } 
        return;
      } 
    } catch (Zlh zlh) {
      throw a(null);
    } 
    this.ZZ.Zg(this.ZZ.ZiO());
    this.Zn.Zu(paramInt1 - this.ZZ.Zi1(), paramInt2 - this.ZZ.Zi1());
  }
  
  public byte[] ZiS() {
    return new byte[0];
  }
  
  public void ZY(byte[] paramArrayOfbyte) {}
  
  public int[] Zif() {
    return this.Zm.Zif();
  }
  
  public boolean Zid() {
    return false;
  }
  
  public int Zi4() {
    return 0;
  }
  
  public void ZS(boolean paramBoolean) {}
  
  public void Zv(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {}
  
  public void ZW(String paramString, int paramInt1, int paramInt2) {
    this.Zm.ZW(paramString, paramInt1, paramInt2);
  }
  
  public void Zv(boolean paramBoolean) {}
  
  public void ZB(boolean paramBoolean) {
    this.ZZ.ZB(paramBoolean);
    this.Zn.ZB(paramBoolean);
  }
  
  public void ZH(boolean paramBoolean) {
    this.ZZ.ZH(paramBoolean);
    this.Zn.ZH(paramBoolean);
  }
  
  public void ZiK() {}
  
  public void ZA(MouseListener paramMouseListener) {
    this.ZZ.ZA(new Zblq(paramMouseListener, this::lambda$addSelectionListener$0));
    this.Zn.ZA(new Zblq(paramMouseListener, this::lambda$addSelectionListener$1));
  }
  
  public void ZT(DocumentListener paramDocumentListener) {
    this.ZZ.ZT(paramDocumentListener);
    this.Zn.ZT(paramDocumentListener);
  }
  
  public void ZP(FocusListener paramFocusListener) {}
  
  public void ZF(boolean paramBoolean) {
    this.ZV = paramBoolean;
  }
  
  public boolean Zi0() {
    return this.ZV;
  }
  
  public boolean Zip() {
    return false;
  }
  
  public String ZiW() {
    return this.ZZ.ZiW() + this.ZZ.ZiW();
  }
  
  public List<String> Zie() {
    return List.of(this.ZZ.ZiW(), this.Zn.ZiW());
  }
  
  public int Zi1() {
    return this.ZZ.Zi1() + this.Zn.Zi1();
  }
  
  public String Ziz() {
    return null;
  }
  
  public void ZP(int paramInt, char paramChar) {}
  
  public DataFlavor[] getTransferDataFlavors() {
    return new DataFlavor[0];
  }
  
  public boolean isDataFlavorSupported(DataFlavor paramDataFlavor) {
    return false;
  }
  
  public Object getTransferData(DataFlavor paramDataFlavor) {
    return "";
  }
  
  public void ZX() {
    ArrayList<Zkv5> arrayList1 = new ArrayList();
    ArrayList<Zkv5> arrayList2 = new ArrayList();
    ArrayList<Zkv5> arrayList3 = new ArrayList();
    ArrayList<Zkv5> arrayList4 = new ArrayList();
    int i = this.ZZ.Zi1();
    Zy(this.Za.Zq(), i, arrayList1, arrayList3);
    Zy(this.Za.Zi(), i, arrayList2, arrayList4);
    this.Zr.Zh(arrayList1);
    this.Zr.ZW(arrayList2);
    this.ZH.Zh(arrayList3);
    this.ZH.ZW(arrayList4);
    this.ZZ.ZX();
    this.Zn.ZX();
  }
  
  private void ZDs() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zn : Lburp/Zl5i;
    //   4: invokevirtual ZiW : ()Ljava/lang/String;
    //   7: astore_1
    //   8: aload_1
    //   9: invokevirtual isBlank : ()Z
    //   12: ifne -> 34
    //   15: aload_1
    //   16: invokestatic Zx : (Ljava/lang/String;)Lnet/portswigger/Zrmq;
    //   19: invokeinterface Za : ()Z
    //   24: ifeq -> 46
    //   27: goto -> 34
    //   30: invokestatic a : (Lnet/portswigger/Zlh;)Lnet/portswigger/Zlh;
    //   33: athrow
    //   34: aload_0
    //   35: aload_1
    //   36: putfield Zf : Ljava/lang/String;
    //   39: goto -> 46
    //   42: invokestatic a : (Lnet/portswigger/Zlh;)Lnet/portswigger/Zlh;
    //   45: athrow
    //   46: goto -> 57
    //   49: astore_2
    //   50: aload_2
    //   51: getstatic net/portswigger/Zk_.COMMON_RUNTIME_FAILURE : Lnet/portswigger/Zk_;
    //   54: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   57: getstatic burp/Zrrh.SUITE_MESSAGE_EDITOR_GRAPHQL_EDIT_WITHIN_TAB : Lburp/Zrrh;
    //   60: invokestatic ZC : (Lnet/portswigger/Zip;)V
    //   63: aload_0
    //   64: getfield ZA : Lburp/Zx8j;
    //   67: aload_0
    //   68: getfield ZO : Lburp/Zkbz;
    //   71: aload_0
    //   72: getfield ZR : Lburp/Zefx;
    //   75: aload_0
    //   76: getfield ZZ : Lburp/Zl5i;
    //   79: invokevirtual ZiW : ()Ljava/lang/String;
    //   82: aload_0
    //   83: getfield Zf : Ljava/lang/String;
    //   86: iconst_0
    //   87: invokevirtual Ze : (Lburp/Zefx;Ljava/lang/String;Ljava/lang/String;Z)Lburp/Zefx;
    //   90: invokeinterface Zx : (Lburp/Zefx;)V
    //   95: return
    // Exception table:
    //   from	to	target	type
    //   8	27	30	net/portswigger/Zlh
    //   8	46	49	net/portswigger/Zlh
    //   15	39	42	net/portswigger/Zlh
  }
  
  private void Zy(List<Zkv5> paramList1, int paramInt, List<Zkv5> paramList2, List<Zkv5> paramList3) {
    // Byte code:
    //   0: aload_1
    //   1: iload_2
    //   2: aload_3
    //   3: aload #4
    //   5: <illegal opcode> accept : (ILjava/util/List;Ljava/util/List;)Ljava/util/function/Consumer;
    //   10: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   15: return
  }
  
  public Ztcw ZI() {
    // Byte code:
    //   0: aload_0
    //   1: getfield Zm : Lburp/Zl5i;
    //   4: astore_1
    //   5: aload_0
    //   6: getfield Zf : Ljava/lang/String;
    //   9: astore_2
    //   10: aload_0
    //   11: getfield ZR : Lburp/Zefx;
    //   14: astore_3
    //   15: aload_0
    //   16: getfield ZP : Lburp/Zmyz;
    //   19: invokevirtual getDividerLocation : ()I
    //   22: istore #4
    //   24: aload_1
    //   25: aload_0
    //   26: getfield ZZ : Lburp/Zl5i;
    //   29: if_acmpne -> 43
    //   32: aload_0
    //   33: getfield Zn : Lburp/Zl5i;
    //   36: goto -> 47
    //   39: invokestatic a : (Lnet/portswigger/Zlh;)Lnet/portswigger/Zlh;
    //   42: athrow
    //   43: aload_0
    //   44: getfield ZZ : Lburp/Zl5i;
    //   47: astore #5
    //   49: iconst_3
    //   50: anewarray burp/Ztcw
    //   53: dup
    //   54: iconst_0
    //   55: aload #5
    //   57: invokeinterface ZI : ()Lburp/Ztcw;
    //   62: aastore
    //   63: dup
    //   64: iconst_1
    //   65: aload_1
    //   66: invokevirtual ZI : ()Lburp/Ztcw;
    //   69: aastore
    //   70: dup
    //   71: iconst_2
    //   72: aload_0
    //   73: aload_1
    //   74: aload_2
    //   75: aload_3
    //   76: iload #4
    //   78: <illegal opcode> Zg : (Lburp/Zloo;Lburp/Zl5i;Ljava/lang/String;Lburp/Zefx;I)Lburp/Ztcw;
    //   83: aastore
    //   84: invokestatic Zb : ([Lburp/Ztcw;)Lburp/Ztcw;
    //   87: areturn
    // Exception table:
    //   from	to	target	type
    //   24	39	39	net/portswigger/Zlh
  }
  
  public void ZU() {
    this.ZZ.ZU();
    this.Zn.ZU();
    this.ZP.resetToPreferredSizes();
    this.Zm = this.ZZ;
    this.Zf = null;
    this.ZR = null;
  }
  
  private static Component Zc(String paramString, Component paramComponent) {
    Zbqc zbqc = new Zbqc(new BorderLayout());
    zbqc.Zl(Zlkk.TEXT_EDITOR_BACKGROUND);
    Zm99 zm99 = new Zm99(paramString);
    zm99.ZE(Zt00.BOLD_FONT);
    zm99.setBorder(new EmptyBorder(8, 10, 8, 10));
    zbqc.add(zm99, a(25239, -20569));
    zbqc.add(paramComponent, a(25232, -28761));
    return zbqc;
  }
  
  private void lambda$checkpoint$5(Zl5i paramZl5i, String paramString, Zefx paramZefx, int paramInt) {
    this.Zm = paramZl5i;
    this.Zf = paramString;
    this.ZR = paramZefx;
    this.ZP.setDividerLocation(paramInt);
  }
  
  private static void lambda$populateHighlights$4(int paramInt, List<Zkv5> paramList1, List<Zkv5> paramList2, Zkv5 paramZkv5) {
    int[] arrayOfInt = Zg5d.Zn();
    try {
      if (paramZkv5.startOffset() < paramInt) {
        try {
          paramList1.add(paramZkv5);
          if (arrayOfInt != null) {
            paramList2.add(paramZkv5.Zg(paramZkv5.startOffset() - paramInt, paramZkv5.endOffset() - paramInt));
            return;
          } 
        } catch (Zlh zlh) {
          throw a(null);
        } 
        return;
      } 
    } catch (Zlh zlh) {
      throw a(null);
    } 
    paramList2.add(paramZkv5.Zg(paramZkv5.startOffset() - paramInt, paramZkv5.endOffset() - paramInt));
  }
  
  private void lambda$addSelectionListener$1() {
    this.Zm = this.Zn;
  }
  
  private void lambda$addSelectionListener$0() {
    this.Zm = this.ZZ;
  }
  
  private static Zlh a(Zlh paramZlh) {
    return paramZlh;
  }
  
  static {
    // Byte code:
    //   0: bipush #7
    //   2: anewarray java/lang/String
    //   5: astore #5
    //   7: iconst_0
    //   8: istore_3
    //   9: ldc '±ÀnÞÜ\\b¿ÿ:£éÇ¯D*§·f×»^1ÿ'Ï¬_ÒòlH]ºÔ¼5Sâ3ðEýHEûüx!HXi'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #24
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: bipush #102
    //   25: iinc #0, 1
    //   28: aload_2
    //   29: iload_0
    //   30: dup
    //   31: iload_1
    //   32: iadd
    //   33: invokevirtual substring : (II)Ljava/lang/String;
    //   36: iconst_m1
    //   37: goto -> 143
    //   40: aload #5
    //   42: swap
    //   43: iload_3
    //   44: iinc #3, 1
    //   47: swap
    //   48: aastore
    //   49: iload_0
    //   50: iload_1
    //   51: iadd
    //   52: dup
    //   53: istore_0
    //   54: iload #4
    //   56: if_icmpge -> 68
    //   59: aload_2
    //   60: iload_0
    //   61: invokevirtual charAt : (I)C
    //   64: istore_1
    //   65: goto -> 23
    //   68: ldc 'øÇj3*^VWwJZ%KóG\\nèÇ¡ý'
    //   70: dup
    //   71: astore_2
    //   72: invokevirtual length : ()I
    //   75: istore #4
    //   77: bipush #9
    //   79: istore_1
    //   80: iconst_m1
    //   81: istore_0
    //   82: bipush #98
    //   84: iinc #0, 1
    //   87: aload_2
    //   88: iload_0
    //   89: dup
    //   90: iload_1
    //   91: iadd
    //   92: invokevirtual substring : (II)Ljava/lang/String;
    //   95: iconst_0
    //   96: goto -> 143
    //   99: aload #5
    //   101: swap
    //   102: iload_3
    //   103: iinc #3, 1
    //   106: swap
    //   107: aastore
    //   108: iload_0
    //   109: iload_1
    //   110: iadd
    //   111: dup
    //   112: istore_0
    //   113: iload #4
    //   115: if_icmpge -> 127
    //   118: aload_2
    //   119: iload_0
    //   120: invokevirtual charAt : (I)C
    //   123: istore_1
    //   124: goto -> 82
    //   127: aload #5
    //   129: putstatic burp/Zloo.a : [Ljava/lang/String;
    //   132: bipush #7
    //   134: anewarray java/lang/String
    //   137: putstatic burp/Zloo.b : [Ljava/lang/String;
    //   140: goto -> 300
    //   143: dup_x2
    //   144: pop
    //   145: invokevirtual toCharArray : ()[C
    //   148: dup_x1
    //   149: arraylength
    //   150: dup_x2
    //   151: pop
    //   152: iconst_0
    //   153: istore #6
    //   155: dup2_x1
    //   156: pop2
    //   157: dup_x2
    //   158: iconst_1
    //   159: if_icmpgt -> 260
    //   162: dup2
    //   163: swap
    //   164: iload #6
    //   166: dup2_x1
    //   167: caload
    //   168: swap
    //   169: iload #6
    //   171: bipush #7
    //   173: irem
    //   174: tableswitch default -> 242, 0 -> 212, 1 -> 217, 2 -> 222, 3 -> 227, 4 -> 232, 5 -> 237
    //   212: bipush #50
    //   214: goto -> 244
    //   217: bipush #66
    //   219: goto -> 244
    //   222: bipush #94
    //   224: goto -> 244
    //   227: bipush #104
    //   229: goto -> 244
    //   232: bipush #85
    //   234: goto -> 244
    //   237: bipush #123
    //   239: goto -> 244
    //   242: bipush #45
    //   244: ixor
    //   245: ixor
    //   246: i2c
    //   247: castore
    //   248: iinc #6, 1
    //   251: dup
    //   252: ifne -> 260
    //   255: dup2
    //   256: dup_x1
    //   257: goto -> 166
    //   260: dup2_x1
    //   261: pop2
    //   262: dup_x2
    //   263: iload #6
    //   265: if_icmpgt -> 162
    //   268: pop
    //   269: new java/lang/String
    //   272: dup_x1
    //   273: swap
    //   274: invokespecial <init> : ([C)V
    //   277: invokevirtual intern : ()Ljava/lang/String;
    //   280: swap
    //   281: pop
    //   282: swap
    //   283: tableswitch default -> 40, 0 -> 99
    //   300: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x6293) & 0xFFFF;
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
      char c = 'ã';
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zloo.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */