package burp;

import java.util.ArrayList;
import java.util.List;
import net.portswigger.Zkb;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zm_g implements Zkfg {
  private static final Zzrd[][] ZH = new Zzrd[][] { Zldu.ZG };
  
  private boolean[][][] ZX;
  
  private boolean[][][] ZN;
  
  private boolean[][] Zh;
  
  private boolean[] ZP;
  
  private final Zbnt Zk;
  
  private final Ze3n Zg;
  
  private final Ztai Zd;
  
  private byte Zu;
  
  private Zshr ZZ = Zshr.NOT_DONE;
  
  public Zm_g(Zbnt paramZbnt, Ze3n paramZe3n, Ztai paramZtai) {
    this.Zk = paramZbnt;
    this.Zg = paramZe3n;
    this.Zd = paramZtai;
  }
  
  public Zl6l ZH(Zmhe paramZmhe, int paramInt, byte paramByte1, boolean paramBoolean, byte paramByte2, byte[] paramArrayOfbyte, Zs2i paramZs2i, Zxs7 paramZxs7, Zlvf paramZlvf) {
    int[] arrayOfInt = Zz6s.Zp();
    if (this.ZZ == Zshr.RESEND_NEXT) {
      Zr();
      Zzud zzud = paramZmhe.Zb().ZM();
      ZV(zzud.ZV());
      this.ZZ = Zshr.ISSUED;
      if (arrayOfInt == null) {
        ZV(paramZmhe.ZN());
        return ZB(paramZmhe, paramInt, paramByte1, paramBoolean, paramByte2, paramArrayOfbyte, paramZs2i, paramZxs7, paramZlvf);
      } 
      return ZB(paramZmhe, paramInt, paramByte1, paramBoolean, paramByte2, paramArrayOfbyte, paramZs2i, paramZxs7, paramZlvf);
    } 
    ZV(paramZmhe.ZN());
    return ZB(paramZmhe, paramInt, paramByte1, paramBoolean, paramByte2, paramArrayOfbyte, paramZs2i, paramZxs7, paramZlvf);
  }
  
  public void ZB() {
    Zr();
    this.ZZ = Zshr.NOT_DONE;
  }
  
  private void Zr() {
    this.ZX = null;
    this.ZN = null;
    this.Zh = null;
    this.ZP = null;
  }
  
  private void ZV(List<Zb6q> paramList) {
    int[] arrayOfInt = Zz6s.Zp();
    if (this.ZX != null || this.ZN != null || this.Zh != null)
      return; 
    this.ZX = new boolean[paramList.size()][][];
    this.ZN = new boolean[paramList.size()][][];
    this.Zh = ZW(paramList);
    this.ZP = new boolean[paramList.size()];
    byte b = 0;
    while (b < paramList.size()) {
      Zstu zstu = ((Zb6q)paramList.get(b)).Za();
      if (zstu != null) {
        ZO(zstu, b, this.ZX, Zgmf.Zj);
        ZO(zstu, b, this.ZN, Zgmf.ZL);
        short s = (Zbwc.Zt((Zlit)null, zstu, Zt0k.NO_HTML_ANALYSIS, this.Zk)).Zb;
        this.ZP[b] = (s >= 500 && s < 600);
      } 
      b++;
      if (arrayOfInt == null)
        break; 
    } 
  }
  
  private void ZO(Zstu paramZstu, int paramInt, boolean[][][] paramArrayOfboolean, Zzrd[][] paramArrayOfZzrd) {
    paramArrayOfboolean[paramInt] = new boolean[paramArrayOfZzrd.length][];
    byte b = 0;
    int[] arrayOfInt = Zz6s.Zp();
    while (b < paramArrayOfZzrd.length) {
      paramArrayOfboolean[paramInt][b] = new boolean[(paramArrayOfZzrd[b]).length];
      byte b1 = 0;
      while (b1 < (paramArrayOfZzrd[b]).length) {
        if (paramArrayOfZzrd[b][b1].ZL(this.Zg.ZA().ZD()).ZP())
          paramArrayOfboolean[paramInt][b][b1] = true; 
        Zbu4 zbu4 = paramArrayOfZzrd[b][b1].ZG(paramZstu);
        if (zbu4.ZP() && !Zmhb.Zl(paramZstu, zbu4.ZR(), this.Zk))
          paramArrayOfboolean[paramInt][b][b1] = true; 
        b1++;
        if (arrayOfInt == null)
          break; 
      } 
      b++;
      if (arrayOfInt == null)
        break; 
    } 
  }
  
  private Zl6l ZB(Zmhe paramZmhe, int paramInt, byte paramByte1, boolean paramBoolean, byte paramByte2, byte[] paramArrayOfbyte, Zs2i paramZs2i, Zxs7 paramZxs7, Zlvf paramZlvf) {
    List<Zb6q> list1 = paramZmhe.ZN();
    Zzud zzud = paramZlvf.ZM();
    List<Zb6q> list2 = zzud.ZV();
    Zm4g zm4g = null;
    byte b = 0;
    boolean bool1 = this.Zd.ZS(paramZmhe.<Zvs>Zq(Zzu2.SQL_INJECTION, Zzu2.SQL_INJECTION_2ND_ORDER), Zr3z.ERROR_BASED);
    int[] arrayOfInt = Zz6s.Zp();
    boolean bool2 = this.Zd.ZS(Zzu2.XPATH_INJECTION, Zr3z.ERROR_BASED);
    if ((bool1 || bool2) && Zs2k.Zb(list1, list2)) {
      List[] arrayOfList = (List[])Zo(zzud);
      Zs2i zs2i = paramZmhe.Z_(paramArrayOfbyte, paramByte1);
      if (arrayOfList != null) {
        while (b < arrayOfList.length && arrayOfList[b] == null) {
          b++;
          if (arrayOfInt == null)
            break; 
        } 
        if (bool1) {
          Zuh.Zv((arrayOfList[b] != null), Zqf.Zx, 1L);
          zm4g = Zrg8.ZJ(paramZmhe.ZB(), paramZmhe.ZO(), 16, paramInt, (byte)2, this.Zu, paramZxs7, paramArrayOfbyte, paramZlvf.Zm(b), zs2i.ZO(), Zrlp.Zc(arrayOfList[b]));
        } 
      } 
      if (zm4g == null) {
        arrayOfList = (List[])Zi(zzud);
        if (arrayOfList != null) {
          while (b < arrayOfList.length && arrayOfList[b] == null) {
            b++;
            if (arrayOfInt == null)
              break; 
          } 
          if (bool2) {
            Zuh.Zv((arrayOfList[b] != null), Zqf.Zx, 2L);
            Zvow zvow = this.Zg.Zt().Zp(zs2i.ZE()).ZK(zs2i.ZO()).Zo(list2.get(b)).Z_(Zrlp.Zc(arrayOfList[b])).Zj((b > 0));
            zm4g = Zzwv.ZH(paramZmhe.ZB(), paramZmhe.ZO(), this.Zu, zvow, paramZxs7, paramArrayOfbyte);
          } 
        } 
      } 
      if (paramBoolean && zm4g == null) {
        arrayOfList = (List[])Zke3.ZK(zzud, this.Zk, this.ZP, this.Zh);
        if (arrayOfList != null) {
          while (b < arrayOfList.length && arrayOfList[b] == null) {
            b++;
            if (arrayOfInt == null)
              break; 
          } 
          Zuh.Zv((arrayOfList[b] != null), Zqf.Zx, 3L);
          if (bool1)
            zm4g = Zrg8.ZJ(paramZmhe.ZB(), paramZmhe.ZO(), 8, paramInt, (byte)1, (this.Zu == 0) ? paramByte2 : this.Zu, paramZxs7, paramArrayOfbyte, (b == zzud.Zq()) ? paramZlvf : paramZlvf.Zm(b), zs2i.ZO(), Zrlp.Zc(arrayOfList[b])); 
        } 
      } 
    } 
    if (this.ZZ == Zshr.NOT_DONE && zm4g != null)
      this.ZZ = Zshr.RESEND_NEXT; 
    return new Zl6l(Zkb.ZG(paramArrayOfbyte), paramZs2i, paramZlvf, zm4g, b);
  }
  
  private boolean[][] ZW(List<Zb6q> paramList) {
    boolean[][][] arrayOfBoolean = new boolean[paramList.size()][][];
    byte b = 0;
    int[] arrayOfInt = Zz6s.Zp();
    while (b < paramList.size()) {
      Zstu zstu = ((Zb6q)paramList.get(b)).Za();
      if (zstu != null)
        ZO(zstu, b, arrayOfBoolean, ZH); 
      b++;
      if (arrayOfInt == null)
        break; 
    } 
    return arrayOfBoolean[0];
  }
  
  private List<int[]>[] Zo(Zzud paramZzud) {
    return ZC(Zgmf.Zj, this.ZX, paramZzud);
  }
  
  private List<int[]>[] Zi(Zzud paramZzud) {
    return ZC(Zgmf.ZL, this.ZN, paramZzud);
  }
  
  private List<int[]>[] ZC(Zzrd[][] paramArrayOfZzrd, boolean[][][] paramArrayOfboolean, Zzud paramZzud) {
    // Byte code:
    //   0: aload_3
    //   1: invokeinterface Zq : ()I
    //   6: iconst_1
    //   7: iadd
    //   8: anewarray java/util/List
    //   11: astore #5
    //   13: invokestatic Zp : ()[I
    //   16: iconst_0
    //   17: istore #6
    //   19: astore #4
    //   21: iconst_0
    //   22: istore #7
    //   24: iload #7
    //   26: aload #5
    //   28: arraylength
    //   29: if_icmpge -> 125
    //   32: iload #7
    //   34: aload #5
    //   36: arraylength
    //   37: iconst_1
    //   38: isub
    //   39: if_icmpne -> 55
    //   42: aload_3
    //   43: invokeinterface Zl : ()Lburp/Zstu;
    //   48: astore #8
    //   50: aload #4
    //   52: ifnonnull -> 78
    //   55: aload_3
    //   56: invokeinterface ZV : ()Ljava/util/List;
    //   61: iload #7
    //   63: invokeinterface get : (I)Ljava/lang/Object;
    //   68: checkcast burp/Zb6q
    //   71: invokeinterface Za : ()Lburp/Zstu;
    //   76: astore #8
    //   78: aload #8
    //   80: ifnonnull -> 86
    //   83: goto -> 125
    //   86: aload #5
    //   88: iload #7
    //   90: aload_0
    //   91: aload_1
    //   92: aload_2
    //   93: aload #8
    //   95: iload #7
    //   97: invokevirtual Zs : ([[Lburp/Zzrd;[[[ZLburp/Zstu;I)Ljava/util/List;
    //   100: aastore
    //   101: aload #5
    //   103: iload #7
    //   105: aaload
    //   106: ifnull -> 117
    //   109: iconst_1
    //   110: istore #6
    //   112: aload #4
    //   114: ifnonnull -> 125
    //   117: iinc #7, 1
    //   120: aload #4
    //   122: ifnonnull -> 24
    //   125: iload #6
    //   127: ifeq -> 135
    //   130: aload #5
    //   132: goto -> 136
    //   135: aconst_null
    //   136: areturn
  }
  
  private List<int[]> Zs(Zzrd[][] paramArrayOfZzrd, boolean[][][] paramArrayOfboolean, Zstu paramZstu, int paramInt) {
    ArrayList<int[]> arrayList = null;
    byte b = 0;
    int[] arrayOfInt = Zz6s.Zp();
    while (b < paramArrayOfZzrd.length) {
      byte b1 = 0;
      while (b1 < (paramArrayOfZzrd[b]).length) {
        if (paramArrayOfboolean.length <= paramInt || !paramArrayOfboolean[paramInt][b][b1]) {
          Zbu4 zbu4 = paramArrayOfZzrd[b][b1].ZG(paramZstu);
          if (zbu4.ZP() && !Zmhb.Zl(paramZstu, zbu4.ZR(), this.Zk)) {
            if (arrayList == null)
              arrayList = new ArrayList(); 
            arrayList.add(zbu4.Z_());
            this.Zu = b;
          } 
        } 
        b1++;
        if (arrayOfInt == null)
          break; 
      } 
      b = (byte)(b + 1);
      if (arrayOfInt == null)
        break; 
    } 
    return (List<int[]>)arrayList;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zm_g.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */