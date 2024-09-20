package com.fasterxml;

import com.fasterxml.Zb.Zf;
import com.fasterxml.Zor.Zy0;
import com.fasterxml.Zor.Zyi;
import com.fasterxml.Zp.Za;
import com.fasterxml.Zw.Zl;
import java.io.IOException;

@Zl
public class Zz8 extends Zz0<char[]> {
  public Zz8() {
    super((Class)char[].class);
  }
  
  public boolean Zg(Zyi paramZyi, char[] paramArrayOfchar) {
    return (paramArrayOfchar.length == 0);
  }
  
  public void Zd(char[] paramArrayOfchar, Zf paramZf, Zyi paramZyi) throws IOException {
    String str = Zz0.ZG();
    try {
      if (paramZyi.ZW(Zy0.WRITE_CHAR_ARRAYS_AS_JSON_ARRAYS)) {
        try {
          paramZf.Zf(paramArrayOfchar, paramArrayOfchar.length);
          Zr(paramZf, paramArrayOfchar);
          paramZf.ZI();
          if (str != null) {
            paramZf.ZA(paramArrayOfchar, 0, paramArrayOfchar.length);
            return;
          } 
        } catch (IOException iOException) {
          throw a(null);
        } 
        return;
      } 
    } catch (IOException iOException) {
      throw a(null);
    } 
    paramZf.ZA(paramArrayOfchar, 0, paramArrayOfchar.length);
  }
  
  public void Zk(char[] paramArrayOfchar, Zf paramZf, Zyi paramZyi, Za paramZa) throws IOException {
    // Byte code:
    //   0: invokestatic ZG : ()Ljava/lang/String;
    //   3: aload_3
    //   4: getstatic com/fasterxml/Zor/Zy0.WRITE_CHAR_ARRAYS_AS_JSON_ARRAYS : Lcom/fasterxml/Zor/Zy0;
    //   7: invokevirtual ZW : (Lcom/fasterxml/Zor/Zy0;)Z
    //   10: istore #6
    //   12: astore #5
    //   14: iload #6
    //   16: ifeq -> 47
    //   19: aload #4
    //   21: aload_2
    //   22: aload #4
    //   24: aload_1
    //   25: getstatic com/fasterxml/Zb/Zl.START_ARRAY : Lcom/fasterxml/Zb/Zl;
    //   28: invokevirtual Zm : (Ljava/lang/Object;Lcom/fasterxml/Zb/Zl;)Lcom/fasterxml/Zo2/Zn;
    //   31: invokevirtual ZA : (Lcom/fasterxml/Zb/Zf;Lcom/fasterxml/Zo2/Zn;)Lcom/fasterxml/Zo2/Zn;
    //   34: astore #7
    //   36: aload_0
    //   37: aload_2
    //   38: aload_1
    //   39: invokespecial Zr : (Lcom/fasterxml/Zb/Zf;[C)V
    //   42: aload #5
    //   44: ifnull -> 72
    //   47: aload #4
    //   49: aload_2
    //   50: aload #4
    //   52: aload_1
    //   53: getstatic com/fasterxml/Zb/Zl.VALUE_STRING : Lcom/fasterxml/Zb/Zl;
    //   56: invokevirtual Zm : (Ljava/lang/Object;Lcom/fasterxml/Zb/Zl;)Lcom/fasterxml/Zo2/Zn;
    //   59: invokevirtual ZA : (Lcom/fasterxml/Zb/Zf;Lcom/fasterxml/Zo2/Zn;)Lcom/fasterxml/Zo2/Zn;
    //   62: astore #7
    //   64: aload_2
    //   65: aload_1
    //   66: iconst_0
    //   67: aload_1
    //   68: arraylength
    //   69: invokevirtual ZA : ([CII)V
    //   72: aload #4
    //   74: aload_2
    //   75: aload #7
    //   77: invokevirtual ZP : (Lcom/fasterxml/Zb/Zf;Lcom/fasterxml/Zo2/Zn;)Lcom/fasterxml/Zo2/Zn;
    //   80: pop
    //   81: return
  }
  
  private final void Zr(Zf paramZf, char[] paramArrayOfchar) throws IOException {
    byte b = 0;
    int i = paramArrayOfchar.length;
    String str = Zz0.ZG();
    while (b < i) {
      paramZf.ZA(paramArrayOfchar, b, 1);
      b++;
      if (str != null)
        break; 
    } 
  }
  
  private static IOException a(IOException paramIOException) {
    return paramIOException;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\com\fasterxml\Zz8.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */