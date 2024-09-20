package burp;

import java.util.ArrayList;
import java.util.List;
import net.portswigger.Zqf;
import net.portswigger.Zuh;

public class Zrkz extends Zrko {
  private final Object Ze;
  
  public Zrkz(Object paramObject, String paramString1, String paramString2) {
    super(paramString1, paramString2);
    if (paramObject == null)
      paramObject = Integer.valueOf(0); 
    this.Ze = paramObject;
  }
  
  public void Zi(Zb3t paramZb3t) {
    // Byte code:
    //   0: invokestatic ZO : ()[Ljava/lang/String;
    //   3: astore_2
    //   4: aload_1
    //   5: invokestatic ZD : (Lburp/Zb3t;)Z
    //   8: ifeq -> 16
    //   11: aload_0
    //   12: aload_1
    //   13: invokevirtual ZI : (Lburp/Zb3t;)V
    //   16: aload_1
    //   17: invokestatic ZR : (Lburp/Zesp;)Z
    //   20: ifeq -> 32
    //   23: aload_1
    //   24: invokeinterface Zk : ()Z
    //   29: ifne -> 33
    //   32: return
    //   33: aload_1
    //   34: invokeinterface ZC : ()Ljava/util/List;
    //   39: iconst_0
    //   40: invokeinterface get : (I)Ljava/lang/Object;
    //   45: checkcast burp/Zb3t
    //   48: astore_3
    //   49: aload_3
    //   50: invokestatic ZC : (Lburp/Zb3t;)Z
    //   53: ifeq -> 89
    //   56: aload_0
    //   57: aload_3
    //   58: invokevirtual Zy : (Lburp/Zb3t;)Z
    //   61: ifeq -> 89
    //   64: aload_0
    //   65: aload_1
    //   66: invokevirtual Za : (Lburp/Zb3t;)Z
    //   69: ifeq -> 148
    //   72: aload_1
    //   73: getstatic burp/Zxc6.TaintSource : Lburp/Zxc6;
    //   76: aload_0
    //   77: getfield Ze : Ljava/lang/Object;
    //   80: invokeinterface Zm : (Lburp/Zxc6;Ljava/lang/Object;)V
    //   85: aload_2
    //   86: ifnonnull -> 148
    //   89: aload_3
    //   90: invokeinterface Zk : ()Z
    //   95: ifeq -> 148
    //   98: aload_3
    //   99: invokeinterface ZC : ()Ljava/util/List;
    //   104: iconst_0
    //   105: invokeinterface get : (I)Ljava/lang/Object;
    //   110: checkcast burp/Zb3t
    //   113: invokestatic ZC : (Lburp/Zb3t;)Z
    //   116: ifeq -> 148
    //   119: aload_0
    //   120: aload_3
    //   121: invokevirtual Zg : (Lburp/Zb3t;)Z
    //   124: ifeq -> 148
    //   127: aload_0
    //   128: aload_3
    //   129: invokevirtual Za : (Lburp/Zb3t;)Z
    //   132: ifeq -> 148
    //   135: aload_1
    //   136: getstatic burp/Zxc6.TaintSource : Lburp/Zxc6;
    //   139: aload_0
    //   140: getfield Ze : Ljava/lang/Object;
    //   143: invokeinterface Zm : (Lburp/Zxc6;Ljava/lang/Object;)V
    //   148: return
  }
  
  private void ZI(Zb3t paramZb3t) {
    String[] arrayOfString = Zrko.ZO();
    if (!Zl19.Zi(paramZb3t.ZC().get(1)))
      Zuh.Zb(false, Zqf.Zr); 
    if (((Zb3t)paramZb3t.ZC().get(1)).ZC() == null)
      return; 
    for (Zb3t zb3t : ((Zb3t)paramZb3t.ZC().get(1)).ZC()) {
      if (Zl19.ZR(zb3t) && Zl19.ZC(zb3t.ZC().get(0)) && Zy(zb3t.ZC().get(0)) && Za(zb3t)) {
        zb3t.Zm(Zxc6.TaintSource, this.Ze);
        if (zb3t.ZO(Zxc6.TaintSource) != null && zb3t.ZO(Zxc6.TaintSink) != null) {
          Zm4y zm4y = new Zm4y(paramZb3t, paramZb3t);
          ZP(zb3t, zm4y);
        } 
      } 
      if (arrayOfString == null)
        break; 
    } 
  }
  
  private boolean Za(Zb3t paramZb3t) {
    return this.ZR.equals((((Zgcc)paramZb3t.ZC().get(0)).ZK()).Zr.toString());
  }
  
  private boolean Zy(Zb3t paramZb3t) {
    return ((((Zgcc)paramZb3t).ZK()).ZE == Zgho.LITERAL_STRING);
  }
  
  private boolean Zg(Zb3t paramZb3t) {
    return ((((Zgcc)paramZb3t.ZC().get(0)).ZK()).ZE == Zgho.IDENTIFIER);
  }
  
  private void ZP(Zesp paramZesp, Zgbi paramZgbi) {
    List<Zgbi> list = paramZesp.<List>ZO(Zxc6.TaintHops);
    if (list == null) {
      list = new ArrayList(1);
      paramZesp.Zm(Zxc6.TaintHops, list);
    } 
    list.add(paramZgbi);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zrkz.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */