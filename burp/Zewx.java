package burp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Optional;
import net.portswigger.Zen;
import net.portswigger.Zkb;
import net.portswigger.Zli;

public class Zewx implements Zs40 {
  public static final EnumSet<Zb25> ZA = EnumSet.of(Zb25.DNS);
  
  public static final EnumSet<Zb25> ZP = EnumSet.allOf(Zb25.class);
  
  private final EnumSet<Zb25> Zt;
  
  private final Zlp9 ZY;
  
  private final byte[] Zh;
  
  private final byte[] ZV;
  
  private final Zen ZX;
  
  private final Zmhr Zz;
  
  private final byte Zn;
  
  private final Zs40 ZU;
  
  private static String[] ZD;
  
  public Zewx(Zen paramZen, byte[] paramArrayOfbyte, Zlp9 paramZlp9, Zmhr paramZmhr, byte paramByte, EnumSet<Zb25> paramEnumSet) {
    this(paramZen, paramArrayOfbyte, paramArrayOfbyte, paramZlp9, paramZmhr, paramByte, paramEnumSet);
  }
  
  public Zewx(Zen paramZen, byte[] paramArrayOfbyte1, byte[] paramArrayOfbyte2, Zlp9 paramZlp9, Zmhr paramZmhr, byte paramByte, EnumSet<Zb25> paramEnumSet) {
    this.ZY = paramZlp9;
    this.Zh = paramArrayOfbyte1;
    this.ZV = paramArrayOfbyte2;
    this.ZX = paramZen;
    this.Zz = paramZmhr;
    this.Zn = paramByte;
    this.Zt = paramEnumSet;
    this.ZU = new Zxnv(paramArrayOfbyte1, paramByte);
  }
  
  public List<Zl1r> Zn(Zbll paramZbll, Zxs7 paramZxs7) {
    return this.ZU.Zn(paramZbll, paramZxs7);
  }
  
  public byte[] Zh() {
    return this.Zh;
  }
  
  public byte[] ZV() {
    return this.ZV;
  }
  
  public Zlp9 ZG() {
    return this.ZY;
  }
  
  public Zs2i Zu(Zxs7 paramZxs7) {
    return paramZxs7.<Zs2i>Zk(new Zrrb(Zh(), this.Zn));
  }
  
  public boolean ZA(Zbjl paramZbjl) {
    return !paramZbjl.ZG() ? false : ((!paramZbjl.ZB().Zi() || !this.Zt.contains(Zb25.DNS) || this.Zt.size() != 1));
  }
  
  public Zmhr ZW() {
    return this.Zz;
  }
  
  public byte ZY() {
    return this.Zn;
  }
  
  public Zen ZF() {
    return this.ZX;
  }
  
  public Zl1r ZY(byte[] paramArrayOfbyte) {
    int i = Zli.ZR(paramArrayOfbyte, Zkb.Zy(this.ZX.toString()));
    if (i == -1)
      return null; 
    int j = Zli.Zw(paramArrayOfbyte, Zkb.Zy("\r"), i, paramArrayOfbyte.length);
    if (Zn())
      j = i + this.ZX.toString().length(); 
    return (j == -1) ? null : new Zl1r(i, j);
  }
  
  public Zl1r ZE(byte[] paramArrayOfbyte) {
    byte[] arrayOfByte = this.ZX.ZZ();
    int i = Zli.ZR(paramArrayOfbyte, this.ZX.ZZ());
    return (i == -1) ? null : new Zl1r(i, i + arrayOfByte.length);
  }
  
  public byte[] ZE(Zzud paramZzud) {
    ArrayList<Zb6q> arrayList = new ArrayList<>(paramZzud.ZV());
    Collections.reverse(arrayList);
    String[] arrayOfString = Zb();
    if (arrayOfString == null)
      Zbqc.Zr(new Zbqc[3]); 
    return arrayList.stream().filter(this::ZO).findFirst().map(Zewx::lambda$findReflection$0).orElse(null);
  }
  
  public Zz1_ Zd(Zesv paramZesv, Zxs7 paramZxs7, Zbjl paramZbjl, Zroy paramZroy, Zzwz paramZzwz, Zer0 paramZer0, List<Zer0> paramList, Ze3n paramZe3n) {
    return new Zz1j(paramZesv, paramZxs7, paramZbjl, paramZroy, paramZzwz, paramZer0, paramList, this, paramZe3n);
  }
  
  public Zz1_ Ze(Zbnt paramZbnt, Ze3n paramZe3n, Zmhe paramZmhe, Zbjl paramZbjl, Zzwz paramZzwz, Zer0 paramZer0, byte[] paramArrayOfbyte) {
    return new Zr5u(paramZbnt, paramZe3n, paramZer0, paramArrayOfbyte, this);
  }
  
  public Optional<Zlvf> Zs(Zmhe paramZmhe) {
    String[] arrayOfString = Zb();
    if (Zbqc.Zwu() == null)
      Z_(new String[2]); 
    return Optional.of(paramZmhe.ZK(Zri7.ZJ(new Zrrb(Zh(), ZY())), Zlp5.Zc().Zd(true)));
  }
  
  protected boolean ZO(Zb6q paramZb6q) {
    return this.ZX.ZL(paramZb6q.Za().ZiD());
  }
  
  private boolean Zn() {
    String str = ZW().ZJ(null).ZJ1();
    return (Zmab.ZC(str) || Zmab.ZE(str));
  }
  
  private static byte[] lambda$findReflection$0(Zb6q paramZb6q) {
    return paramZb6q.Za().ZiD();
  }
  
  static {
    Z_(new String[3]);
  }
  
  public static void Z_(String[] paramArrayOfString) {
    ZD = paramArrayOfString;
  }
  
  public static String[] Zb() {
    return ZD;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zewx.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */