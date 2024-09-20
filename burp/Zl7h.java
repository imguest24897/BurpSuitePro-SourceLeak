package burp;

import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import net.portswigger.Zm2;

public interface Zl7h extends Zgpi<Zl7h> {
  public static final Zeu4<Zl7h> Zz;
  
  public static final String a;
  
  Zxjt ZVe();
  
  boolean ZVV();
  
  Zrmh ZV6();
  
  Zlzm ZVW();
  
  Zlxo ZVF();
  
  Zrl9 ZV2();
  
  Zmu3 ZVh();
  
  Zrfu ZVZ();
  
  Zg4y ZVz();
  
  Zlka ZV4();
  
  Zl34 ZVY();
  
  Zl34 ZVE();
  
  Collection<Zs7s> ZVM();
  
  Ztfk ZVf();
  
  Zrim ZV8();
  
  Zt1i ZVP();
  
  Zsiv ZVv();
  
  Ztk0 ZVa();
  
  Zgak ZVb();
  
  Zeg1 ZVx();
  
  Ze__ ZVu();
  
  Zskz ZVX();
  
  int ZVT();
  
  boolean ZVG();
  
  void ZVk();
  
  boolean ZVd();
  
  void ZV5();
  
  void ZJ(int paramInt);
  
  int ZVI();
  
  void Zm(int paramInt);
  
  int ZVp();
  
  void ZVy();
  
  boolean ZVg();
  
  void Zg(int paramInt);
  
  int ZVJ();
  
  void Zj(int paramInt);
  
  void ZM(int paramInt);
  
  int ZVN();
  
  void ZQ(int paramInt);
  
  int ZVD();
  
  void Zd(String paramString);
  
  String ZVm();
  
  int ZVK();
  
  void ZVl();
  
  int ZVc();
  
  void ZVB();
  
  void Zu(Zszw paramZszw);
  
  Zszw ZVn();
  
  int ZVo();
  
  void Zw(int paramInt);
  
  void ZVC();
  
  void ZVA();
  
  boolean ZVi();
  
  Zzg7 ZVU();
  
  Collection<Zko4> ZVs();
  
  Zefg<Zez3> ZVH();
  
  Zzwo<Zsdr, Zrfx<Zsdr>> ZV0();
  
  default void Zw(Zr69 paramZr69) {
    // Byte code:
    //   0: invokestatic ZG : ()[Lburp/Zbqc;
    //   3: astore_2
    //   4: aload_0
    //   5: invokeinterface ZV6 : ()Lburp/Zrmh;
    //   10: invokeinterface Zzu : ()Z
    //   15: ifne -> 19
    //   18: return
    //   19: getstatic burp/StartBurp.ZL : Lburp/Zxei;
    //   22: invokeinterface Zi : ()Lburp/Zz0n;
    //   27: invokeinterface Zr : ()Lburp/Zzxi;
    //   32: invokevirtual ZM : ()Lburp/Zra1;
    //   35: getstatic burp/Zra1.EXECUTION_MODE_ENTERPRISE_AGENT : Lburp/Zra1;
    //   38: if_acmpne -> 54
    //   41: aload_1
    //   42: invokestatic ZL : ()Lburp/Zsug;
    //   45: invokeinterface Zz : (Lburp/Zsug;)V
    //   50: aload_2
    //   51: ifnonnull -> 172
    //   54: aload_0
    //   55: invokeinterface ZVm : ()Ljava/lang/String;
    //   60: ifnull -> 89
    //   63: aload_1
    //   64: new java/io/File
    //   67: dup
    //   68: aload_0
    //   69: invokeinterface ZVm : ()Ljava/lang/String;
    //   74: invokespecial <init> : (Ljava/lang/String;)V
    //   77: invokestatic Zm : (Ljava/io/File;)Lburp/Zsug;
    //   80: invokeinterface Zz : (Lburp/Zsug;)V
    //   85: aload_2
    //   86: ifnonnull -> 172
    //   89: getstatic java/io/File.separator : Ljava/lang/String;
    //   92: iconst_2
    //   93: anewarray java/lang/CharSequence
    //   96: dup
    //   97: iconst_0
    //   98: aload_0
    //   99: invokeinterface ZV6 : ()Lburp/Zrmh;
    //   104: invokeinterface ZzF : ()Ljava/lang/String;
    //   109: aastore
    //   110: dup
    //   111: iconst_1
    //   112: getstatic burp/Zl7h.a : Ljava/lang/String;
    //   115: iconst_2
    //   116: anewarray java/lang/Object
    //   119: dup
    //   120: iconst_0
    //   121: aload_0
    //   122: invokeinterface ZVD : ()I
    //   127: invokestatic valueOf : (I)Ljava/lang/Integer;
    //   130: aastore
    //   131: dup
    //   132: iconst_1
    //   133: invokestatic currentTimeMillis : ()J
    //   136: invokestatic valueOf : (J)Ljava/lang/Long;
    //   139: aastore
    //   140: invokestatic format : (Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;
    //   143: aastore
    //   144: invokestatic join : (Ljava/lang/CharSequence;[Ljava/lang/CharSequence;)Ljava/lang/String;
    //   147: astore_3
    //   148: aload_0
    //   149: aload_3
    //   150: invokeinterface Zd : (Ljava/lang/String;)V
    //   155: aload_1
    //   156: new java/io/File
    //   159: dup
    //   160: aload_3
    //   161: invokespecial <init> : (Ljava/lang/String;)V
    //   164: invokestatic ZK : (Ljava/io/File;)Lburp/Zsug;
    //   167: invokeinterface Zz : (Lburp/Zsug;)V
    //   172: return
  }
  
  default boolean Zm(String paramString1, String paramString2, Zr_4 paramZr_4) {
    // Byte code:
    //   0: aload_0
    //   1: invokeinterface ZV0 : ()Lburp/Zzwo;
    //   6: astore #5
    //   8: invokestatic ZG : ()[Lburp/Zbqc;
    //   11: aload_3
    //   12: aload_2
    //   13: invokeinterface Zz : (Ljava/lang/String;)Lburp/Zsdr;
    //   18: astore #6
    //   20: astore #4
    //   22: aload_3
    //   23: aload_1
    //   24: invokeinterface Zz : (Ljava/lang/String;)Lburp/Zsdr;
    //   29: astore #7
    //   31: aload #5
    //   33: invokeinterface ZlW : ()Ljava/util/Set;
    //   38: aload #6
    //   40: invokeinterface contains : (Ljava/lang/Object;)Z
    //   45: istore #8
    //   47: iload #8
    //   49: ifeq -> 77
    //   52: aload #5
    //   54: aload #6
    //   56: invokeinterface Zd : (Ljava/lang/Object;)Lburp/Zgpi;
    //   61: checkcast burp/Zrfx
    //   64: aload #7
    //   66: invokeinterface add : (Ljava/lang/Object;)Z
    //   71: pop
    //   72: aload #4
    //   74: ifnonnull -> 120
    //   77: aload_3
    //   78: new burp/Zl0w
    //   81: dup
    //   82: getstatic burp/Zsdr.Zo : Lburp/Zk_l;
    //   85: invokespecial <init> : (Lburp/Zeu4;)V
    //   88: invokeinterface ZH : (Lburp/Zsqx;)Lburp/Zgpi;
    //   93: checkcast burp/Zrfx
    //   96: astore #9
    //   98: aload #9
    //   100: aload #7
    //   102: invokeinterface add : (Ljava/lang/Object;)Z
    //   107: pop
    //   108: aload #5
    //   110: aload #6
    //   112: aload #9
    //   114: invokeinterface Zu : (Lburp/Zgpi;Lburp/Zgpi;)Lburp/Zgpi;
    //   119: pop
    //   120: iload #8
    //   122: ifne -> 129
    //   125: iconst_1
    //   126: goto -> 130
    //   129: iconst_0
    //   130: ireturn
  }
  
  default void ZV1() {
    Zzwo<Zsdr, Zrfx<Zsdr>> zzwo = ZV0();
    List list = zzwo.ZlW().stream().map(zzwo::lambda$reportWebSocketConnections$0).toList();
    String str = list.stream().map(String::valueOf).collect(Collectors.joining(",", "[", "]"));
    Zm2.ZB(Zec3.SCANNER_WEB_SOCKET_CONNECTION_COUNTS, str);
  }
  
  private static Integer lambda$reportWebSocketConnections$0(Zzwo paramZzwo, Zsdr paramZsdr) {
    return Integer.valueOf(((Zrfx)paramZzwo.Zd(paramZsdr)).size());
  }
  
  static {
    // Byte code:
    //   0: bipush #15
    //   2: ldc '_\iSRR^[o\\trL]&HQq'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zl7h.a : Ljava/lang/String;
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
    //   80: bipush #51
    //   82: goto -> 112
    //   85: bipush #33
    //   87: goto -> 112
    //   90: bipush #7
    //   92: goto -> 112
    //   95: bipush #43
    //   97: goto -> 112
    //   100: bipush #49
    //   102: goto -> 112
    //   105: bipush #25
    //   107: goto -> 112
    //   110: bipush #110
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
    //   154: new burp/Zk6o
    //   157: dup
    //   158: invokespecial <init> : ()V
    //   161: putstatic burp/Zl7h.Zz : Lburp/Zeu4;
    //   164: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zl7h.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */