package burp;

import java.awt.Component;
import java.awt.Container;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.KeyListener;
import java.util.Arrays;

public abstract class Zb5a extends Zbqc {
  private int Zb;
  
  private final KeyListener Zf;
  
  private static int[] ZJ;
  
  public Zb5a(Zrvj paramZrvj) {
    setLayout(new GridBagLayout());
    this.Zf = new Zruc(paramZrvj);
  }
  
  void Zy(String paramString, Zbqc paramZbqc) {
    if (this.Zb > 0) {
      GridBagConstraints gridBagConstraints1 = new GridBagConstraints();
      gridBagConstraints1.gridx = 0;
      gridBagConstraints1.gridy = this.Zb;
      gridBagConstraints1.insets = new Insets(10, 0, 0, 0);
      gridBagConstraints1.fill = 2;
      gridBagConstraints1.anchor = 23;
      add(new Zem9(0), gridBagConstraints1);
      this.Zb++;
    } 
    Zm99 zm99 = new Zm99(paramString);
    zm99.ZE(Zt00.TITLE_PLAIN_FONT);
    GridBagConstraints gridBagConstraints = new GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = this.Zb;
    gridBagConstraints.insets = new Insets(10, 0, 25, 0);
    gridBagConstraints.gridwidth = 2;
    gridBagConstraints.anchor = 23;
    add(zm99, gridBagConstraints);
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = this.Zb + 1;
    gridBagConstraints.anchor = 23;
    add(paramZbqc, gridBagConstraints);
    this.Zb += 2;
    Arrays.<Component>stream(paramZbqc.getComponents()).forEach(this::lambda$addSection$0);
    paramZbqc.addKeyListener(this.Zf);
  }
  
  public abstract void ZB();
  
  public void ZS() {
    Arrays.<Component>stream(getComponents()).forEach(this::ZJ);
  }
  
  private void ZJ(Component paramComponent) {
    paramComponent.removeKeyListener(this.Zf);
    if (paramComponent instanceof Zmq5) {
      Zmq5 zmq5 = (Zmq5)paramComponent;
      zmq5.Zl();
    } 
    if (paramComponent instanceof Container) {
      Container container = (Container)paramComponent;
      Arrays.<Component>stream(container.getComponents()).forEach(this::ZJ);
    } 
  }
  
  public static Zb5a ZK(Zrvj paramZrvj, Zsd0<?> paramZsd0) {
    // Byte code:
    //   0: aload_1
    //   1: dup
    //   2: invokestatic requireNonNull : (Ljava/lang/Object;)Ljava/lang/Object;
    //   5: pop
    //   6: astore_2
    //   7: iconst_0
    //   8: istore_3
    //   9: aload_2
    //   10: iload_3
    //   11: <illegal opcode> typeSwitch : (Ljava/lang/Object;I)I
    //   16: tableswitch default -> 52, 0 -> 66, 1 -> 85, 2 -> 104, 3 -> 123, 4 -> 142
    //   52: new java/lang/MatchException
    //   55: dup
    //   56: aconst_null
    //   57: aconst_null
    //   58: invokespecial <init> : (Ljava/lang/String;Ljava/lang/Throwable;)V
    //   61: athrow
    //   62: invokestatic a : (Ljava/lang/MatchException;)Ljava/lang/MatchException;
    //   65: athrow
    //   66: aload_2
    //   67: checkcast burp/Ztiz
    //   70: astore #4
    //   72: new burp/Zb5k
    //   75: dup
    //   76: aload_0
    //   77: aload #4
    //   79: invokespecial <init> : (Lburp/Zrvj;Lburp/Ztiz;)V
    //   82: goto -> 158
    //   85: aload_2
    //   86: checkcast burp/Zt3s
    //   89: astore #5
    //   91: new burp/Zb5c
    //   94: dup
    //   95: aload_0
    //   96: aload #5
    //   98: invokespecial <init> : (Lburp/Zrvj;Lburp/Zt3s;)V
    //   101: goto -> 158
    //   104: aload_2
    //   105: checkcast burp/Zt5l
    //   108: astore #6
    //   110: new burp/Zb5d
    //   113: dup
    //   114: aload_0
    //   115: aload #6
    //   117: invokespecial <init> : (Lburp/Zrvj;Lburp/Zt5l;)V
    //   120: goto -> 158
    //   123: aload_2
    //   124: checkcast burp/Zrgv
    //   127: astore #7
    //   129: new burp/Zb5g
    //   132: dup
    //   133: aload_0
    //   134: aload #7
    //   136: invokespecial <init> : (Lburp/Zrvj;Lburp/Zrgv;)V
    //   139: goto -> 158
    //   142: aload_2
    //   143: checkcast burp/Zxfg
    //   146: astore #8
    //   148: new burp/Zb5r
    //   151: dup
    //   152: aload_0
    //   153: aload #8
    //   155: invokespecial <init> : (Lburp/Zrvj;Lburp/Zxfg;)V
    //   158: areturn
    // Exception table:
    //   from	to	target	type
    //   9	62	62	java/lang/MatchException
  }
  
  private void lambda$addSection$0(Component paramComponent) {
    paramComponent.addKeyListener(this.Zf);
  }
  
  public static void Zv(int[] paramArrayOfint) {
    ZJ = paramArrayOfint;
  }
  
  public static int[] Zd() {
    return ZJ;
  }
  
  private static MatchException a(MatchException paramMatchException) {
    return paramMatchException;
  }
  
  static {
    if (Zd() == null)
      Zv(new int[3]); 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zb5a.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */