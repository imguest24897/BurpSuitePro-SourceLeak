package burp;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import net.portswigger.Zkb;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zeza extends Zez7 {
  private final Zr69 ZX;
  
  private final Zl7h ZW;
  
  private final Ztos<Zt35> Zs;
  
  private final Zr_4 Zf;
  
  private final Zkl6 ZV;
  
  private volatile Zgrn Zg;
  
  private static final String a;
  
  public Zeza(byte paramByte, Zr69 paramZr69, Zl7h paramZl7h, Ztos<Zt35> paramZtos, Zr_4 paramZr_4, Zkl6 paramZkl6) {
    super(paramByte);
    this.ZX = paramZr69;
    this.ZW = paramZl7h;
    this.Zs = paramZtos;
    this.Zf = paramZr_4;
    this.ZV = paramZkl6;
  }
  
  public String Zp() {
    return a;
  }
  
  public boolean ZN(Zsiv paramZsiv) {
    // Byte code:
    //   0: new java/util/ArrayList
    //   3: dup
    //   4: aload_0
    //   5: getfield ZW : Lburp/Zl7h;
    //   8: invokestatic Zf : (Lburp/Zl7h;)Ljava/util/List;
    //   11: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   16: ldc burp/Zxss
    //   18: dup
    //   19: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   22: pop
    //   23: <illegal opcode> test : (Ljava/lang/Class;)Ljava/util/function/Predicate;
    //   28: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   33: ldc burp/Zxss
    //   35: dup
    //   36: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   39: pop
    //   40: <illegal opcode> apply : (Ljava/lang/Class;)Ljava/util/function/Function;
    //   45: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   50: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   55: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   60: invokeinterface toList : ()Ljava/util/List;
    //   65: invokespecial <init> : (Ljava/util/Collection;)V
    //   68: astore_3
    //   69: invokestatic Zv : ()Ljava/lang/String;
    //   72: aload_0
    //   73: aload_0
    //   74: getfield Zs : Lburp/Ztos;
    //   77: getstatic burp/Zt35.ZO : Lburp/Zlnb;
    //   80: aload_0
    //   81: aload_1
    //   82: <illegal opcode> accept : (Lburp/Zeza;Lburp/Zsiv;)Ljava/util/function/Consumer;
    //   87: invokevirtual ZE : (Lburp/Zlnb;Ljava/util/function/Consumer;)Lburp/Zgrn;
    //   90: putfield Zg : Lburp/Zgrn;
    //   93: astore_2
    //   94: aload_3
    //   95: invokeinterface isEmpty : ()Z
    //   100: ifeq -> 120
    //   103: aload_0
    //   104: getfield ZX : Lburp/Zr69;
    //   107: invokeinterface ZU : ()Z
    //   112: ifeq -> 120
    //   115: aload_0
    //   116: invokevirtual Zu : ()Ljava/util/List;
    //   119: astore_3
    //   120: aload_3
    //   121: aload_0
    //   122: aload_1
    //   123: <illegal opcode> accept : (Lburp/Zeza;Lburp/Zsiv;)Ljava/util/function/Consumer;
    //   128: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   133: aload_3
    //   134: invokeinterface isEmpty : ()Z
    //   139: ifne -> 146
    //   142: iconst_1
    //   143: goto -> 147
    //   146: iconst_0
    //   147: invokestatic Zwu : ()[Lburp/Zbqc;
    //   150: ifnonnull -> 158
    //   153: ldc 'cwWmr'
    //   155: invokestatic Zj : (Ljava/lang/String;)V
    //   158: ireturn
  }
  
  private void Zq(Zsiv paramZsiv, Zrp0 paramZrp0) {
    if (paramZrp0 instanceof Zxss) {
      Zxss zxss = (Zxss)paramZrp0;
      if (zxss.Zt() == Zz3o.DISCOVERED_GRAPHQL_OPERATION)
        paramZsiv.ZS(Zeza::lambda$handleExitPending$4, this.Zs); 
    } 
  }
  
  private List<Zgyy> Zu() {
    ArrayList<Zgyy> arrayList = new ArrayList();
    Set set = (Set)this.ZW.ZVe().ZBZ().stream().map(Zeza::lambda$generatePotentialGraphQlEndpoints$5).collect(Collectors.toSet());
    List<Zsss> list = List.of(Zsss.POST, Zsss.GET);
    String str = Zez7.Zv();
    for (Zmzk zmzk : set) {
      for (String str1 : Zkh8.ZG) {
        for (Zde zde : list) {
          Zm55 zm55 = Zm55.ZK(this.Zf.<Zlit>ZH(new Zlgb(zmzk, Zkb.Zy(str1))), zde, this.Zf, this.ZV);
          List<Zgyy> list1 = Zr4x.ZC(this.ZW.ZVe(), zm55, this.ZX, this.Zs, this.Zf, this.ZV);
          this.ZW.ZVe().Za(list1);
          arrayList.addAll(list1);
          if (str == null)
            break; 
        } 
        if (str == null)
          break; 
      } 
      if (str == null)
        break; 
    } 
    return arrayList;
  }
  
  public void Zl(Zsiv paramZsiv, Zt1g paramZt1g) {
    Zuh.Zb((this.Zg != null), Zqf.Zr);
    if (this.Zg != null)
      this.Zg.ZZ(); 
    this.Zg = null;
  }
  
  public boolean Zg() {
    return false;
  }
  
  public String toString() {
    return Zp();
  }
  
  private static Zmzk lambda$generatePotentialGraphQlEndpoints$5(Zski paramZski) {
    return paramZski.ZyR().Zdz();
  }
  
  private static boolean lambda$handleExitPending$4(Zrp0 paramZrp0) {
    if (paramZrp0 instanceof Zxss) {
      Zxss zxss = (Zxss)paramZrp0;
      if (zxss.Zt() == Zz3o.GRAPHQL_INTROSPECTION);
    } 
    return false;
  }
  
  private void lambda$beforeStart$3(Zsiv paramZsiv, Zgyy paramZgyy) {
    paramZsiv.Zx(Zs_g.Zw(paramZgyy), this.ZX, this.Zs);
  }
  
  private void lambda$beforeStart$2(Zsiv paramZsiv, Zxr8 paramZxr8) {
    // Byte code:
    //   0: aload_2
    //   1: aload_0
    //   2: aload_1
    //   3: <illegal opcode> accept : (Lburp/Zeza;Lburp/Zsiv;)Ljava/util/function/Consumer;
    //   8: invokevirtual ZP : (Ljava/util/function/Consumer;)V
    //   11: return
  }
  
  private void lambda$beforeStart$1(Zsiv paramZsiv, Zrp0 paramZrp0) {
    Zq(paramZsiv, paramZrp0);
  }
  
  private static boolean lambda$beforeStart$0(Zxss paramZxss) {
    return (paramZxss.Zt() == Zz3o.GRAPHQL_INTROSPECTION);
  }
  
  static {
    // Byte code:
    //   0: bipush #95
    //   2: ldc 'r"#' D">h1\\bW;8.VX/ !E'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zeza.a : Ljava/lang/String;
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
    //   80: bipush #105
    //   82: goto -> 112
    //   85: bipush #20
    //   87: goto -> 112
    //   90: bipush #15
    //   92: goto -> 112
    //   95: bipush #32
    //   97: goto -> 112
    //   100: bipush #23
    //   102: goto -> 112
    //   105: bipush #41
    //   107: goto -> 112
    //   110: bipush #37
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zeza.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */