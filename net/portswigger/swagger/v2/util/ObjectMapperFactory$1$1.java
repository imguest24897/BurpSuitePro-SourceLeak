package net.portswigger.swagger.v2.util;

import com.fasterxml.Zk.Ze;
import com.fasterxml.Zor.Zy7;
import com.fasterxml.Zor.Zyd;
import com.fasterxml.Zor.Zyv;
import net.portswigger.swagger.v3.core.jackson.ExampleSerializer;
import net.portswigger.swagger.v3.core.jackson.MediaTypeSerializer;
import net.portswigger.swagger.v3.core.jackson.SchemaSerializer;
import net.portswigger.swagger.v3.oas.models.examples.Example;
import net.portswigger.swagger.v3.oas.models.media.MediaType;
import net.portswigger.swagger.v3.oas.models.media.Schema;

class ObjectMapperFactory$1$1 extends Ze {
  final ObjectMapperFactory$1 this$0;
  
  public Zyd<?> modifySerializer(Zy7 paramZy7, Zyv paramZyv, Zyd<?> paramZyd) {
    return (Zyd<?>)(Schema.class.isAssignableFrom(paramZyv.Zl()) ? new SchemaSerializer(paramZyd) : (MediaType.class.isAssignableFrom(paramZyv.Zl()) ? new MediaTypeSerializer(paramZyd) : (Example.class.isAssignableFrom(paramZyv.Zl()) ? new ExampleSerializer(paramZyd) : paramZyd)));
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v\\util\ObjectMapperFactory$1$1.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */