package CampoMinadoJogo;

public class Square {
    private Boolean isThereABomb;
    private Boolean isThereAFlag;

    public Square(Boolean isThereABomb, Boolean isThereAFlag) {
        this.isThereABomb = isThereABomb;
        this.isThereAFlag = isThereAFlag;
    }

    public Boolean getThereABomb() {
        return isThereABomb;
    }

    public void setThereABomb(Boolean thereABomb) {
        isThereABomb = thereABomb;
    }

    public Boolean getThereAFlag() {
        return isThereAFlag;
    }

    public void setThereAFlag(Boolean thereAFlag) {
        isThereAFlag = thereAFlag;
    }
}
