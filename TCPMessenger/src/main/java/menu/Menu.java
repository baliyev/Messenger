package menu;

import service.menu.MenuService;

public enum Menu {
    Login(1, "Login", null),
    Register(2, "Register", null),
    UnKnown(-1, "Unknown menu", null);

    private int number;
    private String label;
    private MenuService service;

    private Menu(int number, String label, MenuService service) {
        this.label = label;
        this.service = service;
        this.number = number;
    }

    public String getLabel() {
        return this.label;
    }

    public MenuService getService() {
        return this.service;
    }

    public int getNumber() {
        return this.number;
    }

}
