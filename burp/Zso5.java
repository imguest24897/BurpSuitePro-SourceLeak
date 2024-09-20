package burp;

import java.util.List;
import java.util.Objects;
import net.portswigger.Zi7;
import net.portswigger.Zv3;

public interface Zso5 extends Zxss {
  public static final Zeu4<Zso5> Zr;
  
  public static final String a;
  
  List<Ze7n> ZFC();
  
  Zmfl ZF1();
  
  String ZFL();
  
  String ZFA();
  
  Zlit ZFP();
  
  default Zski ZFy() {
    return Zski.Zf(ZFP());
  }
  
  default boolean Zu(Zgyy paramZgyy) {
    if (paramZgyy instanceof Zso5) {
      Zso5 zso5 = (Zso5)paramZgyy;
      if (Objects.equals(ZFP(), zso5.ZFP()) && Objects.equals(ZFL(), zso5.ZFL()) && Objects.equals(ZF1(), zso5.ZF1()) && Objects.equals(ZFC(), zso5.ZFC()) && Objects.equals(ZFA(), zso5.ZFA()));
    } 
    return false;
  }
  
  default Zlvj ZY() {
    return (new Zkke(Zt(), ZFP())).ZH(a).Zz(Zsba.JSON.ZE()).Zm(Zsvv.Zm((Zi7)Zv3.Zx(ZFA()))).Zx(ZF1()).Zn(ZFL()).Zg(ZFC()).ZA();
  }
  
  default Zz3o Zt() {
    return Zz3o.DISCOVERED_GRAPHQL_OPERATION;
  }
  
  default <T> T ZJ(Zzbv<T> paramZzbv) {
    return paramZzbv.ZO(this);
  }
  
  default Zeu4<? extends Zrp0> ZF() {
    return (Zeu4)Zr;
  }
  
  static {
    // Byte code:
    //   0: bipush #37
    //   2: ldc 'lE)Y'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zso5.a : Ljava/lang/String;
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
    //   80: bipush #25
    //   82: goto -> 112
    //   85: bipush #47
    //   87: goto -> 112
    //   90: bipush #95
    //   92: goto -> 112
    //   95: bipush #40
    //   97: goto -> 112
    //   100: bipush #103
    //   102: goto -> 112
    //   105: bipush #127
    //   107: goto -> 112
    //   110: bipush #79
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
    //   154: new burp/Zk6g
    //   157: dup
    //   158: invokespecial <init> : ()V
    //   161: putstatic burp/Zso5.Zr : Lburp/Zeu4;
    //   164: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zso5.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */