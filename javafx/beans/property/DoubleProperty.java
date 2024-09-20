/*     */ package javafx.beans.property;
/*     */ 
/*     */ import com.sun.javafx.binding.BidirectionalBinding;
/*     */ import com.sun.javafx.binding.Logging;
/*     */ import java.util.Objects;
/*     */ import javafx.beans.binding.Bindings;
/*     */ import javafx.beans.binding.ObjectExpression;
/*     */ import javafx.beans.value.WritableDoubleValue;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public abstract class DoubleProperty
/*     */   extends ReadOnlyDoubleProperty
/*     */   implements Property<Number>, WritableDoubleValue
/*     */ {
/*     */   public void setValue(Number paramNumber) {
/*  74 */     if (paramNumber == null) {
/*  75 */       Logging.getLogger().fine("Attempt to set double property to null, using default value instead.", new NullPointerException());
/*  76 */       set(0.0D);
/*     */     } else {
/*  78 */       set(paramNumber.doubleValue());
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void bindBidirectional(Property<Number> paramProperty) {
/*  87 */     Bindings.bindBidirectional(this, paramProperty);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void unbindBidirectional(Property<Number> paramProperty) {
/*  95 */     Bindings.unbindBidirectional(this, paramProperty);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 104 */     Object object = getBean();
/* 105 */     String str = getName();
/* 106 */     StringBuilder stringBuilder = new StringBuilder("DoubleProperty [");
/*     */     
/* 108 */     if (object != null) {
/* 109 */       stringBuilder.append("bean: ").append(object).append(", ");
/*     */     }
/* 111 */     if (str != null && !str.equals("")) {
/* 112 */       stringBuilder.append("name: ").append(str).append(", ");
/*     */     }
/* 114 */     stringBuilder.append("value: ").append(get()).append("]");
/* 115 */     return stringBuilder.toString();
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static DoubleProperty doubleProperty(final Property<Double> property) {
/* 154 */     Objects.requireNonNull(property, "Property cannot be null");
/* 155 */     return new DoublePropertyBase()
/*     */       {
/*     */ 
/*     */ 
/*     */         
/*     */         public Object getBean()
/*     */         {
/* 162 */           return null;
/*     */         }
/*     */ 
/*     */         
/*     */         public String getName() {
/* 167 */           return property.getName();
/*     */         }
/*     */       };
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ObjectProperty<Double> asObject() {
/* 193 */     return new ObjectPropertyBase<Double>()
/*     */       {
/*     */ 
/*     */ 
/*     */         
/*     */         public Object getBean()
/*     */         {
/* 200 */           return null;
/*     */         }
/*     */ 
/*     */         
/*     */         public String getName() {
/* 205 */           return DoubleProperty.this.getName();
/*     */         }
/*     */       };
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\beans\property\DoubleProperty.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */