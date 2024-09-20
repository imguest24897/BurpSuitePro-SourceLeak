/*     */ package javafx.beans.property;
/*     */ 
/*     */ import java.text.Format;
/*     */ import javafx.beans.binding.Bindings;
/*     */ import javafx.beans.value.WritableStringValue;
/*     */ import javafx.util.StringConverter;
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
/*     */ public abstract class StringProperty
/*     */   extends ReadOnlyStringProperty
/*     */   implements Property<String>, WritableStringValue
/*     */ {
/*     */   public void setValue(String paramString) {
/*  71 */     set(paramString);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void bindBidirectional(Property<String> paramProperty) {
/*  79 */     Bindings.bindBidirectional(this, paramProperty);
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
/*     */   public void bindBidirectional(Property<?> paramProperty, Format paramFormat) {
/*  98 */     Bindings.bindBidirectional(this, paramProperty, paramFormat);
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
/*     */   public <T> void bindBidirectional(Property<T> paramProperty, StringConverter<T> paramStringConverter) {
/* 118 */     Bindings.bindBidirectional(this, paramProperty, paramStringConverter);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void unbindBidirectional(Property<String> paramProperty) {
/* 126 */     Bindings.unbindBidirectional(this, paramProperty);
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
/*     */   public void unbindBidirectional(Object paramObject) {
/* 145 */     Bindings.unbindBidirectional(this, paramObject);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String toString() {
/* 154 */     Object object = getBean();
/* 155 */     String str = getName();
/* 156 */     StringBuilder stringBuilder = new StringBuilder("StringProperty [");
/*     */     
/* 158 */     if (object != null) {
/* 159 */       stringBuilder.append("bean: ").append(object).append(", ");
/*     */     }
/* 161 */     if (str != null && !str.equals("")) {
/* 162 */       stringBuilder.append("name: ").append(str).append(", ");
/*     */     }
/* 164 */     stringBuilder.append("value: ").append((String)get()).append("]");
/* 165 */     return stringBuilder.toString();
/*     */   }
/*     */ }


/* Location:              C:\Program Files\BurpSuitePro\burpsuite_pro.jar!\javafx\beans\property\StringProperty.class
 * Java compiler version: 17 (61.0)
 * JD-Core Version:       1.1.3
 */