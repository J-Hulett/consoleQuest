package userIO;

public class Color {
    private String value;

    public Color (String color)
    {
        value = color;
    }

    @Override
    public String toString()
    {
        return value;
    }
}
