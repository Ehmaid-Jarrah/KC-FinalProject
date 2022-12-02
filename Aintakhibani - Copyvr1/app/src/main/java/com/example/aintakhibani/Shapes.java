package com.example.aintakhibani;

public class Shapes {
    private String shapeName;
    private int shapeImage;

    public Shapes(String shapeName, int shapeImage) {
        this.shapeName = shapeName;
        this.shapeImage = shapeImage;
    }

    public String getShapeName() {
        return shapeName;
    }

    public void setShapeName(String shapeName) {
        this.shapeName = shapeName;
    }

    public int getShapeImage() {
        return shapeImage;
    }

    public void setShapeImage(int shapeImage) {
        this.shapeImage = shapeImage;
    }
}

