// 
// Decompiled by Procyon v0.6.0
// 

package com.mentalfrostbyte.jello.mods;

import com.mentalfrostbyte.Client;
import mapped.Class6224;

public class PremiumModule extends Module
{
    public PremiumModule(final String s, final String s2, final Category class8013) {
        super(class8013, s, s2);
    }
    
    @Override
    public boolean isEnabled() {
        return Client.getInstance().getNetworkManager().isPremium() && super.isEnabled();
    }
    
    @Override
    public void method9907(final boolean enabled) {
        if (Client.getInstance().getNetworkManager().isPremium()) {
            super.method9907(enabled);
            return;
        }
        if (this.enabled != enabled) {
            Client.getInstance().method35197().method25776(new Class6224("Premium", this.getName() + " Not yet available for free version"));
            Client.getInstance().method35196().method32830("error");
        }
    }
    
    @Override
    public void method9908(final boolean b) {
        if (Client.getInstance().getNetworkManager().isPremium()) {
            super.method9908(b);
            return;
        }
        if (this.enabled != b) {
            if (b) {
                Client.getInstance().method35197().method25776(new Class6224("Premium", this.getName() + " Not yet available for free version"));
                Client.getInstance().method35196().method32830("error");
            }
        }
    }
    
    @Override
    public void method9909(final boolean enabled) {
        if (Client.getInstance().getNetworkManager().isPremium()) {
            super.method9909(enabled);
            return;
        }
        if (this.isEnabled() != enabled) {
            Client.getInstance().method35197().method25776(new Class6224("Premium", this.getName() + " Not yet available for free version"));
            Client.getInstance().method35196().method32830("error");
        }
    }
}
