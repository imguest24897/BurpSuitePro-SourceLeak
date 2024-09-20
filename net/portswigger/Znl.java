package net.portswigger;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.openapi4j.Zpj;
import org.openapi4j.Zw;

public class Znl {
  private final List<Zid> ZC;
  
  public Znl(Zqt paramZqt, Zw paramZw) {
    // Byte code:
    //   0: aload_0
    //   1: invokespecial <init> : ()V
    //   4: aload_0
    //   5: new java/util/ArrayList
    //   8: dup
    //   9: invokespecial <init> : ()V
    //   12: putfield ZC : Ljava/util/List;
    //   15: aload_2
    //   16: ifnonnull -> 20
    //   19: return
    //   20: aload_1
    //   21: aload_2
    //   22: invokevirtual Zx : (Lorg/openapi4j/Zw;)Lorg/openapi4j/Zw;
    //   25: astore_3
    //   26: aload_3
    //   27: invokevirtual getContentMediaTypes : ()Ljava/util/Map;
    //   30: invokestatic ofNullable : (Ljava/lang/Object;)Ljava/util/Optional;
    //   33: aload_0
    //   34: aload_1
    //   35: <illegal opcode> accept : (Lnet/portswigger/Znl;Lnet/portswigger/Zqt;)Ljava/util/function/Consumer;
    //   40: invokevirtual ifPresent : (Ljava/util/function/Consumer;)V
    //   43: return
  }
  
  public List<Zid> ZS() {
    return this.ZC;
  }
  
  private void lambda$new$0(Zqt paramZqt, Map paramMap) {
    Iterator<String> iterator = paramMap.keySet().iterator();
    String[] arrayOfString = Zfe.ZG();
    while (iterator.hasNext()) {
      String str = iterator.next();
      this.ZC.add(new Zid(paramZqt, str, (Zpj)paramMap.get(str)));
      if (arrayOfString == null)
        break; 
    } 
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\Znl.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */