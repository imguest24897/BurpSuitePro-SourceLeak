package burp;

import java.awt.Component;
import net.portswigger.Zoq;

public class Zmau implements Zkuk {
  private final Zbvw Zm;
  
  private final Zoq<Zbha> Zg;
  
  private final Zbhg Zy;
  
  public Zmau(Zgf3 paramZgf3, Zlok paramZlok, Zkb3 paramZkb3, Zb_j paramZb_j, Zlfb paramZlfb, Zbvw paramZbvw, Zlli<Zt1l> paramZlli, Zlli<Zt13> paramZlli1) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: aload #6
    //   7: putfield Zm : Lburp/Zbvw;
    //   10: aload_0
    //   11: aload_1
    //   12: aload #5
    //   14: aload #6
    //   16: aload_2
    //   17: <illegal opcode> get : (Lburp/Zgf3;Lburp/Zlfb;Lburp/Zbvw;Lburp/Zlok;)Ljava/util/function/Supplier;
    //   22: invokestatic ZZ : (Ljava/util/function/Supplier;)Lnet/portswigger/Zoq;
    //   25: putfield Zg : Lnet/portswigger/Zoq;
    //   28: aload_0
    //   29: new burp/Zbhr
    //   32: dup
    //   33: aload #6
    //   35: aload_0
    //   36: getfield Zg : Lnet/portswigger/Zoq;
    //   39: aload_3
    //   40: aload #4
    //   42: aload #5
    //   44: dup
    //   45: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   48: pop
    //   49: <illegal opcode> Zo : (Lburp/Zlfb;)Lburp/Zgu2;
    //   54: aload #5
    //   56: dup
    //   57: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   60: pop
    //   61: <illegal opcode> run : (Lburp/Zlfb;)Ljava/lang/Runnable;
    //   66: invokespecial <init> : (Lburp/Zbvw;Lnet/portswigger/Zoq;Lburp/Zkb3;Lburp/Zb_j;Lburp/Zgu2;Ljava/lang/Runnable;)V
    //   69: putfield Zy : Lburp/Zbhg;
    //   72: aload #8
    //   74: getstatic burp/Zt13.Zd : Lburp/Zlnb;
    //   77: aload #6
    //   79: <illegal opcode> accept : (Lburp/Zbvw;)Ljava/util/function/Consumer;
    //   84: invokeinterface ZE : (Lburp/Zlnb;Ljava/util/function/Consumer;)Lburp/Zgrn;
    //   89: pop
    //   90: aload #8
    //   92: getstatic burp/Zt13.Zv : Lburp/Zlnb;
    //   95: aload_0
    //   96: <illegal opcode> accept : (Lburp/Zmau;)Ljava/util/function/Consumer;
    //   101: invokeinterface ZE : (Lburp/Zlnb;Ljava/util/function/Consumer;)Lburp/Zgrn;
    //   106: pop
    //   107: aload #7
    //   109: getstatic burp/Zt1l.Zp : Lburp/Zlnb;
    //   112: aload_0
    //   113: <illegal opcode> accept : (Lburp/Zmau;)Ljava/util/function/Consumer;
    //   118: invokeinterface ZE : (Lburp/Zlnb;Ljava/util/function/Consumer;)Lburp/Zgrn;
    //   123: pop
    //   124: aload #7
    //   126: getstatic burp/Zt1l.ZP : Lburp/Zlnb;
    //   129: aload_0
    //   130: <illegal opcode> accept : (Lburp/Zmau;)Ljava/util/function/Consumer;
    //   135: invokeinterface ZE : (Lburp/Zlnb;Ljava/util/function/Consumer;)Lburp/Zgrn;
    //   140: pop
    //   141: return
  }
  
  public Component Zg() {
    return this.Zm.ZB();
  }
  
  public void ZL(boolean paramBoolean) {
    this.Zm.ZF(paramBoolean);
    this.Zy.Zt(paramBoolean);
  }
  
  public void Zb() {
    this.Zm.Zb();
    this.Zg.ZV(Zbhh::ZD);
  }
  
  public void Zs() {
    this.Zm.Zs();
    this.Zg.ZV(Zbhh::ZI);
  }
  
  public void Zm() {
    this.Zg.ZV(Zbhh::Ze);
  }
  
  public void Zj() {
    this.Zm.Zj();
  }
  
  public void Zf() {
    this.Zy.Ze();
  }
  
  public void ZA() {
    this.Zy.Zd();
  }
  
  public void ZB(String paramString1, String paramString2) {
    this.Zm.Zj(paramString1, paramString2);
    this.Zg.ZV(paramString1::lambda$setTaskName$6);
  }
  
  void Za(String paramString) {
    this.Zm.Ze(paramString);
  }
  
  private void Zo(Zlj9 paramZlj9) {
    this.Zg.ZV(paramZlj9::lambda$updateProgress$7);
    this.Zg.ZV(paramZlj9::lambda$updateProgress$8);
  }
  
  private void ZP(Zev0 paramZev0) {
    // Byte code:
    //   0: invokestatic ZQ : ()Ljava/lang/String;
    //   3: astore_2
    //   4: getstatic burp/Zzdr.ZB : [I
    //   7: aload_1
    //   8: invokevirtual ordinal : ()I
    //   11: iaload
    //   12: tableswitch default -> 75, 1 -> 52, 2 -> 60, 3 -> 68, 4 -> 68, 5 -> 68, 6 -> 75
    //   52: aload_0
    //   53: invokevirtual Zb : ()V
    //   56: aload_2
    //   57: ifnull -> 75
    //   60: aload_0
    //   61: invokevirtual Zs : ()V
    //   64: aload_2
    //   65: ifnull -> 75
    //   68: aload_0
    //   69: invokevirtual Zm : ()V
    //   72: goto -> 75
    //   75: return
  }
  
  public final Zbhg Zd() {
    return this.Zy;
  }
  
  private static void lambda$updateProgress$8(Zlj9 paramZlj9, Zbha paramZbha) {
    paramZbha.ZE(paramZlj9);
  }
  
  private static void lambda$updateProgress$7(Zlj9 paramZlj9, Zbha paramZbha) {
    paramZbha.Zu(paramZlj9);
  }
  
  private static void lambda$setTaskName$6(String paramString, Zbha paramZbha) {
    paramZbha.ZO(paramString);
  }
  
  private void lambda$new$5(Zxr8 paramZxr8) {
    paramZxr8.ZF().ifPresent(this::ZP);
  }
  
  private void lambda$new$4(Zxr8 paramZxr8) {
    paramZxr8.ZF().ifPresent(this::Zo);
  }
  
  private void lambda$new$3(Zxr8 paramZxr8) {
    paramZxr8.ZP(this::lambda$new$2);
  }
  
  private void lambda$new$2(Ztj1 paramZtj1) {
    ZB(paramZtj1.ZO(), paramZtj1.ZM());
    Za(paramZtj1.Zz());
  }
  
  private static void lambda$new$1(Zbvw paramZbvw, Zxr8 paramZxr8) {
    paramZbvw.Zj();
  }
  
  private static Zbha lambda$new$0(Zgf3 paramZgf3, Zlfb paramZlfb, Zbvw paramZbvw, Zlok paramZlok) {
    Zbha zbha = paramZgf3.ZT(paramZlfb, paramZbvw.ZP());
    Zlj9 zlj9 = paramZlok.Zo();
    if (zlj9 != Zlj9.Zp) {
      zbha.Zu(zlj9);
      zbha.ZE(zlj9);
    } 
    return zbha;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmau.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */