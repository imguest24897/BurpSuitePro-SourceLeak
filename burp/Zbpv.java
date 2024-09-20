package burp;

public class Zbpv implements Zmky {
  private final Zeun ZM = new Zeun();
  
  private boolean Ze;
  
  public void ZI(Ztu8 paramZtu8) {
    // Byte code:
    //   0: invokestatic ZG : ()[Ljava/lang/String;
    //   3: astore_2
    //   4: aload_0
    //   5: getfield Ze : Z
    //   8: ifeq -> 51
    //   11: aload_1
    //   12: invokestatic Za : (Lburp/Ztu8;)Z
    //   15: ifeq -> 27
    //   18: aload_0
    //   19: iconst_0
    //   20: putfield Ze : Z
    //   23: aload_2
    //   24: ifnull -> 63
    //   27: aload_1
    //   28: invokestatic ZS : (Lburp/Ztu8;)Z
    //   31: ifeq -> 63
    //   34: aload_0
    //   35: getfield ZM : Lburp/Zeun;
    //   38: aload_1
    //   39: invokeinterface Zlv : ()Ljava/lang/String;
    //   44: invokevirtual Zk : (Ljava/lang/String;)V
    //   47: aload_2
    //   48: ifnull -> 63
    //   51: aload_1
    //   52: invokestatic ZC : (Lburp/Ztu8;)Z
    //   55: ifeq -> 63
    //   58: aload_0
    //   59: iconst_1
    //   60: putfield Ze : Z
    //   63: return
  }
  
  public void ZW(Zt82 paramZt82) {
    this.ZM.Zv(paramZt82, Zq());
  }
  
  public Zlug Zq() {
    return Zlug.HEADER_TAGS;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbpv.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */