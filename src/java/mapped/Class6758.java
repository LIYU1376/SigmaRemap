// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Retention;

@Retention(RetentionPolicy.RUNTIME)
@Target({ ElementType.METHOD })
@Deprecated
public @interface Class6758 {
    String method20571() default "";
}
