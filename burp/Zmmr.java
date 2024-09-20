package burp;

public class Zmmr extends Zmvg {
  public Zl4m Zc(Zrdb paramZrdb1, Zrdb paramZrdb2, Zgvn paramZgvn, Zz1h paramZz1h) {
    if (paramZrdb1.Za6() == Zzu2.GRAPHQL_ENDPOINT_DISCOVERED && paramZrdb2.Za6() == Zzu2.GRAPHQL_ENDPOINT_DISCOVERED) {
      int i = paramZrdb1.Za7().Zy().size();
      int j = paramZrdb2.Za7().Zy().size();
      return (i >= j) ? Zl4m.Zh : Zl4m.Zf;
    } 
    return (paramZrdb1.Za6() == Zzu2.GRAPHQL_ENDPOINT_DISCOVERED && paramZrdb2.Za6() == Zzu2.GRAPHQL_ENDPOINT_FOUND) ? Zl4m.Zh : ((paramZrdb1.Za6() == Zzu2.GRAPHQL_ENDPOINT_FOUND && paramZrdb2.Za6() == Zzu2.GRAPHQL_ENDPOINT_DISCOVERED) ? Zl4m.Zf : ((paramZrdb1.Za6() == Zzu2.GRAPHQL_ENDPOINT_FOUND && paramZrdb2.Za6() == Zzu2.GRAPHQL_ENDPOINT_FOUND) ? ((paramZrdb1.Zak() >= paramZrdb2.Zak()) ? Zl4m.Zh : Zl4m.Zf) : super.Zc(paramZrdb1, paramZrdb2, paramZgvn, paramZz1h)));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zmmr.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */