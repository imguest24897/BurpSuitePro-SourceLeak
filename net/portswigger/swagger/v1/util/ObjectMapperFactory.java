package net.portswigger.swagger.v1.util;

import com.fasterxml.Zb.Zm;
import com.fasterxml.Zb.Zmi;
import com.fasterxml.Zor.Za;
import com.fasterxml.Zor.Zy0;
import com.fasterxml.Zor.Zy6;
import com.fasterxml.Zor.Zyp;
import com.fasterxml.Zqg;
import com.fasterxml.Zv.Zf;
import net.portswigger.swagger.v1.models.Operation;
import net.portswigger.swagger.v1.models.Response;
import net.portswigger.swagger.v1.util.jackson.mixin.OperationResponseMixin;
import net.portswigger.swagger.v1.util.jackson.mixin.ResponseSchemaMixin;

public class ObjectMapperFactory {
  public static Zy6 createJson(Zmi paramZmi) {
    return create(paramZmi, true, true);
  }
  
  public static Zy6 createJson() {
    return createJson(true, true);
  }
  
  public static Zy6 createJson(boolean paramBoolean1, boolean paramBoolean2) {
    return create(null, paramBoolean1, paramBoolean2);
  }
  
  public static Zy6 createYaml(Zf paramZf) {
    return create((Zmi)paramZf, true, true);
  }
  
  public static Zy6 createYaml() {
    return createYaml(true, true);
  }
  
  public static Zy6 createYaml(boolean paramBoolean1, boolean paramBoolean2) {
    return create((Zmi)new Zf(), paramBoolean1, paramBoolean2);
  }
  
  public static Zy6 create(Zmi paramZmi, boolean paramBoolean1, boolean paramBoolean2) {
    Zy6 zy6 = (paramZmi == null) ? new Zy6() : new Zy6(paramZmi);
    zy6.Z_(new Zm[] { Zm.ALLOW_TRAILING_COMMA });
    zy6.Z_(new Zm[] { Zm.ALLOW_COMMENTS });
    zy6.ZF((Za)new ObjectMapperFactory$1());
    DeserializationModule deserializationModule = new DeserializationModule(paramBoolean1, paramBoolean2);
    zy6.ZF((Za)deserializationModule);
    zy6.ZQ(Zqg.NON_NULL);
    zy6.ZO(Zy0.FAIL_ON_EMPTY_BEANS, false);
    zy6.ZO(Zy0.WRITE_DATES_AS_TIMESTAMPS, false);
    zy6.ZZ(Zyp.FAIL_ON_UNKNOWN_PROPERTIES, false);
    zy6.Zx(Response.class, ResponseSchemaMixin.class);
    zy6.Zx(Operation.class, OperationResponseMixin.class);
    ReferenceSerializationConfigurer.serializeAsComputedRef(zy6);
    return zy6;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v\\util\ObjectMapperFactory.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */