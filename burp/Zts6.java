package burp;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.swing.text.JTextComponent;

public abstract class Zts6 extends Ztsl {
  protected final List<Zmy1> ZW;
  
  final Zsb7 ZZ = new Zsb7();
  
  public Zts6() {
    Zs();
    this.ZW = new ArrayList<>();
  }
  
  public List<Zmy1> ZN(String paramString) {
    int[] arrayOfInt = Zghd.ZM();
    int i = Collections.binarySearch(this.ZW, paramString, this.ZZ);
    if (i < 0)
      return null; 
    int j = i;
    while (j > 0 && this.ZZ.compare(this.ZW.get(j - 1), paramString) == 0) {
      j--;
      if (arrayOfInt == null)
        break; 
    } 
    int k = this.ZW.size();
    while (++i < k && this.ZZ.compare(this.ZW.get(i), paramString) == 0);
    return this.ZW.subList(j, i);
  }
  
  protected List<Zmy1> ZI(JTextComponent paramJTextComponent) {
    // Byte code:
    //   0: new java/util/ArrayList
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_3
    //   8: invokestatic ZM : ()[I
    //   11: aload_0
    //   12: aload_1
    //   13: invokevirtual ZN : (Ljavax/swing/text/JTextComponent;)Ljava/lang/String;
    //   16: astore #4
    //   18: astore_2
    //   19: aload #4
    //   21: ifnull -> 178
    //   24: aload_0
    //   25: getfield ZW : Ljava/util/List;
    //   28: aload #4
    //   30: aload_0
    //   31: getfield ZZ : Lburp/Zsb7;
    //   34: invokestatic binarySearch : (Ljava/util/List;Ljava/lang/Object;Ljava/util/Comparator;)I
    //   37: istore #5
    //   39: iload #5
    //   41: ifge -> 55
    //   44: iload #5
    //   46: ineg
    //   47: iconst_1
    //   48: isub
    //   49: istore #5
    //   51: aload_2
    //   52: ifnonnull -> 117
    //   55: iload #5
    //   57: iconst_1
    //   58: isub
    //   59: istore #6
    //   61: iload #6
    //   63: ifle -> 117
    //   66: aload_0
    //   67: getfield ZZ : Lburp/Zsb7;
    //   70: aload_0
    //   71: getfield ZW : Ljava/util/List;
    //   74: iload #6
    //   76: invokeinterface get : (I)Ljava/lang/Object;
    //   81: aload #4
    //   83: invokevirtual compare : (Ljava/lang/Object;Ljava/lang/Object;)I
    //   86: ifne -> 117
    //   89: aload_3
    //   90: aload_0
    //   91: getfield ZW : Ljava/util/List;
    //   94: iload #6
    //   96: invokeinterface get : (I)Ljava/lang/Object;
    //   101: checkcast burp/Zmy1
    //   104: invokeinterface add : (Ljava/lang/Object;)Z
    //   109: pop
    //   110: iinc #6, -1
    //   113: aload_2
    //   114: ifnonnull -> 61
    //   117: iload #5
    //   119: aload_0
    //   120: getfield ZW : Ljava/util/List;
    //   123: invokeinterface size : ()I
    //   128: if_icmpge -> 178
    //   131: aload_0
    //   132: getfield ZW : Ljava/util/List;
    //   135: iload #5
    //   137: invokeinterface get : (I)Ljava/lang/Object;
    //   142: checkcast burp/Zmy1
    //   145: astore #6
    //   147: aload #6
    //   149: invokeinterface ZG : ()Ljava/lang/String;
    //   154: aload #4
    //   156: invokestatic Zi : (Ljava/lang/String;Ljava/lang/String;)Z
    //   159: ifeq -> 178
    //   162: aload_3
    //   163: aload #6
    //   165: invokeinterface add : (Ljava/lang/Object;)Z
    //   170: pop
    //   171: iinc #5, 1
    //   174: aload_2
    //   175: ifnonnull -> 117
    //   178: aload_3
    //   179: areturn
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zts6.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */