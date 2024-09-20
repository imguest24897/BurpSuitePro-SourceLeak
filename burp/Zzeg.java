package burp;

import java.util.List;

public class Zzeg extends Zzek {
  protected void ZJ(Zstu paramZstu, Zs68 paramZs68, List<Zl1r> paramList) {
    // Byte code:
    //   0: iconst_m1
    //   1: istore #5
    //   3: invokestatic ZP : ()[I
    //   6: aload_2
    //   7: invokestatic Zf : (Lburp/Zs68;)Ljava/util/List;
    //   10: invokeinterface iterator : ()Ljava/util/Iterator;
    //   15: astore #6
    //   17: astore #4
    //   19: aload #6
    //   21: invokeinterface hasNext : ()Z
    //   26: ifeq -> 105
    //   29: aload #6
    //   31: invokeinterface next : ()Ljava/lang/Object;
    //   36: checkcast burp/Ztu8
    //   39: astore #7
    //   41: aload #7
    //   43: invokestatic ZC : (Lburp/Ztu8;)Z
    //   46: ifeq -> 63
    //   49: aload #7
    //   51: invokeinterface Zli : ()I
    //   56: istore #5
    //   58: aload #4
    //   60: ifnull -> 100
    //   63: aload #7
    //   65: invokestatic Za : (Lburp/Ztu8;)Z
    //   68: ifeq -> 100
    //   71: iload #5
    //   73: iflt -> 100
    //   76: aload_3
    //   77: new burp/Zl1r
    //   80: dup
    //   81: iload #5
    //   83: aload #7
    //   85: invokeinterface ZlK : ()I
    //   90: invokespecial <init> : (II)V
    //   93: invokeinterface add : (Ljava/lang/Object;)Z
    //   98: pop
    //   99: return
    //   100: aload #4
    //   102: ifnull -> 19
    //   105: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zzeg.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */