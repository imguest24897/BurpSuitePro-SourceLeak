package burp;

import net.portswigger.Zah;
import net.portswigger.Zk_;
import net.portswigger.Zqf;
import net.portswigger.Zto;
import net.portswigger.Zuh;

class Zgku {
  private final Zg09 Zo;
  
  private final Zmug ZQ;
  
  private final Zbws Zh;
  
  private final Ze_z ZD;
  
  private final Zxcf Zl;
  
  Zgku(Zg09 paramZg09, Zmug paramZmug, Zbws paramZbws) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: aload_1
    //   6: putfield Zo : Lburp/Zg09;
    //   9: aload_0
    //   10: aload_2
    //   11: putfield ZQ : Lburp/Zmug;
    //   14: aload_0
    //   15: aload_3
    //   16: putfield Zh : Lburp/Zbws;
    //   19: aload_0
    //   20: new burp/Ze_z
    //   23: dup
    //   24: invokespecial <init> : ()V
    //   27: putfield ZD : Lburp/Ze_z;
    //   30: aload_0
    //   31: new burp/Zxcf
    //   34: dup
    //   35: aload_0
    //   36: aload_2
    //   37: <illegal opcode> run : (Lburp/Zgku;Lburp/Zmug;)Ljava/lang/Runnable;
    //   42: invokespecial <init> : (Ljava/lang/Runnable;)V
    //   45: putfield Zl : Lburp/Zxcf;
    //   48: return
  }
  
  void ZI(Zbza paramZbza) {
    int i = Zd(paramZbza);
    if (i != -1)
      this.ZD.ZI(i, i); 
  }
  
  void Zp(int paramInt1, int paramInt2) {
    // Byte code:
    //   0: aload_0
    //   1: iload_1
    //   2: iload_2
    //   3: <illegal opcode> run : (Lburp/Zgku;II)Ljava/lang/Runnable;
    //   8: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   11: return
  }
  
  void ZW(Zbza paramZbza) {
    Ze(paramZbza);
  }
  
  void ZE() {
    this.Zl.Zz();
  }
  
  private void Ze(Zbza paramZbza) {
    String[] arrayOfString = Zxcf.Zq();
    int i = Zd(paramZbza);
    try {
      if (i == -1)
        return; 
    } catch (Exception exception) {
      throw a(null);
    } 
    int j = -1;
    try {
      j = this.Zh.convertRowIndexToView(i);
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.IGNORED);
    } 
    ZI(paramZbza);
    try {
      int k = this.Zh.convertRowIndexToModel(j);
      try {
        if (j != -1) {
          try {
            if (k != -1) {
              try {
                if (i != k) {
                  try {
                    if (i > k) {
                      try {
                        this.ZD.ZI(k, i);
                        if (arrayOfString != null)
                          this.ZD.ZI(i, k); 
                      } catch (Exception exception) {
                        throw a(null);
                      } 
                      return;
                    } 
                  } catch (Exception exception) {
                    throw a(null);
                  } 
                } else {
                  return;
                } 
              } catch (Exception exception) {
                throw a(null);
              } 
            } else {
              return;
            } 
          } catch (Exception exception) {
            throw a(null);
          } 
        } else {
          return;
        } 
      } catch (Exception exception) {
        throw a(null);
      } 
      this.ZD.ZI(i, k);
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.IGNORED);
    } 
  }
  
  private int Zd(Zbza paramZbza) {
    int i = paramZbza.Zgv();
    int j = this.Zo.size();
    if (i < 0 || i >= j) {
      Zuh.ZC(false, Zqf.Zk, i, j);
      return -1;
    } 
    Zbza zbza = this.Zo.get(i);
    Zuh.ZC((zbza.Zgv() == i), Zqf.Zr, i, zbza.Zgv());
    if (!zbza.ZF(paramZbza)) {
      Zuh.Zb(false, Zqf.Zr);
      return -1;
    } 
    return i;
  }
  
  private void lambda$rowsUpdatedByUser$2(int paramInt1, int paramInt2) {
    this.ZQ.fireTableRowsUpdated(paramInt1, paramInt2);
  }
  
  private void lambda$new$1(Zmug paramZmug) {
    // Byte code:
    //   0: invokestatic getDefaultToolkit : ()Ljava/awt/Toolkit;
    //   3: invokevirtual getSystemEventQueue : ()Ljava/awt/EventQueue;
    //   6: invokevirtual peekEvent : ()Ljava/awt/AWTEvent;
    //   9: ifnonnull -> 37
    //   12: aload_0
    //   13: getfield ZD : Lburp/Ze_z;
    //   16: invokevirtual ZY : ()Lnet/portswigger/Zto;
    //   19: astore_2
    //   20: aload_2
    //   21: getstatic burp/Ze_z.ZA : Lnet/portswigger/Zto;
    //   24: if_acmpeq -> 37
    //   27: aload_2
    //   28: aload_1
    //   29: <illegal opcode> run : (Lnet/portswigger/Zto;Lburp/Zmug;)Ljava/lang/Runnable;
    //   34: invokestatic invokeLater : (Ljava/lang/Runnable;)V
    //   37: return
  }
  
  private static void lambda$new$0(Zto paramZto, Zmug paramZmug) {
    if (((Integer)paramZto.Zq).intValue() < paramZmug.getRowCount())
      paramZmug.fireTableRowsUpdated(((Integer)paramZto.Zq).intValue(), Math.min(((Integer)paramZto.Zo).intValue(), paramZmug.getRowCount())); 
  }
  
  private static Exception a(Exception paramException) {
    return paramException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgku.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */