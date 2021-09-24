abstract class Animal {
    private String name;
    private String cry;
    private String toMove;

    public Animal(String name, String cry, String toMove) {
        this.name = name;
        this.cry = cry;
        this.toMove = toMove;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCry() {
        return cry;
    }

    public void setCry(String cry) {
        this.cry = cry;
    }

    public String getToMove() {
        return toMove;
    }

    abstract void lay();

    public void setToMove(String toMove) {
        this.toMove = toMove;
    }
}
