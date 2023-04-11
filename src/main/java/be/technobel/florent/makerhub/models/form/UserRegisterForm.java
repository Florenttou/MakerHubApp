package be.technobel.florent.makerhub.models.form;

import be.technobel.florent.makerhub.models.entity.Address;
import lombok.Data;

@Data
public class UserRegisterForm {

    private String firstname;
    private String lastname;
    private String email;
    private String phone;
    private UserAddress address;



    @Data
    public static class UserAddress {
        private String street;
        private int number;
        private String boxNumber;
        private int postalCode;
        private String city;
        private String country;
        private String region;

        private Address toEntity(){
            Address address1 = new Address();

            address1.setCity(city);
            address1.setRegion(region);
            address1.setNumber(number);
            address1.setCountry(country);
            address1.setStreet(street);
            address1.setBoxNumber(boxNumber);
            address1.setPostalCode(postalCode);

            return address1;
        }
    }

}
