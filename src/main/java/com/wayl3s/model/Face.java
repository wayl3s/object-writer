package com.wayl3s.model;

public class Face {
    private int[] vertexIndexes;
    private int[] textureIndexes;
    private int[] normalIndexes;

    public Face(int[] vertexIndexes, int[] textureIndexes, int[] normalIndexes) {
        this.vertexIndexes = vertexIndexes;
        this.textureIndexes = textureIndexes;
        this.normalIndexes = normalIndexes;
    }

    public int[] getVertexIndexes() {
        return vertexIndexes;
    }

    public int[] getTextureIndexes() {
        return textureIndexes;
    }

    public int[] getNormalIndexes() {
        return normalIndexes;
    }

    public void setVertexIndexes(int[] vertexIndexes) {
        this.vertexIndexes = vertexIndexes;
    }

    public void setTextureIndexes(int[] textureIndexes) {
        this.textureIndexes = textureIndexes;
    }

    public void setNormalIndexes(int[] normalIndexes) {
        this.normalIndexes = normalIndexes;
    }
}
