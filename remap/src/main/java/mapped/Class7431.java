// 
// Decompiled by Procyon v0.6.0
// 

package mapped;

import org.apache.logging.log4j.LogManager;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import org.apache.logging.log4j.Logger;

public class Class7431 extends ValueObject
{
    private static final Logger field28658;
    public String field28659;
    public String field28660;
    public String field28661;
    
    public static Class7431 method22864(final String s) {
        final JsonObject asJsonObject = new JsonParser().parse(s).getAsJsonObject();
        final Class7431 class7431 = new Class7431();
        try {
            class7431.field28659 = JsonUtils.func_225171_a("downloadLink", asJsonObject, "");
            class7431.field28660 = JsonUtils.func_225171_a("resourcePackUrl", asJsonObject, "");
            class7431.field28661 = JsonUtils.func_225171_a("resourcePackHash", asJsonObject, "");
        }
        catch (final Exception ex) {
            Class7431.field28658.error("Could not parse WorldDownload: " + ex.getMessage());
        }
        return class7431;
    }
    
    static {
        field28658 = LogManager.getLogger();
    }
}
