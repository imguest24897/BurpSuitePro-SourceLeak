package burp;

import java.util.List;
import java.util.Optional;

public class Ztd_ {
  private final Ze3n Zn;
  
  private final Zsiw Zi;
  
  private final Zg8t ZC;
  
  private final List<Zlew> Zr;
  
  private final List<Ze6q> Zm;
  
  private static final String a;
  
  public Ztd_(Ze3n paramZe3n, Zsiw paramZsiw) {
    this.Zn = paramZe3n;
    this.Zi = paramZsiw;
    this.ZC = new Zg8t(paramZe3n);
    this.Zr = List.of(new Zle_(paramZsiw), new Zlen(paramZsiw));
    int i = Zlme.Zg();
    this.Zm = List.of(new Ze6h(), new Ze67());
    if (Zbqc.Zwu() == null)
      Zlme.ZE(++i); 
  }
  
  public Optional<Zlme> ZZ() {
    int i = Zlme.ZP();
    Zlme zlme = Zlme.Zf();
    if (!this.Zi.ZX()) {
      Optional<Zlme> optional = ZW(zlme, (List)this.Zr);
      if (optional.isPresent()) {
        zlme = optional.get();
        if (i == 0)
          return Optional.empty(); 
      } else {
        return Optional.empty();
      } 
    } 
    boolean bool = this.Zn.ZA().ZG().stream().map(String::toLowerCase).anyMatch(Ztd_::lambda$findValidTokenAndRefererBypasses$0);
    if (bool) {
      Optional<Zlme> optional = ZW(zlme, (List)this.Zm);
      if (optional.isPresent()) {
        zlme = optional.get();
        if (i == 0)
          return Optional.empty(); 
      } else {
        return Optional.empty();
      } 
    } 
    return Optional.of(zlme);
  }
  
  private Optional<Zlme> ZW(Zlme paramZlme, List<? extends Zeni> paramList) {
    int i = Zlme.ZP();
    for (Zeni zeni : paramList) {
      Zg3d zg3d = this.ZC.ZH(paramZlme.Za().ZY(zeni.ZY()));
      if (this.ZC.Zz(zg3d))
        return Optional.of(paramZlme.Zy(zeni, zg3d)); 
      if (i == 0)
        break; 
    } 
    return Optional.empty();
  }
  
  private static boolean lambda$findValidTokenAndRefererBypasses$0(String paramString) {
    return paramString.startsWith(a.toLowerCase());
  }
  
  static {
    // Byte code:
    //   0: bipush #45
    //   2: ldc '3'_g%\\f'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Ztd_.a : Ljava/lang/String;
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
    //   80: bipush #124
    //   82: goto -> 112
    //   85: bipush #123
    //   87: goto -> 112
    //   90: bipush #108
    //   92: goto -> 112
    //   95: bipush #23
    //   97: goto -> 112
    //   100: bipush #56
    //   102: goto -> 112
    //   105: bipush #109
    //   107: goto -> 112
    //   110: bipush #83
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztd_.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */