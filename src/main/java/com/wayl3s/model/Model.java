package com.wayl3s.model;

import java.util.ArrayList;

import com.wayl3s.math.Vector2f;
import com.wayl3s.math.Vector3f;

public class Model {
    public ArrayList<Vector3f> vertices = new ArrayList<Vector3f>();
    public ArrayList<Vector2f> textureVertices = new ArrayList<Vector2f>();
    public ArrayList<Vector3f> normals = new ArrayList<Vector3f>();
    public ArrayList<Face> faces = new ArrayList<Face>();
}
