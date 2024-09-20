package net.portswigger.swagger.v3.parser.reference;

import java.util.List;
import net.portswigger.swagger.v3.oas.models.Components;
import net.portswigger.swagger.v3.oas.models.OpenAPI;
import net.portswigger.swagger.v3.oas.models.Operation;
import net.portswigger.swagger.v3.oas.models.PathItem;
import net.portswigger.swagger.v3.oas.models.Paths;
import net.portswigger.swagger.v3.oas.models.examples.Example;
import net.portswigger.swagger.v3.oas.models.headers.Header;
import net.portswigger.swagger.v3.oas.models.links.Link;
import net.portswigger.swagger.v3.oas.models.media.Encoding;
import net.portswigger.swagger.v3.oas.models.media.MediaType;
import net.portswigger.swagger.v3.oas.models.media.Schema;
import net.portswigger.swagger.v3.oas.models.parameters.Parameter;
import net.portswigger.swagger.v3.oas.models.parameters.RequestBody;
import net.portswigger.swagger.v3.oas.models.responses.ApiResponse;
import net.portswigger.swagger.v3.oas.models.responses.ApiResponses;
import net.portswigger.swagger.v3.oas.models.security.SecurityScheme;

public abstract class AbstractVisitor implements Visitor {
  public OpenAPI visitOpenApi(OpenAPI paramOpenAPI) {
    return null;
  }
  
  public Paths visitPaths(Paths paramPaths) {
    return null;
  }
  
  public Components visitComponents(Components paramComponents) {
    return null;
  }
  
  public PathItem visitPathItem(PathItem paramPathItem) {
    return null;
  }
  
  public Parameter visitParameter(Parameter paramParameter) {
    return null;
  }
  
  public Operation visitOperation(Operation paramOperation) {
    return null;
  }
  
  public Schema visitSchema(Schema paramSchema, List<String> paramList) {
    return null;
  }
  
  public ApiResponse visitResponse(ApiResponse paramApiResponse) {
    return null;
  }
  
  public RequestBody visitRequestBody(RequestBody paramRequestBody) {
    return null;
  }
  
  public Link visitLink(Link paramLink) {
    return null;
  }
  
  public SecurityScheme visitSecurityScheme(SecurityScheme paramSecurityScheme) {
    return null;
  }
  
  public ApiResponses visitResponses(ApiResponses paramApiResponses) {
    return null;
  }
  
  public MediaType visitMediaType(MediaType paramMediaType) {
    return null;
  }
  
  public Encoding visitEncoding(Encoding paramEncoding) {
    return null;
  }
  
  public Header visitHeader(Header paramHeader) {
    return null;
  }
  
  public Example visitExample(Example paramExample) {
    return null;
  }
}


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\net\portswigger\swagger\v3\parser\reference\AbstractVisitor.class
 * Java compiler version: 21 (65.0)
 * JD-Core Version:       1.1.3
 */