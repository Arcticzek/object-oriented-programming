import java.util.ArrayList;

class InvalidAddressException extends Exception {
    InvalidAddressException(String message) {
        super(message);
    }
}

class Address {
    private String street;
    private int houseNumber;
    private String postalCode;
    private String city;

    public Address(String street, int houseNumber, String postalCode, String city) throws InvalidAddressException {
        ArrayList<String> invalidFields = new ArrayList<>();

        if (street == null) {
            invalidFields.add("Street");
        }

        if (houseNumber <= 0) {
            invalidFields.add("House number");
        }

        if (postalCode == null) {
            invalidFields.add("Postal code");
        }

        if (city == null) {
            invalidFields.add("City");
        }

        if (!invalidFields.isEmpty()) {
            StringBuilder message = new StringBuilder();
            for (String field : invalidFields) {
                message.append(field).append(" cannot be null. ");
            }
            throw new InvalidAddressException(message.toString());
        }

        this.street = street;
        this.houseNumber = houseNumber;
        this.postalCode = postalCode;
        this.city = city;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public int getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(int houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}

class Main {
    public static void main(String[] args) {
        try {
            Address address = new Address("Kwiatowa", 1, "12-345", "Lublin");
        } catch (InvalidAddressException e) {
            System.out.println(e.getMessage());
        }
    }
}