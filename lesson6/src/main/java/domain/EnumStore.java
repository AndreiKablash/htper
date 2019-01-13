package domain;

public enum EnumStore {
    AUTOMATIC("Automatic"), SEMI_AUTOMATIC("Semi-automatic"), WASHER_DRYER("Washer and dryer"), DRIER("Dryer");

    private String type;

    EnumStore() {
    }

    EnumStore(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String isType() {
        switch (this) {
            case AUTOMATIC:
                return "Description: automated control";
            case SEMI_AUTOMATIC:
                return "Description: automatic and manual control";
            case WASHER_DRYER:
                return "Description: automated program control with pro-dryer function";
            case DRIER:
                return "Description: oven";
            default:
                return " No description";
        }
    }


}