package burp;

public class Zsi4 implements Zmky {
  private final StringBuilder Zv = new StringBuilder();
  
  private final Zeun Zk = new Zeun();
  
  private boolean ZU;
  
  private boolean ZI;
  
  public void ZI(Ztu8 paramZtu8) {
    // Byte code:
    //   0: invokestatic ZG : ()[Ljava/lang/String;
    //   3: astore_2
    //   4: aload_0
    //   5: getfield ZI : Z
    //   8: ifeq -> 12
    //   11: return
    //   12: aload_0
    //   13: getfield ZU : Z
    //   16: ifeq -> 61
    //   19: aload_1
    //   20: invokestatic ZD : (Lburp/Ztu8;)Z
    //   23: ifeq -> 40
    //   26: aload_0
    //   27: iconst_0
    //   28: putfield ZU : Z
    //   31: aload_0
    //   32: iconst_1
    //   33: putfield ZI : Z
    //   36: aload_2
    //   37: ifnull -> 73
    //   40: aload_1
    //   41: invokestatic ZS : (Lburp/Ztu8;)Z
    //   44: ifeq -> 73
    //   47: aload_0
    //   48: aload_1
    //   49: invokeinterface Zlv : ()Ljava/lang/String;
    //   54: invokevirtual Z_ : (Ljava/lang/String;)V
    //   57: aload_2
    //   58: ifnull -> 73
    //   61: aload_1
    //   62: invokestatic ZH : (Lburp/Ztu8;)Z
    //   65: ifeq -> 73
    //   68: aload_0
    //   69: iconst_1
    //   70: putfield ZU : Z
    //   73: return
  }
  
  private void Z_(String paramString) {
    if (paramString != null) {
      this.Zk.Zk(paramString);
      this.Zv.append(paramString);
    } 
  }
  
  public void ZW(Zt82 paramZt82) {
    this.Zk.Zv(paramZt82, Zq());
    paramZt82.Zh(this.Zv.toString());
  }
  
  public Zlug Zq() {
    return Zlug.PAGE_TITLE;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zsi4.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */