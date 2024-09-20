package burp;

class Zz9g {
  static Zstu Zb(byte[] paramArrayOfbyte, boolean paramBoolean1, boolean paramBoolean2) {
    return Zf(Zyf.Zy(paramArrayOfbyte), paramBoolean1, paramBoolean2);
  }
  
  static Zstu Zf(Zstu paramZstu, boolean paramBoolean1, boolean paramBoolean2) {
    if (paramZstu == null)
      return null; 
    if (!paramBoolean1 && !paramBoolean2)
      return null; 
    if (paramBoolean1 && paramBoolean2)
      return paramZstu; 
    int i = Zgyj.Zg(paramZstu);
    return paramBoolean1 ? paramZstu.Zb(0, i) : paramZstu.Zb(i, paramZstu.Zpu());
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zz9g.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */