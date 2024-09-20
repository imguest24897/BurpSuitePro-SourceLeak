package burp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.stream.Stream;
import net.portswigger.Zms;
import net.portswigger.Zrmr;
import net.portswigger.Zs7;
import net.portswigger.Zsy;
import net.portswigger.Zt0;
import net.portswigger.Zv2;
import net.portswigger.Zzz;

public class Zg_z implements Zstg {
  private final String ZE;
  
  private final String Zg;
  
  private final List<String> ZH = new ArrayList<>();
  
  private String ZL;
  
  private Zmtz ZP;
  
  private static final String a;
  
  public Zg_z(String paramString1, String paramString2) {
    this.ZE = paramString1;
    this.Zg = paramString2;
  }
  
  public Zt3i ZP() {
    return (this.ZP == null) ? null : new Zt3i(this.ZE, String.join(a, (Iterable)this.ZH), this.ZL, Zzav.PATH, this.ZP);
  }
  
  public void ZY(Zs7 paramZs7) {
    Zo((Zv2<Number>)paramZs7);
  }
  
  public void ZC(Zrmr paramZrmr) {
    // Byte code:
    //   0: invokestatic Zf : ()[I
    //   3: astore_2
    //   4: aload_1
    //   5: invokevirtual Zm9 : ()Ljava/util/List;
    //   8: invokeinterface isEmpty : ()Z
    //   13: ifne -> 27
    //   16: aload_0
    //   17: getstatic burp/Zmtz.ENUMERATION : Lburp/Zmtz;
    //   20: putfield ZP : Lburp/Zmtz;
    //   23: aload_2
    //   24: ifnonnull -> 34
    //   27: aload_0
    //   28: getstatic burp/Zmtz.TEXT : Lburp/Zmtz;
    //   31: putfield ZP : Lburp/Zmtz;
    //   34: aload_0
    //   35: aload_1
    //   36: invokevirtual Zmx : ()Ljava/lang/String;
    //   39: putfield ZL : Ljava/lang/String;
    //   42: aload_0
    //   43: aload_1
    //   44: aload_1
    //   45: invokevirtual Zmk : ()Ljava/util/List;
    //   48: aload_1
    //   49: invokevirtual Zm9 : ()Ljava/util/List;
    //   52: invokevirtual Zd : (Lnet/portswigger/Zms;Ljava/util/List;Ljava/util/List;)V
    //   55: return
  }
  
  public void Zz(Zzz paramZzz) {
    Zo((Zv2<Number>)paramZzz);
  }
  
  private <T extends Number> void Zo(Zv2<T> paramZv2) {
    this.ZP = Zmtz.NUMBER;
    this.ZL = paramZv2.description();
    ArrayList<Number> arrayList = new ArrayList();
    if (paramZv2.min() != null)
      arrayList.add(paramZv2.min()); 
    if (paramZv2.max() != null)
      arrayList.add(paramZv2.max()); 
    Zd((Zms)paramZv2, paramZv2.examples(), arrayList);
    if (paramZv2.examples().isEmpty() && arrayList.isEmpty()) {
      this.ZH.add("0");
      this.ZH.add("1");
    } 
  }
  
  public void Zr(Zt0 paramZt0) {
    this.ZP = Zmtz.BOOLEAN;
    this.ZL = paramZt0.Zg1();
    Zd((Zms)paramZt0, paramZt0.Zgl(), Arrays.asList((Object[])new Boolean[] { Boolean.valueOf(false), Boolean.valueOf(true) }));
  }
  
  private void Zd(Zms paramZms, List<?> paramList1, List<?> paramList2) {
    Objects.requireNonNull(this.ZH);
    Stream.concat(paramList1.stream(), paramList2.stream()).distinct().map(String::valueOf).forEach(this.ZH::add);
    if (this.ZH.isEmpty()) {
      Zio zio = (new Zio()).Zn(this.ZE);
      paramZms.ZF(new Zrcz(zio));
      paramZms.ZF(new Zrc6(zio));
      paramZms.ZF(new Zrcf(zio));
      this.ZH.add((new Ztvu(new Zsy(this.Zg + this.Zg))).Za(zio.Zb()));
    } 
  }
  
  static {
    // Byte code:
    //   0: bipush #60
    //   2: ldc 'V'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zg_z.a : Ljava/lang/String;
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
    //   80: bipush #70
    //   82: goto -> 112
    //   85: bipush #7
    //   87: goto -> 112
    //   90: bipush #56
    //   92: goto -> 112
    //   95: bipush #95
    //   97: goto -> 112
    //   100: bipush #50
    //   102: goto -> 112
    //   105: bipush #56
    //   107: goto -> 112
    //   110: bipush #117
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zg_z.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */