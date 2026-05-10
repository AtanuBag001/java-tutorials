class Circle {
    private double radius;
    private double area;
    private double perimeter;

    // Setter for radius with validation
    public void setRadius(double r) {
        if (r <= 0) {
            throw new IllegalArgumentException("Radius must be positive");
        }
        this.radius = r;
        this.area = Math.PI * r * r;
        this.perimeter = 2 * Math.PI * r;
    }

    // Setter for area with validation against radius
    public void setArea(double a) {
        if (Math.abs(a - (Math.PI * radius * radius)) > 1e-9) {
            throw new IllegalArgumentException("Area does not match the radius");
        }
        this.area = a;
    }

    // Setter for perimeter with validation against radius
    public void setPerimeter(double p) {
        if (Math.abs(p - (2 * Math.PI * radius)) > 1e-9) {
            throw new IllegalArgumentException("Perimeter does not match the radius");
        }
        this.perimeter = p;
    }

    // Getters
    public double getRadius() {
        return radius;
    }

    public double getArea() {
        return area;
    }

    public double getPerimeter() {
        return perimeter;
    }
}

public class ques_gett_sett {
    public static void main(String[] args) {
        Circle c = new Circle();
        
        // Set valid radius
        c.setRadius(5.0);
        System.out.println("Radius: " + c.getRadius());
        System.out.println("Area: " + c.getArea());
        System.out.println("Perimeter: " + c.getPerimeter());
        
        // Set correct area
        c.setArea(Math.PI * 25.0);
        System.out.println("Area set correctly");
        
        // Try to set wrong area
        try {
            c.setArea(100.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Error setting area: " + e.getMessage());
        }
        
        // Set correct perimeter
        c.setPerimeter(2 * Math.PI * 5.0);
        System.out.println("Perimeter set correctly");
        
        // Try to set wrong perimeter
        try {
            c.setPerimeter(50.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Error setting perimeter: " + e.getMessage());
        }
        
        // Try to set invalid radius
        try {
            c.setRadius(-1.0);
        } catch (IllegalArgumentException e) {
            System.out.println("Error setting radius: " + e.getMessage());
        }
    }
}
