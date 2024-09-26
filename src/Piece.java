abstract class Piece {
    private TypePiece typePiece;
    private String niveau;

    public TypePiece getTypePiece() {
        return typePiece;
    }

    public void setTypePiece(TypePiece typePiece) {
        this.typePiece = typePiece;
    }

    public String getNiveau() {
        return niveau;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }

    abstract double calculerSurface();

    public Piece(TypePiece typePiece, String niveau) {
        this.typePiece = typePiece;
        this.niveau = niveau;
    }

    @Override
    public String toString() {
        return "Piece [typePiece=" + typePiece + ", niveau=" + niveau + "]";
    }


}
