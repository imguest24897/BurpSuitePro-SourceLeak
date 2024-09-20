package burp;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import net.portswigger.Zkb;

public class Zsus {
  public static final List<String> Zk;
  
  private final Zkl6 Zg;
  
  private final Zr_4 ZY;
  
  public Zsus(Zkl6 paramZkl6, Zr_4 paramZr_4) {
    this.Zg = paramZkl6;
    this.ZY = paramZr_4;
  }
  
  public Zbza ZL(Zkq4 paramZkq4, Zll9 paramZll9, List<int[]> paramList) {
    Zstu zstu1 = paramZll9.Zos();
    Zlit zlit = paramZll9.ZlL();
    if (zstu1 == null) {
      if (zlit == null)
        return null; 
      zstu1 = this.Zg.Zs().ZO().Zf(zlit).Zr();
    } 
    Zstu zstu2 = paramZll9.ZoO();
    return Zv(zlit.Zdz(), zstu1, zstu2, Zkb.ZG(zlit.Zd4()), paramZkq4.Zs6(), 0L, 0L, paramList);
  }
  
  public Zbza Zv(Zmzk paramZmzk, Zstu paramZstu1, Zstu paramZstu2, String paramString, boolean paramBoolean, long paramLong1, long paramLong2, List<int[]> paramList) {
    Zefg<Zrrc> zefg = ZH(paramList);
    Zey9 zey9 = this.Zg.ZH();
    int i = Zb9a.Zv();
    Zefx zefx = zey9.Zu(paramZmzk, paramZstu1);
    if (ZO(zefx)) {
      zefx = Zo(zefx, zefg);
      paramZstu2 = null;
    } 
    Map<Zro0, Zga> map = Zj(zefg, zefx);
    Zz7v zz7v = new Zz7v(paramZmzk, this.ZY.ZZ(zefx.ZD()), paramZstu2, paramString, paramBoolean, paramLong1, paramLong2, paramList, map);
    if (Zbqc.Zwu() == null)
      Zb9a.ZF(++i); 
    return this.ZY.<Zbza>ZH(zz7v);
  }
  
  public Zbza ZS(Zrnc paramZrnc, boolean paramBoolean) {
    Zzg0 zzg0 = this.ZY.<Zzg0>ZH(new Zlim(paramZrnc));
    Zey9 zey9 = this.Zg.ZH();
    Zmzk zmzk = zzg0.Zl_();
    Zstu zstu = zzg0.Zlf();
    Zefx zefx = zey9.Zu(zmzk, zstu);
    Map<Zro0, Zga> map = Zj(null, zefx);
    return this.ZY.<Zbza>ZH(new Zz7v(zzg0, map, paramBoolean));
  }
  
  private Zefg<Zrrc> ZH(List<int[]> paramList) {
    return (paramList == null) ? null : Zkk.Zx(this.ZY, Zrrc.Zm, paramList.stream().map(this::lambda$buildHighlightsFrom$0).toList());
  }
  
  private Map<Zro0, Zga> Zj(Zefg<Zrrc> paramZefg, Zefx paramZefx) {
    // Byte code:
    //   0: new java/util/HashMap
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_3
    //   8: new burp/Zzp6
    //   11: dup
    //   12: aload_2
    //   13: aload_1
    //   14: aload_0
    //   15: getfield Zg : Lburp/Zkl6;
    //   18: invokeinterface ZB : ()Lburp/Zbnt;
    //   23: invokespecial <init> : (Lburp/Zefx;Lburp/Zefg;Lburp/Zbnt;)V
    //   26: invokevirtual Zd : ()Lburp/Zzcc;
    //   29: invokevirtual ZA : ()Ljava/util/List;
    //   32: aload_0
    //   33: aload_3
    //   34: <illegal opcode> accept : (Lburp/Zsus;Ljava/util/Map;)Ljava/util/function/Consumer;
    //   39: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   44: aload_3
    //   45: areturn
  }
  
  private void Zr(Zgh_ paramZgh_, Map<Zro0, Zga> paramMap) {
    Zro0 zro0 = this.ZY.<Zro0>ZH(new Zl3(paramZgh_.ZM()));
    paramMap.put(zro0, this.ZY.<Zga>ZH(new Ztbs(zro0)));
  }
  
  private boolean ZO(Zefx paramZefx) {
    Objects.requireNonNull(paramZefx);
    return Zk.stream().anyMatch(paramZefx::Zh);
  }
  
  private Zefx Zo(Zefx paramZefx, Zefg<Zrrc> paramZefg) {
    ArrayList<String> arrayList = new ArrayList<>(paramZefx.ZG());
    byte[] arrayOfByte1 = paramZefx.ZD();
    Zrq1.ZB(paramZefg, arrayList, arrayOfByte1, this.ZY);
    byte[] arrayOfByte2 = Zljl.Zw(arrayList, arrayOfByte1, paramZefx.ZR() - 2);
    Zey9 zey9 = this.Zg.ZH();
    Zmzk zmzk = paramZefx.ZT();
    return zey9.ZY(zmzk, arrayOfByte2);
  }
  
  private void lambda$initialiseInsertionPointStates$1(Map<Zro0, Zga> paramMap, Zgh_ paramZgh_) {
    Zr(paramZgh_, paramMap);
  }
  
  private Zrrc lambda$buildHighlightsFrom$0(int[] paramArrayOfint) {
    return this.ZY.<Zrrc>ZH(new Zl1r(paramArrayOfint[0], paramArrayOfint[1]));
  }
  
  static {
    // Byte code:
    //   0: iconst_2
    //   1: anewarray java/lang/String
    //   4: astore_0
    //   5: iconst_0
    //   6: istore #4
    //   8: ldc 'Ko0V@Vb/D|lLPKo0U@\nd`x|knljx'
    //   10: dup
    //   11: astore_3
    //   12: invokevirtual length : ()I
    //   15: istore #5
    //   17: bipush #13
    //   19: istore_2
    //   20: iconst_m1
    //   21: istore_1
    //   22: bipush #114
    //   24: iinc #1, 1
    //   27: aload_3
    //   28: iload_1
    //   29: dup
    //   30: iload_2
    //   31: iadd
    //   32: invokevirtual substring : (II)Ljava/lang/String;
    //   35: iconst_m1
    //   36: goto -> 70
    //   39: aload_0
    //   40: swap
    //   41: iload #4
    //   43: iinc #4, 1
    //   46: swap
    //   47: aastore
    //   48: iload_1
    //   49: iload_2
    //   50: iadd
    //   51: dup
    //   52: istore_1
    //   53: iload #5
    //   55: if_icmpge -> 67
    //   58: aload_3
    //   59: iload_1
    //   60: invokevirtual charAt : (I)C
    //   63: istore_2
    //   64: goto -> 22
    //   67: goto -> 215
    //   70: dup_x2
    //   71: pop
    //   72: invokevirtual toCharArray : ()[C
    //   75: dup_x1
    //   76: arraylength
    //   77: dup_x2
    //   78: pop
    //   79: iconst_0
    //   80: istore #6
    //   82: dup2_x1
    //   83: pop2
    //   84: dup_x2
    //   85: iconst_1
    //   86: if_icmpgt -> 188
    //   89: dup2
    //   90: swap
    //   91: iload #6
    //   93: dup2_x1
    //   94: caload
    //   95: swap
    //   96: iload #6
    //   98: bipush #7
    //   100: irem
    //   101: tableswitch default -> 170, 0 -> 140, 1 -> 145, 2 -> 150, 3 -> 155, 4 -> 160, 5 -> 165
    //   140: bipush #112
    //   142: goto -> 172
    //   145: bipush #123
    //   147: goto -> 172
    //   150: bipush #111
    //   152: goto -> 172
    //   155: bipush #106
    //   157: goto -> 172
    //   160: bipush #93
    //   162: goto -> 172
    //   165: bipush #74
    //   167: goto -> 172
    //   170: bipush #117
    //   172: ixor
    //   173: ixor
    //   174: i2c
    //   175: castore
    //   176: iinc #6, 1
    //   179: dup
    //   180: ifne -> 188
    //   183: dup2
    //   184: dup_x1
    //   185: goto -> 93
    //   188: dup2_x1
    //   189: pop2
    //   190: dup_x2
    //   191: iload #6
    //   193: if_icmpgt -> 89
    //   196: pop
    //   197: new java/lang/String
    //   200: dup_x1
    //   201: swap
    //   202: invokespecial <init> : ([C)V
    //   205: invokevirtual intern : ()Ljava/lang/String;
    //   208: swap
    //   209: pop
    //   210: swap
    //   211: pop
    //   212: goto -> 39
    //   215: iconst_2
    //   216: anewarray java/lang/String
    //   219: dup
    //   220: iconst_0
    //   221: aload_0
    //   222: iconst_0
    //   223: aaload
    //   224: aastore
    //   225: dup
    //   226: iconst_1
    //   227: aload_0
    //   228: iconst_1
    //   229: aaload
    //   230: aastore
    //   231: invokestatic Zh : ([Ljava/lang/Object;)Ljava/util/List;
    //   234: putstatic burp/Zsus.Zk : Ljava/util/List;
    //   237: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsus.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */