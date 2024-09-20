package burp;

import java.awt.Component;
import java.awt.Window;

class Zxnc {
  private final Zbhx Za;
  
  private final Zrm5 Z_;
  
  private Zl01 ZX;
  
  Zxnc(Zbhx paramZbhx, Zrm5 paramZrm5) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: aload_1
    //   6: putfield Za : Lburp/Zbhx;
    //   9: aload_0
    //   10: aload_2
    //   11: putfield Z_ : Lburp/Zrm5;
    //   14: aload_2
    //   15: aload_1
    //   16: aload_2
    //   17: <illegal opcode> run : (Lburp/Zbhx;Lburp/Zrm5;)Ljava/lang/Runnable;
    //   22: invokeinterface Za : (Ljava/lang/Runnable;)V
    //   27: return
  }
  
  Zewb Zy() {
    return this.Z_.ZM();
  }
  
  Zrm5 ZY() {
    return this.Z_;
  }
  
  Component Zl() {
    return this.Z_.ZW();
  }
  
  void ZK() {
    this.Z_.Ze();
  }
  
  void Zk() {
    this.Z_.ZV();
  }
  
  void ZR(Window paramWindow, boolean paramBoolean) {
    // Byte code:
    //   0: aload_0
    //   1: new burp/Zl01
    //   4: dup
    //   5: aload_0
    //   6: getfield Za : Lburp/Zbhx;
    //   9: invokespecial <init> : (Lburp/Zbhx;)V
    //   12: putfield ZX : Lburp/Zl01;
    //   15: aload_0
    //   16: getfield ZX : Lburp/Zl01;
    //   19: aload_0
    //   20: invokevirtual Zy : ()Lburp/Zewb;
    //   23: invokeinterface getText : ()Ljava/lang/String;
    //   28: invokevirtual setTitle : (Ljava/lang/String;)V
    //   31: aload_0
    //   32: getfield ZX : Lburp/Zl01;
    //   35: iconst_2
    //   36: invokevirtual setDefaultCloseOperation : (I)V
    //   39: aload_0
    //   40: getfield ZX : Lburp/Zl01;
    //   43: new burp/Zi9
    //   46: dup
    //   47: aload_0
    //   48: invokespecial <init> : (Lburp/Zxnc;)V
    //   51: invokevirtual addWindowListener : (Ljava/awt/event/WindowListener;)V
    //   54: aload_0
    //   55: getfield Z_ : Lburp/Zrm5;
    //   58: iconst_1
    //   59: invokeinterface ZJ : (Z)V
    //   64: invokestatic Zr : ()I
    //   67: aload_0
    //   68: getfield ZX : Lburp/Zl01;
    //   71: invokevirtual getContentPane : ()Ljava/awt/Container;
    //   74: aload_0
    //   75: invokevirtual Zl : ()Ljava/awt/Component;
    //   78: invokevirtual add : (Ljava/awt/Component;)Ljava/awt/Component;
    //   81: pop
    //   82: aload_0
    //   83: getfield ZX : Lburp/Zl01;
    //   86: sipush #150
    //   89: bipush #40
    //   91: invokestatic Zf : (Ljava/awt/Component;II)V
    //   94: istore_3
    //   95: aload_0
    //   96: getfield ZX : Lburp/Zl01;
    //   99: invokevirtual pack : ()V
    //   102: iload_2
    //   103: ifeq -> 139
    //   106: invokestatic getPointerInfo : ()Ljava/awt/PointerInfo;
    //   109: invokevirtual getLocation : ()Ljava/awt/Point;
    //   112: astore #4
    //   114: aload_0
    //   115: getfield ZX : Lburp/Zl01;
    //   118: aload #4
    //   120: invokevirtual setLocation : (Ljava/awt/Point;)V
    //   123: aload_0
    //   124: getfield ZX : Lburp/Zl01;
    //   127: aload #4
    //   129: invokestatic Zs : (Ljava/awt/Point;)Ljava/awt/Rectangle;
    //   132: invokestatic ZK : (Ljava/awt/Window;Ljava/awt/Rectangle;)V
    //   135: iload_3
    //   136: ifne -> 147
    //   139: aload_0
    //   140: getfield ZX : Lburp/Zl01;
    //   143: aload_1
    //   144: invokestatic Zy : (Ljava/awt/Window;Ljava/awt/Window;)V
    //   147: aload_0
    //   148: getfield ZX : Lburp/Zl01;
    //   151: iconst_1
    //   152: invokevirtual setVisible : (Z)V
    //   155: aload_0
    //   156: invokevirtual ZK : ()V
    //   159: return
  }
  
  boolean Zu() {
    return (this.ZX != null);
  }
  
  private static void lambda$new$0(Zbhx paramZbhx, Zrm5 paramZrm5) {
    paramZbhx.ZS(paramZrm5.ZM());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zxnc.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */