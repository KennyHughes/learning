// stored in the Resource folder

import domain.Customer;
import service.CustomerService;
import service.dto.CustomerDTO;
import web.rest.errors.InternalServerErrorException;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.Optional;

@RestController
@CrossOrigin
@RequestMapping("/api")
public class CustomerResource {

    private final CustomerService customerService;

    public CustomerResource(CustomerService customerService)
    {this.customerService = customerService;
    }

    @GetMapping("/customer")
    public CustomerDTO getCustomer (@Valid @RequestParam(name = "id") Long id) {

        Optional<Customer> customerOptional = customerService.getCustomer(id);

        if (customerOptional.isPresent()) {

            Customer customer = customerOptional.get();

            CustomerDTO customerDTO = new CustomerDTO(customer);

            return customerDTO;

        } else{
            throw new InternalServerErrorException("customer was not found");
        }
    }

    }
