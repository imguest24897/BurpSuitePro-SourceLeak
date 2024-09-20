package burp;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.stream.Collectors;
import javax.imageio.ImageIO;
import net.portswigger.Zdc;
import net.portswigger.Zdu;
import net.portswigger.Zfx;
import net.portswigger.Zkb;
import net.portswigger.Zqf;
import net.portswigger.Zrm_;
import net.portswigger.Ztq;
import net.portswigger.Ztu;
import net.portswigger.Zuh;
import net.portswigger.browser.Zct;

public class Zmck implements Zmt2 {
  private final int ZA;
  
  private final Zra1 Za;
  
  private final Zmx0 Zj;
  
  private final AtomicReference<Zdc> ZG;
  
  private final AtomicReference<String> Zr;
  
  private final AtomicInteger ZM;
  
  private final List<Zz2i> Z_;
  
  private final List<Zlea> ZX;
  
  private final List<Zrtf> Zi;
  
  private static String[] Zh;
  
  private static final String[] b;
  
  private static final String[] c;
  
  public Zmck(Zra1 paramZra1, Zlog paramZlog, Zmx0 paramZmx0) {
    this.ZA = paramZlog.ZPo();
    this.Za = paramZra1;
    this.Zj = paramZmx0;
    this.ZG = new AtomicReference<>(Zdc.CRAWLING);
    this.Zr = new AtomicReference<>("");
    this.ZM = new AtomicInteger();
    this.Z_ = new LinkedList<>();
    this.ZX = new LinkedList<>();
    this.Zi = new LinkedList<>();
  }
  
  public Zs_1 Zf(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: new java/util/LinkedList
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore #5
    //   9: invokestatic Zd : ()[Ljava/lang/String;
    //   12: aload_0
    //   13: getfield ZX : Ljava/util/List;
    //   16: dup
    //   17: astore #6
    //   19: monitorenter
    //   20: astore_3
    //   21: iload_1
    //   22: istore #7
    //   24: iload #7
    //   26: iload_1
    //   27: iload_2
    //   28: iadd
    //   29: if_icmpge -> 99
    //   32: iload #7
    //   34: aload_0
    //   35: getfield ZX : Ljava/util/List;
    //   38: invokeinterface size : ()I
    //   43: if_icmpge -> 99
    //   46: aload #5
    //   48: aload_0
    //   49: aload_0
    //   50: getfield ZX : Ljava/util/List;
    //   53: iload #7
    //   55: invokeinterface get : (I)Ljava/lang/Object;
    //   60: checkcast burp/Zlea
    //   63: invokevirtual Zc : (Lburp/Zlea;)Lnet/portswigger/Zdu;
    //   66: invokeinterface add : (Ljava/lang/Object;)Z
    //   71: pop
    //   72: goto -> 85
    //   75: astore #8
    //   77: aload #8
    //   79: getstatic net/portswigger/Zk_.UNEXPECTED : Lnet/portswigger/Zk_;
    //   82: invokestatic Zl : (Ljava/lang/Throwable;Lnet/portswigger/Zk_;)V
    //   85: iinc #7, 1
    //   88: aload_3
    //   89: ifnull -> 24
    //   92: iconst_5
    //   93: anewarray burp/Zbqc
    //   96: invokestatic Zr : ([Lburp/Zbqc;)V
    //   99: aload_0
    //   100: iload #7
    //   102: aload_0
    //   103: getfield ZX : Ljava/util/List;
    //   106: invokeinterface size : ()I
    //   111: if_icmpge -> 122
    //   114: iconst_1
    //   115: goto -> 123
    //   118: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   121: athrow
    //   122: iconst_0
    //   123: invokevirtual ZA : (Z)Lnet/portswigger/Zdc;
    //   126: astore #4
    //   128: aload #6
    //   130: monitorexit
    //   131: goto -> 142
    //   134: astore #9
    //   136: aload #6
    //   138: monitorexit
    //   139: aload #9
    //   141: athrow
    //   142: aload #4
    //   144: invokevirtual Zv : ()Z
    //   147: aload #5
    //   149: invokeinterface size : ()I
    //   154: new net/portswigger/Zgj
    //   157: dup
    //   158: aload_0
    //   159: getfield ZA : I
    //   162: invokestatic valueOf : (I)Ljava/lang/String;
    //   165: aload #4
    //   167: aload_0
    //   168: getfield Zr : Ljava/util/concurrent/atomic/AtomicReference;
    //   171: invokevirtual get : ()Ljava/lang/Object;
    //   174: checkcast java/lang/String
    //   177: aload_0
    //   178: getfield ZM : Ljava/util/concurrent/atomic/AtomicInteger;
    //   181: invokevirtual get : ()I
    //   184: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   187: aload_0
    //   188: aload #4
    //   190: invokevirtual Zk : (Lnet/portswigger/Zdc;)Z
    //   193: ifeq -> 207
    //   196: aload_0
    //   197: invokevirtual ZA : ()Ljava/util/List;
    //   200: goto -> 208
    //   203: invokestatic a : (Ljava/io/IOException;)Ljava/io/IOException;
    //   206: athrow
    //   207: aconst_null
    //   208: aload #5
    //   210: aload_0
    //   211: aload #4
    //   213: invokevirtual Zk : (Lnet/portswigger/Zdc;)Z
    //   216: ifeq -> 226
    //   219: aload_0
    //   220: invokevirtual ZS : ()Ljava/util/List;
    //   223: goto -> 227
    //   226: aconst_null
    //   227: invokespecial <init> : (Ljava/lang/String;Lnet/portswigger/Zdc;Ljava/lang/String;Ljava/lang/Integer;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V
    //   230: invokestatic ZY : (ZILnet/portswigger/Zgx;)Lburp/Zs_1;
    //   233: areturn
    // Exception table:
    //   from	to	target	type
    //   21	131	134	finally
    //   46	72	75	java/io/IOException
    //   99	118	118	java/io/IOException
    //   134	139	134	finally
    //   142	203	203	java/io/IOException
  }
  
  private Zdc ZA(boolean paramBoolean) {
    Zdc zdc = this.ZG.get();
    return zdc.Zv() ? (paramBoolean ? Zdc.CRAWLING : zdc) : zdc;
  }
  
  private boolean Zk(Zdc paramZdc) {
    return (this.Za == Zra1.EXECUTION_MODE_ENTERPRISE_AGENT && paramZdc.Zv());
  }
  
  private List<Ztq> ZA() {
    ArrayList<Ztq> arrayList = new ArrayList();
    Iterator<Zz2i> iterator = this.Z_.iterator();
    String[] arrayOfString = Zd();
    while (iterator.hasNext()) {
      Zz2i zz2i = iterator.next();
      ArrayList<Zrm_> arrayList1 = new ArrayList();
      for (Zr_j zr_j : zz2i.Z_()) {
        arrayList1.add(new Zrm_(zr_j.Zn(), zr_j.Zp().Zb(), zr_j.Zp().Zx(), zr_j.Zc().orElse(null), zr_j.ZL().orElse(null), zr_j.Zy().<String>map(this::Zy).orElse(null), zr_j.ZS().<String>map(this::Zy).orElse(null)));
        if (arrayOfString != null)
          break; 
      } 
      arrayList.add(new Ztq(zz2i.Zn(), arrayList1));
      if (arrayOfString != null)
        break; 
    } 
    return arrayList;
  }
  
  private Zdu Zc(Zlea paramZlea) throws IOException {
    Zct zct = paramZlea.ZJ5();
    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
    ImageIO.write(zct.ZI(), zct.ZA().ZG().name(), byteArrayOutputStream);
    return new Zdu(paramZlea.ZJj(), Zkb.ZG(Ztu.Zt(byteArrayOutputStream.toByteArray())), zct.ZA().Zn(), Zkoy.Zs(zct.ZA().Z_()));
  }
  
  private List<Zfx> ZS() {
    return (List<Zfx>)(new ArrayList(this.Zi)).stream().map(Zmck::lambda$convertRecordedSequenceResults$2).collect(Collectors.toList());
  }
  
  private String Zy(Zstu paramZstu) {
    int i = Math.min(paramZstu.Zpu(), 4096);
    return Zruv.ZO(paramZstu, 0, i);
  }
  
  public void ZC(Zlli<Zt13> paramZlli, Zlli<Zt18> paramZlli1, Zlli<Zt35> paramZlli2) {
    // Byte code:
    //   0: aload_1
    //   1: getstatic burp/Zt13.Zd : Lburp/Zlnb;
    //   4: aload_0
    //   5: <illegal opcode> accept : (Lburp/Zmck;)Ljava/util/function/Consumer;
    //   10: invokeinterface ZE : (Lburp/Zlnb;Ljava/util/function/Consumer;)Lburp/Zgrn;
    //   15: pop
    //   16: new java/util/concurrent/atomic/AtomicReference
    //   19: dup
    //   20: invokespecial <init> : ()V
    //   23: astore #5
    //   25: aload_1
    //   26: getstatic burp/Zt13.ZC : Lburp/Zlnb;
    //   29: aload_0
    //   30: aload #5
    //   32: <illegal opcode> accept : (Lburp/Zmck;Ljava/util/concurrent/atomic/AtomicReference;)Ljava/util/function/Consumer;
    //   37: invokeinterface ZE : (Lburp/Zlnb;Ljava/util/function/Consumer;)Lburp/Zgrn;
    //   42: pop
    //   43: aload_1
    //   44: getstatic burp/Zt13.ZV : Lburp/Zlnb;
    //   47: aload_0
    //   48: aload #5
    //   50: <illegal opcode> accept : (Lburp/Zmck;Ljava/util/concurrent/atomic/AtomicReference;)Ljava/util/function/Consumer;
    //   55: invokeinterface ZE : (Lburp/Zlnb;Ljava/util/function/Consumer;)Lburp/Zgrn;
    //   60: pop
    //   61: aload_2
    //   62: getstatic burp/Zt18.ZW : Lburp/Zlnb;
    //   65: aload_0
    //   66: <illegal opcode> accept : (Lburp/Zmck;)Ljava/util/function/Consumer;
    //   71: invokeinterface ZE : (Lburp/Zlnb;Ljava/util/function/Consumer;)Lburp/Zgrn;
    //   76: pop
    //   77: aload_2
    //   78: getstatic burp/Zt18.ZS : Lburp/Zlnb;
    //   81: aload_0
    //   82: <illegal opcode> accept : (Lburp/Zmck;)Ljava/util/function/Consumer;
    //   87: invokeinterface ZE : (Lburp/Zlnb;Ljava/util/function/Consumer;)Lburp/Zgrn;
    //   92: pop
    //   93: aload_2
    //   94: getstatic burp/Zt18.ZW : Lburp/Zlnb;
    //   97: aload_0
    //   98: <illegal opcode> accept : (Lburp/Zmck;)Ljava/util/function/Consumer;
    //   103: invokeinterface ZE : (Lburp/Zlnb;Ljava/util/function/Consumer;)Lburp/Zgrn;
    //   108: pop
    //   109: aload_3
    //   110: getstatic burp/Zt35.Zy : Lburp/Zlnb;
    //   113: aload_0
    //   114: <illegal opcode> accept : (Lburp/Zmck;)Ljava/util/function/Consumer;
    //   119: invokeinterface ZE : (Lburp/Zlnb;Ljava/util/function/Consumer;)Lburp/Zgrn;
    //   124: pop
    //   125: invokestatic Zd : ()[Ljava/lang/String;
    //   128: aload_3
    //   129: getstatic burp/Zt35.Zd : Lburp/Zlnb;
    //   132: aload_0
    //   133: <illegal opcode> accept : (Lburp/Zmck;)Ljava/util/function/Consumer;
    //   138: invokeinterface ZE : (Lburp/Zlnb;Ljava/util/function/Consumer;)Lburp/Zgrn;
    //   143: pop
    //   144: astore #4
    //   146: aload_3
    //   147: getstatic burp/Zt35.Zj : Lburp/Zlnb;
    //   150: aload_0
    //   151: <illegal opcode> accept : (Lburp/Zmck;)Ljava/util/function/Consumer;
    //   156: invokeinterface ZE : (Lburp/Zlnb;Ljava/util/function/Consumer;)Lburp/Zgrn;
    //   161: pop
    //   162: invokestatic Zwu : ()[Lburp/Zbqc;
    //   165: ifnonnull -> 175
    //   168: iconst_1
    //   169: anewarray java/lang/String
    //   172: invokestatic Ze : ([Ljava/lang/String;)V
    //   175: return
  }
  
  public void ZY(Zb6l paramZb6l) {
    Zuh.Zb((paramZb6l != null), Zqf.Zk);
    if (paramZb6l != null) {
      this.Zr.set(paramZb6l.ZX());
      this.ZM.set(paramZb6l.ZR());
    } 
    ZN(Zdc.FAILED);
  }
  
  private void ZN(Zdc paramZdc) {
    this.ZG.set(paramZdc);
  }
  
  private void Zk(Zz2i paramZz2i) {
    this.Z_.add(paramZz2i);
  }
  
  private void ZJ(Zlea paramZlea) {
    synchronized (this.ZX) {
      this.ZX.add(paramZlea);
    } 
  }
  
  private void Zm(Zrtf paramZrtf) {
    this.Zi.add(paramZrtf);
  }
  
  private void lambda$subscribeTo$13(Zxr8 paramZxr8) {
    paramZxr8.ZP(this::Zm);
  }
  
  private void lambda$subscribeTo$12(Zxr8 paramZxr8) {
    paramZxr8.ZP(this::ZJ);
  }
  
  private void lambda$subscribeTo$11(Zxr8 paramZxr8) {
    paramZxr8.ZP(this::Zk);
  }
  
  private void lambda$subscribeTo$10(Zxr8 paramZxr8) {
    ZN(Zdc.SUCCEEDED);
  }
  
  private void lambda$subscribeTo$9(Zxr8 paramZxr8) {
    paramZxr8.ZP(this::lambda$subscribeTo$8);
  }
  
  private void lambda$subscribeTo$8(Zb6l paramZb6l) {
    this.Zj.ZH(a(24784, 32652) + a(24784, 32652));
    ZY(paramZb6l);
  }
  
  private void lambda$subscribeTo$7(Zxr8 paramZxr8) {
    this.Zj.ZH(a(24786, 21376));
  }
  
  private void lambda$subscribeTo$6(AtomicReference paramAtomicReference, Zxr8 paramZxr8) {
    // Byte code:
    //   0: aload_2
    //   1: aload_0
    //   2: aload_1
    //   3: <illegal opcode> accept : (Lburp/Zmck;Ljava/util/concurrent/atomic/AtomicReference;)Ljava/util/function/Consumer;
    //   8: invokevirtual ZP : (Ljava/util/function/Consumer;)V
    //   11: return
  }
  
  private void lambda$subscribeTo$5(AtomicReference<Zdc> paramAtomicReference, Ztak paramZtak) {
    if (paramZtak.ZO())
      ZN(paramAtomicReference.get()); 
  }
  
  private void lambda$subscribeTo$4(AtomicReference<Zdc> paramAtomicReference, Zxr8 paramZxr8) {
    paramAtomicReference.set(this.ZG.get());
    ZN(Zdc.PAUSED);
  }
  
  private void lambda$subscribeTo$3(Zxr8 paramZxr8) {
    ZY(new Zb6l(Zec4.TASK_DELETED));
  }
  
  private static Zfx lambda$convertRecordedSequenceResults$2(Zrtf paramZrtf) {
    return paramZrtf.ZK().<Zfx>map(paramZrtf::lambda$convertRecordedSequenceResults$0).orElseGet(paramZrtf::lambda$convertRecordedSequenceResults$1);
  }
  
  private static Zfx lambda$convertRecordedSequenceResults$1(Zrtf paramZrtf) {
    return new Zfx(paramZrtf.ZD(), a(24787, -21690), 0);
  }
  
  private static Zfx lambda$convertRecordedSequenceResults$0(Zrtf paramZrtf, String paramString) {
    return new Zfx(paramZrtf.ZD(), paramString, 1);
  }
  
  public static void Ze(String[] paramArrayOfString) {
    Zh = paramArrayOfString;
  }
  
  public static String[] Zd() {
    return Zh;
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
  
  static {
    // Byte code:
    //   0: iconst_3
    //   1: anewarray java/lang/String
    //   4: astore #5
    //   6: iconst_0
    //   7: istore_3
    //   8: aconst_null
    //   9: ldc 'Ó¬µª):ù`ÙtÄQTþý)*êzÂG²=òòeÕü'
    //   11: dup
    //   12: astore_2
    //   13: invokevirtual length : ()I
    //   16: istore #4
    //   18: bipush #14
    //   20: istore_1
    //   21: iconst_m1
    //   22: istore_0
    //   23: invokestatic Ze : ([Ljava/lang/String;)V
    //   26: bipush #93
    //   28: iinc #0, 1
    //   31: aload_2
    //   32: iload_0
    //   33: dup
    //   34: iload_1
    //   35: iadd
    //   36: invokevirtual substring : (II)Ljava/lang/String;
    //   39: iconst_m1
    //   40: goto -> 86
    //   43: aload #5
    //   45: swap
    //   46: iload_3
    //   47: iinc #3, 1
    //   50: swap
    //   51: aastore
    //   52: iload_0
    //   53: iload_1
    //   54: iadd
    //   55: dup
    //   56: istore_0
    //   57: iload #4
    //   59: if_icmpge -> 71
    //   62: aload_2
    //   63: iload_0
    //   64: invokevirtual charAt : (I)C
    //   67: istore_1
    //   68: goto -> 26
    //   71: aload #5
    //   73: putstatic burp/Zmck.b : [Ljava/lang/String;
    //   76: iconst_3
    //   77: anewarray java/lang/String
    //   80: putstatic burp/Zmck.c : [Ljava/lang/String;
    //   83: goto -> 231
    //   86: dup_x2
    //   87: pop
    //   88: invokevirtual toCharArray : ()[C
    //   91: dup_x1
    //   92: arraylength
    //   93: dup_x2
    //   94: pop
    //   95: iconst_0
    //   96: istore #6
    //   98: dup2_x1
    //   99: pop2
    //   100: dup_x2
    //   101: iconst_1
    //   102: if_icmpgt -> 204
    //   105: dup2
    //   106: swap
    //   107: iload #6
    //   109: dup2_x1
    //   110: caload
    //   111: swap
    //   112: iload #6
    //   114: bipush #7
    //   116: irem
    //   117: tableswitch default -> 186, 0 -> 156, 1 -> 161, 2 -> 166, 3 -> 171, 4 -> 176, 5 -> 181
    //   156: bipush #25
    //   158: goto -> 188
    //   161: bipush #36
    //   163: goto -> 188
    //   166: bipush #80
    //   168: goto -> 188
    //   171: bipush #6
    //   173: goto -> 188
    //   176: bipush #66
    //   178: goto -> 188
    //   181: bipush #85
    //   183: goto -> 188
    //   186: bipush #38
    //   188: ixor
    //   189: ixor
    //   190: i2c
    //   191: castore
    //   192: iinc #6, 1
    //   195: dup
    //   196: ifne -> 204
    //   199: dup2
    //   200: dup_x1
    //   201: goto -> 109
    //   204: dup2_x1
    //   205: pop2
    //   206: dup_x2
    //   207: iload #6
    //   209: if_icmpgt -> 105
    //   212: pop
    //   213: new java/lang/String
    //   216: dup_x1
    //   217: swap
    //   218: invokespecial <init> : ([C)V
    //   221: invokevirtual intern : ()Ljava/lang/String;
    //   224: swap
    //   225: pop
    //   226: swap
    //   227: pop
    //   228: goto -> 43
    //   231: return
  }
  
  private static String a(int paramInt1, int paramInt2) {
    int i = (paramInt1 ^ 0x60D2) & 0xFFFF;
    if (c[i] == null) {
      char[] arrayOfChar = b[i].toCharArray();
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
      byte b1 = 26;
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
      c[i] = (new String(arrayOfChar)).intern();
    } 
    return c[i];
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmck.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */