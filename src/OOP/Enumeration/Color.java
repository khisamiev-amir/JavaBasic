package OOP.Enumeration;

public enum Color {
    RED(3028),
    GREEN(6002),
    BLACK(9005);
   private Integer сolor;

    Color(Integer сolor) {
        this.сolor = сolor;
    }

    public Integer getСolor() {
        return сolor;
    }
}
