package burp;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreeNode;
import javax.swing.tree.TreePath;

class Zt9t implements Zm6a {
  final Zl4w ZU;
  
  private Zt9t(Zl4w paramZl4w) {}
  
  public void Zc(String paramString) {
    // Byte code:
    //   0: invokestatic ZS : ()[Lburp/Zbqc;
    //   3: astore_2
    //   4: aload_1
    //   5: ifnonnull -> 12
    //   8: aconst_null
    //   9: goto -> 16
    //   12: aload_1
    //   13: invokevirtual trim : ()Ljava/lang/String;
    //   16: astore_1
    //   17: aload_0
    //   18: getfield ZU : Lburp/Zl4w;
    //   21: getfield Zn : Ljavax/swing/tree/DefaultTreeModel;
    //   24: invokevirtual getRoot : ()Ljava/lang/Object;
    //   27: checkcast javax/swing/tree/DefaultMutableTreeNode
    //   30: astore_3
    //   31: aload_3
    //   32: invokevirtual removeAllChildren : ()V
    //   35: aload_0
    //   36: getfield ZU : Lburp/Zl4w;
    //   39: invokevirtual Zi : ()Lburp/Zg29;
    //   42: astore #4
    //   44: aload_0
    //   45: getfield ZU : Lburp/Zl4w;
    //   48: getfield ZL : Lburp/Zic;
    //   51: aload #4
    //   53: aload_1
    //   54: invokeinterface Zf : (Lburp/Zg29;Ljava/lang/String;)Ljava/util/List;
    //   59: astore #5
    //   61: new java/util/concurrent/atomic/AtomicBoolean
    //   64: dup
    //   65: invokespecial <init> : ()V
    //   68: astore #6
    //   70: aload #5
    //   72: aload_0
    //   73: aload #6
    //   75: <illegal opcode> accept : (Lburp/Zt9t;Ljava/util/concurrent/atomic/AtomicBoolean;)Ljava/util/function/Consumer;
    //   80: invokeinterface forEach : (Ljava/util/function/Consumer;)V
    //   85: aload #6
    //   87: invokevirtual get : ()Z
    //   90: ifeq -> 103
    //   93: aload_0
    //   94: getfield ZU : Lburp/Zl4w;
    //   97: getfield Zy : Ljavax/swing/tree/TreePath;
    //   100: goto -> 104
    //   103: aconst_null
    //   104: astore #7
    //   106: aload_0
    //   107: getfield ZU : Lburp/Zl4w;
    //   110: getfield Zn : Ljavax/swing/tree/DefaultTreeModel;
    //   113: invokevirtual reload : ()V
    //   116: aload #4
    //   118: getstatic burp/Zg29.USER_AND_PROJECT : Lburp/Zg29;
    //   121: if_acmpne -> 135
    //   124: aload_1
    //   125: ifnull -> 145
    //   128: aload_1
    //   129: invokevirtual isEmpty : ()Z
    //   132: ifne -> 145
    //   135: aload_0
    //   136: getfield ZU : Lburp/Zl4w;
    //   139: getfield ZV : Lburp/Zo5;
    //   142: invokevirtual Zp : ()V
    //   145: aload_3
    //   146: invokevirtual getChildCount : ()I
    //   149: ifle -> 162
    //   152: aload_0
    //   153: aload #7
    //   155: invokevirtual ZT : (Ljavax/swing/tree/TreePath;)V
    //   158: aload_2
    //   159: ifnull -> 251
    //   162: aload_0
    //   163: getfield ZU : Lburp/Zl4w;
    //   166: getfield Zi : Lburp/Zbc9;
    //   169: aload_0
    //   170: getfield ZU : Lburp/Zl4w;
    //   173: getfield Zg : Lburp/Zbqc;
    //   176: invokevirtual ZR : (Ljava/awt/Component;)Z
    //   179: ifne -> 251
    //   182: aload_0
    //   183: getfield ZU : Lburp/Zl4w;
    //   186: getfield Zi : Lburp/Zbc9;
    //   189: aload_0
    //   190: getfield ZU : Lburp/Zl4w;
    //   193: getfield Zg : Lburp/Zbqc;
    //   196: invokevirtual ZP : (Ljava/awt/Component;)V
    //   199: aload_0
    //   200: getfield ZU : Lburp/Zl4w;
    //   203: getfield Zo : Lburp/Zgoh;
    //   206: iconst_0
    //   207: anewarray java/lang/String
    //   210: invokevirtual ZK : ([Ljava/lang/String;)V
    //   213: aload_0
    //   214: getfield ZU : Lburp/Zl4w;
    //   217: getfield ZP : Lburp/Zgf8;
    //   220: invokevirtual getText : ()Ljava/lang/String;
    //   223: invokevirtual trim : ()Ljava/lang/String;
    //   226: astore #8
    //   228: aload #8
    //   230: invokevirtual length : ()I
    //   233: iconst_1
    //   234: if_icmple -> 251
    //   237: getstatic burp/Zec3.SUITE_SETTINGS_FAILED_SEARCH : Lburp/Zec3;
    //   240: aload #8
    //   242: getstatic java/util/Locale.ENGLISH : Ljava/util/Locale;
    //   245: invokevirtual toLowerCase : (Ljava/util/Locale;)Ljava/lang/String;
    //   248: invokestatic ZB : (Lnet/portswigger/Zrmw;Ljava/lang/String;)V
    //   251: return
  }
  
  private DefaultMutableTreeNode ZV(Zsd7 paramZsd7) {
    DefaultMutableTreeNode defaultMutableTreeNode = (DefaultMutableTreeNode)this.ZU.Zn.getRoot();
    Iterator<String> iterator = paramZsd7.ZOA().ZB().iterator();
    Zbqc[] arrayOfZbqc = Zl4w.ZS();
    while (iterator.hasNext()) {
      String str = iterator.next();
      defaultMutableTreeNode = ZU(defaultMutableTreeNode, str);
      if (arrayOfZbqc != null)
        break; 
    } 
    Zg3w zg3w = (Zg3w)defaultMutableTreeNode.getUserObject();
    Optional<Zbqc> optional = zg3w.Zy(paramZsd7.ZOT());
    Objects.requireNonNull(this.ZU.Zi);
    optional.ifPresent(this.ZU.Zi::add);
    return defaultMutableTreeNode;
  }
  
  private DefaultMutableTreeNode ZU(DefaultMutableTreeNode paramDefaultMutableTreeNode, String paramString) {
    Zbqc[] arrayOfZbqc = Zl4w.ZS();
    byte b = 0;
    while (b < paramDefaultMutableTreeNode.getChildCount()) {
      DefaultMutableTreeNode defaultMutableTreeNode1 = (DefaultMutableTreeNode)paramDefaultMutableTreeNode.getChildAt(b);
      Zg3w zg3w = (Zg3w)defaultMutableTreeNode1.getUserObject();
      if (Objects.equals(paramString, zg3w.ZM()))
        return defaultMutableTreeNode1; 
      b++;
      if (arrayOfZbqc != null)
        break; 
    } 
    DefaultMutableTreeNode defaultMutableTreeNode = new DefaultMutableTreeNode(new Zg3w(paramString));
    paramDefaultMutableTreeNode.add(defaultMutableTreeNode);
    return defaultMutableTreeNode;
  }
  
  private void ZT(TreePath paramTreePath) {
    if (paramTreePath == null)
      paramTreePath = Zo((TreeNode)this.ZU.Zn.getRoot()); 
    this.ZU.ZV.setSelectionPath(paramTreePath);
  }
  
  private TreePath Zo(TreeNode paramTreeNode) {
    Zbqc[] arrayOfZbqc = Zl4w.ZS();
    ArrayList<TreeNode> arrayList = new ArrayList();
    while (paramTreeNode != null) {
      arrayList.add(paramTreeNode);
      if (paramTreeNode.isLeaf() || paramTreeNode.getChildCount() < 1) {
        paramTreeNode = null;
        continue;
      } 
      if (paramTreeNode.getChildCount() > 0) {
        paramTreeNode = paramTreeNode.getChildAt(0);
        if (arrayOfZbqc != null)
          break; 
      } 
    } 
    return arrayList.isEmpty() ? null : new TreePath(arrayList.toArray());
  }
  
  private void lambda$applyFilter$0(AtomicBoolean paramAtomicBoolean, Zsd7 paramZsd7) {
    DefaultMutableTreeNode defaultMutableTreeNode = ZV(paramZsd7);
    if (!paramAtomicBoolean.get() && this.ZU.Zy != null) {
      Object[] arrayOfObject = this.ZU.Zy.getPath();
      String str1 = Arrays.toString(Arrays.copyOfRange(arrayOfObject, 1, arrayOfObject.length));
      String str2 = Arrays.toString(paramZsd7.ZOA().ZB().toArray());
      if (str2.equals(str1)) {
        this.ZU.Zy = new TreePath((Object[])defaultMutableTreeNode.getPath());
        paramAtomicBoolean.set(true);
      } 
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zt9t.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */