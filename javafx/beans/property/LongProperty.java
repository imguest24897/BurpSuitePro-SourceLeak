/*     */ package javafx.beans.property;
/*     */ 
/*     */ import com.sun.javafx.binding.BidirectionalBinding;
/*     */ import com.sun.javafx.binding.Logging;
/*     */ import java.util.Objects;
/*     */ import javafx.beans.binding.Bindings;
/*     */ import javafx.beans.binding.ObjectExpression;
/*     */ import javafx.beans.value.WritableLongValue;
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
/*     */ public abstract class LongProperty
/*     */   extends ReadOnlyLongProperty
/*     */   implements Property<Number>, WritableLongValue
/*     */ {
/*     */   public void setValue(Number paramNumber) {
/*  72 */     if (paramNumber == null) {
/*  73 */       Logging.getLogger().fine("Attempt to set long property to null, using default value instead.", new NullPointerException());
/*  74 */       set(0L);
/*     */     } else {
/*  76 */       set(paramNumber.longValue());
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void bindBidirectional(Property<Number> paramProperty) {
/*  85 */     Bindings.bindBidirectional(this, paramProperty);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void unbindBidirectional(Property<Number> paramProperty) {
/*  93 */     Bindings.unbindBidirectional(this, paramProperty);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 102 */     Object object = getBean();
/* 103 */     String str = getName();
/* 104 */     StringBuilder stringBuilder = new StringBuilder("LongProperty [");
/* 105 */     if (object != null) {
/* 106 */       stringBuilder.append("bean: ").append(object).append(", ");
/*     */     }
/* 108 */     if (str != null && !str.equals("")) {
/* 109 */       stringBuilder.append("name: ").append(str).append(", ");
/*     */     }
/* 111 */     stringBuilder.append("value: ").append(get()).append("]");
/* 112 */     return stringBuilder.toString();
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
/*     */   
/*     */   public static LongProperty longProperty(final Property<Long> property) {
/* 152 */     Objects.requireNonNull(property, "Property cannot be null");
/* 153 */     return new LongPropertyBase()
/*     */       {
/*     */ 
/*     */ 
/*     */         
/*     */         public Object getBean()
/*     */         {
/* 160 */           return null;
/*     */         }
/*     */ 
/*     */         
/*     */         public String getName() {
/* 165 */           return property.getName();
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
/*     */   public ObjectProperty<Long> asObject() {
/* 191 */     return new ObjectPropertyBase<Long>()
/*     */       {
/*     */ 
/*     */ 
/*     */         
/*     */         public Object getBean()
/*     */         {
/* 198 */           return null;
/*     */         }
/*     */ 
/*     */         
/*     */         public String getName() {
/* 203 */           return LongProperty.this.getName();
/*     */         }
/*     */       };
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\beans\property\LongProperty.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */