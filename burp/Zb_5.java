package burp;

import java.util.Set;
import java.util.function.Consumer;

public class Zb_5 implements Zrcg {
  private final Zg0g Zj;
  
  private final Zmz6 Ze;
  
  private final Zgb6 Zs;
  
  private final Ztai ZN;
  
  private final Zkc ZR;
  
  private final Zlba Zf;
  
  private final Zr_4 Zg;
  
  private final Zssh Zh;
  
  private final Zz1h ZE;
  
  private final Zz1i ZA;
  
  private final Zbza Zr;
  
  private final Znn ZK;
  
  private final Consumer<Ze3n> ZZ;
  
  private final Zz1m<Zt1o> ZD;
  
  Zb_5(Zg0g paramZg0g, Zmz6 paramZmz6, Zgb6 paramZgb6, Ztai paramZtai, Zkc paramZkc, Zlba paramZlba, Zr_4 paramZr_4, Zssh paramZssh, Zz1h paramZz1h, Zz1i paramZz1i, Zbza paramZbza, Znn paramZnn, Consumer<Ze3n> paramConsumer, Zz1m<Zt1o> paramZz1m) {
    this.Zj = paramZg0g;
    this.Ze = paramZmz6;
    this.Zs = paramZgb6;
    this.ZN = paramZtai;
    this.ZR = paramZkc;
    this.Zf = paramZlba;
    this.Zg = paramZr_4;
    this.Zh = paramZssh;
    this.ZE = paramZz1h;
    this.ZA = paramZz1i;
    this.Zr = paramZbza;
    this.ZK = paramZnn;
    this.ZZ = paramConsumer;
    this.ZD = paramZz1m;
  }
  
  public Set<? extends Zmgr> Zc() {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZR : Lburp/Zkc;
    //   4: aload_0
    //   5: getfield Zr : Lburp/Zbza;
    //   8: invokevirtual ZI : (Lburp/Zbza;)Lburp/Ze3n;
    //   11: astore_2
    //   12: invokestatic ZV : ()Ljava/lang/String;
    //   15: aload_0
    //   16: getfield ZZ : Ljava/util/function/Consumer;
    //   19: aload_2
    //   20: invokeinterface accept : (Ljava/lang/Object;)V
    //   25: new java/util/HashSet
    //   28: dup
    //   29: invokespecial <init> : ()V
    //   32: astore_3
    //   33: new burp/Ztgb
    //   36: dup
    //   37: aload_0
    //   38: getfield Ze : Lburp/Zmz6;
    //   41: aload_0
    //   42: getfield Zf : Lburp/Zlba;
    //   45: aload_0
    //   46: getfield Zr : Lburp/Zbza;
    //   49: invokespecial <init> : (Lburp/Zmz6;Lburp/Zlba;Lburp/Zbza;)V
    //   52: astore #4
    //   54: new java/util/concurrent/atomic/AtomicInteger
    //   57: dup
    //   58: invokespecial <init> : ()V
    //   61: astore #5
    //   63: astore_1
    //   64: new burp/Zo
    //   67: dup
    //   68: aload_0
    //   69: getfield ZN : Lburp/Ztai;
    //   72: aload_0
    //   73: getfield Zg : Lburp/Zr_4;
    //   76: aload_0
    //   77: getfield Zh : Lburp/Zssh;
    //   80: aload_0
    //   81: getfield ZE : Lburp/Zz1h;
    //   84: aload #4
    //   86: invokespecial <init> : (Lburp/Ztai;Lburp/Zr_4;Lburp/Zssh;Lburp/Zz1h;Lburp/Ztgb;)V
    //   89: astore #6
    //   91: aload_0
    //   92: getfield Zj : Lburp/Zg0g;
    //   95: aload_2
    //   96: invokeinterface ZJ : (Lburp/Ze3n;)Ljava/util/List;
    //   101: invokeinterface stream : ()Ljava/util/stream/Stream;
    //   106: <illegal opcode> test : ()Ljava/util/function/Predicate;
    //   111: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   116: aload_0
    //   117: aload_2
    //   118: <illegal opcode> test : (Lburp/Zb_5;Lburp/Ze3n;)Ljava/util/function/Predicate;
    //   123: invokeinterface filter : (Ljava/util/function/Predicate;)Ljava/util/stream/Stream;
    //   128: aload_0
    //   129: aload_2
    //   130: aload #4
    //   132: <illegal opcode> apply : (Lburp/Zb_5;Lburp/Ze3n;Lburp/Ztgb;)Ljava/util/function/Function;
    //   137: invokeinterface map : (Ljava/util/function/Function;)Ljava/util/stream/Stream;
    //   142: aload_3
    //   143: dup
    //   144: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   147: pop
    //   148: <illegal opcode> accept : (Ljava/util/Set;)Ljava/util/function/Consumer;
    //   153: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   158: new burp/Zz2x
    //   161: dup
    //   162: aload_2
    //   163: aload_0
    //   164: getfield Zs : Lburp/Zgb6;
    //   167: aload_0
    //   168: getfield ZA : Lburp/Zz1i;
    //   171: aload #5
    //   173: dup
    //   174: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   177: pop
    //   178: <illegal opcode> accept : (Ljava/util/concurrent/atomic/AtomicInteger;)Ljava/util/function/Consumer;
    //   183: aload #5
    //   185: dup
    //   186: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   189: pop
    //   190: <illegal opcode> get : (Ljava/util/concurrent/atomic/AtomicInteger;)Ljava/util/function/Supplier;
    //   195: invokespecial <init> : (Lburp/Ze3n;Lburp/Zgb6;Lburp/Zz1i;Ljava/util/function/Consumer;Ljava/util/function/Supplier;)V
    //   198: astore #7
    //   200: new burp/Zxob
    //   203: dup
    //   204: aload_0
    //   205: getfield ZN : Lburp/Ztai;
    //   208: invokespecial <init> : (Lburp/Ztai;)V
    //   211: getstatic burp/Zzua.PASSIVE : Lburp/Zzua;
    //   214: invokevirtual ZO : (Lburp/Zzua;)Ljava/util/List;
    //   217: astore #8
    //   219: aload_3
    //   220: new burp/Zgzd
    //   223: dup
    //   224: invokespecial <init> : ()V
    //   227: iconst_2
    //   228: anewarray burp/Zk8d
    //   231: dup
    //   232: iconst_0
    //   233: aload_2
    //   234: aload_0
    //   235: getfield Zj : Lburp/Zg0g;
    //   238: aload_2
    //   239: invokeinterface Zf : (Lburp/Ze3n;)Ljava/util/List;
    //   244: aload_0
    //   245: getfield ZD : Lburp/Zz1m;
    //   248: invokestatic ZC : (Lburp/Ze3n;Ljava/util/List;Lburp/Zz1m;)Lburp/Zk8d;
    //   251: aastore
    //   252: dup
    //   253: iconst_1
    //   254: new burp/Zz6z
    //   257: dup
    //   258: aload #7
    //   260: aload #8
    //   262: aload_2
    //   263: aload_0
    //   264: getfield ZD : Lburp/Zz1m;
    //   267: invokespecial <init> : (Lburp/Zz2x;Ljava/util/List;Lburp/Ze3n;Lburp/Zz1m;)V
    //   270: aastore
    //   271: invokevirtual ZR : ([Lburp/Zk8d;)Lburp/Zgzd;
    //   274: aload #6
    //   276: aload_2
    //   277: invokevirtual ZL : (Lburp/Ze3n;)Lburp/Zsvl;
    //   280: invokevirtual ZK : (Lburp/Zsvl;)Lburp/Zgzd;
    //   283: invokevirtual Zs : ()Lburp/Zrx4;
    //   286: invokeinterface add : (Ljava/lang/Object;)Z
    //   291: pop
    //   292: aload_3
    //   293: aload_1
    //   294: ifnonnull -> 304
    //   297: iconst_4
    //   298: anewarray burp/Zbqc
    //   301: invokestatic Zr : ([Lburp/Zbqc;)V
    //   304: areturn
  }
  
  private Zrx4 lambda$getPassiveWorkItems$1(Ze3n paramZe3n, Ztgb paramZtgb, Zehc paramZehc) {
    return (new Zgzd()).ZR(new Zk8d[] { Zs1y.ZS(paramZe3n, paramZehc, this.ZD) }).ZK(new Zkb7(paramZtgb)).Zs();
  }
  
  private boolean lambda$getPassiveWorkItems$0(Ze3n paramZe3n, Zehc paramZehc) {
    return !this.ZK.ZO(paramZehc, paramZe3n.Za());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb_5.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */