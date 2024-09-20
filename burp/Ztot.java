package burp;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import javax.swing.SwingUtilities;
import javax.swing.tree.DefaultTreeModel;
import javax.swing.tree.MutableTreeNode;
import javax.swing.tree.TreeNode;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Ztot extends DefaultTreeModel implements Zkmc {
  private final Map<Zez3, Zz_1> Zp = new HashMap<>();
  
  private boolean Zc = true;
  
  private static final String a;
  
  public Ztot(TreeNode paramTreeNode) {
    super(paramTreeNode);
  }
  
  public Zz_1 ZR(Zxya paramZxya1, Zxya paramZxya2, boolean paramBoolean) {
    // Byte code:
    //   0: invokestatic ZG : ()Ljava/lang/String;
    //   3: astore #4
    //   5: aload_1
    //   6: ifnonnull -> 11
    //   9: aconst_null
    //   10: areturn
    //   11: aload_0
    //   12: aload_2
    //   13: invokevirtual ZC : (Lburp/Zxya;)Ljavax/swing/tree/MutableTreeNode;
    //   16: astore #5
    //   18: aload #5
    //   20: ifnonnull -> 25
    //   23: aconst_null
    //   24: areturn
    //   25: aload_1
    //   26: invokevirtual ZX : ()Z
    //   29: ifeq -> 41
    //   32: aload #5
    //   34: aload_0
    //   35: getfield root : Ljavax/swing/tree/TreeNode;
    //   38: if_acmpeq -> 69
    //   41: aload_1
    //   42: invokevirtual ZX : ()Z
    //   45: ifne -> 57
    //   48: aload #5
    //   50: aload_0
    //   51: getfield root : Ljavax/swing/tree/TreeNode;
    //   54: if_acmpne -> 69
    //   57: iconst_0
    //   58: getstatic net/portswigger/Zqf.Zr : Lnet/portswigger/Zqf;
    //   61: getstatic burp/Ztot.a : Ljava/lang/String;
    //   64: invokestatic ZT : (ZLnet/portswigger/Zqf;Ljava/lang/String;)V
    //   67: aconst_null
    //   68: areturn
    //   69: aload_0
    //   70: getfield Zp : Ljava/util/Map;
    //   73: aload_1
    //   74: getfield ZX : Lburp/Zez3;
    //   77: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   82: ifnull -> 87
    //   85: aconst_null
    //   86: areturn
    //   87: new burp/Zsdq
    //   90: dup
    //   91: aload #5
    //   93: invokespecial <init> : (Ljavax/swing/tree/TreeNode;)V
    //   96: astore #6
    //   98: aload #6
    //   100: aload_1
    //   101: invokevirtual Zt : (Lburp/Zxya;)I
    //   104: istore #7
    //   106: new burp/Zz_1
    //   109: dup
    //   110: aload_1
    //   111: invokespecial <init> : (Lburp/Zxya;)V
    //   114: astore #8
    //   116: aload_0
    //   117: getfield Zp : Ljava/util/Map;
    //   120: aload_1
    //   121: getfield ZX : Lburp/Zez3;
    //   124: aload #8
    //   126: invokeinterface put : (Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    //   131: pop
    //   132: aload_0
    //   133: getfield Zc : Z
    //   136: ifne -> 143
    //   139: iload_3
    //   140: ifeq -> 159
    //   143: aload #5
    //   145: aload #8
    //   147: iload #7
    //   149: invokeinterface insert : (Ljavax/swing/tree/MutableTreeNode;I)V
    //   154: aload #4
    //   156: ifnonnull -> 174
    //   159: aload_0
    //   160: aload #5
    //   162: aload #8
    //   164: iload #7
    //   166: <illegal opcode> run : (Lburp/Ztot;Ljavax/swing/tree/MutableTreeNode;Lburp/Zz_1;I)Ljava/lang/Runnable;
    //   171: invokestatic Zb : (Ljava/lang/Runnable;)V
    //   174: aload #8
    //   176: areturn
  }
  
  private MutableTreeNode ZC(Zxya paramZxya) {
    return (paramZxya == null) ? (MutableTreeNode)this.root : this.Zp.get(paramZxya.ZX);
  }
  
  public Zz_1 ZO(Zxya paramZxya, boolean paramBoolean) {
    // Byte code:
    //   0: invokestatic ZG : ()Ljava/lang/String;
    //   3: astore_3
    //   4: aload_1
    //   5: ifnonnull -> 10
    //   8: aconst_null
    //   9: areturn
    //   10: aload_0
    //   11: getfield Zp : Ljava/util/Map;
    //   14: aload_1
    //   15: getfield ZX : Lburp/Zez3;
    //   18: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   23: checkcast burp/Zz_1
    //   26: astore #4
    //   28: aload #4
    //   30: ifnonnull -> 35
    //   33: aconst_null
    //   34: areturn
    //   35: aload_0
    //   36: getfield Zc : Z
    //   39: ifne -> 46
    //   42: iload_2
    //   43: ifeq -> 56
    //   46: aload #4
    //   48: aload_1
    //   49: invokevirtual setUserObject : (Ljava/lang/Object;)V
    //   52: aload_3
    //   53: ifnonnull -> 68
    //   56: aload_0
    //   57: aload #4
    //   59: aload_1
    //   60: <illegal opcode> run : (Lburp/Ztot;Lburp/Zz_1;Lburp/Zxya;)Ljava/lang/Runnable;
    //   65: invokestatic Zb : (Ljava/lang/Runnable;)V
    //   68: aload #4
    //   70: areturn
  }
  
  public Zz_1 Z_(Zxya paramZxya, boolean paramBoolean) {
    // Byte code:
    //   0: invokestatic ZG : ()Ljava/lang/String;
    //   3: astore_3
    //   4: aload_1
    //   5: ifnonnull -> 10
    //   8: aconst_null
    //   9: areturn
    //   10: aload_0
    //   11: getfield Zp : Ljava/util/Map;
    //   14: aload_1
    //   15: getfield ZX : Lburp/Zez3;
    //   18: invokeinterface get : (Ljava/lang/Object;)Ljava/lang/Object;
    //   23: checkcast burp/Zz_1
    //   26: astore #4
    //   28: aload #4
    //   30: ifnonnull -> 35
    //   33: aconst_null
    //   34: areturn
    //   35: aload_0
    //   36: aload #4
    //   38: invokevirtual Zh : (Lburp/Zz_1;)V
    //   41: aload_0
    //   42: getfield Zc : Z
    //   45: ifne -> 52
    //   48: iload_2
    //   49: ifeq -> 85
    //   52: aload #4
    //   54: invokevirtual getParent : ()Ljavax/swing/tree/TreeNode;
    //   57: aload #4
    //   59: invokeinterface getIndex : (Ljavax/swing/tree/TreeNode;)I
    //   64: istore #5
    //   66: aload #4
    //   68: invokevirtual getParent : ()Ljavax/swing/tree/TreeNode;
    //   71: checkcast javax/swing/tree/MutableTreeNode
    //   74: iload #5
    //   76: invokeinterface remove : (I)V
    //   81: aload_3
    //   82: ifnonnull -> 96
    //   85: aload_0
    //   86: aload #4
    //   88: <illegal opcode> run : (Lburp/Ztot;Lburp/Zz_1;)Ljava/lang/Runnable;
    //   93: invokestatic Zb : (Ljava/lang/Runnable;)V
    //   96: aload #4
    //   98: areturn
  }
  
  public void Zq() {
    nodeStructureChanged(this.root);
  }
  
  public Zz_1 Zv(Zez3 paramZez3) {
    Zz_1 zz_1 = this.Zp.get(paramZez3);
    Zuh.Zb((zz_1 != null), Zqf.Zx);
    return zz_1;
  }
  
  public boolean Zw(Zez3 paramZez3) {
    return this.Zp.containsKey(paramZez3);
  }
  
  public TreeNode[] Zb(Zxya paramZxya) {
    Zuh.Zb(SwingUtilities.isEventDispatchThread(), Zqf.ZF);
    Zz_1 zz_1 = this.Zp.get(paramZxya.ZX);
    Zuh.Zb((zz_1 != null), Zqf.Zr);
    return zz_1.Zp();
  }
  
  public void ZE() {
    this.Zc = false;
  }
  
  private void Zh(Zz_1 paramZz_1) {
    this.Zp.remove(((Zxya)paramZz_1.Z_()).ZX);
    Enumeration<Zz_1> enumeration = paramZz_1.children();
    String str = Zz_1.ZG();
    while (enumeration.hasMoreElements()) {
      Zz_1 zz_1 = enumeration.nextElement();
      Zh(zz_1);
      if (str == null)
        break; 
    } 
  }
  
  private void lambda$clear$3() {
    String str = Zz_1.ZG();
    int i = this.root.getChildCount() - 1;
    while (i >= 0) {
      removeNodeFromParent((MutableTreeNode)this.root.getChildAt(i));
      i--;
      if (str == null)
        break; 
    } 
  }
  
  private void lambda$itemRemoved$2(Zz_1 paramZz_1) {
    removeNodeFromParent(paramZz_1);
  }
  
  private void lambda$itemUpdated$1(Zz_1 paramZz_1, Zxya paramZxya) {
    paramZz_1.setUserObject(paramZxya);
    nodeChanged(paramZz_1);
  }
  
  private void lambda$itemAdded$0(MutableTreeNode paramMutableTreeNode, Zz_1 paramZz_1, int paramInt) {
    paramMutableTreeNode.insert(paramZz_1, paramInt);
    nodesWereInserted(paramMutableTreeNode, new int[] { paramInt });
    if (paramMutableTreeNode == this.root && this.root.getChildCount() == 1)
      nodeStructureChanged(this.root); 
  }
  
  static {
    // Byte code:
    //   0: bipush #24
    //   2: ldc '}nc}R4On{sS}HnxzNXnywRJ++fNVgT++GhVgN+n2S|Hb+eIaY/x2@V}S &zNg=+b@vR:+aIfP*+|N'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Ztot.a : Ljava/lang/String;
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
    //   80: bipush #36
    //   82: goto -> 112
    //   85: bipush #86
    //   87: goto -> 112
    //   90: bipush #19
    //   92: goto -> 112
    //   95: bipush #10
    //   97: goto -> 112
    //   100: bipush #57
    //   102: goto -> 112
    //   105: bipush #110
    //   107: goto -> 112
    //   110: bipush #11
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
    //   154: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Ztot.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */