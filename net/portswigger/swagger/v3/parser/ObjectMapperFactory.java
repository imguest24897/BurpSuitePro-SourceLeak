package net.portswigger.swagger.v3.parser;

import com.fasterxml.Zb.Zm;
import com.fasterxml.Zb.Zmi;
import com.fasterxml.Zb.Zmv;
import com.fasterxml.Zb.Zn;
import com.fasterxml.Zor.Za;
import com.fasterxml.Zor.Zy0;
import com.fasterxml.Zor.Zy6;
import com.fasterxml.Zor.Zyp;
import com.fasterxml.Zqg;
import com.fasterxml.Zv.Zb;
import com.fasterxml.Zv.Zf;
import com.fasterxml.Zyf;

public class ObjectMapperFactory {
  public static Zy6 createJson() {
    return createJson(true, true);
  }
  
  protected static Zy6 createJson(boolean paramBoolean1, boolean paramBoolean2) {
    return create(createJsonFactory(), paramBoolean1, paramBoolean2);
  }
  
  public static Zy6 createYaml() {
    return createYaml(true, true);
  }
  
  protected static Zy6 createYaml(boolean paramBoolean1, boolean paramBoolean2) {
    return create(createYamlFactory(), paramBoolean1, paramBoolean2);
  }
  
  private static Zy6 create(Zmi paramZmi, boolean paramBoolean1, boolean paramBoolean2) {
    Zy6 zy6 = (paramZmi == null) ? new Zy6() : new Zy6(paramZmi);
    zy6.Z_(new Zm[] { Zm.ALLOW_TRAILING_COMMA });
    zy6.Z_(new Zm[] { Zm.ALLOW_COMMENTS });
    zy6.ZF((Za)new Zyf());
    zy6.ZQ(Zqg.NON_NULL);
    zy6.ZO(Zy0.FAIL_ON_EMPTY_BEANS, false);
    zy6.ZO(Zy0.WRITE_DATES_AS_TIMESTAMPS, false);
    zy6.ZZ(Zyp.FAIL_ON_UNKNOWN_PROPERTIES, false);
    return zy6;
  }
  
  private static Zmi createJsonFactory() {
    return ((Zn)(new Zn()).ZD(Zmv.STRICT_DUPLICATE_DETECTION)).ZL();
  }
  
  private static Zmi createYamlFactory() {
    return (Zmi)((Zb)Zf.Zx().ZD(Zmv.STRICT_DUPLICATE_DETECTION)).Zz();
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v3\parser\ObjectMapperFactory.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */