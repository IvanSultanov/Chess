public class Players {
    private String Name;
    private char Color;
    StringToInt Conv = new StringToInt();
    public String getName() { return Name; }
    public char getColor() { return Color; }

    Players (String Name, char Color) {
        this.Name = Name;
        this.Color = Color;
    }
}
