package top.hendrixshen.magiclib.compat.minecraft.api.blaze3d.vertex;

import net.fabricmc.api.EnvType;
import net.fabricmc.api.Environment;
import org.jetbrains.annotations.ApiStatus;

//#if MC > 11605
//$$ import com.mojang.blaze3d.vertex.VertexFormat;
//#else
import org.lwjgl.opengl.GL11;
//#endif

@Deprecated
@ApiStatus.ScheduledForRemoval
@Environment(EnvType.CLIENT)
public interface VertexFormatCompatApi {
    class Mode {
        //#if MC > 11605
        //$$ public static final VertexFormat.Mode QUADS = VertexFormat.Mode.QUADS;
        //#else
        public static final int QUADS = GL11.GL_QUADS;
        //#endif
    }
}