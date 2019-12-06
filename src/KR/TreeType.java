package KR;

public enum TreeType {
    CONIFEROUS, DECIDUOUS;

    @Override
    public String toString() {
        switch (this) {
            case CONIFEROUS:
                return "CONIFEROUS";
            case DECIDUOUS:
                return "DECIDUOUS";
            default:
                return "Incorrect";
        }
    }

    public static TreeType toType(String s) throws EnumIncorrectException {
        TreeType temp;
        switch (s) {
            case "CONIFEROUS":
                temp = CONIFEROUS;
                break;
            case "DECIDUOUS":
                temp = DECIDUOUS;
                break;
            default:
                throw new EnumIncorrectException();
        }
        return temp;
    }


}
