package com.guflimc.kingdomcraft.demo;

import com.gufli.kingdomcraft.premium.api.KingdomCraftPremium;
import com.gufli.kingdomcraft.premium.api.KingdomCraftPremiumProvider;
import com.gufli.kingdomcraft.premium.api.domain.Region;
import org.bukkit.plugin.java.JavaPlugin;

import java.util.stream.Collectors;

public class DemoPlugin extends JavaPlugin {

    @Override
    public void onEnable() {
        KingdomCraftPremium kdcp = KingdomCraftPremiumProvider.get();

        getLogger().info("List of regions: " + kdcp.regionsApi().getRegions()
                .stream()
                .map(Region::getName)
                .collect(Collectors.joining(", ")));
    }
}
