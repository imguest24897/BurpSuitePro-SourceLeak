package burp;

import javax.swing.tree.TreePath;

public class Zgme {
  public static Zs6r ZO = new Zezs();
  
  public static Ze3h Zk(TreePath[] paramArrayOfTreePath) {
    // Byte code:
    //   0: invokestatic ZG : ()Ljava/lang/String;
    //   3: astore_1
    //   4: new burp/Ze3h
    //   7: dup
    //   8: iconst_0
    //   9: anewarray burp/Zz_1
    //   12: invokespecial <init> : ([Lburp/Zz_1;)V
    //   15: astore_2
    //   16: aload_0
    //   17: ifnull -> 92
    //   20: aload_0
    //   21: astore_3
    //   22: aload_3
    //   23: arraylength
    //   24: istore #4
    //   26: iconst_0
    //   27: istore #5
    //   29: iload #5
    //   31: iload #4
    //   33: if_icmpge -> 92
    //   36: aload_3
    //   37: iload #5
    //   39: aaload
    //   40: astore #6
    //   42: aload #6
    //   44: invokevirtual getLastPathComponent : ()Ljava/lang/Object;
    //   47: astore #7
    //   49: aload #7
    //   51: instanceof burp/Zz_1
    //   54: ifeq -> 70
    //   57: aload_2
    //   58: aload #7
    //   60: checkcast burp/Zz_1
    //   63: invokevirtual Zj : (Lburp/Zz_1;)V
    //   66: aload_1
    //   67: ifnonnull -> 85
    //   70: iconst_0
    //   71: getstatic net/portswigger/Zqf.Zk : Lnet/portswigger/Zqf;
    //   74: aload #7
    //   76: invokevirtual getClass : ()Ljava/lang/Class;
    //   79: invokevirtual toString : ()Ljava/lang/String;
    //   82: invokestatic ZT : (ZLnet/portswigger/Zqf;Ljava/lang/String;)V
    //   85: iinc #5, 1
    //   88: aload_1
    //   89: ifnonnull -> 29
    //   92: aload_2
    //   93: areturn
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgme.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */