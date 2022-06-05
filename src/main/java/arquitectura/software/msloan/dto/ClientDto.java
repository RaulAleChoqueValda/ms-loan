package arquitectura.software.msloan.dto;

public class ClientDto {
    Integer clientId;
    String name;
    String lastname;
    String email;
    Integer phone;
    Integer addressId;

    public ClientDto(Integer clientId, String name, String lastname, String email, Integer phone, Integer addressId) {
        this.clientId = clientId;
        this.name = name;
        this.lastname = lastname;
        this.email = email;
        this.phone = phone;
        this.addressId = addressId;
    }

    public Integer getClientId() {
        return clientId;
    }

    public void setClientId(Integer clientId) {
        this.clientId = clientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getPhone() {
        return phone;
    }

    public void setPhone(Integer phone) {
        this.phone = phone;
    }

    public Integer getAddressId() {
        return addressId;
    }

    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    @Override
    public String toString() {
        return "ClientDto{" +
                "clientId=" + clientId +
                ", name='" + name + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                ", phone=" + phone +
                ", addressId=" + addressId +
                '}';
    }
}
