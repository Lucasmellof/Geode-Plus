package net.yeoxuhang.geodeplus.fabric;

import net.fabricmc.api.ClientModInitializer;
import net.fabricmc.fabric.api.client.rendering.v1.BlockEntityRendererRegistry;
import net.yeoxuhang.geodeplus.client.GeodeClient;
import net.yeoxuhang.geodeplus.client.model.layer.GeodeModModelLayers;
import net.yeoxuhang.geodeplus.client.render.WrappistPedestalBlockEntityRenderer;
import net.yeoxuhang.geodeplus.common.registry.GeodeModBlockEntitiesRegistry;

public class GeodePlusFabricClient implements ClientModInitializer {
    @Override
    public void onInitializeClient() {
        GeodeModModelLayers.initialize();

        GeodeClient.initClient();
        BlockEntityRendererRegistry.register(GeodeModBlockEntitiesRegistry.WRAPPIST_PEDESTAL_ENTITY.get(), WrappistPedestalBlockEntityRenderer::new);
    }
}
