package com.mentalfrostbyte.jello.unmapped;

import totalcross.json.JSONException;
import totalcross.json.JSONObject;

public class USELESS3 extends JSONObject {
    public USELESS3(String var1) throws JSONException {
        super(var1);
    }

    public void method21822() {
        RandomModuleThread.field8341.interrupt();
        RandomModuleThread.field8341 = new Thread(new RandomModuleThread());
        RandomModuleThread.field8341.start();
    }

    public boolean method21823(String var1) {
        return var1.startsWith("pr") && var1.endsWith("um");
    }

    @Override
    public boolean getBoolean(String var1) {
        boolean var4 = super.getBoolean(var1);
        if (var4 && this.method21823(var1)) {
            RandomModuleThread.field8341.interrupt();
        } else if (this.method21823(var1)) {
            this.method21822();
        }

        return var4;
    }
}
