package burp;

import java.util.List;
import net.portswigger.Zah;
import net.portswigger.Zk_;

public interface Zbh {
  public static final List<Zbh> ZH = List.of(new Zbh[] { 
        new Zsjb(Zrrh.SCANNER_OPTIONS_INSERTION_POINTS_HTTP_HEADERS_DISABLED, Zbph::ZNF, new Zs66[] { Zs66.HEADER }), new Zsjb(Zrrh.SCANNER_OPTIONS_INSERTION_POINTS_COOKIES_DISABLED, Zbph::ZNI, new Zs66[] { Zs66.COOKIE }), new Zsjb(Zrrh.SCANNER_OPTIONS_INSERTION_POINTS_ENTIRE_BODY_DISABLED, Zbph::ZNX, new Zs66[] { Zs66.ENTIRE_BODY }), new Zsjb(Zrrh.SCANNER_OPTIONS_INSERTION_POINTS_URL_PARAMETERS_DISABLED, Zbph::ZNr, new Zs66[] { Zs66.URL_PARAM }), new Zsjb(Zrrh.SCANNER_OPTIONS_INSERTION_POINTS_URL_PATH_FILENAME_DISABLED, Zbph::ZNg, new Zs66[] { Zs66.PATH_FILENAME_PARAM }), new Zsjb(Zrrh.SCANNER_OPTIONS_INSERTION_POINTS_URL_PATH_FOLDERS_DISABLED, Zbph::ZN5, new Zs66[] { Zs66.PATH_FOLDER_PARAM }), new Zsjb(Zrrh.SCANNER_OPTIONS_INSERTION_POINTS_BODY_PARAMETERS_DISABLED, Zbph::ZN6, new Zs66[] { Zs66.JSON_PARAM, Zs66.BODY_PARAM_URL_ENCODED, Zs66.BODY_PARAM_MULTIPART, Zs66.XML_ATTR, Zs66.XML_PARAM }), new Zsjb(Zrrh.SCANNER_OPTIONS_INSERTION_POINTS_PARAMETER_NAME_DISABLED, Zbph::ZNU, new Zs66[] { Zs66.PARAM_NAME_URL, Zs66.PARAM_NAME_BODY_URL_ENCODED, Zs66.PARAM_NAME_BODY_MULTIPART }), new Zkgz(Zrrh.SCANNER_OPTIONS_INSERTION_POINTS_CHANGE_URL_TO_COOKIE, Zbph::ZNQ, 11), new Zkgz(Zrrh.SCANNER_OPTIONS_INSERTION_POINTS_CHANGE_URL_TO_BODY, Zbph::ZNP, 8), 
        new Zkgz(Zrrh.SCANNER_OPTIONS_INSERTION_POINTS_CHANGE_COOKIE_TO_URL, Zbph::ZNY, 10), new Zkgz(Zrrh.SCANNER_OPTIONS_INSERTION_POINTS_CHANGE_COOKIE_TO_BODY, Zbph::ZNo, 13), new Zkgz(Zrrh.SCANNER_OPTIONS_INSERTION_POINTS_CHANGE_BODY_TO_URL, Zbph::ZNO, 9), new Zkgz(Zrrh.SCANNER_OPTIONS_INSERTION_POINTS_CHANGE_BODY_TO_COOKIE, Zbph::ZN0, 12), new Zxo9(), new Zlmm(), Zbh::lambda$static$0 });
  
  static Zexx ZE(Zgh_ paramZgh_, Zbph paramZbph, int paramInt, boolean paramBoolean) {
    int i = Zrjd.ZG();
    try {
      for (Zbh zbh : ZH) {
        Zexx zexx = zbh.Ze(paramZgh_, paramZbph, paramInt, paramBoolean);
        if (zexx != Zexx.ALLOWED)
          return zexx; 
        if (i != 0)
          break; 
      } 
      return Zexx.ALLOWED;
    } catch (Exception exception) {
      Zah.Zl(exception, Zk_.UNEXPECTED);
      return Zexx.VETOED_DUE_TO_INTERNAL_ERROR;
    } 
  }
  
  Zexx Ze(Zgh_ paramZgh_, Zbph paramZbph, int paramInt, boolean paramBoolean);
  
  private static Zexx lambda$static$0(Zgh_ paramZgh_, Zbph paramZbph, int paramInt, boolean paramBoolean) {
    return (paramInt >= paramZbph.ZNE()) ? Zexx.VETOED_DUE_TO_LIMIT : Zexx.ALLOWED;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\burp\Zbh.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */