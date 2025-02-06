package models;

/**
 * Customer model
 */
public class Customer {
    private String id;
    private String name;
    private String contact;

    public Customer(String id, String name, String contact) {
        this.id = id;
        this.name = name;
        this.contact = contact;
    }
}

public String getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Customer: " + name + " (ID: " + id + ")";
    }
}
