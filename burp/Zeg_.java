package burp;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import net.portswigger.Zli;
import net.portswigger.Zto;

public class Zeg_ {
  private static final byte[] ZS = new byte[] { 104, 116, 116, 112, 58, 47, 47 };
  
  private static final byte[] Zf = new byte[] { 104, 116, 116, 112, 115, 58, 47, 47 };
  
  private static final byte[] ZK = new byte[] { 119, 115, 58, 47, 47 };
  
  private static final byte[] Zz = new byte[] { 119, 115, 115, 58, 47, 47 };
  
  private static final byte[] Zp = new byte[] { 58, 47, 47 };
  
  private static final byte[] Zg = new byte[] { 47 };
  
  private static final byte[] ZV = new byte[] { 46, 47 };
  
  private static final byte[] Zi = new byte[] { 46, 46, 47 };
  
  private static final byte[][] ZC = new byte[][] { 
      { 60 }, { 62 }, { 39 }, { 34 }, { 38, 113, 117, 111, 116, 59 }, { 38, 103, 116, 59 }, { 41 }, { 93 }, { 125 }, { 32 }, 
      { 13 }, { 10 } };
  
  private static final byte[][] Ze = new byte[][] { Zf, ZS, Zz, ZK };
  
  private static final List<Zto<Integer, Zzrd>> Zk = new LinkedList<>();
  
  private static final Zrpi<Boolean> ZA = Zu();
  
  private static final Zrpi<Boolean> ZZ = ZZ();
  
  private final Zbnt ZF;
  
  public Zeg_(Zbnt paramZbnt) {
    this.ZF = paramZbnt;
  }
  
  Zg6y Zj(Zlit paramZlit, byte[] paramArrayOfbyte, int paramInt, byte paramByte, Zm4 paramZm4) {
    int[] arrayOfInt = Zxxs.Zz();
    Zg6y zg6y = ZU(paramArrayOfbyte, paramInt);
    if (zg6y == null || zg6y.ZM == null)
      zg6y = Za(paramZlit, paramArrayOfbyte, paramInt); 
    ZI(zg6y, paramByte, paramZm4);
    if (arrayOfInt != null)
      Zbqc.Zr(new Zbqc[2]); 
    return zg6y;
  }
  
  public void Zb(byte[] paramArrayOfbyte, int paramInt, byte paramByte, Zm4 paramZm4) {
    List<Integer> list = ZQ(paramArrayOfbyte, paramInt);
    Iterator<Integer> iterator = list.iterator();
    int[] arrayOfInt = Zxxs.Zz();
    while (iterator.hasNext()) {
      Integer integer = iterator.next();
      Zg6y zg6y = ZT(paramArrayOfbyte, integer.intValue(), 0);
      ZI(zg6y, paramByte, paramZm4);
      if (arrayOfInt != null)
        break; 
    } 
  }
  
  private List<Integer> ZQ(byte[] paramArrayOfbyte, int paramInt) {
    ArrayList<Integer> arrayList1 = new ArrayList();
    int i = paramInt;
    int[] arrayOfInt = Zxxs.Zz();
    while (i < paramArrayOfbyte.length) {
      int j = Zli.ZG(paramArrayOfbyte, Zp, false, i);
      if (j == -1)
        break; 
      arrayList1.add(Integer.valueOf(j));
      i = j + Zp.length + 2;
      if (arrayOfInt != null)
        break; 
    } 
    ArrayList<Integer> arrayList2 = new ArrayList();
    for (Integer integer : arrayList1) {
      int j = ZE(paramArrayOfbyte, paramInt, integer.intValue());
      if (j != -1)
        arrayList2.add(Integer.valueOf(j)); 
      if (arrayOfInt != null)
        break; 
    } 
    return arrayList2;
  }
  
  private int ZE(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    return (paramInt2 >= paramInt1 + 5 && Zli.ZC(paramArrayOfbyte, Zf, false, paramInt2 - 5)) ? (paramInt2 - 5) : ((paramInt2 >= paramInt1 + 4 && Zli.ZC(paramArrayOfbyte, ZS, false, paramInt2 - 4)) ? (paramInt2 - 4) : ((paramInt2 >= paramInt1 + 3 && Zli.ZC(paramArrayOfbyte, Zz, false, paramInt2 - 3)) ? (paramInt2 - 3) : ((paramInt2 >= paramInt1 + 2 && Zli.ZC(paramArrayOfbyte, ZK, false, paramInt2 - 2)) ? (paramInt2 - 2) : -1)));
  }
  
  private void ZI(Zg6y paramZg6y, byte paramByte, Zm4 paramZm4) {
    if (paramZg6y != null && paramZg6y.ZM != null) {
      short s = Zt1t.ZC(paramZg6y.ZM.Zd_());
      Zsq8 zsq8 = new Zsq8(paramByte, paramZg6y.ZM, paramZg6y.ZQ, null, null, s, paramZg6y.Zm, paramZg6y.ZH);
      paramZm4.Zt(zsq8);
    } 
  }
  
  private Zg6y ZU(byte[] paramArrayOfbyte, int paramInt) {
    if (Zg(paramArrayOfbyte))
      return null; 
    int i = ZV(paramArrayOfbyte);
    return (i == -1) ? null : ZT(paramArrayOfbyte, i, paramInt);
  }
  
  private Zg6y ZT(byte[] paramArrayOfbyte, int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: aload_1
    //   2: iload_2
    //   3: invokevirtual Zs : ([BI)I
    //   6: istore #5
    //   8: aload_1
    //   9: arraylength
    //   10: istore #6
    //   12: invokestatic Zz : ()[I
    //   15: iload_2
    //   16: iload #5
    //   18: iadd
    //   19: istore #7
    //   21: astore #4
    //   23: iload #7
    //   25: aload_1
    //   26: arraylength
    //   27: if_icmpge -> 57
    //   30: aload_0
    //   31: aload_1
    //   32: iload #7
    //   34: invokevirtual ZH : ([BI)Z
    //   37: ifeq -> 49
    //   40: iload #7
    //   42: istore #6
    //   44: aload #4
    //   46: ifnull -> 57
    //   49: iinc #7, 1
    //   52: aload #4
    //   54: ifnull -> 23
    //   57: iload #6
    //   59: iload_2
    //   60: isub
    //   61: istore #7
    //   63: iload #7
    //   65: iload #5
    //   67: iconst_3
    //   68: iadd
    //   69: if_icmpge -> 89
    //   72: new burp/Zg6y
    //   75: dup
    //   76: aconst_null
    //   77: aconst_null
    //   78: iload_3
    //   79: iload_2
    //   80: iadd
    //   81: iload_3
    //   82: iload #6
    //   84: iadd
    //   85: invokespecial <init> : (Lburp/Zlit;Ljava/lang/String;II)V
    //   88: areturn
    //   89: aload_1
    //   90: iload_2
    //   91: iload #7
    //   93: invokestatic Zo : ([BII)Ljava/lang/String;
    //   96: astore #8
    //   98: aload #8
    //   100: aconst_null
    //   101: aload_0
    //   102: getfield ZF : Lburp/Zbnt;
    //   105: invokestatic ZL : (Ljava/lang/String;Lburp/Zlit;Lburp/Zbnt;)Lburp/Zlit;
    //   108: astore #9
    //   110: aload #9
    //   112: ifnonnull -> 132
    //   115: new burp/Zg6y
    //   118: dup
    //   119: aconst_null
    //   120: aconst_null
    //   121: iload_3
    //   122: iload_2
    //   123: iadd
    //   124: iload_3
    //   125: iload #6
    //   127: iadd
    //   128: invokespecial <init> : (Lburp/Zlit;Ljava/lang/String;II)V
    //   131: areturn
    //   132: new burp/Zg6y
    //   135: dup
    //   136: aload #9
    //   138: aload #8
    //   140: invokestatic ZK : (Ljava/lang/String;)Ljava/lang/String;
    //   143: iload_3
    //   144: iload_2
    //   145: iadd
    //   146: iload_3
    //   147: iload #6
    //   149: iadd
    //   150: invokespecial <init> : (Lburp/Zlit;Ljava/lang/String;II)V
    //   153: areturn
  }
  
  private int Zs(byte[] paramArrayOfbyte, int paramInt) {
    int[] arrayOfInt = Zxxs.Zz();
    for (Zto<Integer, Zzrd> zto : Zk) {
      if (((Zzrd)zto.Zo).Zk(paramArrayOfbyte, paramInt, -1).ZP())
        return ((Integer)zto.Zq).intValue(); 
      if (arrayOfInt != null)
        break; 
    } 
    return 1;
  }
  
  private int ZV(byte[] paramArrayOfbyte) {
    int i = -1;
    Iterator<Zto<Integer, Zzrd>> iterator = Zk.iterator();
    int[] arrayOfInt = Zxxs.Zz();
    while (iterator.hasNext()) {
      Zto zto = iterator.next();
      int j = ((Zzrd)zto.Zo).Zk(paramArrayOfbyte, 0, (i == -1) ? -1 : (i + ((Integer)zto.Zq).intValue())).ZR();
      if (j != -1)
        i = j; 
      if (arrayOfInt != null)
        break; 
    } 
    return i;
  }
  
  private Zg6y Za(Zlit paramZlit, byte[] paramArrayOfbyte, int paramInt) {
    // Byte code:
    //   0: invokestatic Zz : ()[I
    //   3: astore #4
    //   5: aload_0
    //   6: aload_2
    //   7: invokevirtual Zg : ([B)Z
    //   10: ifeq -> 15
    //   13: aconst_null
    //   14: areturn
    //   15: aload_2
    //   16: iconst_0
    //   17: invokestatic ZP : ([BI)I
    //   20: istore #5
    //   22: aload_0
    //   23: aload_2
    //   24: iload #5
    //   26: invokevirtual Zt : ([BI)Z
    //   29: ifeq -> 34
    //   32: aconst_null
    //   33: areturn
    //   34: iconst_0
    //   35: istore #6
    //   37: iconst_0
    //   38: istore #7
    //   40: iconst_0
    //   41: istore #8
    //   43: iload #5
    //   45: iconst_1
    //   46: iadd
    //   47: istore #9
    //   49: iload #9
    //   51: aload_2
    //   52: arraylength
    //   53: if_icmpge -> 215
    //   56: aload_2
    //   57: iload #9
    //   59: baload
    //   60: istore #10
    //   62: iload #10
    //   64: bipush #32
    //   66: if_icmple -> 76
    //   69: iload #10
    //   71: bipush #127
    //   73: if_icmplt -> 78
    //   76: aconst_null
    //   77: areturn
    //   78: iload #8
    //   80: ifeq -> 86
    //   83: goto -> 207
    //   86: iload #10
    //   88: bipush #47
    //   90: if_icmpne -> 101
    //   93: iconst_1
    //   94: istore #6
    //   96: aload #4
    //   98: ifnull -> 207
    //   101: iload #10
    //   103: bipush #46
    //   105: if_icmpne -> 116
    //   108: iconst_1
    //   109: istore #7
    //   111: aload #4
    //   113: ifnull -> 207
    //   116: iload #10
    //   118: bipush #35
    //   120: if_icmpne -> 142
    //   123: iload #7
    //   125: ifne -> 133
    //   128: iload #6
    //   130: ifeq -> 140
    //   133: iload #9
    //   135: bipush #6
    //   137: if_icmpge -> 215
    //   140: aconst_null
    //   141: areturn
    //   142: iload #10
    //   144: bipush #63
    //   146: if_icmpeq -> 156
    //   149: iload #10
    //   151: bipush #59
    //   153: if_icmpne -> 183
    //   156: iload #7
    //   158: ifne -> 166
    //   161: iload #6
    //   163: ifeq -> 173
    //   166: iload #9
    //   168: bipush #6
    //   170: if_icmpge -> 175
    //   173: aconst_null
    //   174: areturn
    //   175: iconst_1
    //   176: istore #8
    //   178: aload #4
    //   180: ifnull -> 207
    //   183: iload #10
    //   185: invokestatic isLetterOrDigit : (I)Z
    //   188: ifne -> 207
    //   191: iload #10
    //   193: bipush #45
    //   195: if_icmpeq -> 207
    //   198: iload #10
    //   200: bipush #95
    //   202: if_icmpeq -> 207
    //   205: aconst_null
    //   206: areturn
    //   207: iinc #9, 1
    //   210: aload #4
    //   212: ifnull -> 49
    //   215: aload_2
    //   216: iload #5
    //   218: iload #9
    //   220: iload #5
    //   222: isub
    //   223: invokestatic Zo : ([BII)Ljava/lang/String;
    //   226: astore #10
    //   228: aload #10
    //   230: aload_1
    //   231: aload_0
    //   232: getfield ZF : Lburp/Zbnt;
    //   235: invokestatic ZL : (Ljava/lang/String;Lburp/Zlit;Lburp/Zbnt;)Lburp/Zlit;
    //   238: astore #11
    //   240: aload #11
    //   242: ifnonnull -> 247
    //   245: aconst_null
    //   246: areturn
    //   247: new burp/Zg6y
    //   250: dup
    //   251: aload #11
    //   253: aload #10
    //   255: invokestatic ZK : (Ljava/lang/String;)Ljava/lang/String;
    //   258: iload_3
    //   259: iload_3
    //   260: aload #10
    //   262: invokevirtual length : ()I
    //   265: iadd
    //   266: invokespecial <init> : (Lburp/Zlit;Ljava/lang/String;II)V
    //   269: areturn
  }
  
  private boolean Zt(byte[] paramArrayOfbyte, int paramInt) {
    return !((Boolean)ZA.ZA(paramArrayOfbyte, paramInt).orElse(Boolean.valueOf(false))).booleanValue();
  }
  
  private boolean ZH(byte[] paramArrayOfbyte, int paramInt) {
    return ((Boolean)ZZ.ZA(paramArrayOfbyte, paramInt).orElse(Boolean.valueOf(false))).booleanValue();
  }
  
  private boolean Zg(byte[] paramArrayOfbyte) {
    return (paramArrayOfbyte == null || paramArrayOfbyte.length < 6);
  }
  
  private static Zrpi<Boolean> Zu() {
    Zrpi<Boolean> zrpi = new Zrpi();
    zrpi.ZG(Zg, Boolean.valueOf(true));
    zrpi.ZG(ZV, Boolean.valueOf(true));
    zrpi.ZG(Zi, Boolean.valueOf(true));
    return zrpi;
  }
  
  private static Zrpi<Boolean> ZZ() {
    Zrpi<Boolean> zrpi = new Zrpi(false);
    for (byte[] arrayOfByte : ZC)
      zrpi.ZG(arrayOfByte, Boolean.valueOf(true)); 
    return zrpi;
  }
  
  static {
    for (byte[] arrayOfByte : Ze)
      Zk.add(Zto.ZM(Integer.valueOf(arrayOfByte.length), Zzrd.ZJ(arrayOfByte, true, false))); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zeg_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */