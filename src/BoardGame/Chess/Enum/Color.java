package BoardGame.Chess.Enum;

public enum Color {
    BLACK(1),
    WHITE(2);

    private Integer colors;

    private Color(Integer colors){
        this.colors=colors;
    }

    public Integer getColors() {
        return colors;
    }

    public void setColors(Integer colors) {
        this.colors = colors;
    }

    
}
