package burp;

import net.portswigger.Zl0;

class Zmp1 implements Zkh {
  private final Zrk1 ZM;
  
  private final Zxei Zx;
  
  private final Zl0 Zk;
  
  boolean ZZ;
  
  private static final String a;
  
  Zmp1(Zrk1 paramZrk1, Zxei paramZxei, Zl0 paramZl0) {
    this.ZM = paramZrk1;
    this.Zx = paramZxei;
    this.Zk = paramZl0;
  }
  
  public boolean ZM() {
    // Byte code:
    //   0: new burp/Zt87
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_1
    //   8: aload_0
    //   9: aload_1
    //   10: <illegal opcode> run : (Lburp/Zmp1;Lburp/Zt87;)Ljava/lang/Runnable;
    //   15: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   18: aload_1
    //   19: invokevirtual ZE : ()Z
    //   22: ireturn
  }
  
  public boolean ZN(boolean paramBoolean) {
    // Byte code:
    //   0: new burp/Zt87
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_2
    //   8: aload_0
    //   9: aload_2
    //   10: iload_1
    //   11: <illegal opcode> run : (Lburp/Zmp1;Lburp/Zt87;Z)Ljava/lang/Runnable;
    //   16: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   19: aload_2
    //   20: invokevirtual ZE : ()Z
    //   23: istore_3
    //   24: aload_0
    //   25: iload_3
    //   26: ifne -> 33
    //   29: iconst_1
    //   30: goto -> 34
    //   33: iconst_0
    //   34: putfield ZZ : Z
    //   37: iload_3
    //   38: ireturn
  }
  
  public boolean ZP() {
    // Byte code:
    //   0: new burp/Zt87
    //   3: dup
    //   4: invokespecial <init> : ()V
    //   7: astore_1
    //   8: aload_0
    //   9: aload_1
    //   10: <illegal opcode> run : (Lburp/Zmp1;Lburp/Zt87;)Ljava/lang/Runnable;
    //   15: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   18: aload_1
    //   19: invokevirtual ZE : ()Z
    //   22: ireturn
  }
  
  public void Zd(Zk8l paramZk8l, Ztg4 paramZtg4, String paramString) {
    this.ZM.Zf(paramZk8l, paramZtg4, paramString);
  }
  
  public void Zo(Zkit paramZkit, Zk8l paramZk8l, Zgbj paramZgbj, Ztg4 paramZtg4, String paramString) {
    this.ZM.ZA(paramZkit, paramZk8l, paramZtg4, paramString);
  }
  
  public void ZP(Zkit paramZkit, Zk8l paramZk8l, Zgbj paramZgbj, Ztg4 paramZtg4, String paramString, Zl04 paramZl04) {
    // Byte code:
    //   0: invokestatic ZT : ()[Ljava/lang/String;
    //   3: astore #7
    //   5: aload_0
    //   6: aload_1
    //   7: aload_2
    //   8: aload_3
    //   9: aload #4
    //   11: aload #5
    //   13: aload #6
    //   15: <illegal opcode> run : (Lburp/Zmp1;Lburp/Zkit;Lburp/Zk8l;Lburp/Zgbj;Lburp/Ztg4;Ljava/lang/String;Lburp/Zl04;)Ljava/lang/Runnable;
    //   20: astore #8
    //   22: aload_3
    //   23: ifnull -> 39
    //   26: aload_3
    //   27: aload #8
    //   29: invokeinterface Zy : (Ljava/lang/Runnable;)V
    //   34: aload #7
    //   36: ifnull -> 57
    //   39: iconst_0
    //   40: getstatic net/portswigger/Zqf.Zr : Lnet/portswigger/Zqf;
    //   43: invokestatic Zb : (ZLnet/portswigger/Zqf;)V
    //   46: aload_0
    //   47: getfield Zx : Lburp/Zxei;
    //   50: aload #8
    //   52: invokeinterface ZY : (Ljava/lang/Runnable;)V
    //   57: return
  }
  
  private void lambda$repairDataStore$3(Zkit paramZkit, Zk8l paramZk8l, Zgbj paramZgbj, Ztg4 paramZtg4, String paramString, Zl04 paramZl04) {
    new Zxtz(this.Zx, paramZkit, paramZk8l, paramZgbj, paramZtg4, this.Zk, paramString, paramZl04, a);
  }
  
  private void lambda$promptUserToEnableSafeMode$2(Zt87 paramZt87) {
    this.ZM.ZZ(paramZt87);
  }
  
  private void lambda$shouldUseNewerProjectFile$1(Zt87 paramZt87, boolean paramBoolean) {
    this.ZM.Zi(paramZt87, paramBoolean);
  }
  
  private void lambda$shouldAdoptCollaboratorInteractions$0(Zt87 paramZt87) {
    this.ZM.ZT(paramZt87);
  }
  
  static {
    // Byte code:
    //   0: bipush #93
    //   2: ldc 'J[SshMHLLxd\@'
    //   4: iconst_m1
    //   5: goto -> 14
    //   8: putstatic burp/Zmp1.a : Ljava/lang/String;
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
    //   80: bipush #69
    //   82: goto -> 112
    //   85: bipush #99
    //   87: goto -> 112
    //   90: bipush #126
    //   92: goto -> 112
    //   95: bipush #79
    //   97: goto -> 112
    //   100: bipush #92
    //   102: goto -> 112
    //   105: bipush #98
    //   107: goto -> 112
    //   110: bipush #105
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


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmp1.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */