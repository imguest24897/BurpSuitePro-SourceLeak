package burp;

class Zbw9 extends Zbws {
  private Zran Zt;
  
  private int ZU = -1;
  
  private int Zc = -1;
  
  Zbw9() {
    setSelectionMode(1);
  }
  
  public void ZB(Zran paramZran) {
    ZL(paramZran);
    this.Zt = paramZran;
  }
  
  public boolean isCellSelected(int paramInt1, int paramInt2) {
    if (paramInt2 == 17 && this.ZU == -1)
      return true; 
    if (paramInt2 == 0 || paramInt2 == 17 || this.ZU == -1)
      return false; 
    int i = Z_(paramInt1, paramInt2);
    return (this.Zc > this.ZU) ? ((i >= this.ZU && i < this.Zc)) : ((this.Zc < this.ZU) ? ((i >= this.Zc && i < this.ZU)) : false);
  }
  
  public void clearSelection() {
    this.ZU = -1;
    this.Zc = -1;
  }
  
  public boolean ZM() {
    return (this.ZU != -1 && this.ZU != this.Zc);
  }
  
  public byte[] ZA() {
    int i = Zl();
    int j = ZC();
    byte[] arrayOfByte = new byte[j - i];
    System.arraycopy(this.Zt.Zj(false), i, arrayOfByte, 0, j - i);
    return arrayOfByte;
  }
  
  public int Zl() {
    return Math.min(this.ZU, this.Zc);
  }
  
  public int ZC() {
    return Math.max(this.ZU, this.Zc);
  }
  
  private int Z_(int paramInt1, int paramInt2) {
    if (paramInt2 == 0)
      paramInt2 = 1; 
    if (paramInt2 == 17)
      paramInt2 = 16; 
    return paramInt1 * 16 + paramInt2 - 1;
  }
  
  public void changeSelection(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2) {
    // Byte code:
    //   0: aload_0
    //   1: iload_1
    //   2: iload_2
    //   3: invokevirtual Z_ : (II)I
    //   6: istore #6
    //   8: invokestatic ZH : ()Z
    //   11: aload_0
    //   12: getfield Zt : Lburp/Zran;
    //   15: invokeinterface ZC : ()I
    //   20: istore #7
    //   22: istore #5
    //   24: iload #4
    //   26: ifeq -> 100
    //   29: aload_0
    //   30: getfield ZU : I
    //   33: iconst_m1
    //   34: if_icmpeq -> 100
    //   37: iload_2
    //   38: ifne -> 52
    //   41: aload_0
    //   42: iload #6
    //   44: putfield Zc : I
    //   47: iload #5
    //   49: ifne -> 166
    //   52: iload #6
    //   54: aload_0
    //   55: getfield ZU : I
    //   58: if_icmplt -> 74
    //   61: aload_0
    //   62: iload #6
    //   64: iconst_1
    //   65: iadd
    //   66: putfield Zc : I
    //   69: iload #5
    //   71: ifne -> 80
    //   74: aload_0
    //   75: iload #6
    //   77: putfield Zc : I
    //   80: aload_0
    //   81: getfield Zc : I
    //   84: iload #7
    //   86: if_icmple -> 166
    //   89: aload_0
    //   90: iload #7
    //   92: putfield Zc : I
    //   95: iload #5
    //   97: ifne -> 166
    //   100: iload_2
    //   101: ifne -> 129
    //   104: aload_0
    //   105: iload #6
    //   107: putfield ZU : I
    //   110: aload_0
    //   111: iload #6
    //   113: bipush #16
    //   115: iadd
    //   116: iload #7
    //   118: invokestatic min : (II)I
    //   121: putfield Zc : I
    //   124: iload #5
    //   126: ifne -> 166
    //   129: iload_2
    //   130: bipush #17
    //   132: if_icmpeq -> 142
    //   135: iload #6
    //   137: iload #7
    //   139: if_icmplt -> 152
    //   142: aload_0
    //   143: iconst_m1
    //   144: putfield ZU : I
    //   147: iload #5
    //   149: ifne -> 166
    //   152: aload_0
    //   153: iload #6
    //   155: putfield ZU : I
    //   158: aload_0
    //   159: iload #6
    //   161: iconst_1
    //   162: iadd
    //   163: putfield Zc : I
    //   166: aload_0
    //   167: iload_1
    //   168: iload_2
    //   169: iload_3
    //   170: iload #4
    //   172: invokespecial changeSelection : (IIZZ)V
    //   175: return
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbw9.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */