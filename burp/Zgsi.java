package burp;

import java.awt.EventQueue;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public class Zgsi {
  private final Ztwv Zh;
  
  private final Zz37 ZJ;
  
  public Zgsi(Ztwv paramZtwv, Zz37 paramZz37) {
    this.Zh = paramZtwv;
    this.ZJ = paramZz37;
  }
  
  public void Ze(Zrw9 paramZrw9) {
    // Byte code:
    //   0: aload_1
    //   1: invokevirtual ZQ : ()Ljavafx/beans/property/BooleanProperty;
    //   4: iconst_1
    //   5: invokestatic valueOf : (Z)Ljava/lang/Boolean;
    //   8: invokevirtual setValue : (Ljava/lang/Boolean;)V
    //   11: aload_0
    //   12: getfield Zh : Lburp/Ztwv;
    //   15: aload_0
    //   16: aload_1
    //   17: <illegal opcode> run : (Lburp/Zgsi;Lburp/Zrw9;)Ljava/lang/Runnable;
    //   22: invokeinterface Zx : (Ljava/lang/Runnable;)Ljava/util/concurrent/Future;
    //   27: pop
    //   28: return
  }
  
  private void Zl(Zrw9 paramZrw9) throws Zxe9 {
    Zraj zraj = paramZrw9.ZS();
    Zmkf zmkf = zraj.ZCy();
    Zm1j zm1j = this.ZJ.ZL(zraj.ZCm(), zraj.ZCX());
    zmkf.Zc(zm1j.Zp8());
    zmkf.ZO(zm1j.Zpb());
  }
  
  private void lambda$generate$1(Zrw9 paramZrw9) {
    try {
      Zl(paramZrw9);
    } catch (Zxe9 zxe9) {
      Zah.Zl(zxe9, Zk_.COMMON_RUNTIME_FAILURE);
      Zraj zraj = paramZrw9.ZS();
      Zmkf zmkf = zraj.ZCy();
      zmkf.Zg(zxe9.getMessage());
    } finally {
      EventQueue.invokeLater(paramZrw9::lambda$generate$0);
    } 
  }
  
  private static void lambda$generate$0(Zrw9 paramZrw9) {
    paramZrw9.ZQ().setValue(Boolean.valueOf(false));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zgsi.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */