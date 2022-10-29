// stored in the DTO folder

import domain.Customer;

public class CustomerDTO {
    private Long id;
    private String name;

    public CustomerDTO() {

    }

    public CustomerDTO(Customer customer) {
        this.id = customer.getId();
        this.name = customer.getName();

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
