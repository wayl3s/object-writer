package com.wayl3s;

import java.io.FileWriter;
import java.io.IOException;

import com.wayl3s.math.Vector2f;
import com.wayl3s.math.Vector3f;
import com.wayl3s.model.Face;
import com.wayl3s.model.Model;

public class App {
    public static void main(String[] args) {
        Model model = new Model();
        model.vertices.add(new Vector3f(0.0f, 0.0f, 0.0f));
        model.vertices.add(new Vector3f(1.0f, 0.0f, 0.0f));
        model.vertices.add(new Vector3f(0.0f, 0.0f, 1.0f));
        model.vertices.add(new Vector3f(1.0f, 0.0f, 1.0f));

        model.textureVertices.add(new Vector2f(0.0f, 0.0f));
        model.textureVertices.add(new Vector2f(1.0f, 0.0f));
        model.textureVertices.add(new Vector2f(0.0f, 1.0f));
        model.textureVertices.add(new Vector2f(1.0f, 1.0f));
        
        model.faces.add(new Face(new int[]{0,1,2,3}, new int[]{0,1,2,3}, null));
        try {
            FileWriter writer = new FileWriter("output.obj");
            ObjWriter.write(model, writer);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("Completed");
    }
}
