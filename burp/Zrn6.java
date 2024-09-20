package burp;

import java.util.ArrayList;
import java.util.List;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zrn6 implements Zgtz {
  private final Zkol ZS;
  
  private final int Zo;
  
  private final int ZL;
  
  public Zrn6(Zkol paramZkol, int paramInt1, int paramInt2) {
    this.ZS = paramZkol;
    this.Zo = paramInt1;
    this.ZL = paramInt2;
    Zuh.Zb((paramInt1 >= 0 && paramInt1 < paramInt2), Zqf.Zk);
  }
  
  public List<Zb3t> ZO(List<Zb3t> paramList) {
    // Byte code:
    //   0: invokestatic ZB : ()I
    //   3: istore_2
    //   4: aload_0
    //   5: getfield ZL : I
    //   8: aload_1
    //   9: invokeinterface size : ()I
    //   14: if_icmpgt -> 21
    //   17: iconst_1
    //   18: goto -> 22
    //   21: iconst_0
    //   22: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   25: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   28: new java/util/ArrayList
    //   31: dup
    //   32: invokespecial <init> : ()V
    //   35: astore_3
    //   36: iconst_0
    //   37: istore #4
    //   39: iload #4
    //   41: aload_1
    //   42: invokeinterface size : ()I
    //   47: if_icmpge -> 115
    //   50: iload #4
    //   52: aload_0
    //   53: getfield Zo : I
    //   56: if_icmpne -> 90
    //   59: aload_3
    //   60: aload_0
    //   61: aload_1
    //   62: invokevirtual Zl : (Ljava/util/List;)Lburp/Zb3t;
    //   65: invokeinterface add : (Ljava/lang/Object;)Z
    //   70: pop
    //   71: aload_0
    //   72: getfield ZL : I
    //   75: iconst_1
    //   76: isub
    //   77: istore #4
    //   79: iload_2
    //   80: ifne -> 108
    //   83: iconst_4
    //   84: anewarray burp/Zbqc
    //   87: invokestatic Zr : ([Lburp/Zbqc;)V
    //   90: aload_3
    //   91: aload_1
    //   92: iload #4
    //   94: invokeinterface get : (I)Ljava/lang/Object;
    //   99: checkcast burp/Zb3t
    //   102: invokeinterface add : (Ljava/lang/Object;)Z
    //   107: pop
    //   108: iinc #4, 1
    //   111: iload_2
    //   112: ifne -> 39
    //   115: aload_3
    //   116: areturn
  }
  
  private Zb3t Zl(List<Zb3t> paramList) {
    ArrayList<Zb3t> arrayList = new ArrayList(this.ZL - this.Zo);
    int j = this.Zo;
    int i = Zggr.ZB();
    while (j < this.ZL) {
      arrayList.add(paramList.get(j));
      j++;
      if (i == 0)
        break; 
    } 
    return this.ZS.Zu(null, arrayList);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrn6.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */