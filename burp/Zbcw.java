package burp;

import java.awt.GridBagLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class Zbcw extends Zbqc {
  private final List<Zbcm> ZV = new ArrayList<>();
  
  private int ZF = -1;
  
  private boolean Zj;
  
  public Zbcw() {
    setLayout(new GridBagLayout());
  }
  
  public void Zi(List<Zbcm> paramList, boolean paramBoolean, int paramInt) {
    this.ZV.clear();
    this.ZF = paramInt;
    removeAll();
    Za(paramBoolean);
    boolean bool = Zm99.ZQ();
    for (Zbcm zbcm : paramList) {
      Zk(zbcm);
      if (bool)
        break; 
    } 
  }
  
  public void Za(boolean paramBoolean) {
    this.Zj = paramBoolean;
    Zc();
  }
  
  private void Zc() {
    IntStream.range(0, this.ZV.size()).forEach(this::Zf);
  }
  
  private void Zf(int paramInt) {
    Zbcm zbcm = this.ZV.get(paramInt);
    Zh(zbcm, paramInt, this.Zj);
  }
  
  public void Zk(Zbcm paramZbcm) {
    // Byte code:
    //   0: aload_0
    //   1: getfield ZV : Ljava/util/List;
    //   4: invokeinterface size : ()I
    //   9: istore_2
    //   10: aload_0
    //   11: getfield ZV : Ljava/util/List;
    //   14: aload_1
    //   15: invokeinterface add : (Ljava/lang/Object;)Z
    //   20: pop
    //   21: iload_2
    //   22: ifle -> 32
    //   25: aload_0
    //   26: iload_2
    //   27: iconst_1
    //   28: isub
    //   29: invokevirtual Zf : (I)V
    //   32: aload_0
    //   33: aload_1
    //   34: iload_2
    //   35: aload_0
    //   36: getfield Zj : Z
    //   39: invokevirtual Zh : (Lburp/Zbcm;IZ)V
    //   42: aload_0
    //   43: aload_1
    //   44: iload_2
    //   45: invokevirtual Zp : (Lburp/Zbcm;I)V
    //   48: aload_1
    //   49: aload_0
    //   50: iload_2
    //   51: <illegal opcode> run : (Lburp/Zbcw;I)Ljava/lang/Runnable;
    //   56: invokevirtual Zm : (Ljava/lang/Runnable;)V
    //   59: new java/awt/GridBagConstraints
    //   62: dup
    //   63: invokespecial <init> : ()V
    //   66: astore_3
    //   67: aload_3
    //   68: bipush #21
    //   70: putfield anchor : I
    //   73: aload_3
    //   74: iload_2
    //   75: putfield gridx : I
    //   78: aload_0
    //   79: aload_1
    //   80: aload_3
    //   81: invokevirtual add : (Ljava/awt/Component;Ljava/lang/Object;)V
    //   84: return
  }
  
  private void Zh(Zbcm paramZbcm, int paramInt, boolean paramBoolean) {
    // Byte code:
    //   0: invokestatic ZM : ()Z
    //   3: aload_0
    //   4: getfield ZV : Ljava/util/List;
    //   7: invokeinterface size : ()I
    //   12: iconst_1
    //   13: isub
    //   14: istore #5
    //   16: istore #4
    //   18: iload #5
    //   20: ifne -> 35
    //   23: aload_1
    //   24: invokestatic Ze : ()Ljavax/swing/border/Border;
    //   27: invokevirtual setBorder : (Ljavax/swing/border/Border;)V
    //   30: iload #4
    //   32: ifne -> 78
    //   35: iload_2
    //   36: ifne -> 52
    //   39: aload_1
    //   40: iload_3
    //   41: invokestatic Zj : (Z)Ljavax/swing/border/Border;
    //   44: invokevirtual setBorder : (Ljavax/swing/border/Border;)V
    //   47: iload #4
    //   49: ifne -> 78
    //   52: iload_2
    //   53: iload #5
    //   55: if_icmpne -> 70
    //   58: aload_1
    //   59: invokestatic ZJ : ()Ljavax/swing/border/Border;
    //   62: invokevirtual setBorder : (Ljavax/swing/border/Border;)V
    //   65: iload #4
    //   67: ifne -> 78
    //   70: aload_1
    //   71: iload_3
    //   72: invokestatic ZJ : (Z)Ljavax/swing/border/Border;
    //   75: invokevirtual setBorder : (Ljavax/swing/border/Border;)V
    //   78: return
  }
  
  private void Zp(Zbcm paramZbcm, int paramInt) {
    boolean bool = Zm99.ZM();
    if (paramZbcm.isEnabled()) {
      if (paramInt == this.ZF) {
        paramZbcm.ZH();
        if (!bool) {
          paramZbcm.ZV();
          return;
        } 
        return;
      } 
    } else {
      return;
    } 
    paramZbcm.ZV();
  }
  
  public boolean Zs(int paramInt) {
    return (paramInt == this.ZF);
  }
  
  public void ZS(int paramInt) {
    if (Zs(paramInt))
      return; 
    ZF(paramInt);
    ((Zbcm)this.ZV.get(paramInt)).ZL();
  }
  
  public void ZF(int paramInt) {
    if (paramInt == this.ZF)
      return; 
    if (this.ZF != -1) {
      Zbcm zbcm = this.ZV.get(this.ZF);
      zbcm.ZV();
    } 
    this.ZF = paramInt;
    if (paramInt != -1) {
      Zbcm zbcm = this.ZV.get(paramInt);
      zbcm.ZH();
    } 
  }
  
  public void Zu(boolean paramBoolean) {
    if (this.ZV != null)
      this.ZV.forEach(paramBoolean::lambda$setInteractive$1); 
  }
  
  private static void lambda$setInteractive$1(boolean paramBoolean, Zbcm paramZbcm) {
    paramZbcm.ZZ(paramBoolean);
  }
  
  private void lambda$addRadioBarButton$0(int paramInt) {
    ZS(paramInt);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbcw.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */