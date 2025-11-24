package com.wayl3s;

import java.io.IOException;
import java.io.Writer;

import com.wayl3s.math.Vector2f;
import com.wayl3s.math.Vector3f;
import com.wayl3s.model.Face;
import com.wayl3s.model.Model;

public class ObjWriter {
    public static void write(Model model, Writer writer) throws IOException {
        for (Vector3f vertex: model.vertices) {
            writer.append(String.format("v %.4f %.4f %.4f\n", vertex.x, vertex.y, vertex.z));
        }
        writer.append("\n");
        
        for (Vector2f textureVertex: model.textureVertices) {
            writer.append(String.format("vt %.4f %.4f\n", textureVertex.x, textureVertex.y));
        }
        if (model.textureVertices.size() != 0) writer.append("\n");
        
        for (Vector3f normal: model.normals) {
            writer.append(String.format("vn %.4f %.4f %.4f\n", normal.x, normal.y, normal.z));
        }
        if (model.normals.size() != 0) writer.append("\n");
        
        for (Face face: model.faces) {
            writer.append("f");
            for (int i = 0; i < face.getVertexIndexes().length; i++) {
                writer.append(" ");
                writer.append(Integer.toString(face.getVertexIndexes()[i] + 1));
                if (face.getTextureIndexes() != null) {
                    writer.append(String.format("/%d", face.getTextureIndexes()[i] + 1));
                    if (face.getNormalIndexes() != null) {
                        writer.append(String.format("/%d", face.getNormalIndexes()[i] + 1));
                    }
                } else {
                    if (face.getNormalIndexes() != null) {
                        writer.append(String.format("//%d", face.getNormalIndexes()[i] + 1));
                    }
                }
            }
            writer.append("\n");
        }

        writer.flush();
    }
}
