package KR;

public enum TreeType {
    CONIFEROUS,DECIDUOUS;

    @Override
    public String toString(){
        switch (this){
            case  CONIFEROUS:
                return "CONIFEROUS";
            case DECIDUOUS:
                return "DECIDUOUS";
            default:
                return "Incorrect";
        }
    }

    public static TreeType toType(String s) throws EnumIncorrectException{
        TreeType delta;
        switch (s){
            case "CONIFEROUS":
                delta = CONIFEROUS;
                break;
            case "DECIDUOUS":
                delta = DECIDUOUS;
                break;
            default:
                throw new EnumIncorrectException();
        }
        return delta;
    }


}
