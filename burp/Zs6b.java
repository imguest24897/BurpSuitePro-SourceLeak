package burp;

class Zs6b implements Zkjk {
  private final Zgbd Ze;
  
  Zs6b(Zgbd paramZgbd) {
    this.Ze = paramZgbd;
  }
  
  public Zt4c ZP(Zska paramZska) {
    return (paramZska.ZO(Zzzm.CONTENT_LENGTH_HEADER) && this.Ze.Zf()) ? Zt4c.UNDERLINE : ((paramZska.ZO(Zzzm.CONNECTION_HEADER) && this.Ze.Zw()) ? Zt4c.UNDERLINE : Zt4c.NONE);
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zs6b.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */