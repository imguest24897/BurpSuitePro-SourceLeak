package burp;

import java.util.Comparator;
import java.util.EnumSet;
import java.util.List;

public class Zmvg {
  public static final Comparator<Zgkc> ZS = Zmvg::lambda$static$0;
  
  protected final EnumSet<Zzqz> ZC;
  
  private static final Zxll ZL = new Zxll(new Zt97(new Zxn2(new Zg1f(new Zt6_(new Zgq9(new Zlet(new Zs7y())))))));
  
  protected static final Zxll ZE = new Zxll(new Zt97(new Zxn2(new Zg1f(new Zmyl(new Zt6_(new Zlet(new Zs7y())))))));
  
  protected static final Zxll Zp = new Zxll(new Zt97(new Zg1f(new Zt6_(new Zlet(new Zs7y())))));
  
  protected static final Zxll ZW = new Zxll(new Zt97(new Zg1f(new Zt6_(new Zs7y()))));
  
  protected static final Zxll Zg = new Zxll(new Zt97(new Zxn2(new Zg1f(new Zlet(new Zs7y())))));
  
  public static final Zxll ZU = new Zxll(new Zgq9(new Zzyy(new Zs7y())));
  
  private static int[] Zw;
  
  public Zmvg() {
    this(EnumSet.noneOf(Zzqz.class));
  }
  
  public Zmvg(EnumSet<Zzqz> paramEnumSet) {
    this.ZC = paramEnumSet;
  }
  
  public final boolean Zv() {
    return this.ZC.contains(Zzqz.VARIANT);
  }
  
  public final boolean ZG() {
    return this.ZC.contains(Zzqz.FLAGS);
  }
  
  public Zl4m Zc(Zrdb paramZrdb1, Zrdb paramZrdb2, Zgvn paramZgvn, Zz1h paramZz1h) {
    return ZL.Zi(paramZrdb1, paramZrdb2, paramZz1h);
  }
  
  public String Zi(Zvs paramZvs, byte paramByte1, int paramInt, Ztlj paramZtlj, Ztub paramZtub, Zefg<Zxtl> paramZefg, Zmzk paramZmzk, byte[] paramArrayOfbyte, byte paramByte2, byte paramByte3) {
    return null;
  }
  
  public String Zt(Zvs paramZvs, byte paramByte, int paramInt, Ztlj paramZtlj, Ztub paramZtub, Zefg<Zxtl> paramZefg) {
    return null;
  }
  
  protected static Zl4m Zy(Zrdb paramZrdb1, Zrdb paramZrdb2, Zrbe paramZrbe, Zz1h paramZz1h) {
    return (new Zxll(new Zt97(new Zxn2(new Zzhn(new Zt6_(new Zz9b(paramZrbe, new Zs7y()))))))).Zi(paramZrdb1, paramZrdb2, paramZz1h);
  }
  
  protected static Zl4m ZY(Zrdb paramZrdb1, Zrdb paramZrdb2, Zrbe paramZrbe, Zz1h paramZz1h) {
    return (new Zt97(new Zxll(new Zz9b(paramZrbe, new Zs7y())))).Zi(paramZrdb1, paramZrdb2, paramZz1h);
  }
  
  protected static Zl4m ZQ(Zrdb paramZrdb1, Zrdb paramZrdb2, Zb0f paramZb0f, Zz1h paramZz1h) {
    return (new Zt97(new Zxll(new Zrxi(new Zs7y(), paramZb0f)))).Zi(paramZrdb1, paramZrdb2, paramZz1h);
  }
  
  public static Zl4m Zl(Zrdb paramZrdb1, Zrdb paramZrdb2) {
    return (paramZrdb1.Zam() == paramZrdb2.Zam()) ? null : ((paramZrdb1.Zam() == 0 && paramZrdb2.Zam() != 0) ? Zl4m.Zf : ((paramZrdb2.Zam() == 0 && paramZrdb1.Zam() != 0) ? Zl4m.Zh : (((paramZrdb1.Zam() & paramZrdb2.Zam()) == paramZrdb1.Zam()) ? Zl4m.Zf : (((paramZrdb2.Zam() & paramZrdb1.Zam()) == paramZrdb2.Zam()) ? Zl4m.Zh : ((paramZrdb1.Zam() != paramZrdb2.Zam()) ? Zl4m.ZX : null)))));
  }
  
  public String Z_(List<Zrdb> paramList) {
    return Zmey.Ze(paramList);
  }
  
  public byte Zf(Ztlj paramZtlj, Ztub paramZtub, byte paramByte) {
    return paramByte;
  }
  
  public byte Zj(Ztlj paramZtlj, Ztub paramZtub, byte paramByte, int paramInt, Zs66 paramZs66, byte[] paramArrayOfbyte, Zrdb paramZrdb) {
    return paramByte;
  }
  
  public byte ZV(Ztlj paramZtlj, Ztub paramZtub, byte paramByte) {
    return paramByte;
  }
  
  public Comparator<Zgkc> ZC() {
    return ZS;
  }
  
  public int ZA() {
    return 3;
  }
  
  private static int lambda$static$0(Zgkc paramZgkc1, Zgkc paramZgkc2) {
    return 0;
  }
  
  public static void Zg(int[] paramArrayOfint) {
    Zw = paramArrayOfint;
  }
  
  public static int[] ZX() {
    return Zw;
  }
  
  static {
    Zg(null);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmvg.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */