package burp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;
import net.portswigger.Zdo;
import net.portswigger.Zkb;
import net.portswigger.Zli;
import net.portswigger.Zmw;

public final class Zr6q extends Zr62 implements Zefx {
  private final Zmzk ZG;
  
  private final byte[] Zt;
  
  private final Zey9 Zz;
  
  private byte[] ZK;
  
  private Integer ZW;
  
  private static final String b;
  
  Zr6q(Zmzk paramZmzk, byte[] paramArrayOfbyte, Zey9 paramZey9, Zbnt paramZbnt) {
    super(paramZbnt, paramZey9);
    this.ZG = paramZmzk;
    this.Zt = paramArrayOfbyte;
    this.Zz = paramZey9;
  }
  
  public byte[] ZD() {
    return this.Zt;
  }
  
  protected Zefx ZE() {
    return this;
  }
  
  public Zmzk ZT() {
    return this.ZG;
  }
  
  public byte[] Zw() {
    if (this.ZK == null)
      this.ZK = (ZN() >= 0) ? Arrays.copyOfRange(this.Zt, ZN(), this.Zt.length) : Zdo.ZQ; 
    return this.ZK;
  }
  
  public boolean Zh() {
    return (this.Zt == null || this.Zt.length == 0);
  }
  
  public int ZN() {
    if (this.ZW == null)
      this.ZW = Integer.valueOf(Zsbj.Zc(this.Zt)); 
    return this.ZW.intValue();
  }
  
  public void Zi(Zg5o paramZg5o) {
    paramZg5o.Zs(this);
  }
  
  public Zefx ZM(Zmzk paramZmzk) {
    return Objects.equals(paramZmzk, ZT()) ? this : this.Zz.ZY(paramZmzk, this.Zt);
  }
  
  public Zefx Zb() {
    return this;
  }
  
  public void Zh(Zbf7 paramZbf7) {
    paramZbf7.ZS(this);
  }
  
  public boolean equals(Object paramObject) {
    if (this == paramObject)
      return true; 
    if (paramObject == null || getClass() != paramObject.getClass())
      return false; 
    Zr6q zr6q = (Zr6q)paramObject;
    return (Objects.equals(this.ZG, zr6q.ZG) && Arrays.equals(this.Zt, zr6q.Zt));
  }
  
  public int hashCode() {
    null = Objects.hash(new Object[] { this.ZG });
    return 31 * null + Arrays.hashCode(this.Zt);
  }
  
  public String toString() {
    return Zkb.ZG(this.Zt);
  }
  
  public Zefx Zo() {
    ArrayList<String> arrayList = new ArrayList<>(ZG());
    List<Ztnz> list = (List)Zejx.ZV(arrayList, false).stream().map(Zr6q::lambda$upgradeToHttp2Request$0).collect(Collectors.toList());
    return this.Zz.ZR(this.ZG, list, Zw());
  }
  
  public Zefx Zp() {
    int i = Zli.Zt(this.Zt);
    int j = Zli.Zw(this.Zt, Zxk3.HTTP_V2.Za(), 0, i);
    int k = j + (Zxk3.HTTP_V2.Za()).length;
    if (k == i) {
      Zxk3 zxk3 = (Zli.ZZ(this.Zt, Zkb.Zy(b), false, 0, ZN()) != -1) ? Zxk3.HTTP_V11 : Zxk3.HTTP_V10;
      return this.Zz.ZY(this.ZG, Zmw.Zb(this.Zt, j, k, zxk3.Za()));
    } 
    return this;
  }
  
  public Zr6q Zz() {
    return this;
  }
  
  private static Ztnz lambda$upgradeToHttp2Request$0(Zges paramZges) {
    return new Ztnz(paramZges.ZN(), paramZges.ZR());
  }
  
  static {
    // Byte code:
    //   0: bipush #33
    //   2: ldc 'vm2 sg'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zr6q.b : Ljava/lang/String;
    //   11: goto -> 154
    //   14: dup_x2
    //   15: pop
    //   16: invokevirtual toCharArray : ()[C
    //   19: dup_x1
    //   20: arraylength
    //   21: dup_x2
    //   22: pop
    //   23: iconst_0
    //   24: istore_0
    //   25: dup2_x1
    //   26: pop2
    //   27: dup_x2
    //   28: iconst_1
    //   29: if_icmpgt -> 128
    //   32: dup2
    //   33: swap
    //   34: iload_0
    //   35: dup2_x1
    //   36: caload
    //   37: swap
    //   38: iload_0
    //   39: bipush #7
    //   41: irem
    //   42: tableswitch default -> 110, 0 -> 80, 1 -> 85, 2 -> 90, 3 -> 95, 4 -> 100, 5 -> 105
    //   80: bipush #90
    //   82: goto -> 112
    //   85: bipush #70
    //   87: goto -> 112
    //   90: bipush #91
    //   92: goto -> 112
    //   95: bipush #110
    //   97: goto -> 112
    //   100: bipush #33
    //   102: goto -> 112
    //   105: bipush #50
    //   107: goto -> 112
    //   110: bipush #62
    //   112: ixor
    //   113: ixor
    //   114: i2c
    //   115: castore
    //   116: iinc #0, 1
    //   119: dup
    //   120: ifne -> 128
    //   123: dup2
    //   124: dup_x1
    //   125: goto -> 35
    //   128: dup2_x1
    //   129: pop2
    //   130: dup_x2
    //   131: iload_0
    //   132: if_icmpgt -> 32
    //   135: pop
    //   136: new java/lang/String
    //   139: dup_x1
    //   140: swap
    //   141: invokespecial <init> : ([C)V
    //   144: invokevirtual intern : ()Ljava/lang/String;
    //   147: swap
    //   148: pop
    //   149: swap
    //   150: pop
    //   151: goto -> 8
    //   154: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zr6q.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */